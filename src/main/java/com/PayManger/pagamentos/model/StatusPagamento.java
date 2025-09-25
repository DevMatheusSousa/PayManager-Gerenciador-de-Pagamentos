package com.PayManger.pagamentos.model;

public enum StatusTransacao {
    BOLETO("Boleto"),
    PIX("pix"),
    CARTAO_CRÉDITO("Crédito"),
    CARTA_DÉBITO("Débito");

    StatusTransacao(String descriao) {

    }
}
