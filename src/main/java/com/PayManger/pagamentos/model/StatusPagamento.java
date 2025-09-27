package com.PayManger.pagamentos.model;

public enum StatusPagamento {
    PENDENTE("Pendente"),
    PROCESSADO("Processado"),
    CONCLUIDO("Concluido"),
    FALHOU("Falhou"),
    ESTORNOU("Estornou"),
    CANCELADO("Cancelado");

     StatusPagamento(String descricao){

    }

}
