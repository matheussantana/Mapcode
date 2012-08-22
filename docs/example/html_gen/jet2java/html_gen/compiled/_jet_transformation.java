package html_gen.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(4);
    static {
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/html.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/students.jet", //$NON-NLS-1$
                Integer.valueOf(3));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/dump.jet
                return new html_gen.compiled._jet_dump();
            case 1: // templates/html.jet
                return new html_gen.compiled._jet_html();
            case 2: // templates/main.jet
                return new html_gen.compiled._jet_main();
            case 3: // templates/students.jet
                return new html_gen.compiled._jet_students();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
