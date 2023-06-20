package com.github.hattsuyia.cartaobeneficios.servico;

import com.github.hattsuyia.cartaobeneficios.Cartao;
import com.github.hattsuyia.cartaobeneficios.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        //TODO faz cobrança do valor no pix

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que %.2f\", Cartao.VALOR_MINIMO_DEPOSITO"));
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);

    }
}
