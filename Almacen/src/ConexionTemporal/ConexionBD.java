package ConexionTemporal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    String bd = "empresax";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.jdbc.Driver";
    Connection Con;
    
    public Connection Conectar(){
        Connection con = null;
        try {
            Class.forName(driver);
            Con = DriverManager.getConnection(url+bd, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
       return Con;
    }
    
    public void Desconectar(){
        try{
            Con.close();
        }catch(SQLException ex){
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
