package org.example.QUESTAO2;

public class GeradorDeEtiqueta {
    public static String gerarEtiqueta(Produto produto) {
        String descricaoProduto = produto.getDescricao();
        if (descricaoProduto.length() > 22) {
            descricaoProduto = descricaoProduto.substring(0, 22);
        }

        String precoLataFormatado = String.format("R$ %.2f", produto.getPrecoLata());
        String precoCaixaFormatado = String.format("R$ %.2f", produto.getPrecoCaixa());
        String codigoBarras = produto.getCodigoBarra();

        String zpl = "^XA\n"
                + "^CF0,60\n"
                + "^FO50,50^ADN,36,20^FD" + descricaoProduto + "^FS\n"
                + "^CF0,40\n"
                + "^FO50,200^FD" + precoLataFormatado + "^FS\n"
                + "^CF0,40\n"
                + "^FO50,280^FD" + precoCaixaFormatado + "^FS\n"
                + "^BY5,2,270\n"
                + "^FO100,450^BC^FD" + codigoBarras + "^FS\n"
                + "^XZ\n";

        return zpl;
    }
}
