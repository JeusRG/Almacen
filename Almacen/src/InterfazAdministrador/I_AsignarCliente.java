package InterfazAdministrador;

import ProgramacionAcciones.BuscarEmpleadoCliente;
import ProgramacionAcciones.ConsultarCliente;
import ProgramacionAcciones.ConsultarEmpleado;
import ProgramacionAcciones.I1_Identificador;
import ProgramacionAcciones.MostrarTomadoresPedido;

public class I_AsignarCliente extends javax.swing.JFrame {
    
    private MostrarTomadoresPedido MTP;
    private ConsultarCliente CC;
    private ConsultarEmpleado CE;
    private I1_Identificador I;
    private BuscarEmpleadoCliente BEC;
    int Id = 0;
    int Fila = 0;
    
    public I_AsignarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        MTP = new MostrarTomadoresPedido();
        MTP.mostrarPuesto();
        MostrarTablaEmpleado();
    }

    private void MostrarTablaFiltrada(String Identificador, int Id1){
        TablaEmpleado.setModel(BEC.buscarEmpleadocliente(Identificador, Id));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lbl_Titulo = new javax.swing.JLabel();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        ContenedorTC = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        ContenedorTE = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        TomadorPedidos = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        AsignarCliente = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setText("ASIGNAR EMPLEADOS");
        getContentPane().add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 25));

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niue", "nombre", "apellidop", "apellidom" }));
        getContentPane().add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });
        getContentPane().add(EntradaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 30, 30));

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

        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        ContenedorTE.setViewportView(TablaEmpleado);

        getContentPane().add(ContenedorTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 280));

        TomadorPedidos.setText("Tomadores de pedidos");
        TomadorPedidos.setToolTipText("");
        TomadorPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomadorPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(TomadorPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 30));

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 30));

        AsignarCliente.setText("Asignar Cliente");
        AsignarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(AsignarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 130, 30));

        Cancelar.setText("Cancelar");
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 110, 30));

        lbl_Fondo.setToolTipText("");
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarTablaEmpleado(){
        TablaEmpleado.setModel(MTP.mostrarPuesto());   
    }
    
    private void MostrarTablaCliente(){
        TablaCliente.setModel(CC.mostrarClientes());
    }
    
    private void TomadorPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomadorPedidosActionPerformed
        ContenedorTE.setVisible(true);
        ContenedorTC.setVisible(false);
        CE = new ConsultarEmpleado();
        CE.mostrarEmpleados();
        MostrarTablaEmpleado();
    }//GEN-LAST:event_TomadorPedidosActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        ContenedorTC.setVisible(true);
        ContenedorTE.setVisible(false);
        CC = new ConsultarCliente();
        CC.mostrarClientes();
        MostrarTablaCliente();
    }//GEN-LAST:event_ClienteActionPerformed

    private void EntradaBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaBuscadorKeyReleased
        String Identificador = EntradaBuscador.getText();
        
        I = new I1_Identificador();
        Id = I.numeroBuscador(Buscador.getSelectedIndex());
        
        BEC = new BuscarEmpleadoCliente();
        BEC.buscarEmpleadocliente(Identificador,Id);
        MostrarTablaFiltrada(Identificador,Id);
    }//GEN-LAST:event_EntradaBuscadorKeyReleased

    private void AsignarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarClienteActionPerformed
        
    }//GEN-LAST:event_AsignarClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_AsignarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsignarCliente;
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cliente;
    private javax.swing.JScrollPane ContenedorTC;
    private javax.swing.JScrollPane ContenedorTE;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTable TablaCliente;
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JButton TomadorPedidos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
