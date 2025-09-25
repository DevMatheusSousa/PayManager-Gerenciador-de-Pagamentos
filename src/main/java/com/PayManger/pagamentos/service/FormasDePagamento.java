package com.PayManger.pagamentos.service;

public class FormasDePagamento implements PagamentoService{
    @Override
    public String pagamentoBoleto(String boleto) {
        if(boleto != null && boleto.matches("\\d{47}")){
            return "pagamento via boleto processado com sucesso";
        }
        return "Boleto inválido";
    }

    @Override
    public String pagamentoCartaoCredito(String cartaoCredido) {
        if(cartaoCredido != null && cartaoCredido.matches("\\d{16}")) {
            return "Pagamento via Cartão de crédido processado com sucesso";
        }
        return "Cartão de crédito inválido";
    }

    @Override
    public String pagamentoCartaoDebito(String cartaoDebido) {
        if (cartaoDebido != null && cartaoDebido.matches("\\d{16}")){
            return "Pagamento via Cartão débito processado com sucesso";
        }
        return "Cartão de débito inválido";
    }

    @Override
    public String pagamentoPix(String pagamentoPix) {
        if(pagamentoPix != null && !pagamentoPix.isEmpty()){
            return "Pagamento via pix processado com sucesso";
        }
        return "Pix inválido";
    }
}
