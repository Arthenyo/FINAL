package org.example.QUESTAO2;

public class Produto {
    private String descricao;
    private Double precoLata;
    private Double precoCaixa;
    private String codigoBarra;

    public Produto() {
    }

    public Produto(String descricao, Double precoLata, Double precoCaixa, String codigoBarra) {
        this.descricao = descricao;
        this.precoLata = precoLata;
        this.precoCaixa = precoCaixa;
        this.codigoBarra = codigoBarra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoLata() {
        return precoLata;
    }

    public void setPrecoLata(Double precoLata) {
        this.precoLata = precoLata;
    }

    public Double getPrecoCaixa() {
        return precoCaixa;
    }

    public void setPrecoCaixa(Double precoCaixa) {
        this.precoCaixa = precoCaixa;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
}
