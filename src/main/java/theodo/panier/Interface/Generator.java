package theodo.panier.Interface;

import java.io.IOException;

import freemarker.template.TemplateException;

public interface Generator {
    String generateHtml(DocumentParameter documentParameter) throws IOException, TemplateException;
}
