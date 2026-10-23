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
            pst.execute(); // pst.executeQuery() e pst.executeUpdate() são metodos diferentes
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
    
    public void PesquisarRegistro(Aluno a) throws Exception {
	try {
            abrirBanco();
            String query = "select codigo, nome,email FROM aluno where codigo=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, a.getCodigo());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                a.setCodigo(tr.getInt("codigo"));
                a.setNome(tr.getString("nome"));
                a.setEmail(tr.getString("email"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado! ");
            }
            fecharBanco();
	} catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
	}
    }
    
    public ArrayList<Aluno> PesquisarTudo() throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        try {
            abrirBanco();
            String query = "select * FROM aluno";
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = pst.executeQuery();
            Aluno a;
            while (tr.next()) {
                a = new Aluno();
                a.setCodigo(tr.getInt("codigo"));
                a.setNome(tr.getString("nome"));
                a.setEmail(tr.getString("email"));
                alunos.add(a);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return alunos;
    }
    
    public void editarAluno(Aluno a) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String query = "UPDATE aluno set nome = ?, email = ? where codigo = ?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, a.getNome());
        pst.setString(2, a.getEmail());
        pst.setInt(3, a.getCodigo());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Aluno Alterado com sucesso!");
        fecharBanco();
    }
}
