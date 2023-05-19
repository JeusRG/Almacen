package InterfazAdministrador;

import java.awt.BorderLayout;

public class Principal extends javax.swing.JFrame {
           
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        SalidaImagen.getIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lateral = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Ventanas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelniue = new javax.swing.JLabel();
        pantallaniue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SalidaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lateral.setBackground(new java.awt.Color(69, 114, 196));
        Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Agregar empleado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Lateral.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 169, 48));

        jButton4.setText("Eliminar empleado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Lateral.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 169, 48));

        jButton5.setText("Asignar cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Lateral.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 169, 48));

        jButton1.setText("Mostrar Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Lateral.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 169, 48));

        getContentPane().add(Lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 540));

        Ventanas.setBackground(new java.awt.Color(204, 204, 255));
        Ventanas.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout VentanasLayout = new javax.swing.GroupLayout(Ventanas);
        Ventanas.setLayout(VentanasLayout);
        VentanasLayout.setHorizontalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        VentanasLayout.setVerticalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(Ventanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 740, 540));

        jPanel1.setBackground(new java.awt.Color(69, 114, 196));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelniue.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelniue.setText("NIUE");
        jPanel1.add(labelniue, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 26));

        pantallaniue.setEditable(false);
        pantallaniue.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pantallaniue.setText("2");
        jPanel1.add(pantallaniue, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 123, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/osodebimbo-red.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 159, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/logobimbo-tp.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 0, -1, -1));

        SalidaImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(SalidaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 5, 100, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        AgregarEmpleado AE = new AgregarEmpleado();
        AE.setSize(600,400);
        AE.setLocation(75,75);
        
        Ventanas.removeAll();
        Ventanas.add(AE, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EliminarEmpleado EE = new EliminarEmpleado();
        EE.setSize(740,540);
        EE.setLocation(0,0);
        
        Ventanas.removeAll();
        Ventanas.add(EE, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  
        AsignarCliente AC = new AsignarCliente();
        AC.setSize(600,400);
        AC.setLocation(75,75);
        
        Ventanas.removeAll();
        Ventanas.add(AC, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MostrarCliente MC = new MostrarCliente();
        MC.setSize(600,400);
        MC.setLocation(75,75);
       
        Ventanas.removeAll();
        Ventanas.add(MC, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lateral;
    private javax.swing.JLabel SalidaImagen;
    private javax.swing.JPanel Ventanas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel labelniue;
    private static javax.swing.JTextField pantallaniue;
    // End of variables declaration//GEN-END:variables
}
