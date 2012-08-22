package html_gen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_html implements JET2Template {
    private static final String _jetns_mbct = "br.ufscar.dc.mapcode.MapcodeTags"; //$NON-NLS-1$

    public _jet_html() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_mbct_scopy_30_1 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            30, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_Get_35_1 = new TagInfo("mbct:Get", //$NON-NLS-1$
            35, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currHtml/@title", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_36_1 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            36, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_iterate_42_1 = new TagInfo("mbct:iterate", //$NON-NLS-1$
            42, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currHtml/question", //$NON-NLS-1$
                "t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_MyIfTag_44_2 = new TagInfo("mbct:MyIfTag", //$NON-NLS-1$
            44, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$t/@num = '1'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_Get_46_3 = new TagInfo("mbct:Get", //$NON-NLS-1$
            46, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$t/@type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_47_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            47, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_Get_50_3 = new TagInfo("mbct:Get", //$NON-NLS-1$
            50, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$t/content", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_51_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            51, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_MyIfTag_56_2 = new TagInfo("mbct:MyIfTag", //$NON-NLS-1$
            56, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$t/@num = '2'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_58_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            58, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_Get_62_3 = new TagInfo("mbct:Get", //$NON-NLS-1$
            62, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$t/@type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_63_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            63, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_iterate_66_4 = new TagInfo("mbct:iterate", //$NON-NLS-1$
            66, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$t/option", //$NON-NLS-1$
                "r", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_67_5 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            67, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_Get_70_5 = new TagInfo("mbct:Get", //$NON-NLS-1$
            70, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$r/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_70_33 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            70, 33,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_Get_71_5 = new TagInfo("mbct:Get", //$NON-NLS-1$
            71, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$r", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_72_5 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            72, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_MyIfTag_78_2 = new TagInfo("mbct:MyIfTag", //$NON-NLS-1$
            78, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$t/@num = '3'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_79_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            79, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_Get_82_3 = new TagInfo("mbct:Get", //$NON-NLS-1$
            82, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$t/@type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_83_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            83, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_Get_86_3 = new TagInfo("mbct:Get", //$NON-NLS-1$
            86, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$t/content", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_87_3 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            87, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_mbct_file_92_1 = new TagInfo("mbct:file", //$NON-NLS-1$
            92, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/students.jet", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/generated/students.html", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_include_94_2 = new TagInfo("mbct:include", //$NON-NLS-1$
            94, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/students.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mbct_scopy_96_1 = new TagInfo("mbct:scopy", //$NON-NLS-1$
            96, 1,
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
            out.write("<html>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<head>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<title>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_mbct_scopy_30_1.handleBodyContent(out);
        }
        out = _jettag_mbct_scopy_30_1_saved_out;
        _jettag_mbct_scopy_30_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_mbct_Get_35_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_mbct_Get_35_1.setRuntimeParent(null);
        _jettag_mbct_Get_35_1.setTagInfo(_td_mbct_Get_35_1);
        _jettag_mbct_Get_35_1.doStart(context, out);
        _jettag_mbct_Get_35_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_mbct_scopy_36_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_36_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_mbct_scopy_36_1.setRuntimeParent(null);
        _jettag_mbct_scopy_36_1.setTagInfo(_td_mbct_scopy_36_1);
        _jettag_mbct_scopy_36_1.doStart(context, out);
        JET2Writer _jettag_mbct_scopy_36_1_saved_out = out;
        while (_jettag_mbct_scopy_36_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("</title>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</head>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<body>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_mbct_scopy_36_1.handleBodyContent(out);
        }
        out = _jettag_mbct_scopy_36_1_saved_out;
        _jettag_mbct_scopy_36_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_mbct_iterate_42_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "iterate", "mbct:iterate", _td_mbct_iterate_42_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_mbct_iterate_42_1.setRuntimeParent(null);
        _jettag_mbct_iterate_42_1.setTagInfo(_td_mbct_iterate_42_1);
        _jettag_mbct_iterate_42_1.doStart(context, out);
        while (_jettag_mbct_iterate_42_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_mbct_MyIfTag_44_2 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "MyIfTag", "mbct:MyIfTag", _td_mbct_MyIfTag_44_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_MyIfTag_44_2.setRuntimeParent(_jettag_mbct_iterate_42_1);
            _jettag_mbct_MyIfTag_44_2.setTagInfo(_td_mbct_MyIfTag_44_2);
            _jettag_mbct_MyIfTag_44_2.doStart(context, out);
            while (_jettag_mbct_MyIfTag_44_2.okToProcessBody()) {
                out.write("\t\t<FONT size=\"3\" face=\"Tahoma\" color=\"blue\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_Get_46_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_46_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_Get_46_3.setRuntimeParent(_jettag_mbct_MyIfTag_44_2);
                _jettag_mbct_Get_46_3.setTagInfo(_td_mbct_Get_46_3);
                _jettag_mbct_Get_46_3.doStart(context, out);
                _jettag_mbct_Get_46_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_scopy_47_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_47_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_scopy_47_3.setRuntimeParent(_jettag_mbct_MyIfTag_44_2);
                _jettag_mbct_scopy_47_3.setTagInfo(_td_mbct_scopy_47_3);
                _jettag_mbct_scopy_47_3.doStart(context, out);
                JET2Writer _jettag_mbct_scopy_47_3_saved_out = out;
                while (_jettag_mbct_scopy_47_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("\t\t\t</FONT> <p>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    _jettag_mbct_scopy_47_3.handleBodyContent(out);
                }
                out = _jettag_mbct_scopy_47_3_saved_out;
                _jettag_mbct_scopy_47_3.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_Get_50_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_50_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_Get_50_3.setRuntimeParent(_jettag_mbct_MyIfTag_44_2);
                _jettag_mbct_Get_50_3.setTagInfo(_td_mbct_Get_50_3);
                _jettag_mbct_Get_50_3.doStart(context, out);
                _jettag_mbct_Get_50_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_scopy_51_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_51_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_scopy_51_3.setRuntimeParent(_jettag_mbct_MyIfTag_44_2);
                _jettag_mbct_scopy_51_3.setTagInfo(_td_mbct_scopy_51_3);
                _jettag_mbct_scopy_51_3.doStart(context, out);
                JET2Writer _jettag_mbct_scopy_51_3_saved_out = out;
                while (_jettag_mbct_scopy_51_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("\t\t\t<p> <INPUT TYPE \"TEXT\" NAME=\"name\" SIZE=50 VALUE=\"\"> </p>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    _jettag_mbct_scopy_51_3.handleBodyContent(out);
                }
                out = _jettag_mbct_scopy_51_3_saved_out;
                _jettag_mbct_scopy_51_3.doEnd();
                out.write(NL);         
                _jettag_mbct_MyIfTag_44_2.handleBodyContent(out);
            }
            _jettag_mbct_MyIfTag_44_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_mbct_MyIfTag_56_2 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "MyIfTag", "mbct:MyIfTag", _td_mbct_MyIfTag_56_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_MyIfTag_56_2.setRuntimeParent(_jettag_mbct_iterate_42_1);
            _jettag_mbct_MyIfTag_56_2.setTagInfo(_td_mbct_MyIfTag_56_2);
            _jettag_mbct_MyIfTag_56_2.doStart(context, out);
            while (_jettag_mbct_MyIfTag_56_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_scopy_58_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_58_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_scopy_58_3.setRuntimeParent(_jettag_mbct_MyIfTag_56_2);
                _jettag_mbct_scopy_58_3.setTagInfo(_td_mbct_scopy_58_3);
                _jettag_mbct_scopy_58_3.doStart(context, out);
                JET2Writer _jettag_mbct_scopy_58_3_saved_out = out;
                while (_jettag_mbct_scopy_58_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("\t\t\t<FONT size=\"3\" face=\"Tahoma\" color=\"blue\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    _jettag_mbct_scopy_58_3.handleBodyContent(out);
                }
                out = _jettag_mbct_scopy_58_3_saved_out;
                _jettag_mbct_scopy_58_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_Get_62_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_62_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_Get_62_3.setRuntimeParent(_jettag_mbct_MyIfTag_56_2);
                _jettag_mbct_Get_62_3.setTagInfo(_td_mbct_Get_62_3);
                _jettag_mbct_Get_62_3.doStart(context, out);
                _jettag_mbct_Get_62_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_scopy_63_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_63_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_scopy_63_3.setRuntimeParent(_jettag_mbct_MyIfTag_56_2);
                _jettag_mbct_scopy_63_3.setTagInfo(_td_mbct_scopy_63_3);
                _jettag_mbct_scopy_63_3.doStart(context, out);
                JET2Writer _jettag_mbct_scopy_63_3_saved_out = out;
                while (_jettag_mbct_scopy_63_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("\t\t\t</FONT> <p>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    _jettag_mbct_scopy_63_3.handleBodyContent(out);
                }
                out = _jettag_mbct_scopy_63_3_saved_out;
                _jettag_mbct_scopy_63_3.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_mbct_iterate_66_4 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "iterate", "mbct:iterate", _td_mbct_iterate_66_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_iterate_66_4.setRuntimeParent(_jettag_mbct_MyIfTag_56_2);
                _jettag_mbct_iterate_66_4.setTagInfo(_td_mbct_iterate_66_4);
                _jettag_mbct_iterate_66_4.doStart(context, out);
                while (_jettag_mbct_iterate_66_4.okToProcessBody()) {
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_mbct_scopy_67_5 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_67_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_mbct_scopy_67_5.setRuntimeParent(_jettag_mbct_iterate_66_4);
                    _jettag_mbct_scopy_67_5.setTagInfo(_td_mbct_scopy_67_5);
                    _jettag_mbct_scopy_67_5.doStart(context, out);
                    JET2Writer _jettag_mbct_scopy_67_5_saved_out = out;
                    while (_jettag_mbct_scopy_67_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(NL);         
                        out.write("\t\t\t\t<INPUT TYPE=\"RADIO\" NAME=\"test1\" VALUE=\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        _jettag_mbct_scopy_67_5.handleBodyContent(out);
                    }
                    out = _jettag_mbct_scopy_67_5_saved_out;
                    _jettag_mbct_scopy_67_5.doEnd();
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_mbct_Get_70_5 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_70_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_mbct_Get_70_5.setRuntimeParent(_jettag_mbct_iterate_66_4);
                    _jettag_mbct_Get_70_5.setTagInfo(_td_mbct_Get_70_5);
                    _jettag_mbct_Get_70_5.doStart(context, out);
                    _jettag_mbct_Get_70_5.doEnd();
                    RuntimeTagElement _jettag_mbct_scopy_70_33 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_70_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_mbct_scopy_70_33.setRuntimeParent(_jettag_mbct_iterate_66_4);
                    _jettag_mbct_scopy_70_33.setTagInfo(_td_mbct_scopy_70_33);
                    _jettag_mbct_scopy_70_33.doStart(context, out);
                    JET2Writer _jettag_mbct_scopy_70_33_saved_out = out;
                    while (_jettag_mbct_scopy_70_33.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" \"> ");  //$NON-NLS-1$        
                        _jettag_mbct_scopy_70_33.handleBodyContent(out);
                    }
                    out = _jettag_mbct_scopy_70_33_saved_out;
                    _jettag_mbct_scopy_70_33.doEnd();
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_mbct_Get_71_5 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_71_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_mbct_Get_71_5.setRuntimeParent(_jettag_mbct_iterate_66_4);
                    _jettag_mbct_Get_71_5.setTagInfo(_td_mbct_Get_71_5);
                    _jettag_mbct_Get_71_5.doStart(context, out);
                    _jettag_mbct_Get_71_5.doEnd();
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_mbct_scopy_72_5 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_72_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_mbct_scopy_72_5.setRuntimeParent(_jettag_mbct_iterate_66_4);
                    _jettag_mbct_scopy_72_5.setTagInfo(_td_mbct_scopy_72_5);
                    _jettag_mbct_scopy_72_5.doStart(context, out);
                    JET2Writer _jettag_mbct_scopy_72_5_saved_out = out;
                    while (_jettag_mbct_scopy_72_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t<p> ");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        _jettag_mbct_scopy_72_5.handleBodyContent(out);
                    }
                    out = _jettag_mbct_scopy_72_5_saved_out;
                    _jettag_mbct_scopy_72_5.doEnd();
                    out.write(NL);         
                    _jettag_mbct_iterate_66_4.handleBodyContent(out);
                }
                _jettag_mbct_iterate_66_4.doEnd();
                _jettag_mbct_MyIfTag_56_2.handleBodyContent(out);
            }
            _jettag_mbct_MyIfTag_56_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_mbct_MyIfTag_78_2 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "MyIfTag", "mbct:MyIfTag", _td_mbct_MyIfTag_78_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_MyIfTag_78_2.setRuntimeParent(_jettag_mbct_iterate_42_1);
            _jettag_mbct_MyIfTag_78_2.setTagInfo(_td_mbct_MyIfTag_78_2);
            _jettag_mbct_MyIfTag_78_2.doStart(context, out);
            while (_jettag_mbct_MyIfTag_78_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_scopy_79_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_79_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_scopy_79_3.setRuntimeParent(_jettag_mbct_MyIfTag_78_2);
                _jettag_mbct_scopy_79_3.setTagInfo(_td_mbct_scopy_79_3);
                _jettag_mbct_scopy_79_3.doStart(context, out);
                JET2Writer _jettag_mbct_scopy_79_3_saved_out = out;
                while (_jettag_mbct_scopy_79_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("\t\t<FONT size=\"3\" face=\"Tahoma\" color=\"blue\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    _jettag_mbct_scopy_79_3.handleBodyContent(out);
                }
                out = _jettag_mbct_scopy_79_3_saved_out;
                _jettag_mbct_scopy_79_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_Get_82_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_82_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_Get_82_3.setRuntimeParent(_jettag_mbct_MyIfTag_78_2);
                _jettag_mbct_Get_82_3.setTagInfo(_td_mbct_Get_82_3);
                _jettag_mbct_Get_82_3.doStart(context, out);
                _jettag_mbct_Get_82_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_scopy_83_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_83_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_scopy_83_3.setRuntimeParent(_jettag_mbct_MyIfTag_78_2);
                _jettag_mbct_scopy_83_3.setTagInfo(_td_mbct_scopy_83_3);
                _jettag_mbct_scopy_83_3.doStart(context, out);
                JET2Writer _jettag_mbct_scopy_83_3_saved_out = out;
                while (_jettag_mbct_scopy_83_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("\t\t</FONT> <p>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    _jettag_mbct_scopy_83_3.handleBodyContent(out);
                }
                out = _jettag_mbct_scopy_83_3_saved_out;
                _jettag_mbct_scopy_83_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_Get_86_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "Get", "mbct:Get", _td_mbct_Get_86_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_Get_86_3.setRuntimeParent(_jettag_mbct_MyIfTag_78_2);
                _jettag_mbct_Get_86_3.setTagInfo(_td_mbct_Get_86_3);
                _jettag_mbct_Get_86_3.doStart(context, out);
                _jettag_mbct_Get_86_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_mbct_scopy_87_3 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_87_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_mbct_scopy_87_3.setRuntimeParent(_jettag_mbct_MyIfTag_78_2);
                _jettag_mbct_scopy_87_3.setTagInfo(_td_mbct_scopy_87_3);
                _jettag_mbct_scopy_87_3.doStart(context, out);
                JET2Writer _jettag_mbct_scopy_87_3_saved_out = out;
                while (_jettag_mbct_scopy_87_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("\t\t</p><INPUT TYPE=\"RADIO\" NAME=\"test2\" VALUE=\"True\">True<p>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t<INPUT TYPE=\"RADIO\" NAME=\"test2\" VALUE=\"False\">False<p>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    _jettag_mbct_scopy_87_3.handleBodyContent(out);
                }
                out = _jettag_mbct_scopy_87_3_saved_out;
                _jettag_mbct_scopy_87_3.doEnd();
                out.write(NL);         
                _jettag_mbct_MyIfTag_78_2.handleBodyContent(out);
            }
            _jettag_mbct_MyIfTag_78_2.doEnd();
            RuntimeTagElement _jettag_mbct_file_92_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "file", "mbct:file", _td_mbct_file_92_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_file_92_1.setRuntimeParent(_jettag_mbct_iterate_42_1);
            _jettag_mbct_file_92_1.setTagInfo(_td_mbct_file_92_1);
            _jettag_mbct_file_92_1.doStart(context, out);
            _jettag_mbct_file_92_1.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mbct_include_94_2 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "include", "mbct:include", _td_mbct_include_94_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mbct_include_94_2.setRuntimeParent(_jettag_mbct_iterate_42_1);
            _jettag_mbct_include_94_2.setTagInfo(_td_mbct_include_94_2);
            _jettag_mbct_include_94_2.doStart(context, out);
            _jettag_mbct_include_94_2.doEnd();
            out.write(NL);         
            _jettag_mbct_iterate_42_1.handleBodyContent(out);
        }
        _jettag_mbct_iterate_42_1.doEnd();
        RuntimeTagElement _jettag_mbct_scopy_96_1 = context.getTagFactory().createRuntimeTag(_jetns_mbct, "scopy", "mbct:scopy", _td_mbct_scopy_96_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_mbct_scopy_96_1.setRuntimeParent(null);
        _jettag_mbct_scopy_96_1.setTagInfo(_td_mbct_scopy_96_1);
        _jettag_mbct_scopy_96_1.doStart(context, out);
        JET2Writer _jettag_mbct_scopy_96_1_saved_out = out;
        while (_jettag_mbct_scopy_96_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("</body>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</html>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_mbct_scopy_96_1.handleBodyContent(out);
        }
        out = _jettag_mbct_scopy_96_1_saved_out;
        _jettag_mbct_scopy_96_1.doEnd();
    }
}
