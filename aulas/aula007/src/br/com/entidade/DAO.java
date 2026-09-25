package br.com.entidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Classe Conexão - Pacote DAO Entidade
public class DAO {  
    Connection con; // Criação do objeto conexão
    PreparedStatement ps; // Criação do objeto preparação de ambiente
    ResultSet rs; // Criação do objeto que recebe resultados
    
    public void abrirBanco() throws SQLException { // Criando metodo para acessar o banco
        try { // Tratamento de Exceções
            Class.forName("com.mysql.jdbc.Driver"); // Classe para utilização do arquivo com configurações do servidor mysql
            String url = "jdbc:mysql://localhost/crudsexta"; // Driver servidor e banco de dados a serem utilizados e indicação do banco a ser utilizado
            String user = "root"; // Usuario do banco de dados
            String senha = ""; // Senha do usuario do banco de dados    
            con =(Connection) DriverManager.getConnection
            (url,user,senha); // Metodo que usa os parametros para conectar com o banco
            System.out.println("Conectado ao Servidor de Banco de Dados");
        }
        
        catch (ClassNotFoundException ex) { // Tratamento de erro de driver
            System.out.println("Classe nao encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } 

        catch(SQLException e) { // Tratamento de erro de SQL
            System.out.println(e);
            throw new RuntimeException(e);
        }  
    }
    
    public void fecharBanco() throws Exception { // Criando metodo que fechao conexão com o banco
        if (ps != null) { // Limpando os dados de conexão   
            ps.close(); // Fechando o ambiente de conexão
            System.out.println("Execucao da Query fechada\n");
        }  
    }
}