package theodo.panier.Strategy.Thymeleaf;

import org.springframework.stereotype.Service;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.Context;

import lombok.RequiredArgsConstructor;
import theodo.panier.Interface.DocumentParameter;
import theodo.panier.Interface.Generator;

@RequiredArgsConstructor
@Service
public class ThymeleafStrategy implements Generator {
    private final ITemplateEngine thymeleafTemplateEngine;


    @Override
    public String generateHtml(DocumentParameter documentParameter){
        Context context = new Context();
        documentParameter.getDocumentInputs().entrySet().forEach((input -> context.setVariable(input.getKey(), input.getValue())));

        return thymeleafTemplateEngine.process("thymeleaf-template", context);
    }
    
}
