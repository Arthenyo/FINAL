package org.example.QUESTAO3.imposto;

import org.example.QUESTAO3.model.Item;

public class PIS implements Imposto{
    @Override
    public double calcular(Item item) {
        double imposto = item.getValor() * 0.0065;
        item.setImpostoCalculado(imposto);
        item.setTotal(item.getValor() + imposto);
        return imposto;
    }
}
