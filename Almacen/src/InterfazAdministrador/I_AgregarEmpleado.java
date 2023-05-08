package InterfazAdministrador;

import ProgramacionAcciones.I1_AgregarEmpleado;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

public class I_AgregarEmpleado extends javax.swing.JFrame {
    
    private I1_AgregarEmpleado AE;
    Icon imagenInicial;
    
    public I_AgregarEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        imagenInicial = EntradaImagen.getIcon(); 
        Ocultar1.setVisible(false);
        Ocultar2.setVisible(false);
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
        lbl_Contraseña = new javax.swing.JLabel();
        EntradaContraseña = new javax.swing.JPasswordField();
        lbl_ContraseñaVerificador = new javax.swing.JLabel();
        EntradaContraseñaVerificado = new javax.swing.JPasswordField();
        btn_Agregar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        Ver1 = new javax.swing.JButton();
        Ocultar1 = new javax.swing.JButton();
        Ver2 = new javax.swing.JButton();
        Ocultar2 = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setText("REGISTRAR EMPLEADOS");
        getContentPane().add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 25));

        lbl_Perfil.setText("Avatar");
        getContentPane().add(lbl_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 580, 20));

        EntradaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntradaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursoImagenes/LogoUsuarioImagen75px.png"))); // NOI18N
        EntradaImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaImagenMouseClicked(evt);
            }
        });
        getContentPane().add(EntradaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 100));

        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, 20));

        EntradaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EntradaNombre.setForeground(new java.awt.Color(204, 204, 204));
        EntradaNombre.setText("Ingrese el Nombre");
        EntradaNombre.setBorder(null);
        EntradaNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaNombreMouseClicked(evt);
            }
        });
        getContentPane().add(EntradaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 30));

        lbl_ApellidoPaterno.setText("Apellido Paterno");
        getContentPane().add(lbl_ApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 200, 20));

        EntradaAPaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EntradaAPaterno.setForeground(new java.awt.Color(204, 204, 204));
        EntradaAPaterno.setText("Ingrese el A. Paterno");
        EntradaAPaterno.setBorder(null);
        EntradaAPaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaAPaternoMouseClicked(evt);
            }
        });
        getContentPane().add(EntradaAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 30));

        lbl_ApellidoMaterno.setText("Apellido Materno");
        getContentPane().add(lbl_ApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 200, 20));

        EntradaAMaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EntradaAMaterno.setForeground(new java.awt.Color(204, 204, 204));
        EntradaAMaterno.setText("Ingrese el A. Materno");
        EntradaAMaterno.setBorder(null);
        EntradaAMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaAMaternoMouseClicked(evt);
            }
        });
        getContentPane().add(EntradaAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 200, 30));

        lbl_Puesto.setText("Puesto");
        getContentPane().add(lbl_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 580, 20));

        EntradaPuesto.setBackground(new java.awt.Color(251, 255, 255));
        EntradaPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Puesto de Trabajo", "Administrador", "Tomador de pedidos" }));
        EntradaPuesto.setBorder(null);
        EntradaPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(EntradaPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 580, 30));

        lbl_Contraseña.setText("Contraseña");
        getContentPane().add(lbl_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 285, 20));

        EntradaContraseña.setForeground(new java.awt.Color(204, 204, 204));
        EntradaContraseña.setText("**********");
        EntradaContraseña.setBorder(null);
        EntradaContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaContraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(EntradaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 285, 30));

        lbl_ContraseñaVerificador.setText("Confirme la Contraseña");
        getContentPane().add(lbl_ContraseñaVerificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 270, 285, 20));

        EntradaContraseñaVerificado.setForeground(new java.awt.Color(204, 204, 204));
        EntradaContraseñaVerificado.setText("**********");
        EntradaContraseñaVerificado.setBorder(null);
        EntradaContraseñaVerificado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaContraseñaVerificadoMouseClicked(evt);
            }
        });
        getContentPane().add(EntradaContraseñaVerificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 290, 285, 30));

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 360, 100, 30));

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 360, 100, 30));

        Ver1.setText("◻ Mostrar Contraseña");
        Ver1.setBorder(null);
        Ver1.setContentAreaFilled(false);
        Ver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver1ActionPerformed(evt);
            }
        });
        getContentPane().add(Ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        Ocultar1.setText("☑ Mostrar Contraseña");
        Ocultar1.setToolTipText("");
        Ocultar1.setBorder(null);
        Ocultar1.setContentAreaFilled(false);
        Ocultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ocultar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Ocultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        Ver2.setText("◻ Mostrar Contraseña");
        Ver2.setBorder(null);
        Ver2.setContentAreaFilled(false);
        Ver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver2ActionPerformed(evt);
            }
        });
        getContentPane().add(Ver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 330, -1, -1));

        Ocultar2.setText("☑ Mostrar Contraseña");
        Ocultar2.setToolTipText("");
        Ocultar2.setBorder(null);
        Ocultar2.setContentAreaFilled(false);
        Ocultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ocultar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Ocultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 330, -1, -1));

        lbl_Fondo.setToolTipText("");
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaNombreMouseClicked
        if("Ingrese el Nombre".equals(EntradaNombre.getText())){
            EntradaNombre.setText("");
            EntradaNombre.setForeground(Color.black);
            if("".equals(EntradaAPaterno.getText())){
                EntradaAPaterno.setText("Ingrese el A. Paterno");
                EntradaAPaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaAMaterno.getText())){
                EntradaAMaterno.setText("Ingrese el A. Materno");
                EntradaAMaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseña.getText())){
                EntradaContraseña.setText("**********");
                EntradaContraseña.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseñaVerificado.getText())){
                EntradaContraseñaVerificado.setText("**********");
                EntradaContraseñaVerificado.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_EntradaNombreMouseClicked

    private void EntradaAPaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaAPaternoMouseClicked
        if("Ingrese el A. Paterno".equals(EntradaAPaterno.getText())){
            EntradaAPaterno.setText("");
            EntradaAPaterno.setForeground(Color.black);
            if("".equals(EntradaNombre.getText())){
                EntradaNombre.setText("Ingrese el Nombre");
                EntradaNombre.setForeground(Color.gray);
            }
            if("".equals(EntradaAMaterno.getText())){
                EntradaAMaterno.setText("Ingrese el A. Materno");
                EntradaAMaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseña.getText())){
                EntradaContraseña.setText("**********");
                EntradaContraseña.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseñaVerificado.getText())){
                EntradaContraseñaVerificado.setText("**********");
                EntradaContraseñaVerificado.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_EntradaAPaternoMouseClicked

    private void EntradaAMaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaAMaternoMouseClicked
        if("Ingrese el A. Materno".equals(EntradaAMaterno.getText())){
            EntradaAMaterno.setText("");
            EntradaAMaterno.setForeground(Color.black);
            if("".equals(EntradaNombre.getText())){
                EntradaNombre.setText("Ingrese el Nombre");
                EntradaNombre.setForeground(Color.gray);
            }
            if("".equals(EntradaAPaterno.getText())){
                EntradaAPaterno.setText("Ingrese el A. Paterno");
                EntradaAPaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseña.getText())){
                EntradaContraseña.setText("**********");
                EntradaContraseña.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseñaVerificado.getText())){
                EntradaContraseñaVerificado.setText("**********");
                EntradaContraseñaVerificado.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_EntradaAMaternoMouseClicked

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        boolean Verificador = false;
        String puesto = "";
        
        Icon avatar      = EntradaImagen.getIcon();
        String nombre    = EntradaNombre.getText().toUpperCase();
        String aPaterno  = EntradaAPaterno.getText().toUpperCase();
        String aMaterno  = EntradaAMaterno.getText().toUpperCase();
        String password1 = EntradaContraseña.getText();
        String password2 = EntradaContraseñaVerificado.getText();
        
        if(EntradaPuesto.getSelectedIndex() == 1){
            puesto = EntradaPuesto.getSelectedItem().toString().toUpperCase();
        }
        if(EntradaPuesto.getSelectedIndex() == 2){
            puesto = EntradaPuesto.getSelectedItem().toString().toUpperCase();
        }
        
        AE = new I1_AgregarEmpleado();
        
        if(EntradaPuesto.getSelectedIndex() != 0){
            Verificador = AE.verificarDatos(imagenInicial,avatar,nombre,aPaterno,aMaterno,puesto,password1,password2);
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

    private void EntradaImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaImagenMouseClicked
        JFileChooser archivo = new JFileChooser();
        File ruta = new File("C:\\Users\\Jeus RG\\OneDrive\\Escritorio\\Avatars");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        
        if(ventana == JFileChooser.APPROVE_OPTION){
            File file = archivo.getSelectedFile();
            Image foto = getToolkit().getImage(String.valueOf(file));
            foto = foto.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
            EntradaImagen.setIcon(new ImageIcon(foto));
        }  
    }//GEN-LAST:event_EntradaImagenMouseClicked

    private void EntradaContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaContraseñaMouseClicked
        if("**********".equals(EntradaContraseña.getText())){
            EntradaContraseña.setText("");
            EntradaContraseña.setForeground(Color.black);
            if("".equals(EntradaNombre.getText())){
                EntradaNombre.setText("Ingrese el Nombre");
                EntradaNombre.setForeground(Color.gray);
            }
            if("".equals(EntradaAPaterno.getText())){
                EntradaAPaterno.setText("Ingrese el A. Paterno");
                EntradaAPaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaAMaterno.getText())){
                EntradaAMaterno.setText("Ingrese el A. Materno");
                EntradaAMaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseñaVerificado.getText())){
                EntradaContraseñaVerificado.setText("**********");
                EntradaContraseñaVerificado.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_EntradaContraseñaMouseClicked

    private void EntradaContraseñaVerificadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaContraseñaVerificadoMouseClicked
        if("**********".equals(EntradaContraseñaVerificado.getText())){
            EntradaContraseñaVerificado.setText("");
            EntradaContraseñaVerificado.setForeground(Color.black);
            if("".equals(EntradaNombre.getText())){
                EntradaNombre.setText("Ingrese el Nombre");
                EntradaNombre.setForeground(Color.gray);
            }
            if("".equals(EntradaAPaterno.getText())){
                EntradaAPaterno.setText("Ingrese el A. Paterno");
                EntradaAPaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaAMaterno.getText())){
                EntradaAMaterno.setText("Ingrese el A. Materno");
                EntradaAMaterno.setForeground(Color.gray);
            }
            if("".equals(EntradaContraseña.getText())){
                EntradaContraseña.setText("**********");
                EntradaContraseña.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_EntradaContraseñaVerificadoMouseClicked

    private void Ver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver1ActionPerformed
        Ver1.setVisible(false);
        Ocultar1.setVisible(true);
        EntradaContraseña.setEchoChar((char)0);
    }//GEN-LAST:event_Ver1ActionPerformed

    private void Ocultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ocultar1ActionPerformed
        Ver1.setVisible(true);
        Ocultar1.setVisible(false);
        EntradaContraseña.setEchoChar('•');
    }//GEN-LAST:event_Ocultar1ActionPerformed

    private void Ocultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ocultar2ActionPerformed
        Ver2.setVisible(true);
        Ocultar2.setVisible(false);
        EntradaContraseñaVerificado.setEchoChar('•');
    }//GEN-LAST:event_Ocultar2ActionPerformed

    private void Ver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver2ActionPerformed
        Ver2.setVisible(false);
        Ocultar2.setVisible(true);
        EntradaContraseñaVerificado.setEchoChar((char)0);
    }//GEN-LAST:event_Ver2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_AgregarEmpleado().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EntradaAMaterno;
    private javax.swing.JTextField EntradaAPaterno;
    private javax.swing.JPasswordField EntradaContraseña;
    private javax.swing.JPasswordField EntradaContraseñaVerificado;
    private javax.swing.JLabel EntradaImagen;
    private javax.swing.JTextField EntradaNombre;
    private javax.swing.JComboBox<String> EntradaPuesto;
    private javax.swing.JButton Ocultar1;
    private javax.swing.JButton Ocultar2;
    private javax.swing.JButton Ver1;
    private javax.swing.JButton Ver2;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JLabel lbl_ApellidoMaterno;
    private javax.swing.JLabel lbl_ApellidoPaterno;
    private javax.swing.JLabel lbl_Contraseña;
    private javax.swing.JLabel lbl_ContraseñaVerificador;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Perfil;
    private javax.swing.JLabel lbl_Puesto;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
