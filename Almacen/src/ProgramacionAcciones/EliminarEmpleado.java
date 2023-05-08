package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EliminarEmpleado {
    private ConexionBD CBD;
    PreparedStatement pstmt;
    Connection Con;

    public boolean eliminarEmpleado(String Identificador, int Id) {
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        
        boolean Verificador = false;
        
        try{
            if(Id == 1){
                pstmt = Con.prepareStatement("DELETE from empleados WHERE niue='" +Integer.valueOf(Identificador)+ "'");
            }
            if(Id == 2){
                pstmt = Con.prepareStatement("DELETE from empleados WHERE nombre='" +Identificador+ "'");
            }
            if(Id == 3){
                pstmt = Con.prepareStatement("DELETE from empleados WHERE apellidop='" +Identificador+ "'");
            }
            if(Id == 4){
                pstmt = Con.prepareStatement("DELETE from empleados WHERE apellidom='" +Identificador+ "'");
            }
            if(Id == 5){
                pstmt = Con.prepareStatement("DELETE from empleados WHERE puesto='" +Identificador+ "'");
            }
            
            
            int rs = pstmt.executeUpdate();
            if(rs > 0){
                JOptionPane.showMessageDialog(null, "Contacto Eliminado");
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