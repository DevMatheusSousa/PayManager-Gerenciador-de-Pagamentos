package com.PayManger.pagamentos.model;

public enum StatusTransacao {
    PENDENTE("Pendente"),
    PROCESSADO("Processado"),
    CONCLUIDO("Concluido"),
    FALHOU("Falhou"),
    ESTORNOU("Estornou");

     StatusTransacao(String descricao){

    }

}
