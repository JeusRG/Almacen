package InterfazAdministrador;

import ProgramacionAcciones.I1_AgregarEmpleado;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AgregarEmpleado extends javax.swing.JPanel {

    private I1_AgregarEmpleado AE;
    String Ruta = "";
    Icon imagenInicial;
    
    public AgregarEmpleado() {
        initComponents();
        imagenInicial = EntradaImagen.getIcon(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        lbl_Perfil = new javax.swing.JLabel();
        EntradaImagen = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        EntradaNombre = new javax.swing.JTextField();
        lbl_ApellidoPaterno = new javax.swing.JLabel();
        EntradaAPaterno = new javax.swing.JTextField();
        lbl_ApellidoMaterno = new javax.swing.JLabel();
        EntradaAMaterno = new javax.swing.JTextField();
        lbl_Puesto = new javax.swing.JLabel();
        EntradaPuesto = new javax.swing.JComboBox<>();
        btn_Agregar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lbl_Titulo.setText("REGISTRAR EMPLEADOS");
        add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 25));

        lbl_Perfil.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lbl_Perfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Perfil.setText("Avatar");
        add(lbl_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 740, 20));

        EntradaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntradaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursoImagenes/LogoUsuarioImagen75px.png"))); // NOI18N
        EntradaImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaImagenMouseClicked(evt);
            }
        });
        add(EntradaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 600, 100));

        lbl_Nombre.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre");
        add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 20));

        EntradaNombre.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        EntradaNombre.setForeground(new java.awt.Color(204, 204, 204));
        EntradaNombre.setBorder(null);
        add(EntradaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 30));

        lbl_ApellidoPaterno.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lbl_ApellidoPaterno.setText("Apellido Paterno");
        add(lbl_ApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 250, 20));

        EntradaAPaterno.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        EntradaAPaterno.setForeground(new java.awt.Color(204, 204, 204));
        EntradaAPaterno.setBorder(null);
        add(EntradaAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 250, 30));

        lbl_ApellidoMaterno.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lbl_ApellidoMaterno.setText("Apellido Materno");
        add(lbl_ApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 250, 20));

        EntradaAMaterno.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        EntradaAMaterno.setForeground(new java.awt.Color(204, 204, 204));
        EntradaAMaterno.setBorder(null);
        add(EntradaAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 250, 30));

        lbl_Puesto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lbl_Puesto.setText("Puesto");
        add(lbl_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 580, 20));

        EntradaPuesto.setBackground(new java.awt.Color(251, 255, 255));
        EntradaPuesto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        EntradaPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Puesto de Trabajo", "Administrador", "Tomador de pedidos" }));
        EntradaPuesto.setBorder(null);
        EntradaPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(EntradaPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 720, 30));

        btn_Agregar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 100, 30));

        btn_Cancelar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaImagenMouseClicked
        JFileChooser archivo = new JFileChooser();
        File ruta = new File("C:\\Users\\Jeus RG\\OneDrive\\Escritorio\\Avatars");
        archivo.setFileFilter(new FileNameExtensionFilter("Archivo de imagen","png","jpg","jpeg"));
        archivo.setCurrentDirectory(ruta);

        int ventana = archivo.showOpenDialog(null);

        if(ventana == JFileChooser.APPROVE_OPTION){
            File file = archivo.getSelectedFile();
            Ruta = String.valueOf(file);
            Image foto = getToolkit().getImage(Ruta);
            foto = foto.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
            EntradaImagen.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_EntradaImagenMouseClicked

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        boolean Verificador = false;
        String puesto = "";

        FileInputStream archivofoto = null;
        Icon avatar      = EntradaImagen.getIcon();
        String nombre    = EntradaNombre.getText().toUpperCase();
        String aPaterno  = EntradaAPaterno.getText().toUpperCase();
        String aMaterno  = EntradaAMaterno.getText().toUpperCase();

        try {
            archivofoto = new FileInputStream(Ruta);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AgregarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(EntradaPuesto.getSelectedIndex() == 1){
            puesto = EntradaPuesto.getSelectedItem().toString().toUpperCase();
        }
        if(EntradaPuesto.getSelectedIndex() == 2){
            puesto = EntradaPuesto.getSelectedItem().toString().toUpperCase();
        }

        AE = new I1_AgregarEmpleado();

        if(EntradaPuesto.getSelectedIndex() != 0){
            Verificador = AE.verificarDatos(imagenInicial,avatar,nombre,aPaterno,aMaterno,puesto,archivofoto);
        }else{
            JOptionPane.showMessageDialog(null, "Campos Incompletos");
        }

        if(Verificador == true){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            //Aquie se realizara la conexion a la pantalla principal, una vez que el proyecto se una.
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        //Aqui se realizara la conexion a la pantalla principal, una vez que el proyecto se una.
    }//GEN-LAST:event_btn_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EntradaAMaterno;
    private javax.swing.JTextField EntradaAPaterno;
    private javax.swing.JLabel EntradaImagen;
    private javax.swing.JTextField EntradaNombre;
    private javax.swing.JComboBox<String> EntradaPuesto;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JLabel lbl_ApellidoMaterno;
    private javax.swing.JLabel lbl_ApellidoPaterno;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Perfil;
    private javax.swing.JLabel lbl_Puesto;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
