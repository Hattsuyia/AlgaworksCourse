package com.github.hattsuyia.cartaobeneficios.servico;

import com.github.hattsuyia.cartaobeneficios.Cartao;
import com.github.hattsuyia.cartaobeneficios.Estabelecimento;
import com.github.hattsuyia.cartaobeneficios.Recibo;

public class ServicoDePagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        if (cartao.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.titular, "Pagamento", valor);
    }
}
