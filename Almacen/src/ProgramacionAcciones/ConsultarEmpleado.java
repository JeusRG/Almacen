package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultarEmpleado {
    
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTM;
    PreparedStatement pstmt;
    Connection Con;
    ResultSet rs;
    int PosY;
    
    private DefaultTableModel establecerTitulos(){
        DTM = new DefaultTableModel();
        DTM.addColumn("Id");
        DTM.addColumn("Nombre");
        DTM.addColumn("APaterno");
        DTM.addColumn("AMaterno");
        DTM.addColumn("Puesto");
        DTM.addColumn("Imagen");
        return DTM;
    }
    
    public DefaultTableModel mostrarEmpleados() {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        String sql = "Select * from empleados";
        
        try {
            establecerTitulos();   
            
            pstmt = CBD.Conectar().prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            Object[] Mostrar = new Object[6];

            while(rs.next()){

                Mostrar[0] = rs.getInt("niue");
                Mostrar[1] = rs.getString("nombre");
                Mostrar[2] = rs.getString("apellidop");
                Mostrar[3] = rs.getString("apellidom");
                Mostrar[4] = rs.getString("puesto");
                Mostrar[5] = rs.getBlob("imagen");
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
