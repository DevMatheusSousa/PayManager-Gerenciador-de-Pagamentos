package com.PayManger.pagamentos.service;

public interface PagamentoService {
String pagamentoBoleto(String boleto);
String pagamentoCartaoCredito(String cartaoCredido);
String pagamentoCartaoDebito(String cartaoDebido);
String pagamentoPix(String pagamentoPix);

}
