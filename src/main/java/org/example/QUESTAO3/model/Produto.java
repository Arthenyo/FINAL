package org.example.QUESTAO3.model;

public class Produto extends Item{
    private boolean industrial;

    public Produto() {
    }

    public Produto(int codigo, String descricao, double valor, double impostoCalculado, double total, boolean industrial) {
        super(codigo, descricao, valor, impostoCalculado, total);
        this.industrial = industrial;
    }

    public boolean isIndustrial() {
        return industrial;
    }

    public void setIndustrial(boolean industrial) {
        this.industrial = industrial;
    }

    @Override
    public String toString() {
        return "Produto " +"\n" +
                "codigo= " + getCodigo() +"\n"+
                "descricao= " + getDescricao() +"\n" +
                "valor= " + getValor() +"\n" +
                "impostoCalculado= " + getImpostoCalculado() +"\n"+
                "total= " + (getValor() + getImpostoCalculado());
    }
}
