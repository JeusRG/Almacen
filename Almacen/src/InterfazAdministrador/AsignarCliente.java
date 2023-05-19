package InterfazAdministrador;

import ProgramacionAcciones.AsignarClienteClase;
import ProgramacionAcciones.BuscarEmpleadoCliente;
import ProgramacionAcciones.I1_Identificador;
import ProgramacionAcciones.MostrarTomadoresPedido;
import javax.swing.JOptionPane;

public class AsignarCliente extends javax.swing.JPanel {

    private AsignarClienteClase AC;
    private MostrarTomadoresPedido MTP;
    private I1_Identificador I;
    private BuscarEmpleadoCliente BEC;
    int Id = 0;
    
    public AsignarCliente() {
        initComponents();
        MTP = new MostrarTomadoresPedido();
        MTP.mostrarPuesto();
        MostrarTablaEmpleado();
    }

    private void MostrarTablaFiltrada(String Identificador, int Id1){
        TablaEmpleado.setModel(BEC.buscarEmpleadocliente(Identificador, Id));
    }

    private void MostrarTablaEmpleado(){
        TablaEmpleado.setModel(MTP.mostrarPuesto());   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        ContenedorTE = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
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
        AsignarCliente = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lbl_Titulo.setText("ASIGNAR EMPLEADOS");

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niue", "nombre", "apellidop", "apellidom" }));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });

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

        lbl_CIUN.setText("CIUN");

        lbl_NIUE.setText("NIUE");

        lbl_Nombre.setText("Nombre");

        lbl_ApellidoP.setText("Apellido Paterno");

        lbl_ApellidoM.setText("Apellido Materno");

        lbl_Direccion.setText("Direccion");

        AsignarCliente.setText("Asignar Cliente");
        AsignarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarClienteActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(AsignarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ContenedorTE, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_CIUN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(lbl_NIUE)
                                    .addGap(64, 64, 64)
                                    .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(lbl_ApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(EntradaCiun, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(EntradaNiue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(EntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(EntradaApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_ApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(150, 150, 150)
                                    .addComponent(lbl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(EntradaApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(EntradaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsignarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(ContenedorTE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_CIUN)
                        .addComponent(lbl_NIUE)
                        .addComponent(lbl_Nombre)
                        .addComponent(lbl_ApellidoP))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EntradaCiun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaNiue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_ApellidoM)
                        .addComponent(lbl_Direccion))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EntradaApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 67, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaBuscadorKeyReleased
        String Identificador = EntradaBuscador.getText();

        I = new I1_Identificador();
        Id = I.numeroBuscador(Buscador.getSelectedIndex());

        BEC = new BuscarEmpleadoCliente();
        BEC.buscarEmpleadocliente(Identificador,Id);
        MostrarTablaFiltrada(Identificador,Id);
    }//GEN-LAST:event_EntradaBuscadorKeyReleased

    private void TablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadoMouseClicked
        int PosY = TablaEmpleado.getSelectedRow();
        String niue = TablaEmpleado.getValueAt(PosY, 0).toString();
        EntradaNiue.setText(niue);
    }//GEN-LAST:event_TablaEmpleadoMouseClicked

    private void AsignarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarClienteActionPerformed
        boolean Verificador = false;
        String ciun = EntradaCiun.getText().toUpperCase();
        int niue = Integer.parseInt(EntradaNiue.getText());
        String nombre = EntradaNombre.getText().toUpperCase();
        String aPaterno  = EntradaApellidoP.getText().toUpperCase();
        String aMaterno  = EntradaApellidoM.getText().toUpperCase();
        String direccion = EntradaDireccion.getText().toUpperCase();

        AC = new AsignarClienteClase();

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsignarCliente;
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JButton Cancelar;
    private javax.swing.JScrollPane ContenedorTE;
    private javax.swing.JTextField EntradaApellidoM;
    private javax.swing.JTextField EntradaApellidoP;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JTextField EntradaCiun;
    private javax.swing.JTextField EntradaDireccion;
    private javax.swing.JTextField EntradaNiue;
    private javax.swing.JTextField EntradaNombre;
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JLabel lbl_ApellidoM;
    private javax.swing.JLabel lbl_ApellidoP;
    private javax.swing.JLabel lbl_CIUN;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_NIUE;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
