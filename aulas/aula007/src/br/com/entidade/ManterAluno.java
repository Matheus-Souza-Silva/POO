package br.com.entidade;

import br.com.controle.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

// Classe Persistencia - Pacote DAO Entidade
public class ManterAluno extends DAO{
    public void inserir(Aluno a) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String existe = "SELECT mat, nome, idade, email FROM alunos WHERE email=?";
        ps = (PreparedStatement) con.prepareStatement(existe);
        ps.setString(1, a.getEmail());
        ResultSet tr = ps.executeQuery();
        
        if (tr.next()) {
            JOptionPane.showMessageDialog(null, "E-mail ja cadastrado anteriormente!");
        } else {
            String query = "INSERT INTO alunos (mat,nome,idade,email) values(null,?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getIdade());
            ps.setString(3, a.getEmail());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Aluno Inserido com sucesso!");
        }

        fecharBanco();
    }
}