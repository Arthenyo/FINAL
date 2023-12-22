package org.example.QUESTAO3.imposto;

import org.example.QUESTAO3.model.Item;
import org.example.QUESTAO3.model.Produto;

public class IPI implements Imposto{
    @Override
    public double calcular(Item item) {
        double imposto = 0;
        if (item instanceof Produto && ((Produto)item).isIndustrial()) {
            imposto = item.getValor() * 0.12;
        }
        item.setImpostoCalculado(imposto);
        item.setTotal(item.getValor() + imposto);
        return imposto;
    }
}
