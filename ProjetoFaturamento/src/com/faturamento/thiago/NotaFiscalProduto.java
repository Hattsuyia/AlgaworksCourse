package com.faturamento.thiago;

public class NotaFiscalProduto extends NotaFiscal{

    public static final double ALIQUOTA_IMPOSTOS_FEDERAIS = 0.18;
    public static final double ALIQUOTA_IMPOSTOS_ESTADUAIS = 0.12;
    private double valorFrente;

    public NotaFiscalProduto(String descricao, double valorTotal, double valorFrente) {
        super(descricao, valorTotal);
        this.valorFrente = valorFrente;
    }

    public double getValorFrente() {
        return valorFrente;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS_ESTADUAIS;
        valorImpostos += getValorTotal() * ALIQUOTA_IMPOSTOS_FEDERAIS;

        return valorImpostos;
    }
}
