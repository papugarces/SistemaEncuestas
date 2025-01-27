/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.CtlAgregarPreguntas;
import dtos.DTOPreguntaOpciones;
import excepciones.ConexionException;
import excepciones.NoExistenteException;
import excepciones.PreguntaYaEnLaEncuestaException;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import modelo.PreguntaEncuesta;

/**
 *
 * @author jose
 */
public class FrmAgregarPreguntas extends javax.swing.JInternalFrame {

    private JInternalFrame subVentana;
    CtlAgregarPreguntas controlador;
    int idEncuesta;
    int idSubCategoria;
    PreguntaEncuesta preguntaQuitar;

    /**
     * Creates new form FrmAgregarPreguntas
     */
    public FrmAgregarPreguntas() {
        controlador = new CtlAgregarPreguntas();
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setVisible(true);
        setMaximizable(false);
        btnAgregarPreguntaExistente.setEnabled(false);
        btnAgregarPreguntaNueva.setEnabled(false);
        btnRefrescar.setEnabled(false);
    }

    public FrmAgregarPreguntas(int idEnc, int idSub) {
        idEncuesta = idEnc;
        idSubCategoria = idSub;
        controlador = new CtlAgregarPreguntas();
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setVisible(true);
        setMaximizable(false);
        //btnAgregarPreguntaNueva.setVisible(false);
        btnAgregarPreguntaExistente.setEnabled(true);
        txtIdEncuesta.setText(idEncuesta + "");
        btnFijarEncuesta.doClick();
        btnFijarEncuesta.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPreguntas = new javax.swing.JTable();
        btnAgregarPreguntaNueva = new javax.swing.JButton();
        txtIdEncuesta = new javax.swing.JTextField();
        btnAgregarPreguntaExistente = new javax.swing.JButton();
        btnFijarEncuesta = new javax.swing.JButton();
        panelInterno1 = new vistas.PanelInterno();
        btnAgregarNormal = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarDependiente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1365, 670));
        setMinimumSize(new java.awt.Dimension(1365, 670));
        setPreferredSize(new java.awt.Dimension(1365, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1365, 690));
        jPanel2.setMinimumSize(new java.awt.Dimension(1365, 690));
        jPanel2.setPreferredSize(new java.awt.Dimension(1365, 690));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPreguntas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPreguntas.setGridColor(new java.awt.Color(0, 0, 0));
        tblPreguntas.setSelectionBackground(new java.awt.Color(0, 113, 193));
        tblPreguntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPreguntasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPreguntas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 500, 440));

        btnAgregarPreguntaNueva.setBackground(new java.awt.Color(0, 51, 102));
        btnAgregarPreguntaNueva.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnAgregarPreguntaNueva.setText("Añadir Una Nueva Pregunta");
        btnAgregarPreguntaNueva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarPreguntaNueva.setBorderPainted(false);
        btnAgregarPreguntaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPreguntaNuevaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarPreguntaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 210, 30));

        txtIdEncuesta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtIdEncuesta.setPreferredSize(new java.awt.Dimension(4, 20));
        jPanel2.add(txtIdEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 149, 140, -1));

        btnAgregarPreguntaExistente.setBackground(new java.awt.Color(0, 51, 102));
        btnAgregarPreguntaExistente.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnAgregarPreguntaExistente.setText("Añadir Una Pregunta del Banco");
        btnAgregarPreguntaExistente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarPreguntaExistente.setBorderPainted(false);
        btnAgregarPreguntaExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPreguntaExistenteActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarPreguntaExistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 250, 30));

        btnFijarEncuesta.setBackground(new java.awt.Color(0, 0, 153));
        btnFijarEncuesta.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnFijarEncuesta.setText("Fijar Encuesta");
        btnFijarEncuesta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), null, null));
        btnFijarEncuesta.setBorderPainted(false);
        btnFijarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFijarEncuestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnFijarEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 146, 120, 30));

        panelInterno1.setForeground(new java.awt.Color(255, 255, 255));
        panelInterno1.setMaximumSize(new java.awt.Dimension(640, 440));
        panelInterno1.setMinimumSize(new java.awt.Dimension(640, 440));
        jPanel2.add(panelInterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 660, 460));

        btnAgregarNormal.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/sumar.png"))); // NOI18N
        btnAgregarNormal.setBorder(null);
        btnAgregarNormal.setContentAreaFilled(false);
        btnAgregarNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNormalActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        btnQuitar.setBackground(new java.awt.Color(204, 204, 204));
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/restar.png"))); // NOI18N
        btnQuitar.setBorder(null);
        btnQuitar.setContentAreaFilled(false);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 138, 10));

        jLabel1.setBackground(new java.awt.Color(0, 113, 193));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 113, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Normal");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 130, -1));

        jPanel1.setBackground(new java.awt.Color(0, 113, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/pregunta.png"))); // NOI18N
        jLabel2.setText("AGREGAR PREGUNTAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 35, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 270, 10));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1370, 120));

        jLabel4.setBackground(new java.awt.Color(0, 113, 193));
        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 113, 193));
        jLabel4.setText("Id Encuesta :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 146, 90, -1));

        jLabel5.setBackground(new java.awt.Color(0, 113, 193));
        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 113, 193));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Quitar pregunta");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 130, -1));

        jLabel6.setBackground(new java.awt.Color(0, 113, 193));
        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 113, 193));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dependiente");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 130, -1));

        jLabel7.setBackground(new java.awt.Color(0, 113, 193));
        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 113, 193));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Agregar pregunta");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 130, -1));

        btnAgregarDependiente.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarDependiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/sumar.png"))); // NOI18N
        btnAgregarDependiente.setBorder(null);
        btnAgregarDependiente.setContentAreaFilled(false);
        btnAgregarDependiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDependienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarDependiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 113, 193));
        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 113, 193));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar pregunta");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 130, -1));

        btnRefrescar.setBackground(new java.awt.Color(0, 51, 102));
        btnRefrescar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnRefrescar.setText("Refrescar");
        btnRefrescar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefrescar.setBorderPainted(false);
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 110, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPreguntaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPreguntaNuevaActionPerformed
        // TODO add your handling code here:
        FrmAgregarPreguntaButtom agregarPreguntasMediante = new FrmAgregarPreguntaButtom();
        agregarPreguntasMediante.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarPreguntaNuevaActionPerformed

    private void btnAgregarPreguntaExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPreguntaExistenteActionPerformed
        if (subVentana == null) {
            try {
                idSubCategoria = controlador.obtenerSubcategoria(idEncuesta);
                subVentana = new FrmBancoPreguntas(idSubCategoria);
                panelInterno1.add(subVentana);
                Dimension desktopSize = panelInterno1.getSize();
                Dimension FrameSize = subVentana.getSize();
                subVentana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                subVentana.show();
                btnAgregarPreguntaNueva.setEnabled(true);
                btnRefrescar.setEnabled(true);
                btnAgregarPreguntaExistente.setEnabled(true);
            } catch (ConexionException | NoExistenteException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            panelInterno1.remove(subVentana);
            panelInterno1.repaint();
            subVentana = new FrmBancoPreguntas(idSubCategoria);
            panelInterno1.add(subVentana);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = subVentana.getSize();
            subVentana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            subVentana.show();
            btnAgregarPreguntaNueva.setEnabled(true);
            btnRefrescar.setEnabled(true);
            btnAgregarPreguntaExistente.setEnabled(true);
        }
    }//GEN-LAST:event_btnAgregarPreguntaExistenteActionPerformed

    private void btnAgregarNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNormalActionPerformed
        try {
            DTOPreguntaOpciones preguntaAgregar = FrmBancoPreguntas.pregunta;
            if (preguntaAgregar != null) {
                controlador.agregarAEncuesta(preguntaAgregar, idEncuesta);
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una pregunta del banco");
            }
            preguntaAgregar = null;
        } catch (ConexionException | PreguntaYaEnLaEncuestaException | NoExistenteException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarNormalActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        try {
            if (preguntaQuitar != null) {
                controlador.quitarDeEncuesta(idEncuesta, preguntaQuitar.getNumeroPregunta());
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar la pregunta que desea quitar de la encuesta");
            }
            preguntaQuitar = null;
        } catch (ConexionException | NoExistenteException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnFijarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFijarEncuestaActionPerformed
        try {

            idEncuesta = Integer.parseInt(txtIdEncuesta.getText());
            listar();
            txtIdEncuesta.setEnabled(false);
            btnAgregarPreguntaExistente.setEnabled(true);
        } catch (ConexionException | NoExistenteException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnFijarEncuestaActionPerformed

    private void tblPreguntasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreguntasMouseClicked
        int pos = tblPreguntas.getSelectedRow();

        if (pos >= 0) {
            preguntaQuitar = controlador.cargarPreguntaSeleccionada(pos);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
        }
    }//GEN-LAST:event_tblPreguntasMouseClicked

    private void btnAgregarDependienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDependienteActionPerformed
        try {
            DTOPreguntaOpciones preguntaAgregar = FrmBancoPreguntas.pregunta;

            if (preguntaAgregar != null) {
                if (controlador.verificarSiPreguntaNoAgregada(preguntaAgregar,idEncuesta)) {
                    int numeroPreguntaRequisito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la pregunta \na la que quiere referenciar"));
//                    numeroPreguntaRequisito -= 1;
                    if (controlador.verificarPregunta(idEncuesta, numeroPreguntaRequisito)) {
                        long idPreguntaRequisito = controlador.cargarPreguntaSeleccionada(numeroPreguntaRequisito-1).getIdPregunta();
                        int idOpcionRequisito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opción \na la que quiere referenciar"));;
//                        idOpcionRequisito -= 1;
                        if (controlador.verificarOpcion(idPreguntaRequisito, idOpcionRequisito)) {

                            controlador.agregarDependiente(preguntaAgregar, idEncuesta, idPreguntaRequisito, idOpcionRequisito);
                            listar();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una pregunta del banco");
            }
            preguntaAgregar = null;
        } catch (ConexionException | PreguntaYaEnLaEncuestaException | NoExistenteException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnAgregarDependienteActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
        if (subVentana == null) {
            try {
                idSubCategoria = controlador.obtenerSubcategoria(idEncuesta);
                subVentana = new FrmBancoPreguntas(idSubCategoria);
                panelInterno1.add(subVentana);
                Dimension desktopSize = panelInterno1.getSize();
                Dimension FrameSize = subVentana.getSize();
                subVentana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                subVentana.show();
                btnAgregarPreguntaNueva.setEnabled(true);
                btnRefrescar.setEnabled(true);
                btnAgregarPreguntaExistente.setEnabled(true);
            } catch (ConexionException | NoExistenteException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            panelInterno1.remove(subVentana);
            panelInterno1.repaint();
            subVentana = new FrmBancoPreguntas(idSubCategoria);
            panelInterno1.add(subVentana);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = subVentana.getSize();
            subVentana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            subVentana.show();
            btnAgregarPreguntaNueva.setEnabled(true);
            btnRefrescar.setEnabled(true);
            btnAgregarPreguntaExistente.setEnabled(true);
        }
    }//GEN-LAST:event_btnRefrescarActionPerformed

    public void listar() throws ConexionException, NoExistenteException {
        if (controlador.verificarEncuesta(idEncuesta)) {
            controlador.cargarPreguntasEncuesta(idEncuesta);
            tblPreguntas.setModel(controlador.listarPreguntasEncuesta());
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
            java.util.logging.Logger.getLogger(FrmAgregarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarPreguntas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDependiente;
    private javax.swing.JButton btnAgregarNormal;
    private javax.swing.JButton btnAgregarPreguntaExistente;
    private javax.swing.JButton btnAgregarPreguntaNueva;
    private javax.swing.JButton btnFijarEncuesta;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private vistas.PanelInterno panelInterno1;
    private javax.swing.JTable tblPreguntas;
    private javax.swing.JTextField txtIdEncuesta;
    // End of variables declaration//GEN-END:variables

}
