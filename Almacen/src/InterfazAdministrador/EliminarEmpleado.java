package InterfazAdministrador;

import ProgramacionAcciones.BuscarEmpleado;
import ProgramacionAcciones.ConsultarEmpleado;
import ProgramacionAcciones.EliminarEmpleadoClase;
import ProgramacionAcciones.I1_Identificador;
import javax.swing.JOptionPane;

public class EliminarEmpleado extends javax.swing.JPanel {

    private ConsultarEmpleado CE;
    private EliminarEmpleadoClase EE;
    private BuscarEmpleado BE;
    private I1_Identificador I;
    int Id = 0;
    String niue = "";
    
    public EliminarEmpleado() {
        initComponents();
        CE = new ConsultarEmpleado();
        BE = new BuscarEmpleado();
        MostrarTabla();
    }
    
    private void MostrarTabla(){
        Tabla.setModel(CE.mostrarEmpleados());   
    }
    
    private void MostrarTablaFiltrada(String Identificador, int Id1){
        Tabla.setModel(BE.buscarEmpleado(Identificador, Id));     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        PanelContenedor = new javax.swing.JPanel();
        Contenedor = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        lbl_Titulo.setText("ELIMINAR EMPLEADOS");

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niue", "nombre", "apellidop", "apellidom", "puesto" }));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });

        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIUE", "Nombre", "APaterno", "AMaterno", "Puesto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        Contenedor.setViewportView(Tabla);

        PanelContenedor.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 270));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 120, 120));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.setToolTipText("");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
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
                        .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(Eliminar)
                            .addGap(107, 107, 107)
                            .addComponent(Cancelar)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Eliminar)
                        .addComponent(Cancelar))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaBuscadorKeyReleased
        String Identificador = EntradaBuscador.getText();

        I = new I1_Identificador();
        Id = I.numeroBuscador(Buscador.getSelectedIndex());

        BE = new BuscarEmpleado();
        BE.buscarEmpleado(Identificador,Id);
        MostrarTablaFiltrada(Identificador,Id);
    }//GEN-LAST:event_EntradaBuscadorKeyReleased

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int PosY  = Tabla.getSelectedRow();
        niue      = Tabla.getValueAt(PosY, 0).toString();
    }//GEN-LAST:event_TablaMouseClicked

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        EntradaBuscador.setText(null);
        MostrarTabla();
    }//GEN-LAST:event_CancelarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        boolean Verificador = false;

        if(!niue.isEmpty()){
            String Identificador = "";

            I = new I1_Identificador();
            Id = I.numeroBuscador(Buscador.getSelectedIndex());

            Identificador = niue;

            EE = new EliminarEmpleadoClase();
            Verificador = EE.eliminarEmpleado(Identificador,Id);

        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un contacto");
        }

        if(Verificador == true){
            MostrarTabla();
            EntradaBuscador.setText("");
        }
    }//GEN-LAST:event_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JButton Cancelar;
    private javax.swing.JScrollPane Contenedor;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
