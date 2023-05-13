package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

public class BuscarEmpleado {
    
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTM;
    PreparedStatement pstmt;
    Connection Con;
    ResultSet rs;
    
    public DefaultTableModel buscarEmpleado(String Identificador,int Id) {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        String sql = "";
        
        if(Id == 1){
            sql = "Select * from empleados where niue LIKE '"+Identificador+"%'";
        }
        if(Id == 2){
            sql = "Select * from empleados where nombre LIKE '"+Identificador+"%'";
        }
        if(Id == 3){
            sql = "Select * from empleados where apellidop LIKE '"+Identificador+"%'";
        }
        if(Id == 4){
            sql = "Select * from empleados where apellidom LIKE '"+Identificador+"%'";
        }
        if(Id == 5){
            sql = "Select * from empleados where puesto LIKE '"+Identificador+"%'";
        }
        
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
            }
        } catch (Exception ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            pstmt = null;
            rs = null;
            CBD.Desconectar();
        }
        return DTM;    
    }
    
    private DefaultTableModel establecerTitulos(){
        DTM = new DefaultTableModel();
        DTM.addColumn("NIUE");
        DTM.addColumn("Nombre");
        DTM.addColumn("APaterno");
        DTM.addColumn("AMaterno");
        DTM.addColumn("Puesto");
        DTM.addColumn("Imagen");
        return DTM;
    }
}
