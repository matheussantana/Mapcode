package html_gen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_students implements JET2Template {
    private static final String _jetns_mbct = "br.ufscar.dc.mapcode.MapcodeTags"; //$NON-NLS-1$

    public _jet_students() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_mbct_scopy_30_1 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            30, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_iterate_34_1 = new TagInfo("mbct:iterate", //$NON-NLS-1$
            34, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/survey/student", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_set_36_3 = new TagInfo("mbct:set", //$NON-NLS-1$
            36, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$p", //$NON-NLS-1$
                "className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_Get_37_3 = new TagInfo("mbct:Get", //$NON-NLS-1$
            37, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$p/@student_id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_Get_37_39 = new TagInfo("mbct:Get", //$NON-NLS-1$
            37, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$p/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_Get_38_3 = new TagInfo("mbct:Get", //$NON-NLS-1$
            38, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$p/name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_39_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            39, 3,
            new String[] {
            },
            new String[] {
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
        RuntimeTagElement _jettag_mbct_scopy_30_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_mbct_scopy_30_1.setRuntimeParent(null);
        _jettag_mbct_scopy_30_1.setTagInfo(_td_mbct_scopy_30_1);
        _jettag_mbct_scopy_30_1.doStart(context, out);
        JET2Writer _jettag_mbct_scopy_30_1_saved_out = out;
        while (_jettag_mbct_scopy_30_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("students:<p>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_mbct_scopy_30_1.handleBodyContent(out);
        }
        out = _jettag_mbct_scopy_30_1_saved_out;
        _jettag_mbct_scopy_30_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_mbct_iterate_34_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "iterate", "mbct:iterate", _td_mbct_iterate_34_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_mbct_iterate_34_1.setRuntimeParent(null);
        _jettag_mbct_iterate_34_1.setTagInfo(_td_mbct_iterate_34_1);
        _jettag_mbct_iterate_34_1.doStart(context, out);
        while (_jettag_mbct_iterate_34_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_mbct_set_36_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "set", "mbct:set", _td_mbct_set_36_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_set_36_3.setRuntimeParent(_jettag_mbct_iterate_34_1);
            _jettag_mbct_set_36_3.setTagInfo(_td_mbct_set_36_3);
            _jettag_mbct_set_36_3.doStart(context, out);
            while (_jettag_mbct_set_36_3.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_Get_37_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_37_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_Get_37_3.setRuntimeParent(_jettag_mbct_set_36_3);
                _jettag_mbct_Get_37_3.setTagInfo(_td_mbct_Get_37_3);
                _jettag_mbct_Get_37_3.doStart(context, out);
                _jettag_mbct_Get_37_3.doEnd();
                RuntimeTagElement _jettag_mbct_Get_37_39 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_37_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_Get_37_39.setRuntimeParent(_jettag_mbct_set_36_3);
                _jettag_mbct_Get_37_39.setTagInfo(_td_mbct_Get_37_39);
                _jettag_mbct_Get_37_39.doStart(context, out);
                _jettag_mbct_Get_37_39.doEnd();
                _jettag_mbct_set_36_3.handleBodyContent(out);
            }
            _jettag_mbct_set_36_3.doEnd();
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mbct_Get_38_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_38_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_Get_38_3.setRuntimeParent(_jettag_mbct_iterate_34_1);
            _jettag_mbct_Get_38_3.setTagInfo(_td_mbct_Get_38_3);
            _jettag_mbct_Get_38_3.doStart(context, out);
            _jettag_mbct_Get_38_3.doEnd();
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mbct_scopy_39_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_39_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_scopy_39_3.setRuntimeParent(_jettag_mbct_iterate_34_1);
            _jettag_mbct_scopy_39_3.setTagInfo(_td_mbct_scopy_39_3);
            _jettag_mbct_scopy_39_3.doStart(context, out);
            JET2Writer _jettag_mbct_scopy_39_3_saved_out = out;
            while (_jettag_mbct_scopy_39_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                _jettag_mbct_scopy_39_3.handleBodyContent(out);
            }
            out = _jettag_mbct_scopy_39_3_saved_out;
            _jettag_mbct_scopy_39_3.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_mbct_iterate_34_1.handleBodyContent(out);
        }
        _jettag_mbct_iterate_34_1.doEnd();
    }
}
