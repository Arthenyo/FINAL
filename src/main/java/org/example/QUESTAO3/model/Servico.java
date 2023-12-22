package org.example.QUESTAO3.model;

public class Servico extends Item{
    public Servico() {
    }
    public Servico(int codigo, String descricao, double valor, double impostoCalculado, double total) {
        super(codigo, descricao, valor, impostoCalculado, total);
    }

    @Override
    public String toString() {
        return "servico " +"\n" +
                "codigo= " + getCodigo() +"\n"+
                "descricao= " + getDescricao() +"\n" +
                "valor= " + getValor() +"\n" +
                "impostoCalculado= " + getImpostoCalculado() +"\n"+
                "total= " + (getValor() + getImpostoCalculado());
    }
}
