package com.faturamento.thiago;

public class GestorFiscal {

    public void emitirNotasFiscais (NotaFiscal...notaFiscais){
        for (NotaFiscal notaFiscal : notaFiscais) {
            notaFiscal.emitir();
            System.out.println("------------------------------");
        }
    }
}
