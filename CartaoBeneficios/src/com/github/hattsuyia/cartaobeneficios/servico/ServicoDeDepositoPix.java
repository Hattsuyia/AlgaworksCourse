package com.github.hattsuyia.cartaobeneficios.servico;

import com.github.hattsuyia.cartaobeneficios.Cartao;
import com.github.hattsuyia.cartaobeneficios.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        //TODO faz cobrança do valor no pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);

    }
}
