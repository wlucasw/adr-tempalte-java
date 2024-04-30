package theodo.panier.presentation.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import theodo.panier.Interface.DocumentParameter;
import theodo.panier.Strategy.Strategies;

@Getter
@Setter
@AllArgsConstructor
public class DocumentDto {
    Strategies strategy;
    DocumentParameter documentParameter;
}
