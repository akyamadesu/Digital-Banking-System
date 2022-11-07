package pacote;

import java.sql.*;
import javax.swing.JOptionPane;
import pacote2.variaveis;
import pacote.login;

public class login 
{
    Connection con;
        
    public ResultSet autenticacao(variaveis obj)
    {
        con = new conexaoBD().conexao();
                             
        try {
            String sql = "select * from login where cpf = ? and senha = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,obj.getCpf());
            ps.setString(2,obj.getSenha());
            
            ResultSet r = ps.executeQuery();
            return r;
        
        } catch (SQLException erro) {
           
            JOptionPane.showMessageDialog(null, "Usuario inexistente");
       
        }
        
        return (ResultSet) con;
                           
    }   

    public void setCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setSenha(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}          

