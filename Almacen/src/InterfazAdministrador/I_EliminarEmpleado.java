package InterfazAdministrador;

import ProgramacionAcciones.BuscarEmpleado;
import ProgramacionAcciones.ConsultarEmpleado;
import ProgramacionAcciones.EliminarEmpleado;
import ProgramacionAcciones.I1_Identificador;
import javax.swing.JOptionPane;

public class I_EliminarEmpleado extends javax.swing.JFrame {
    
    private ConsultarEmpleado CE;
    private EliminarEmpleado EE;
    private BuscarEmpleado BE;
    private I1_Identificador I;
    int Id = 0;
    String niue      = "";
    String nombre    = "";
    String apellidop = "";
    String apellidom = "";
    String puesto    = "";

    public I_EliminarEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        CE = new ConsultarEmpleado();
        BE = new BuscarEmpleado();
        MostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        Buscador = new javax.swing.JComboBox<>();
        EntradaBuscador = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        PanelContenedor = new javax.swing.JPanel();
        Contenedor = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Cancelar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setText("ELIMINAR EMPLEADOS");
        getContentPane().add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 25));

        Buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "niue", "nombre", "apellidop", "apellidom", "puesto" }));
        getContentPane().add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        EntradaBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaBuscadorKeyReleased(evt);
            }
        });
        getContentPane().add(EntradaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 30, 30));

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
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        PanelContenedor.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 270));

        getContentPane().add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 270));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.setToolTipText("");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        lbl_Fondo.setToolTipText("");
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void MostrarTabla(){
        Tabla.setModel(CE.mostrarEmpleados());      
    }
    
    private void MostrarTablaFiltrada(String Identificador, int Id1){
        Tabla.setModel(BE.buscarEmpleado(Identificador, Id));     
    }
    
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        boolean Verificador = false;
        
        if(!EntradaBuscador.getText().isEmpty()){
            //String Identificador = EntradaBuscador.getText();
            String Identificador = "";
            
            I = new I1_Identificador();
            Id = I.numeroBuscador(Buscador.getSelectedIndex());     
            
            //if(Id == 1){
                Identificador = niue;
            //}
            /*if(Id == 2){
                Identificador = nombre;
            }
            if(Id == 3){
                Identificador = apellidop;
            }
            if(Id == 4){
                Identificador = apellidom;
            }
            if(Id == 5){
                Identificador = puesto;
            }*/
            
            
            
            
            EE = new EliminarEmpleado();
            Verificador = EE.eliminarEmpleado(Identificador,Id);
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un contacto");
        }
        
        
        
        
        if(Verificador == true){
            MostrarTabla();
            EntradaBuscador.setText("");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        /*String Identificador = EntradaBuscador.getText();
        
        I = new I1_Identificador();
        Id = I.numeroBuscador(Buscador.getSelectedIndex());
        
        BE = new BuscarEmpleado();
        BE.buscarEmpleado(Identificador,Id);
        MostrarTablaFiltrada(Identificador,Id);*/
    }//GEN-LAST:event_BuscarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        EntradaBuscador.setText(null);
        MostrarTabla();
    }//GEN-LAST:event_CancelarActionPerformed

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
        /*nombre    = Tabla.getValueAt(PosY, 1).toString();
        apellidop = Tabla.getValueAt(PosY, 2).toString();
        apellidom = Tabla.getValueAt(PosY, 3).toString();
        puesto    = Tabla.getValueAt(PosY, 4).toString();*/
    }//GEN-LAST:event_TablaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_EliminarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Buscador;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JScrollPane Contenedor;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField EntradaBuscador;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
