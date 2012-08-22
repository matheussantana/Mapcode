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
import org.eclipse.jet.taglib.AbstractIteratingTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.xpath.NodeSet;
import org.eclipse.jet.xpath.XPathUtil;

public class iterate extends AbstractIteratingTag {
	
	private boolean firstTime = false;
	
	  private static final String UPDATE_CONTEXT_VAR = "br.dc.ufscar.mapcode.iterateSetsContext"; //$NON-NLS-1$
	  
	  private Boolean updateContext;
	  
	  private Object[] selectedObjects;

	  private int currentIndex;

	  private String varName;

	  private Object savedVarValue = null;
	  
	  private boolean nodeSetIteration;

	  private long maxIterations = 0;
	  
	  ControlStack cstack = new ControlStack();


	  /**
	   * 
	   */
	  public iterate()
	  {
	    super();
	  }

	  /* (non-Javadoc)
	   * @see org.eclipse.jet.taglib.IteratingTag#doEvalLoopCondition(org.eclipse.jet.taglib.TagInfo, org.eclipse.jet.JET2Context)
	   */
	  public boolean doEvalLoopCondition(TagInfo tc, JET2Context context) throws JET2TagException
	  {
	    boolean doAnotherIteration = ++currentIndex < maxIterations;

	    if (!doAnotherIteration && varName != null)
	    {
	      // clean up variables...
	      if (savedVarValue != null)
	      {
	        context.setVariable(varName, savedVarValue);
	      }
	      else
	      {
	        context.removeVariable(varName);
	      }
	    }

	    return doAnotherIteration;
	  }
	  
	  /* (non-Javadoc)
	   * @see org.eclipse.jet.taglib.AbstractIteratingTag#doBeforeBody(org.eclipse.jet.taglib.TagInfo, org.eclipse.jet.JET2Context, org.eclipse.jet.JET2Writer)
	   */
	  public void doBeforeBody(TagInfo td, JET2Context context, JET2Writer out) throws JET2TagException
	  {
		    super.doBeforeBody(td, context, out);
		  /*if(primeiraVez) {
			  primeiraVez = false;
			  // codigo que só roda uma vez
		  		String result = context.getTemplatePath();
		  		out.write("//T4:"+result+"\n");
		  }*/

	  		String result = context.getTemplatePath();
	  		cstack.push();
	  		out.write("<!--T4:"+result+"#"+cstack.top()+"-->\n");
			  

		  
	    // set variables and context objects for this interation
	    if (nodeSetIteration)
	    {
	      final Object currentObject = selectedObjects[currentIndex];
	      if(varName != null) {
	        context.setVariable(varName, currentObject);
	      }
	      if(updateContext(context)) {
	        XPathContextExtender.getInstance(context).pushXPathContextObject(currentObject);

	      }
	    }
	    else
	    {
	      // numeric based looping is 1-based, add 1 to the current index.
	      if(varName != null) {	    	  
	        context.setVariable(varName, new Long(currentIndex + 1));
	  		//out.write("	      // numeric based looping is 1-based, add 1 to the current index.\n");   

	      }
	    }

	  }
	  
	  /* (non-Javadoc)
	   * @see org.eclipse.jet.taglib.AbstractIteratingTag#doAfterBody(org.eclipse.jet.taglib.TagInfo, org.eclipse.jet.JET2Context, org.eclipse.jet.JET2Writer)
	   */
	  public void doAfterBody(TagInfo td, JET2Context context, JET2Writer out) throws JET2TagException
	  {
	    // restore variables, context objects from previous interation up variables
	    if (updateContext(context) && nodeSetIteration)
	    {
	      XPathContextExtender.getInstance(context).popXPathContextObject();
	    	//out.write("doAfterBody if \n");
	    }
	    
  		String result = context.getTemplatePath();
  		out.write("<!--T4:"+result+"#"+cstack.pop()+"-->\n");
	    }
		  

	  
	  /* (non-Javadoc)
	   * @see org.eclipse.jet.taglib.IteratingTag#doInitializeLoop(org.eclipse.jet.taglib.TagInfo, org.eclipse.jet.JET2Context)
	   */
	  public void doInitializeLoop(TagInfo td, JET2Context context) throws JET2TagException
	  {
		  //primeiraVez = true;
	    String selectXPath = getAttribute("select"); //$NON-NLS-1$
	    varName = getAttribute("var"); //$NON-NLS-1$


	    setDelimiter(getAttribute("delimiter")); //$NON-NLS-1$

	    XPathContextExtender xpathContext = XPathContextExtender.getInstance(context);

	    if (varName != null && context.hasVariable(varName))
	    {
	      savedVarValue = context.getVariable(varName);
	    }

	    final Object resultObject = xpathContext.resolveAsObject(xpathContext.currentXPathContextObject(), selectXPath);
	    if (resultObject instanceof Number)
	    {
	      nodeSetIteration = false;
	      maxIterations = ((Number)resultObject).longValue();
	    }
	    else if (resultObject instanceof NodeSet)
	    {
	      nodeSetIteration = true;
	      selectedObjects = ((NodeSet)resultObject).toArray();
	      maxIterations = selectedObjects.length;
	    }
	    else
	    {
	      throw new JET2TagException(MessageFormat.format(JET2Messages.IterateTag_CannotIterateOnResult, new Object []{ selectXPath }));
	    }
	    currentIndex = -1;
	    }

	  private boolean updateContext(JET2Context context)
	  {
	    if(updateContext == null) {
	      if(!context.hasVariable(UPDATE_CONTEXT_VAR)) {
	        updateContext = Boolean.FALSE;
	      } else {
	        updateContext = Boolean.valueOf(XPathUtil.xpathBoolean(context.getVariable(UPDATE_CONTEXT_VAR)));
	      }
	    }
	    return updateContext.booleanValue();
	  }

}
