package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MostrarTomadoresPedido {
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTMP;
    PreparedStatement pstmt;
    Connection Con;
    ResultSet rs;
        
        public DefaultTableModel mostrarPuesto() {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        String sql = "";
        String Identificador = "Tomador de pedidos";
        
        sql = "Select * from empleados where puesto='"+Identificador+"'";
        
        
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
                DTMP.addRow(Mostrar);
            }
        } catch (Exception ex) {
            Logger.getLogger(MostrarTomadoresPedido.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            pstmt = null;
            rs = null;
            CBD.Desconectar();
        }
        return DTMP;    
    }
        
    private DefaultTableModel establecerTitulos(){
        DTMP = new DefaultTableModel();
        DTMP.addColumn("NIUE");
        DTMP.addColumn("Nombre");
        DTMP.addColumn("APaterno");
        DTMP.addColumn("AMaterno");
        return DTMP;
    }    
}
