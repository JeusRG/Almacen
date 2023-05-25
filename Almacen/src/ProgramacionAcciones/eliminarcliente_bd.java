/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionAcciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class eliminarcliente_bd {
    
    public DefaultTableModel mostrar_tabla(String txt, String tipo){
        int numcol;
        //crea un modelo para realizar la tabla
        DefaultTableModel model=new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row,int column){
                    return false;
                }
            };
        try {
            String sql="";
            /**
             * Realiza la busqueda dependiendo de la string txt, si es vacia no necesita buscar alguna que este vacia
             * ya que podria dar error asi que realiza la busqueda general solo filtrando que tengan el mismo empleado 
             * encargado con el niue ingresado, si no esta vacia realiza la busqueda que contenga el string txt ingresado
             */
            if(txt.isEmpty()){
                //Busqueda con txt vacio
                sql="SELECT niuc,ciun,nombre,apellidop,apellidom,direccion FROM clientes WHERE estado='activo'";
            }else{
                //busqueda con txt no vacio
             sql="SELECT niuc,ciun,nombre,apellidop,apellidom,direccion FROM clientes WHERE "+tipo+" like ? && estado='activo'";}
            
            /**
             * Realiza las correspondiente conexion con su clase conexion en el mismo modulo
             */
            conexion con=new conexion();
            Connection login;
            login=con.conectar();
            //Crea un statement preparado de la busqueda de la strign sql por comandos SQL
            PreparedStatement ps = (PreparedStatement) login.prepareStatement(sql);
            
            if(txt.isEmpty()){}else{
                //Rellena en caso de que txt no este vacio
            ps.setString(1, "%"+txt+"%");
            
            }
            
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmt=(ResultSetMetaData) rs.getMetaData();
            //obtiene el conteo de las columnas del resultado
            numcol=rsmt.getColumnCount();
            
            //System.out.println(numcol);
            
            //System.out.println("parametros enviados");
            
            for(int i=1;i<=numcol;i++){
                //agrega las columnas colocandoles el nombre de la misma en la bd
                model.addColumn((rsmt.getColumnName(i)).toUpperCase());
            }
            
            
            
            //System.out.println("columnas colocadas");
           String [] datos=new String[numcol]; 
           while(rs.next()){
                //guarda el dato de la columna representada por el numero .getString(num)
                //obtiene los datos de cada colunma de la fila
                //realiza el while mientras existan datos en las filas
                //System.out.println("1");
                //con esto automatizo la colocacion de datos en la tabla sin tener que hacer uno para cada caso
                
                for(int i=0;i<numcol;i++){
                    
                    datos[i]=rs.getString(i+1);
                }
                
                model.addRow(datos);
                //System.out.println("fila colocada");
            }
           
           con.desconectar();
            
        } catch (SQLException ex) {
            Logger.getLogger(eliminarcliente_bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }
    
    public void eliminar(String niuc){
        String sql="UPDATE clientes SET estado='INACTIVO' WHERE niuc=?";
        PreparedStatement ps=null;
        
        Connection log=null;

        try{
            conexion con=new conexion();
            log=con.conectar();
            ps=(PreparedStatement) log.prepareStatement(sql);
            
            ps.setString(1, niuc);
           
            
            int res=0;
            res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Eliminacion fallida");
            }
            con.desconectar();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
    }
    
}
