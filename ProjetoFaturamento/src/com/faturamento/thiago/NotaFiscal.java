package com.faturamento.thiago;

public abstract class NotaFiscal {

    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos ();

    public void emitir() {
        System.out.printf("Emitindo Nota Fiscal para %s%n", getDescricao());
        System.out.printf("Valor total: R$%.2f%n", getValorTotal());
        System.out.printf("Impostos: R$%.2f%n", calcularImpostos());
    }
}