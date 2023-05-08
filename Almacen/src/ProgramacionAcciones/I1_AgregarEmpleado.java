package ProgramacionAcciones;

import ConexionTemporal.ConexionBD;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

public class I1_AgregarEmpleado {
    
    private ConexionBD CBD;
    PreparedStatement pstmt;
    Connection Con;
    
    public boolean verificarDatos(Icon imagenInicial, Icon avatar, String nombre, String aPaterno, String aMaterno, String puesto, String password1, String password2) {
        //Variables
        boolean Verificador = false;
        
        //Proceso de datos recibidos
        if(!"Ingrese el Nombre".equals(nombre) && !"".equals(nombre)           &&
           !"Ingrese el A. Paterno".equals(aPaterno) && !"".equals(aPaterno)   &&
           !"Ingrese el A. Materno".equals(aMaterno) && !"".equals(aMaterno)   &&
           !"Ingrese el Puesto de Trabajo".equals(puesto) && !"".equals(puesto)&&
           !"".equals(password1) && !"".equals(password2) && avatar != imagenInicial)
        {
            if(password1.equals(password2))
            {
                Verificador = agregarEmpleados(avatar,nombre,aPaterno,aMaterno,puesto,password1); 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Contraseñas Diferentes");
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Campos Incompletos");
        }
        return Verificador;
        //
    }

    public boolean agregarEmpleados(Icon avatar, String nombre, String aPaterno, String aMaterno, String puesto, String password1) {
        //Realizamos la conexion a la BD
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        //
        boolean Verificador = false;
        
        //Ingresamos datos del empleado a una base de datos
        try{
            pstmt = Con.prepareStatement("INSERT INTO empleados(nombre,apellidop,apellidom,puesto,contra) VALUES(?,?,?,?,?)");
            
            //pstmt.setInt(1,generadorNIUE());
            pstmt.setString(1, nombre);
            pstmt.setString(2, aPaterno);
            pstmt.setString(3, aMaterno);
            pstmt.setString(4, puesto);
            pstmt.setString(5, password1);
            pstmt.executeUpdate();
            
            Verificador = true;
            CBD.Desconectar();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //
        return Verificador;
        //
    }

/*    public int generadorNIUE() {
        int niue = 0;
        
        Random rand = new Random();
        niue = rand.nextInt(900000) + 1;
        
        return niue;      
    }*/
    
}
