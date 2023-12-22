package org.example.QUESTAO3.imposto;

import org.example.QUESTAO3.model.Item;
import org.example.QUESTAO3.model.Servico;

public class ISS implements Imposto{
    @Override
    public double calcular(Item item) {
        if (item instanceof Servico) {
            double imposto = item.getValor() * 0.22;
            item.setImpostoCalculado(imposto);
            item.setTotal(item.getValor() + imposto);
            return imposto;
        } else {
            return 0;
        }
    }
}
