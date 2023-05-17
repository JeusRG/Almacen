package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AsignarClienteClase {
    private ConexionBD CBD;
    PreparedStatement pstmt;
    Connection Con;

    public boolean verificarDatos(String ciun, int niue, String nombre, String aPaterno, String aMaterno, String direccion) {
        boolean Verificador = false;
        
        if(!"".equals(ciun) &&
           !"".equals(niue) &&
           !"Ingrese el Nombre".equals(nombre)       && !"".equals(nombre)     &&
           !"Ingrese el A. Paterno".equals(aPaterno) && !"".equals(aPaterno)   &&
           !"Ingrese el A. Materno".equals(aMaterno) && !"".equals(aMaterno)   &&
           !"Ingrese la Direccion".equals(direccion) && !"".equals(direccion))
           {
                Verificador = agregarCliente(ciun,niue,nombre,aPaterno,aMaterno,direccion); 
           }else{
                JOptionPane.showMessageDialog(null, "Campos Incompletos");
           }
        return Verificador;
    }

    private boolean agregarCliente(String ciun, int niue, String nombre, String aPaterno, String aMaterno, String direccion) {
        //Realizamos la conexion a la BD
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        //
        boolean Verificador = false;
        
        //Ingresamos datos del empleado a una base de datos
        try{
            pstmt = Con.prepareStatement("INSERT INTO clientes(ciun,niue,nombre,apellidop,apellidom,direccion) VALUES(?,?,?,?,?,?)");
            
            pstmt.setString(1, ciun);
            pstmt.setInt(2, niue);
            pstmt.setString(3, nombre);
            pstmt.setString(4, aPaterno);
            pstmt.setString(5, aMaterno);
            pstmt.setString(6, direccion);
            pstmt.executeUpdate();
            
            Verificador = true;
            CBD.Desconectar();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return Verificador;
    }
}
