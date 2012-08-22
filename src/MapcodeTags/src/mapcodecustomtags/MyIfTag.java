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
import org.eclipse.jet.taglib.AbstractConditionalTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.xpath.XPathUtil;

public class MyIfTag extends AbstractConditionalTag {
	  private String var = null;
	  private boolean varAlreadySet = false; 
	  private Object savedValue;
	  TagID tid=new TagID();
	  ControlStack pilha = new ControlStack();


	public MyIfTag() {
		super();
	}

	@Override
	public boolean doEvalCondition(TagInfo td, JET2Context context)
			throws JET2TagException {
	    String testXPath = getAttribute("test"); //$NON-NLS-1$
	    var = getAttribute("var"); //$NON-NLS-1$
	    
	    XPathContextExtender xpathExtender = XPathContextExtender.getInstance(context);
	    
	    // get the result of the xpath expression prior to casting to boolean, in case we define a 'var'.
	    Object rawObject = xpathExtender.resolveAsObject(xpathExtender.currentXPathContextObject(), testXPath);
	    
	    boolean processContents = XPathUtil.xpathBoolean(rawObject);
	    if(processContents && var != null)
	    {
	      varAlreadySet = context.hasVariable(var);
	      if(varAlreadySet)
	      {
	        savedValue = context.getVariable(var);
	      }
	      context.setVariable(var, rawObject);
	    }

	    return processContents;
	
	
	}
	@Override
	  public void doBeforeBody(TagInfo td, JET2Context context, JET2Writer out) throws JET2TagException
	  {
		  out.write("<!--T5:");
		  String result = context.getTemplatePath();
//		  out.write(result+"#"+tid.getCount()+"\n");
		  
	      pilha.push();
		  out.write(result+"#"+pilha.top()+"-->\n");
	  }	  
	@Override
	  public void doAfterBody(TagInfo td, JET2Context context, JET2Writer out) throws JET2TagException
	  {
	    if(var != null)
	    {
	      if(varAlreadySet)
	      {
	        context.setVariable(var, savedValue);
	      }
	      else
	      {
	        context.removeVariable(var);
	      }
	    }
		  out.write("<!--T5:");
		  String result = context.getTemplatePath();
	    out.write(result+"#"+pilha.pop()+"-->\n");

//		  out.write(result+"#"+tid.getCount()+"\n");	  
//		  tid.inc();
	  }

}
