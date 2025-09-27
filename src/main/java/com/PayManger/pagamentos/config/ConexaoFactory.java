package com.PayManger.pagamentos.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    // Configurações de conexão para um banco de dados de exemplo (ajuste conforme necessário)
    // Para MySQL:
    private static final String DB_URL = "jdbc:mysql://localhost:3308/paymanger?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "93381609";

    public void conexaoPersonalizada(){
        try{
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            System.out.println("Informações da Conexão: " + connection.getMetaData().getDatabaseProductName()
                    + " " + connection.getMetaData().getDatabaseProductVersion());
        }catch (SQLException e){
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            // SQLState fornece um código de erro padronizado
            System.err.println("SQLState: " + e.getSQLState());
            // VendorError fornece o código de erro específico do banco de dados
            System.err.println("VendorError: " + e.getErrorCode());
            e.printStackTrace();
        }
        System.out.println("Fim da demonstração de carregamento de driver.");

    }
    public static void main(String[] args) {

        ConexaoFactory conexao = new ConexaoFactory();
        conexao.conexaoPersonalizada();
    }
}
