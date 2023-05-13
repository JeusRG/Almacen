package InterfazAdministrador;

import ProgramacionAcciones.AsignarCliente;
import ProgramacionAcciones.BuscarEmpleadoCliente;
import ProgramacionAcciones.ConsultarCliente;
import ProgramacionAcciones.ConsultarEmpleado;
import ProgramacionAcciones.I1_Identificador;
import ProgramacionAcciones.MostrarTomadoresPedido;
import javax.swing.JOptionPane;

public class I_AsignarCliente extends javax.swing.JFrame {
    
    private AsignarCliente AC;
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
        ContenedorTC.setVisible(false);
        ContenedorTE.setVisible(true);
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
        ContenedorTE = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        TomadorPedidos = new javax.swing.JButton();
        lbl_CIUN = new javax.swing.JLabel();
        EntradaCiun = new javax.swing.JTextField();
        lbl_NIUE = new javax.swing.JLabel();
        EntradaNiue = new javax.swing.JTextField();
        lbl_Nombre = new javax.swing.JLabel();
        EntradaNombre = new javax.swing.JTextField();
        lbl_ApellidoP = new javax.swing.JLabel();
        EntradaApellidoP = new javax.swing.JTextField();
        lbl_ApellidoM = new javax.swing.JLabel();
        EntradaApellidoM = new javax.swing.JTextField();
        lbl_Direccion = new javax.swing.JLabel();
        EntradaDireccion = new javax.swing.JTextField();
        Cliente = new javax.swing.JButton();
        AsignarCliente = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        ContenedorTC = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
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
        TablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadoMouseClicked(evt);
            }
        });
        ContenedorTE.setViewportView(TablaEmpleado);

        getContentPane().add(ContenedorTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 140));

        TomadorPedidos.setText("Tomadores de pedidos");
        TomadorPedidos.setToolTipText("");
        TomadorPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomadorPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(TomadorPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 180, 30));

        lbl_CIUN.setText("CIUN");
        getContentPane().add(lbl_CIUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        getContentPane().add(EntradaCiun, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        lbl_NIUE.setText("NIUE");
        getContentPane().add(lbl_NIUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));
        getContentPane().add(EntradaNiue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 80, 30));

        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 60, -1));
        getContentPane().add(EntradaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, 30));

        lbl_ApellidoP.setText("Apellido Paterno");
        getContentPane().add(lbl_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 160, -1));
        getContentPane().add(EntradaApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 240, 30));

        lbl_ApellidoM.setText("Apellido Materno");
        getContentPane().add(lbl_ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));
        getContentPane().add(EntradaApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 240, 30));

        lbl_Direccion.setText("Direccion");
        getContentPane().add(lbl_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 100, -1));
        getContentPane().add(EntradaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 330, 30));

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 100, 30));

        AsignarCliente.setText("Asignar Cliente");
        AsignarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(AsignarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, 30));

        Cancelar.setText("Cancelar");
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 30));

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
        EntradaCiun.setVisible(false);
        EntradaNiue.setVisible(false);
        EntradaNombre.setVisible(false);
        EntradaApellidoP.setVisible(false);
        EntradaApellidoM.setVisible(false);
        EntradaDireccion.setVisible(false);
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
        boolean Verificador = false;
        String ciun = EntradaCiun.getText().toUpperCase();
        int niue = Integer.parseInt(EntradaNiue.getText());
        String nombre = EntradaNombre.getText().toUpperCase();
        String aPaterno  = EntradaApellidoP.getText().toUpperCase();
        String aMaterno  = EntradaApellidoM.getText().toUpperCase();
        String direccion = EntradaDireccion.getText().toUpperCase();
        
        AC = new AsignarCliente();
        
        
        Verificador = AC.verificarDatos(ciun,niue,nombre,aPaterno,aMaterno,direccion);
        
        if(Verificador == true){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            EntradaCiun.setText(null);
            EntradaNiue.setText(null);
            EntradaNombre.setText(null);
            EntradaApellidoP.setText(null);
            EntradaApellidoM.setText(null);
            EntradaDireccion.setText(null);
        }
    }//GEN-LAST:event_AsignarClienteActionPerformed

    private void TablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadoMouseClicked
        int PosY = TablaEmpleado.getSelectedRow();
        String niue = TablaEmpleado.getValueAt(PosY, 0).toString();
        System.out.println(PosY + " " + niue);
        EntradaNiue.setText(niue); 
    }//GEN-LAST:event_TablaEmpleadoMouseClicked

    /*TablaEmpleado.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e) {
        // Obtener el índice de la fila seleccionada
        

        // Obtener los valores de las celdas en la fila seleccionada
        String col1 = table.getValueAt(rowIndex, 0).toString();
        String col2 = table.getValueAt(rowIndex, 1).toString();
        String col3 = table.getValueAt(rowIndex, 2).toString();

        // Imprimir los valores de las celdas en la consola
        System.out.println("Valor de la celda 1: " + col1);
        System.out.println("Valor de la celda 2: " + col2);
        System.out.println("Valor de la celda 3: " + col3);
    }
}*/
    
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
    private javax.swing.JTextField EntradaApellidoM;
    private javax.swing.JTextField EntradaApellidoP;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTextField EntradaCiun;
    private javax.swing.JTextField EntradaDireccion;
    private javax.swing.JTextField EntradaNiue;
    private javax.swing.JTextField EntradaNombre;
    private javax.swing.JTable TablaCliente;
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JButton TomadorPedidos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_ApellidoM;
    private javax.swing.JLabel lbl_ApellidoP;
    private javax.swing.JLabel lbl_CIUN;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_NIUE;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
