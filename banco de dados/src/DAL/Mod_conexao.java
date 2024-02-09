package DAL;
import java.sql.*;

public class Mod_conexao {
//    modulo responsavel por estabelecer a conexão com o banco de dados...
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
//      linha abaixo chama o driver
        String driver = "com.mysql.cj.jbc.Driver";
        String url    = "jbdc:mysgl://localhost:3306/usuarios";
        String user   = "root";
        String password = "";

//      Estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }   
}
