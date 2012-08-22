package html_gen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_dump implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_dump() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_dump_27_1 = new TagInfo("c:dump", //$NON-NLS-1$
            27, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "format", //$NON-NLS-1$
                "entities", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 
        //Example Mapcode - HTML code generator(JET engine based)
        //http://matheussantana.github.com/Mapcode
        //
        //In this example we generate two HTML codes with annotations(HTML comments) for each mapping type based
        //on templates(html.jet and students.jet) and a input model(model.xml).
        //
        //Each Mapcode tag is represented with mbct prefix.
        //
        //   Copyright (C) 2012 Matheus Santana
        //    This program is free software: you can redistribute it and/or modify
        //    it under the terms of the GNU General Public License as published by
        //    the Free Software Foundation, either version 3 of the License, or
        //    (at your option) any later version.
        //
        //    This program is distributed in the hope that it will be useful,
        //    but WITHOUT ANY WARRANTY; without even the implied warranty of
        //    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        //    GNU General Public License for more details.
        //
        //    You should have received a copy of the GNU General Public License
        //    along with this program.  If not, see <http://www.gnu.org/licenses/>.
        //
        //Created by: Matheus Santana (matheusslima <at> yahoo <dot> com <dot> br)    
        out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_dump_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "dump", "c:dump", _td_c_dump_27_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_dump_27_1.setRuntimeParent(null);
        _jettag_c_dump_27_1.setTagInfo(_td_c_dump_27_1);
        _jettag_c_dump_27_1.doStart(context, out);
        _jettag_c_dump_27_1.doEnd();
        out.write(NL);         
    }
}
