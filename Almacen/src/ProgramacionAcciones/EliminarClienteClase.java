package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EliminarClienteClase {
    
    private ConexionBD CBD;
    PreparedStatement pstmt;
    Connection Con;
    
    public boolean eliminarCliente(String Identificador, int Id) {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        
        boolean Verificador = false;
        
        try{
            
            pstmt = Con.prepareStatement("DELETE from clientes WHERE niuc='" +Integer.valueOf(Identificador)+ "'");
                        
            int rs = pstmt.executeUpdate();
            
                if(rs > 0){
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                    Verificador = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Sin Coincidencias");
                }
                
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        CBD.Desconectar();
        return Verificador; 
    }
}
