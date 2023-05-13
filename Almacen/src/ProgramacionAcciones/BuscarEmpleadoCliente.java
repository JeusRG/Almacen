package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

//clase perteneciente a la interfaz asignar cliente

public class BuscarEmpleadoCliente {
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTM;
    PreparedStatement pstmt;
    Connection Con;
    ResultSet rs;
    
    public DefaultTableModel buscarEmpleadocliente(String Identificador,int Id) {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        String sql = "";
        
        if(Id == 1){
            sql = "Select * from empleados where puesto= '"+"Tomador de pedidos"+"'AND  niue LIKE '"+Identificador+"%'";
        }
        if(Id == 2){
            sql = "Select * from empleados where puesto= '"+"Tomador de pedidos"+"'AND nombre LIKE '"+Identificador+"%'";
        }
        if(Id == 3){
            sql = "Select * from empleados where puesto= '"+"Tomador de pedidos"+"'AND apellidop LIKE '"+Identificador+"%'";
        }
        if(Id == 4){
            sql = "Select * from empleados where puesto= '"+"Tomador de pedidos"+"'AND apellidom LIKE '"+Identificador+"%'";
        }
        
        try {
            establecerTitulos();
            pstmt = CBD.Conectar().prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            Object[] Mostrar = new Object[4];

            while(rs.next()){

                Mostrar[0] = rs.getInt("niue");
                Mostrar[1] = rs.getString("nombre");
                Mostrar[2] = rs.getString("apellidop");
                Mostrar[3] = rs.getString("apellidom");
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
        return DTM;
    }
}
