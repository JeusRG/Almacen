package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BuscarCliente {
    
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTM;
    PreparedStatement pstmt;
    Connection Con;
    ResultSet rs;
    
    public DefaultTableModel buscarCliente(String Identificador, int Id) {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        String sql = "";
        
        if(Id == 1){
            sql = "Select * from clientes where niuc LIKE '"+Identificador+"%'";
        }
        if(Id == 2){
            sql = "Select * from clientes where ciun LIKE '"+Identificador+"%'";
        }
        if(Id == 3){
            sql = "Select * from clientes where niue LIKE '"+Identificador+"%'";
        }
        if(Id == 4){
            sql = "Select * from clientes where nombre LIKE '"+Identificador+"%'";
        }
        if(Id == 5){
            sql = "Select * from clientes where apellidop LIKE '"+Identificador+"%'";
        }
        if(Id == 6){
            sql = "Select * from clientes where apellidom LIKE '"+Identificador+"%'";
        }
        if(Id == 7){
            sql = "Select * from clientes where direccion LIKE '"+Identificador+"%'";
        }
        
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
            }
        } catch (Exception ex) {
            Logger.getLogger(BuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            pstmt = null;
            rs = null;
            CBD.Desconectar();
        }
        return DTM; 
    }
    
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
}
