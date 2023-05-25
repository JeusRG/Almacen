
package ProgramacionAcciones;



import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    
    
    private static Connection conn;
    private static final String controlador="com.mysql.jdbc.Driver";
    private static  String user="tomadorp";
    private static  String pass="123456";
    private static final String url="jdbc:mysql://localhost:3306/empresax";
    private static boolean ver=false;
    //activa primero el xamp
    //esta clase sirve solamente para la conexion a la base de datos
    public Connection conectar(){
        
        conn=null;
        try{
        conn=(Connection) DriverManager.getConnection(url, user, pass);
        if(conn!=null){
            
            if(ver==false){
                //JOptionPane.showMessageDialog(null, "Conexion establecida");
            //ventana_tabla pag=new ventana_tabla();
            //pag.setResizable(false);
            //pag.setLocationRelativeTo(null);
            
            //pag.setVisible(true);
            ver=true;}
        }
        } catch (SQLException ex) {
            //System.out.println();
            JOptionPane.showMessageDialog(null, "Conexion fallida","Error",JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    
    public void desconectar (){
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconexion realizada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desconexion fallida");
        }
        
    }
    
    
}
