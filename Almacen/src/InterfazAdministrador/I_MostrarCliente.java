package InterfazAdministrador;

import ProgramacionAcciones.BuscarCliente;
import ProgramacionAcciones.ConsultarCliente;
import ProgramacionAcciones.I1_Identificador;

public class I_MostrarCliente extends javax.swing.JFrame {
    private ConsultarCliente CC;
    private I_AsignarCliente IAC;
    private I1_Identificador I;
    private BuscarCliente BC;
    int Id = 0;
    
    public I_MostrarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        CC = new ConsultarCliente();
        CC.mostrarClientes();
        MostrarTablaCliente();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorTC = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        TomadorPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIUE", "Nombre", "APaterno", "AMaterno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ContenedorTC.setViewportView(TablaCliente);

        getContentPane().add(ContenedorTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 280));

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niuc", "ciue", "niue", "nombre", "apellidop", "apellidom" }));
        getContentPane().add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });
        getContentPane().add(EntradaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

        TomadorPedidos.setText("Tomadores de pedidos");
        TomadorPedidos.setToolTipText("");
        TomadorPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomadorPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(TomadorPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 180, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void MostrarTablaCliente(){
        TablaCliente.setModel(CC.mostrarClientes());
    }
    
    private void MostrarTablaFiltrada(String Identificador, int Id1){
        TablaCliente.setModel(BC.buscarCliente(Identificador, Id));
    }
    
    private void EntradaBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaBuscadorKeyReleased
        String Identificador = EntradaBuscador.getText();

        I = new I1_Identificador();
        Id = I.numeroBuscador(Buscador.getSelectedIndex());

        BC = new BuscarCliente();
        BC.buscarCliente(Identificador,Id);
        MostrarTablaFiltrada(Identificador,Id);
    }//GEN-LAST:event_EntradaBuscadorKeyReleased

    private void TomadorPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomadorPedidosActionPerformed
        IAC = new I_AsignarCliente();
        IAC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TomadorPedidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(I_MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_MostrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JScrollPane ContenedorTC;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTable TablaCliente;
    private javax.swing.JButton TomadorPedidos;
    // End of variables declaration//GEN-END:variables
}
