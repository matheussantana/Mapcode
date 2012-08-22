package mapcodecustomtags;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.internal.taglib.workspace.WsFileFromWriterAction;
import org.eclipse.jet.taglib.AbstractEmptyTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.taglib.workspace.WorkspaceContextExtender;
import org.eclipse.jet.transform.TransformContextExtender;

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

public class File extends AbstractEmptyTag {


	  private static final String TEMPLATE__ATTR = "template"; //$NON-NLS-1$

	  private static final String PATH__ATTR = "path"; //$NON-NLS-1$

	  private static final String REPLACE__ATTR = "replace"; //$NON-NLS-1$

	  private static final String DERIVED__ATTR = "derived"; //$NON-NLS-1$

	  private static final String ENCODING__ATTR = "encoding"; //$NON-NLS-1$

      ControlStack stack = new ControlStack();

	  /**
	   * 
	   */

	public File() {
		super();
	}

	@Override
	public void doAction(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {


		  
		   IPath path = new Path(getAttribute(PATH__ATTR));
		    String templatePath = getAttribute(TEMPLATE__ATTR);

			  String result = context.getTemplatePath();
			 out.write("<!-- T7-Parent:"+result+"-->");			
			  out.write("\n<!--T7-Child:");
		      stack.push();
			  out.write(templatePath+"#"+stack.top()+"-->\n");
			  stack.pop();
		    
		    boolean replace = true;
		    if (td.hasAttribute(REPLACE__ATTR))
		    {
		      replace = Boolean.valueOf(getAttribute(REPLACE__ATTR)).booleanValue();
		    }
		    boolean derived = false;
		    if (td.hasAttribute(DERIVED__ATTR))
		    {
		      derived = Boolean.valueOf(getAttribute(DERIVED__ATTR)).booleanValue();
		    }

		    WorkspaceContextExtender wsExtender = WorkspaceContextExtender.getInstance(context);

		    IFile file = getTargetFile(path, wsExtender);

		    if(replace == false && file.exists()) {
		      // don't need to run template or create action...
		      return;
		    }
		    
		    BodyContentWriter contentWriter = new BodyContentWriter();
		    TransformContextExtender tce = TransformContextExtender.getInstance(context);
		    tce.execute(templatePath, contentWriter);

		    WsFileFromWriterAction fileAction = new WsFileFromWriterAction(
		      context.getTemplatePath(),
		      td,
		      file,
		      contentWriter,
		      replace,
		      derived);
		    
		    if (td.hasAttribute(ENCODING__ATTR))
		    {
		      fileAction.setEncoding(getAttribute(ENCODING__ATTR));
		    }
		    wsExtender.addAction(fileAction);

	}
	  private IFile getTargetFile(IPath path, WorkspaceContextExtender wsExtender) throws JET2TagException
	  {
	    IFile file;
	    if (path.isAbsolute() || !wsExtender.existsContainer())
	    {
	      try
	      {
	        file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
	      }
	      catch (IllegalArgumentException e)
	      {
	        throw new JET2TagException(e.getLocalizedMessage(), e);
	      }
	    }
	    else
	    {
	      file = wsExtender.getContainer().getFile(path);
	    }
	    return file;
	  }


}
