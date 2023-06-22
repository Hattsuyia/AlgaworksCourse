package com.github.hattsuyia.cartaobeneficios.servico;

import com.github.hattsuyia.cartaobeneficios.Cartao;
import com.github.hattsuyia.cartaobeneficios.Estabelecimento;
import com.github.hattsuyia.cartaobeneficios.Recibo;

public class ServicoDePagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        cartao.debitar(valor);
        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
