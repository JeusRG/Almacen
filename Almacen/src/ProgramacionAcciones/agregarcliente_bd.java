/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionAcciones;

import InterfazAdministrador.agregar_cliente;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class agregarcliente_bd {
    
    public boolean verificar_ciun(String ciun){
        
         boolean res=false;
        try {
            String sql="SELECT 1 FROM clientes WHERE ciun = ?";
            conexion con=new conexion();
            Connection login;
            login=con.conectar();
            PreparedStatement ps = (PreparedStatement) login.prepareStatement(sql);
            
            ps.setString(1, ciun);
            ResultSet rs = ps.executeQuery();
            res=rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(agregar_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res; 
    }
    
    
    public void nuevo_registro(String ciun, String nombre,String app,String apm,String direccion){
       
        
        try{
            
          String sql="INSERT INTO clientes(ciun,nombre,apellidop,apellidom,direccion) values(?,?,?,?,?)";
            
            
            conexion con=new conexion();
            Connection login;
            login=con.conectar();
            PreparedStatement ps = (PreparedStatement) login.prepareStatement(sql);
            
            
            ps.setString(1,ciun );
            ps.setString(2,nombre );
            ps.setString(3, app);
            ps.setString(4,apm );
            ps.setString(5, direccion);
            
            
            ps.executeUpdate();
            
           con.desconectar();
            
        } catch (SQLException ex) {
            Logger.getLogger(agregar_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
