package html_gen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_mbct = "br.ufscar.dc.mapcode.MapcodeTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_mbct_iterate_30_1 = new TagInfo("mbct:iterate", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/survey", //$NON-NLS-1$
                "currHtml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_file_32_2 = new TagInfo("mbct:file", //$NON-NLS-1$
            32, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/html.jet", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/generated/test.html", //$NON-NLS-1$
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
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_mbct_iterate_30_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "iterate", "mbct:iterate", _td_mbct_iterate_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_mbct_iterate_30_1.setRuntimeParent(null);
        _jettag_mbct_iterate_30_1.setTagInfo(_td_mbct_iterate_30_1);
        _jettag_mbct_iterate_30_1.doStart(context, out);
        while (_jettag_mbct_iterate_30_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mbct_file_32_2 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "file", "mbct:file", _td_mbct_file_32_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_file_32_2.setRuntimeParent(_jettag_mbct_iterate_30_1);
            _jettag_mbct_file_32_2.setTagInfo(_td_mbct_file_32_2);
            _jettag_mbct_file_32_2.doStart(context, out);
            _jettag_mbct_file_32_2.doEnd();
            out.write(NL);         
            _jettag_mbct_iterate_30_1.handleBodyContent(out);
        }
        _jettag_mbct_iterate_30_1.doEnd();
    }
}
