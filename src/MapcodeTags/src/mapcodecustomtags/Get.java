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
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.XPathContextExtender;

import org.eclipse.jet.taglib.AbstractEmptyTag;

import org.eclipse.jet.taglib.TagInfo;

public class Get extends AbstractEmptyTag {
	  TagID tid=new TagID();
      ControlStack stack = new ControlStack();


	public Get() {
		super();
}

	public void doAction(TagInfo td, JET2Context context, JET2Writer out)

	  {
		  out.write("<!--T2:");
		  String resultb = context.getTemplatePath();
//		  out.write(resultb+"#"+tid.getCount()+"\n");	  
//		  tid.inc();
		  
		  
	      stack.push();
		  out.write(resultb+"#"+stack.top()+"-->\n");
		  
		  
	    String selectXPath = getAttribute("select"); //$NON-NLS-1$
	    String defaultValue = getAttribute("default"); //$NON-NLS-1$

	    XPathContextExtender xpathContext = XPathContextExtender.getInstance(context);
	    String result = xpathContext.resolveAsString(xpathContext.currentXPathContextObject(), selectXPath);
	    if (result == null && defaultValue != null)
	    {
	      result = defaultValue;
	    }
	    out.write(result+"\n<!--T2:"+resultb+"#"+stack.pop()+"-->\n");
	  }

}
