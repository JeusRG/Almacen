package InterfazAdministrador;

import ConexionTemporal.ConexionBD;
import ProgramacionAcciones.BuscarEmpleado;
import ProgramacionAcciones.ConsultarEmpleado;
import ProgramacionAcciones.EliminarEmpleadoClase;
import ProgramacionAcciones.I1_Identificador;
import com.mysql.cj.jdbc.Blob;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminarEmpleado extends javax.swing.JPanel {

    private ConsultarEmpleado CE;
    private EliminarEmpleadoClase EE;
    private BuscarEmpleado BE;
    private I1_Identificador I;
    int Id = 0;
    String niue = "";
    String nombre = "";
    String apellidop = "";
    String apellidom = "";
    String puesto = "";
    private ConexionBD CBD = new ConexionBD();
    private DefaultTableModel DTM;
    PreparedStatement pstmt;
    Connection Con;
    ResultSet rs;
    int PosY;
    
    public EliminarEmpleado() {
        initComponents();
        CE = new ConsultarEmpleado();
        BE = new BuscarEmpleado();
        MostrarTabla();
    }
    
    private void MostrarTabla(){
        Tabla.setModel(CE.mostrarEmpleados());   
    }
    
    private void MostrarTablaFiltrada(String Identificador, int Id1){
        Tabla.setModel(BE.buscarEmpleado(Identificador, Id));     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        Contenedor = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Cancelar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        SalidaImagen = new javax.swing.JLabel();
        SalidaPuesto = new javax.swing.JTextField();
        SalidaNiue = new javax.swing.JTextField();
        SalidaNombre = new javax.swing.JTextField();
        SalidaAP = new javax.swing.JTextField();
        SalidaAM = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setText("ELIMINAR EMPLEADOS");
        add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 25));

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niue", "nombre", "apellidop", "apellidom", "puesto" }));
        add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, 100, 30));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });
        add(EntradaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 31, 200, 30));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIUE", "Nombre", "APaterno", "AMaterno", "Puesto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        Contenedor.setViewportView(Tabla);

        add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 720, 320));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.setToolTipText("");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        SalidaImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SalidaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 100, 100));
        add(SalidaPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 310, 30));
        add(SalidaNiue, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, 100, 30));
        add(SalidaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 90, 150, 30));
        add(SalidaAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 90, 150, 30));
        add(SalidaAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 90, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaBuscadorKeyReleased
        String Identificador = EntradaBuscador.getText();

        I = new I1_Identificador();
        Id = I.numeroBuscador(Buscador.getSelectedIndex());

        BE = new BuscarEmpleado();
        BE.buscarEmpleado(Identificador,Id);
        MostrarTablaFiltrada(Identificador,Id);
    }//GEN-LAST:event_EntradaBuscadorKeyReleased

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int PosY  = Tabla.getSelectedRow();
        niue      = Tabla.getValueAt(PosY, 0).toString();
        nombre    = Tabla.getValueAt(PosY, 1).toString();
        apellidop = Tabla.getValueAt(PosY, 2).toString();
        apellidom = Tabla.getValueAt(PosY, 3).toString();
        puesto    = Tabla.getValueAt(PosY, 4).toString();
        
        SalidaNiue.setText(niue);
        SalidaNombre.setText(nombre);
        SalidaAP.setText(apellidop);
        SalidaAM.setText(apellidom);
        SalidaPuesto.setText(puesto);
        int id = Integer.parseInt(niue);
        obtenerimagen(id);
    }//GEN-LAST:event_TablaMouseClicked

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        EntradaBuscador.setText(null);
        MostrarTabla();
    }//GEN-LAST:event_CancelarActionPerformed

    public void obtenerimagen(int niue){
        ImageIcon imageIcon = null;
        CBD = new ConexionBD();
        Con = CBD.Conectar();
        String sql = "Select Imagen from empleados where niue ='" + niue +"'";
        try {
            pstmt = CBD.Conectar().prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                Blob blob = (Blob) rs.getBlob("Imagen");
                byte[] blobData = blob.getBytes(1, (int) blob.length());
                imageIcon = new ImageIcon(blobData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image originalImage = imageIcon.getImage();
        int newWidth = 100; // Nuevo ancho deseado
        int newHeight = 100; // Nuevo alto deseado
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        // Crea un nuevo ImageIcon con la imagen redimensionada
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        /**/
        SalidaImagen.setIcon((resizedIcon));
    }
    
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        boolean Verificador = false;

        if(!niue.isEmpty()){
            String Identificador = "";

            I = new I1_Identificador();
            Id = I.numeroBuscador(Buscador.getSelectedIndex());

            Identificador = niue;

            EE = new EliminarEmpleadoClase();
            Verificador = EE.eliminarEmpleado(Identificador,Id);

        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un contacto");
        }

        if(Verificador == true){
            MostrarTabla();
            EntradaBuscador.setText("");
        }
    }//GEN-LAST:event_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JButton Cancelar;
    private javax.swing.JScrollPane Contenedor;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTextField SalidaAM;
    private javax.swing.JTextField SalidaAP;
    private javax.swing.JLabel SalidaImagen;
    private javax.swing.JTextField SalidaNiue;
    private javax.swing.JTextField SalidaNombre;
    private javax.swing.JTextField SalidaPuesto;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
