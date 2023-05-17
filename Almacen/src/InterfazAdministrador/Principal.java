package InterfazAdministrador;

import java.awt.BorderLayout;

public class Principal extends javax.swing.JFrame {

    //private AgregarEmpleado AE;
    boolean Bandera = false;
            
    public Principal() {
        initComponents();
    }
    
    public void recursos(boolean Verificador){
        Bandera = Verificador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Lateral = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Cabecera = new javax.swing.JPanel();
        Ventanas = new javax.swing.JPanel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lateral.setBackground(new java.awt.Color(153, 255, 255));
        Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Agregar empleado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Lateral.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jButton4.setText("Eliminar empleado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Lateral.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jButton5.setText("Asignar cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Lateral.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jButton1.setText("Mostrar Clientes");
        jButton1.setActionCommand("Mostrar Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Lateral.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        Cabecera.setBackground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout CabeceraLayout = new javax.swing.GroupLayout(Cabecera);
        Cabecera.setLayout(CabeceraLayout);
        CabeceraLayout.setHorizontalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        CabeceraLayout.setVerticalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout VentanasLayout = new javax.swing.GroupLayout(Ventanas);
        Ventanas.setLayout(VentanasLayout);
        VentanasLayout.setHorizontalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        VentanasLayout.setVerticalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Ventanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        AgregarEmpleado AE = new AgregarEmpleado();
        AE.setSize(600,400);
        AE.setLocation(0,0);
        
        Ventanas.removeAll();
        Ventanas.add(AE, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EliminarEmpleado EE = new EliminarEmpleado();
        EE.setSize(600,400);
        EE.setLocation(0,0);
        
        Ventanas.removeAll();
        Ventanas.add(EE, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  
        AsignarCliente AC = new AsignarCliente();
        AC.setSize(600,400);
        AC.setLocation(0,0);
        
        Ventanas.removeAll();
        Ventanas.add(AC, BorderLayout.CENTER);
        Ventanas.revalidate();
        Ventanas.repaint();   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MostrarCliente MC = new MostrarCliente();
        MC.setSize(600,400);
        MC.setLocation(0,0);
        
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
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel Lateral;
    private javax.swing.JPanel Ventanas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
