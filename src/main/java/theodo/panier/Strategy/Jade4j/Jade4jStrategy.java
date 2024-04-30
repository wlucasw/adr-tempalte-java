package theodo.panier.Strategy.Jade4j;

import java.io.IOException;
import org.springframework.stereotype.Service;

import de.neuland.jade4j.Jade4J;
import de.neuland.jade4j.model.JadeModel;
import lombok.RequiredArgsConstructor;
import theodo.panier.Interface.DocumentParameter;
import theodo.panier.Interface.Generator;

@Service
@RequiredArgsConstructor
public class Jade4jStrategy implements Generator{

    
    @Override
    public String generateHtml(DocumentParameter documentParameter) throws IOException{


        JadeModel jadeModel = new JadeModel(documentParameter.getDocumentInputs());



        return Jade4J.render(Jade4J.getTemplate("/Users/lucaspanier/Documents/panier/src/main/resources/templates/jade.jade"), jadeModel);
    }
    
}
