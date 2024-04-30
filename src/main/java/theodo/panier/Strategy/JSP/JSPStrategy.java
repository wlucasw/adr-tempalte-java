package theodo.panier.Strategy.JSP;

import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import theodo.panier.Interface.DocumentParameter;
import theodo.panier.Interface.Generator;
@RequiredArgsConstructor
@Service
public class JSPStrategy implements Generator {

    @Override
    public String generateHtml(DocumentParameter documentParameter){
        return("JSP");
    }
}
