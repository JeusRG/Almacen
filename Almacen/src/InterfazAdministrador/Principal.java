package InterfazAdministrador;

import java.awt.BorderLayout;

public class Principal extends javax.swing.JFrame {
           
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lateral = new javax.swing.JPanel();
        AE = new javax.swing.JButton();
        EE = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        MC = new javax.swing.JButton();
        AddC = new javax.swing.JButton();
        EC = new javax.swing.JButton();
        Ventanas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelniue = new javax.swing.JLabel();
        pantallaniue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lateral.setBackground(new java.awt.Color(69, 114, 196));
        Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AE.setText("Agregar Empleado");
        AE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AEActionPerformed(evt);
            }
        });
        Lateral.add(AE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 169, 48));

        EE.setText("Eliminar Empleado");
        EE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEActionPerformed(evt);
            }
        });
        Lateral.add(EE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 169, 48));

        AC.setText("Asignar Cliente");
        AC.setActionCommand("Asignar Cliente");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        Lateral.add(AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 169, 48));

        MC.setText("Mostrar Clientes");
        MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCActionPerformed(evt);
            }
        });
        Lateral.add(MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 169, 48));

        AddC.setText("Agregar Cliente");
        AddC.setActionCommand("Agregar Clientes");
        AddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCActionPerformed(evt);
            }
        });
        Lateral.add(AddC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 169, 48));

        EC.setText("Eliminar Cliente");
        EC.setActionCommand("Agregar Clientes");
        EC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECActionPerformed(evt);
            }
        });
        Lateral.add(EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 169, 48));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AEActionPerformed
        AgregarEmpleado AE = new AgregarEmpleado();
        AE.setSize(740,350);
        AE.setLocation(0,95);
        
        Ventanas.removeAll();
        Ventanas.add(AE, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_AEActionPerformed

    private void EEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEActionPerformed
        EliminarEmpleado EE = new EliminarEmpleado();
        EE.setSize(740,540);
        EE.setLocation(0,0);
        
        Ventanas.removeAll();
        Ventanas.add(EE, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_EEActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        AsignarCliente AC = new AsignarCliente();
        AC.setSize(600,400);
        AC.setLocation(75,75);
        
        Ventanas.removeAll();
        Ventanas.add(AC, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();   
    }//GEN-LAST:event_ACActionPerformed

    private void MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCActionPerformed
        MostrarCliente MC = new MostrarCliente();
        MC.setSize(600,400);
        MC.setLocation(75,75);
       
        Ventanas.removeAll();
        Ventanas.add(MC, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_MCActionPerformed

    private void ECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECActionPerformed
        eliminar_cliente ec=new eliminar_cliente();
        ec.setSize(740,540);
        ec.setLocation(0, 0);
        
        Ventanas.removeAll();
        Ventanas.add(ec, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_ECActionPerformed

    private void AddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCActionPerformed
        agregar_cliente ac =new agregar_cliente();
        ac.setSize(740,540);
        ac.setLocation(0, 0);
        
        Ventanas.removeAll();
        Ventanas.add(ac, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_AddCActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton AE;
    private javax.swing.JButton AddC;
    private javax.swing.JButton EC;
    private javax.swing.JButton EE;
    private javax.swing.JPanel Lateral;
    private javax.swing.JButton MC;
    private javax.swing.JPanel Ventanas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel labelniue;
    private static javax.swing.JTextField pantallaniue;
    // End of variables declaration//GEN-END:variables
}
