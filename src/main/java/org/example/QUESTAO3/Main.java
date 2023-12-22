package org.example.QUESTAO3;

import org.example.QUESTAO3.factory.ImpostoFactory;
import org.example.QUESTAO3.imposto.Imposto;
import org.example.QUESTAO3.model.Produto;
import org.example.QUESTAO3.model.Servico;
import org.example.QUESTAO3.model.enums.TipoImposto;

public class Main {
    public static void main(String[] args) {
        Imposto impostoICMS = ImpostoFactory.getImposto(TipoImposto.TIPO_ICMS);
        Imposto impostoIPI = ImpostoFactory.getImposto(TipoImposto.TIPO_IPI);
        Imposto impostoISS = ImpostoFactory.getImposto(TipoImposto.TIPO_ISS);
        Imposto impostoPIS = ImpostoFactory.getImposto(TipoImposto.TIPO_PIS);

        Produto produto1 = new Produto();
        produto1.setCodigo(1);
        produto1.setDescricao("Milho");
        produto1.setValor(100);
        produto1.setIndustrial(false);
        produto1.setImpostoCalculado(impostoICMS.calcular(produto1));

        Produto produto2 = new Produto();
        produto2.setCodigo(2);
        produto2.setDescricao("Milho2");
        produto2.setValor(100);
        produto2.setIndustrial(true);
        produto2.setImpostoCalculado(impostoIPI.calcular(produto2));

        Servico servico = new Servico();
        servico.setCodigo(3);
        servico.setDescricao("Milho3");
        servico.setValor(100);
        servico.setImpostoCalculado(impostoISS.calcular(servico));

        Produto produto4 = new Produto();
        produto4.setCodigo(4);
        produto4.setDescricao("Milho4");
        produto4.setValor(100);
        produto4.setIndustrial(false);
        produto4.setImpostoCalculado(impostoPIS.calcular(produto4));

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(servico);
        System.out.println(produto4);

    }
}
