package com.PayManger.pagamentos.model;

public enum StatusPagamento {
    BOLETO("Boleto"),
    PIX("pix"),
    CARTAO_CRÉDITO("Crédito"),
    CARTA_DÉBITO("Débito");

    StatusPagamento(String descriao){

    }
}
