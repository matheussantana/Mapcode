package deprecated;
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
import org.eclipse.jet.taglib.AbstractEmptyTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;

@Deprecated public class DisplayHelloWorld extends AbstractEmptyTag {

	public DisplayHelloWorld() {
		
	}

	public void doAction(TagInfo td, JET2Context context, JET2Writer out) throws JET2TagException {
		String nome = getAttribute("nome");
		String strNumVezes = getAttribute("numVezes");
		int numVezes = 1;
		if(strNumVezes != null)
			numVezes = Integer.parseInt(strNumVezes);
		for(int i=0;i<numVezes;i++) {
			out.write("Ola, "+nome+"!");
		}

	}

}
