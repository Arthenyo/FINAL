package org.example.QUESTAO2;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("CERVEJA",6.0,35.0,"78936683");
        String etiquetaZPL = GeradorDeEtiqueta.gerarEtiqueta(produto);
        System.out.println(etiquetaZPL);
    }
}
