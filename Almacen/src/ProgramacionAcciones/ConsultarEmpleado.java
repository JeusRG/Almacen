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
    //Clase perteneciente a la interfaz eliminar empleado
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTM;
    PreparedStatement pstmt;
    ResultSet rs;
    
    private DefaultTableModel establecerTitulos(){
        System.out.print("Funciona al mostrar los titulos");
        DTM = new DefaultTableModel();
        DTM.addColumn("Id");
        DTM.addColumn("Nombre");
        DTM.addColumn("APaterno");
        DTM.addColumn("AMaterno");
        DTM.addColumn("Puesto");
        //DTM.addColumn("Imagen");
        return DTM;
    }
    
    public DefaultTableModel mostrarEmpleados() {
        System.out.print("Funciona antes de la conexion");
        CBD = new ConexionBD();
        CBD.Conectar();
        String sql = "Select * from empleados";
        System.out.print("Funciona antes de mostrar los datos");
        try {
            establecerTitulos();   
            
            pstmt = CBD.Conectar().prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            Object[] Mostrar = new Object[5];

            while(rs.next()){

                Mostrar[0] = rs.getInt("niue");
                Mostrar[1] = rs.getString("nombre");
                Mostrar[2] = rs.getString("apellidop");
                Mostrar[3] = rs.getString("apellidom");
                Mostrar[4] = rs.getString("puesto");
                DTM.addRow(Mostrar);            
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
