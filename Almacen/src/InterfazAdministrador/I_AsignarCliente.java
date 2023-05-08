package InterfazAdministrador;

import ProgramacionAcciones.BuscarEmpleado;
import ProgramacionAcciones.BuscarEmpleadoCliente;
import ProgramacionAcciones.ConsultarCliente;
import ProgramacionAcciones.I1_Identificador;
import ProgramacionAcciones.MostrarTomadoresPedido;
import javax.swing.JOptionPane;

public class I_AsignarCliente extends javax.swing.JFrame {
    
    private MostrarTomadoresPedido MTP;
    private ConsultarCliente CC;
    private I1_Identificador I;
    private BuscarEmpleadoCliente BEC;
    int Id = 0;
    int Fila = 0;
    
    public I_AsignarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        MTP = new MostrarTomadoresPedido();
        MTP.mostrarPuesto();
        MostrarTabla();
        
        
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
        Contenedor1 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        lbl_NIUC = new javax.swing.JLabel();
        Entrada_NIUC = new javax.swing.JTextField();
        lbl_CIUN = new javax.swing.JLabel();
        Entrada_CIUN = new javax.swing.JTextField();
        lbl_NIUE = new javax.swing.JLabel();
        Entrada_NIUE = new javax.swing.JTextField();
        lbl_Nombre = new javax.swing.JLabel();
        Entrada_Nombre = new javax.swing.JTextField();
        lbl_ApellidoP = new javax.swing.JLabel();
        Entrada_ApellidoP = new javax.swing.JTextField();
        lbl_ApellidoM = new javax.swing.JLabel();
        Entrada_ApellidoM = new javax.swing.JTextField();
        lbl_Direccion = new javax.swing.JLabel();
        Entrada_Direccion = new javax.swing.JTextField();
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
        Contenedor1.setViewportView(TablaEmpleado);

        getContentPane().add(Contenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 110));

        lbl_NIUC.setText("NIUC");
        getContentPane().add(lbl_NIUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        getContentPane().add(Entrada_NIUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 30));

        lbl_CIUN.setText("CIUN");
        getContentPane().add(lbl_CIUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));
        getContentPane().add(Entrada_CIUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 30));

        lbl_NIUE.setText("NIUE");
        getContentPane().add(lbl_NIUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));
        getContentPane().add(Entrada_NIUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 120, 30));

        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));
        getContentPane().add(Entrada_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 170, 30));

        lbl_ApellidoP.setText("Apellido Paterno");
        getContentPane().add(lbl_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        getContentPane().add(Entrada_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 30));

        lbl_ApellidoM.setText("Apellido Materno");
        getContentPane().add(lbl_ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        getContentPane().add(Entrada_ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 300, 30));

        lbl_Direccion.setText("Direccion");
        getContentPane().add(lbl_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        getContentPane().add(Entrada_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 580, 30));

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

    private void MostrarTabla(){
        TablaEmpleado.setModel(MTP.mostrarPuesto());
    }
    
    private void MostrarTablaCliente(){
        //Tabl.setModel(CC.mostrarClientes());      
    }
    
    private void TomadorPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomadorPedidosActionPerformed
        //
    }//GEN-LAST:event_TomadorPedidosActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
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
        
        if(!Entrada_NIUC.getText().isEmpty()      && 
           !Entrada_CIUN.getText().isEmpty()      && 
           !Entrada_Nombre.getText().isEmpty()    && 
           !Entrada_ApellidoP.getText().isEmpty() &&
           !Entrada_ApellidoM.getText().isEmpty() && 
           !Entrada_Direccion.getText().isEmpty())
        {
        int NIUC = Integer.parseInt(Entrada_NIUC.getText());
        String CIUN      = Entrada_CIUN.getText().toUpperCase();
        String Nombre    = Entrada_Nombre.getText().toUpperCase();
        String APaterno  = Entrada_ApellidoP.getText().toUpperCase();
        String AMaterno  = Entrada_ApellidoM.getText().toUpperCase();
        String Direccion = Entrada_Direccion.getText().toUpperCase();
        }else{
            JOptionPane.showMessageDialog(null, "Campos Incompletos");
        }
        Fila = TablaEmpleado.getSelectedRow();
        System.out.print("Hola" + Fila);
        
        
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
    private javax.swing.JScrollPane Contenedor1;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTextField Entrada_ApellidoM;
    private javax.swing.JTextField Entrada_ApellidoP;
    private javax.swing.JTextField Entrada_CIUN;
    private javax.swing.JTextField Entrada_Direccion;
    private javax.swing.JTextField Entrada_NIUC;
    private javax.swing.JTextField Entrada_NIUE;
    private javax.swing.JTextField Entrada_Nombre;
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JButton TomadorPedidos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_ApellidoM;
    private javax.swing.JLabel lbl_ApellidoP;
    private javax.swing.JLabel lbl_CIUN;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_NIUC;
    private javax.swing.JLabel lbl_NIUE;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
