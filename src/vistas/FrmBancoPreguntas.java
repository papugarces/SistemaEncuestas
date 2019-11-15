/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edit
 */
package vistas;


import controladores.CtlBancoPreguntas;
import dtos.DTOPreguntaOpciones;
import excepciones.ConexionException;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class FrmBancoPreguntas extends JInternalFrame {

    /**
     * Creates new form FrmBancoPreguntas
     */
    int idSubcategoria;
    int idCategoria;
    
    
    CtlBancoPreguntas controlador;
    public static DTOPreguntaOpciones pregunta;

    public FrmBancoPreguntas() {
        initComponents();
        controlador = new CtlBancoPreguntas();
        setVisible(true);
        setMaximizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        
        try {
            controlador.cargarPreguntas();
            tblListado.setModel(controlador.listarPreguntas());
            cargarCategorias();
        } catch (ConexionException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }
    
    public FrmBancoPreguntas(int id){
        initComponents();
        controlador = new CtlBancoPreguntas();
        setVisible(true);
        setMaximizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        
        try {
            controlador.cargarPreguntas();
            tblListado.setModel(controlador.listarPreguntas());
            cargarCategorias();
        } catch (ConexionException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbSubcategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 440));
        setMinimumSize(new java.awt.Dimension(640, 440));
        setPreferredSize(new java.awt.Dimension(640, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblListado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblListado.setGridColor(new java.awt.Color(0, 0, 0));
        tblListado.setSelectionBackground(new java.awt.Color(0, 113, 193));
        tblListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 161, 620, 240));

        cmbCategoria.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, 30));

        jLabel1.setBackground(new java.awt.Color(0, 113, 193));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 113, 193));
        jLabel1.setText("CATEGORIA :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 122, 100, -1));

        cmbSubcategoria.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cmbSubcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbSubcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 118, 140, 30));

        jLabel2.setBackground(new java.awt.Color(0, 113, 193));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 113, 193));
        jLabel2.setText("SUBCATEGORIA :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 130, -1));

        jPanel1.setBackground(new java.awt.Color(0, 113, 193));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/base de datos.png"))); // NOI18N
        jLabel3.setText("BANCO DE PREGUNTAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 650, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        try {
            idCategoria = controlador.getListaCategorias().get(cmbCategoria.getSelectedIndex()).getId();
            cmbSubcategoria.removeAllItems();
            for (int i = 0; i < controlador.obtenerSubcategorias(idCategoria).size(); i++) {
                cmbSubcategoria.addItem(controlador.obtenerSubcategorias(idCategoria).get(i).getNombre());
            }
        } catch (NullPointerException ex) {

        } catch (ConexionException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void tblListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoMouseClicked
        int pos = tblListado.getSelectedRow();

        if (pos >= 0) {
            pregunta = controlador.cargarPreguntaSeleccion(pos);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
        }
    }//GEN-LAST:event_tblListadoMouseClicked

    public void cargarCategorias() {
        try {
            cmbCategoria.removeAllItems();
            for (int i = 0; i < controlador.obtenerCategorias().size(); i++) {
                cmbCategoria.addItem(controlador.obtenerCategorias().get(i).getNombre());
            }
        } catch (ConexionException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(FrmBancoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBancoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBancoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBancoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBancoPreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbSubcategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListado;
    // End of variables declaration//GEN-END:variables
}
