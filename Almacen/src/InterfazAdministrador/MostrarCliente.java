package InterfazAdministrador;

import ProgramacionAcciones.BuscarCliente;
import ProgramacionAcciones.ConsultarCliente;
import ProgramacionAcciones.EliminarClienteClase;
import ProgramacionAcciones.I1_Identificador;
import javax.swing.JOptionPane;

public class MostrarCliente extends javax.swing.JPanel {

    private ConsultarCliente CC;
    private I_AsignarCliente IAC;
    private I1_Identificador I;
    private EliminarClienteClase EC;
    private BuscarCliente BC;
    int Id = 0;
    String niuc = "";
    
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

        Eliminar = new javax.swing.JButton();
        ContenedorTC = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();

        Eliminar.setText("Eliminar");
        Eliminar.setToolTipText("");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

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
        TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteMouseClicked(evt);
            }
        });
        ContenedorTC.setViewportView(TablaCliente);

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niuc", "ciue", "niue", "nombre", "apellidop", "apellidom" }));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ContenedorTC, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(Eliminar)
                .addGap(107, 107, 107)
                .addComponent(Cancelar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(ContenedorTC, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eliminar)
                    .addComponent(Cancelar)))
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

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        boolean Verificador = false;

        if(!niuc.isEmpty()){
            
            String Identificador = "";

            I = new I1_Identificador();
            Id = I.numeroBuscador(Buscador.getSelectedIndex());

            Identificador = niuc;

            EC = new EliminarClienteClase();
            Verificador = EC.eliminarCliente(Identificador,Id);

        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un contacto");
        }

        if(Verificador == true){
            MostrarTablaCliente();
            EntradaBuscador.setText("");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        /*EntradaBuscador.setText(null);
        MostrarTabla();*/
    }//GEN-LAST:event_CancelarActionPerformed

    private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
        int PosY  = TablaCliente.getSelectedRow();
        niuc      = TablaCliente.getValueAt(PosY, 0).toString();
    }//GEN-LAST:event_TablaClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JButton Cancelar;
    private javax.swing.JScrollPane ContenedorTC;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTable TablaCliente;
    // End of variables declaration//GEN-END:variables
}
