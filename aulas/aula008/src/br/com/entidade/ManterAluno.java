package br.com.entidade;

import br.com.controle.Aluno;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ManterAluno extends DAO {
    public void inserir(Aluno a) throws Exception {
        abrirBanco();
        String existe = "select codigo,nome,email FROM aluno where email=?";
        pst = (PreparedStatement) con.prepareStatement(existe);
        pst.setString(1, a.getEmail());
        ResultSet tr = pst.executeQuery();
        if (tr.next()) {
            JOptionPane.showMessageDialog(null, "E-mail ja cadastrado anteriormente!");
        } else {
            String query = "INSERT INTO aluno (codigo,nome,email) values(null,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setString(1, a.getNome());
            pst.setString(2, a.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno Inserido com sucesso!");
        }
        fecharBanco();
    }
    
    public void deletarAluno(Aluno a) throws Exception {
        abrirBanco();
        String query = "delete from aluno where codigo=?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, a.getCodigo());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso!");
        fecharBanco();
    }
}
