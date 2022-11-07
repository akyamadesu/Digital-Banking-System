package pacote;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexaoBD 
{
    public Connection conexao()
    {
        Connection con = null;
    
        try {
            String url = "jdbc:mysql://localhost:3306/ac2?user=root&password=Theo211015@";
            con = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            System.out.println("Erro ao conectarcom o banco de dados :(");  
            JOptionPane.showMessageDialog(null, "Usuario inexistente");
        }
        
        return con;        
 
    }   
}
