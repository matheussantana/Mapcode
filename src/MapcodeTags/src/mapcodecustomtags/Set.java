package mapcodecustomtags;
/**
 * 
 * @author matheus
 *
Mapcode - Mapping Generated Code to a Reference Implementation – Towards Automatic Code Migration

This plugin implements an initial step towards automatic code migration in the context of MDE-based
projects that use template-based code generation (Java Emitter Templates(JET) engine) backed up by
a reference implementation. Different types of mapping between a template and the generated code
are identified, each one covering a different code generation possibility.
The mapping is established by the automatic insertion, in the generated code, of special
markings that delineate the boundaries of each mapping type.

   Copyright (C) 2012 Matheus Santana
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

Created by: Matheus Santana (matheusslima <at> yahoo <dot> com <dot> br)

Date: 21/08/2012

For futher information see:

[Project website] (http://matheussantana.github.com/Mapcode/)
[Code repository] (https://github.com/matheussantana/Mapcode)
[More info] (http://www2.comp.ufscar.br/~matheus_santana/static.php?page=static120821-224438)

 */
import java.text.MessageFormat;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.internal.l10n.JET2Messages;
import org.eclipse.jet.taglib.AbstractContainerTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;

public class Set extends AbstractContainerTag {
	  private String tagContent = ""; //$NON-NLS-1$
	  ControlStack cstack = new ControlStack();

	public Set() {
super();
	}

	@Override
	public void doBeforeBody(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {
		  out.write("<!--T3:");
		  String result = context.getTemplatePath();
		  
	      cstack.push();
		  out.write(result+"#"+cstack.top()+"-->\n");
 
	}

	@Override
	public void doAfterBody(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {

	    String selectXPath = getAttribute("select"); //$NON-NLS-1$
	    String name = getAttribute("name"); //$NON-NLS-1$

	    XPathContextExtender xpathExtender = XPathContextExtender.getInstance(context);
	    Object element = xpathExtender.resolveSingle(xpathExtender.currentXPathContextObject(), selectXPath);
	    if (element == null)
	    {
	      throw new JET2TagException(JET2Messages.XPath_NoElementSelected);
	    }

	    final boolean isSet = xpathExtender.setAttribute(element, name, tagContent);
	    if (!isSet)
	    {
	      String msg = JET2Messages.SetTag_CoundNotSet;
	      throw new JET2TagException(MessageFormat.format(msg, new Object []{ name }));
	    }
		  out.write("<!--T3:");
		  String result = context.getTemplatePath();
		    out.write(result+"#"+cstack.pop()+"-->\n");
	}
	
	  public void setBodyContent(JET2Writer bodyContent)
	  {
	    tagContent = bodyContent.toString();
	  }

}
