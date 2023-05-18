package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EliminarEmpleadoClase {
    //Clase perteneciente a la interfaz eliminar empleado
    private ConexionBD CBD;
    PreparedStatement pstmt;
    Connection Con;

    public boolean eliminarEmpleado(String Identificador, int Id) {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        
        boolean Verificador = false;
        
        try{
            pstmt = Con.prepareStatement("DELETE from empleados WHERE niue='" +Integer.valueOf(Identificador)+ "'");
                        
            int rs = pstmt.executeUpdate();
            
                if(rs > 0){
                    JOptionPane.showMessageDialog(null, "Empleado Eliminado");
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