package InterfazAdministrador;

import ProgramacionAcciones.BuscarCliente;
import ProgramacionAcciones.ConsultarCliente;
import ProgramacionAcciones.I1_Identificador;

public class MostrarCliente extends javax.swing.JPanel {

    private ConsultarCliente CC;
    private I_AsignarCliente IAC;
    private I1_Identificador I;
    private BuscarCliente BC;
    int Id = 0;
    
    public MostrarCliente() {
        initComponents();
        CC = new ConsultarCliente();
        CC.mostrarClientes();
        MostrarTablaCliente();
    }
    
    private void MostrarTablaCliente(){
        TablaCliente.setModel(CC.mostrarClientes());
    }
    
    private void MostrarTablaFiltrada(String Identificador, int Id1){
        TablaCliente.setModel(BC.buscarCliente(Identificador, Id));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorTC = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        TomadorPedidos = new javax.swing.JButton();

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

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niuc", "ciue", "niue", "nombre", "apellidop", "apellidom" }));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });

        TomadorPedidos.setText("Tomadores de pedidos");
        TomadorPedidos.setToolTipText("");
        TomadorPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomadorPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(TomadorPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ContenedorTC, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TomadorPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(ContenedorTC, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JScrollPane ContenedorTC;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTable TablaCliente;
    private javax.swing.JButton TomadorPedidos;
    // End of variables declaration//GEN-END:variables
}
