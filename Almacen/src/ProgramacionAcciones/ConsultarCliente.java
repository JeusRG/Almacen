package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultarCliente {
    //Clase perteneciente a la interfaz asignar cliente
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTM;
    PreparedStatement pstmt;
    Connection Con;
    ResultSet rs;
    
    private DefaultTableModel establecerTitulos(){
        DTM = new DefaultTableModel();
        DTM.addColumn("NIUC");
        DTM.addColumn("CIUN"); 
        DTM.addColumn("NIUE"); 
        DTM.addColumn("nombre");
        DTM.addColumn("APaterno");
        DTM.addColumn("AMaterno");
        DTM.addColumn("Direccion");
        return DTM;
    }
    
    public DefaultTableModel mostrarClientes() {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        String sql = "Select * from clientes";
        
        try {
            establecerTitulos();   
            
            pstmt = CBD.Conectar().prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            Object[] Mostrar = new Object[7];

            while(rs.next()){

                Mostrar[0] = rs.getInt("niuc");
                Mostrar[1] = rs.getString("ciun");
                Mostrar[2] = rs.getString("niue");
                Mostrar[3] = rs.getString("nombre");
                Mostrar[4] = rs.getString("apellidop");
                Mostrar[5] = rs.getString("apellidom");
                Mostrar[6] = rs.getString("direccion");
                DTM.addRow(Mostrar);
                //Modificar el modelo de la tabla;
                //Mostrar[5] = rs.getString("contraseña");             
            }       
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            pstmt = null;
            rs = null;
            CBD.Desconectar();
        }
        return DTM;      
    }
    
}
