package theodo.panier.Strategy.FreeMaker;

import java.io.IOException;
import java.io.StringWriter;

import org.apache.tomcat.jni.File;
import org.springframework.stereotype.Service;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import lombok.RequiredArgsConstructor;
import theodo.panier.Interface.DocumentParameter;
import theodo.panier.Interface.Generator;

@RequiredArgsConstructor
@Service
public class FrameMakerStrategy implements Generator{

    
    @Override
    public String generateHtml(DocumentParameter documentParameter) throws IOException, TemplateException{


        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        configuration.setLogTemplateExceptions(false);
        final ClassTemplateLoader loader = new ClassTemplateLoader(DocumentParameter.class, "/templates");
        configuration.setTemplateLoader(loader);

        Template template = configuration.getTemplate("/free-maker-template.html");
        StringWriter stringWriter = new StringWriter();
        template.process(documentParameter.getDocumentInputs() , stringWriter);
        return stringWriter.toString();


    }
    
}
