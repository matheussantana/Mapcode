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
import java.util.Map;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.internal.l10n.JET2Messages;
import org.eclipse.jet.taglib.AbstractEmptyTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.transform.TransformContextExtender;

public class Include extends AbstractEmptyTag {
    ControlStack stack = new ControlStack();

	public Include() {
		super();
	}

	@Override
	public void doAction(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {

		  out.write("<!--T6:");
		  String result = context.getTemplatePath();
		  
		  
	      stack.push();
		  out.write(result+"#"+stack.top()+"-->\n");
		  
		  
		  
		  
		
	    String template = getAttribute("template"); //$NON-NLS-1$
	    String restoreNames = getAttribute("restoreNames"); //$NON-NLS-1$
	    String passVariables = getAttribute("passVariables"); //$NON-NLS-1$
	    
	    String useSuperStr = getAttribute("super"); //$NON-NLS-1$
	    boolean useSuper = useSuperStr != null && Boolean.valueOf(useSuperStr).booleanValue();

	    if(restoreNames != null && passVariables != null)
	    {
	      throw new JET2TagException(MessageFormat.format(JET2Messages.AnyTag_MutuallyExclusiveAttributes,
	          new Object[] {"restoreNames", "passVariables"}));  //$NON-NLS-1$//$NON-NLS-2$
	    }
	    
	    Map savedVariableValues;
	    if(passVariables != null)
	    {
	      savedVariableValues = context.getVariables();
	      context.setVariables(context.extractVariables(passVariables));
	    }
	    else
	    {
	      savedVariableValues = context.extractVariables(restoreNames);
	    }

	    try 
	    {
	      TransformContextExtender tce = new TransformContextExtender(context);
	      tce.execute(template, useSuper, out);
	    }
	    finally
	    {
	      if(restoreNames != null)
	      {
	        context.restoreVariables(savedVariableValues);
	      }
	      else if(passVariables != null)
	      {
	        context.setVariables(savedVariableValues);
	      }
	    }
		  out.write("<!--T6:");
		    out.write(result+"#"+stack.pop()+"-->\n");

	  }
		
	}
