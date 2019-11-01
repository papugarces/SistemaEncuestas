/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import excepciones.ConexionException;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private JInternalFrame ventanaActual;

    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

        if (FrmLogin.role.equals("Usuario")) {
//            jMenuAdministrar.setVisible(false);
            jmiCrearEncuesta.setVisible(false);
            jmiAgregarPreguntas.setVisible(false);
            jmiInvitarUsuarios.setVisible(false);
            jMenuPreguntas.setVisible(false);
            jMenuUsuarios.setVisible(false);
        } else if (FrmLogin.role.equals("Administrador")) {
            jmiPresentarEncuesta.setVisible(false);

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

        panelInterno1 = new vistas.PanelInterno();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEncuestas = new javax.swing.JMenu();
        jmiCrearEncuesta = new javax.swing.JMenuItem();
        jmiAgregarPreguntas = new javax.swing.JMenuItem();
        jmiInvitarUsuarios = new javax.swing.JMenuItem();
        jmiPresentarEncuesta = new javax.swing.JMenuItem();
        jMenuPreguntas = new javax.swing.JMenu();
        jmiCrearPreguntas = new javax.swing.JMenuItem();
        jmiDespachos = new javax.swing.JMenuItem();
        jmiHistorial = new javax.swing.JMenuItem();
        jmiHabilitarVehiculos = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenu();
        jmiRegistrarUsuarios = new javax.swing.JMenuItem();
        jmiGestionarViajes = new javax.swing.JMenuItem();
        jmiMisTiquetes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1380, 735));
        setResizable(false);

        panelInterno1.setDoubleBuffered(true);
        panelInterno1.setMaximumSize(new java.awt.Dimension(1380, 712));
        panelInterno1.setMinimumSize(new java.awt.Dimension(1380, 712));

        jMenuEncuestas.setBackground(new java.awt.Color(255, 255, 255));
        jMenuEncuestas.setForeground(new java.awt.Color(0, 0, 0));
        jMenuEncuestas.setText("Encuestas");
        jMenuEncuestas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jmiCrearEncuesta.setBackground(new java.awt.Color(255, 255, 255));
        jmiCrearEncuesta.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiCrearEncuesta.setForeground(new java.awt.Color(0, 0, 0));
        jmiCrearEncuesta.setText("Crear Encuesta");
        jmiCrearEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearEncuestaActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(jmiCrearEncuesta);

        jmiAgregarPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        jmiAgregarPreguntas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiAgregarPreguntas.setForeground(new java.awt.Color(0, 0, 0));
        jmiAgregarPreguntas.setText("Agregar Preguntas");
        jmiAgregarPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarPreguntasActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(jmiAgregarPreguntas);

        jmiInvitarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jmiInvitarUsuarios.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiInvitarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        jmiInvitarUsuarios.setText("Invitar Usuarios");
        jmiInvitarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInvitarUsuariosActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(jmiInvitarUsuarios);

        jmiPresentarEncuesta.setBackground(new java.awt.Color(255, 255, 255));
        jmiPresentarEncuesta.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiPresentarEncuesta.setForeground(new java.awt.Color(0, 0, 0));
        jmiPresentarEncuesta.setText("Presentar Encuestas");
        jmiPresentarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPresentarEncuestaActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(jmiPresentarEncuesta);

        jMenuBar1.add(jMenuEncuestas);

        jMenuPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        jMenuPreguntas.setForeground(new java.awt.Color(0, 0, 0));
        jMenuPreguntas.setText("Preguntas");
        jMenuPreguntas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jmiCrearPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        jmiCrearPreguntas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiCrearPreguntas.setText("Crear Preguntas");
        jmiCrearPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearPreguntasActionPerformed(evt);
            }
        });
        jMenuPreguntas.add(jmiCrearPreguntas);

        jmiDespachos.setBackground(new java.awt.Color(255, 255, 255));
        jmiDespachos.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiDespachos.setForeground(new java.awt.Color(0, 0, 0));
        jmiDespachos.setText("--");
        jmiDespachos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDespachosActionPerformed(evt);
            }
        });
        jMenuPreguntas.add(jmiDespachos);

        jmiHistorial.setBackground(new java.awt.Color(255, 255, 255));
        jmiHistorial.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiHistorial.setForeground(new java.awt.Color(0, 0, 0));
        jmiHistorial.setText("--");
        jmiHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHistorialActionPerformed(evt);
            }
        });
        jMenuPreguntas.add(jmiHistorial);

        jmiHabilitarVehiculos.setBackground(new java.awt.Color(255, 255, 255));
        jmiHabilitarVehiculos.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiHabilitarVehiculos.setForeground(new java.awt.Color(0, 0, 0));
        jmiHabilitarVehiculos.setText("--");
        jmiHabilitarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHabilitarVehiculosActionPerformed(evt);
            }
        });
        jMenuPreguntas.add(jmiHabilitarVehiculos);

        jMenuBar1.add(jMenuPreguntas);

        jMenuUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jMenuUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jmiRegistrarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jmiRegistrarUsuarios.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiRegistrarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        jmiRegistrarUsuarios.setText("Registrar Usuario");
        jmiRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarUsuariosActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jmiRegistrarUsuarios);

        jmiGestionarViajes.setBackground(new java.awt.Color(255, 255, 255));
        jmiGestionarViajes.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiGestionarViajes.setForeground(new java.awt.Color(0, 0, 0));
        jmiGestionarViajes.setText("--");
        jmiGestionarViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarViajesActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jmiGestionarViajes);

        jmiMisTiquetes.setBackground(new java.awt.Color(255, 255, 255));
        jmiMisTiquetes.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jmiMisTiquetes.setForeground(new java.awt.Color(0, 0, 0));
        jmiMisTiquetes.setText("--");
        jmiMisTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMisTiquetesActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jmiMisTiquetes);

        jMenuBar1.add(jMenuUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInterno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInterno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCrearEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearEncuestaActionPerformed
        if (ventanaActual == null) {
            ventanaActual = new FrmCrearEncuesta();
            panelInterno1.add(ventanaActual);
        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmCrearEncuesta();
            panelInterno1.add(ventanaActual);
        }
    }//GEN-LAST:event_jmiCrearEncuestaActionPerformed

    private void jmiAgregarPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarPreguntasActionPerformed
        if (ventanaActual == null) {
            ventanaActual = new FrmAgregarPreguntas();
            panelInterno1.add(ventanaActual);
        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmAgregarPreguntas();
            panelInterno1.add(ventanaActual);
        }
    }//GEN-LAST:event_jmiAgregarPreguntasActionPerformed

    private void jmiInvitarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInvitarUsuariosActionPerformed
        try {
            if (ventanaActual == null) {
                ventanaActual = new FrmInvitarUsuarios();
                panelInterno1.add(ventanaActual);
            } else {
                panelInterno1.remove(ventanaActual);
                panelInterno1.repaint();
                ventanaActual = new FrmInvitarUsuarios();
                panelInterno1.add(ventanaActual);
            }
        } catch (ConexionException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jmiInvitarUsuariosActionPerformed

    private void jmiRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarUsuariosActionPerformed
//        try {
        if (ventanaActual == null) {
            ventanaActual = new FrmRegistrarUsuario();
            panelInterno1.add(ventanaActual);
        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmRegistrarUsuario();
            panelInterno1.add(ventanaActual);
        }
//        } catch (ConexionException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
    }//GEN-LAST:event_jmiRegistrarUsuariosActionPerformed

    private void jmiGestionarViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionarViajesActionPerformed
//        if (ventanaActual == null){
//            ventanaActual = new CrearViajes();
//            panelInterno1.add(ventanaActual);
//        }else{
//            panelInterno1.remove(ventanaActual);
//            panelInterno1.repaint();
//            ventanaActual = new CrearViajes();
//            panelInterno1.add(ventanaActual);
//        }
    }//GEN-LAST:event_jmiGestionarViajesActionPerformed

    private void jmiDespachosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDespachosActionPerformed
//        if (ventanaActual == null){
//            ventanaActual = new Despachos();
//            panelInterno1.add(ventanaActual);
//        }else{
//            panelInterno1.remove(ventanaActual);
//            panelInterno1.repaint();
//            ventanaActual = new Despachos();
//            panelInterno1.add(ventanaActual);
//        }
    }//GEN-LAST:event_jmiDespachosActionPerformed

    private void jmiHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHistorialActionPerformed
//        if (ventanaActual == null){
//            ventanaActual = new Historial();
//            panelInterno1.add(ventanaActual);
//        }else{
//            panelInterno1.remove(ventanaActual);
//            panelInterno1.repaint();
//            ventanaActual = new Historial();
//            panelInterno1.add(ventanaActual);
//        }
    }//GEN-LAST:event_jmiHistorialActionPerformed

    private void jmiCrearPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearPreguntasActionPerformed
        // TODO add your handling code here:
        if (ventanaActual == null) {
            ventanaActual = new FrmCrearPreguntas();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();
        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmCrearPreguntas();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();
        }
    }//GEN-LAST:event_jmiCrearPreguntasActionPerformed

    private void jmiHabilitarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHabilitarVehiculosActionPerformed
//        if (ventanaActual == null){
//            ventanaActual = new HabilitarVehiculos();
//            panelInterno1.add(ventanaActual);
//        }else{
//            panelInterno1.remove(ventanaActual);
//            panelInterno1.repaint();
//            ventanaActual = new HabilitarVehiculos();
//            panelInterno1.add(ventanaActual);
//        }
    }//GEN-LAST:event_jmiHabilitarVehiculosActionPerformed

    private void jmiMisTiquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMisTiquetesActionPerformed
//        if (ventanaActual == null){
//            ventanaActual = new TiquetesCliente();
//            panelInterno1.add(ventanaActual);
//        }else{
//            panelInterno1.remove(ventanaActual);
//            panelInterno1.repaint();
//            ventanaActual = new TiquetesCliente();
//            panelInterno1.add(ventanaActual);
//        }
    }//GEN-LAST:event_jmiMisTiquetesActionPerformed

    private void jmiPresentarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPresentarEncuestaActionPerformed
        if (ventanaActual == null) {
            ventanaActual = new FrmElegirEncuesta();
            panelInterno1.add(ventanaActual);
        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmElegirEncuesta();
            panelInterno1.add(ventanaActual);
        }
    }//GEN-LAST:event_jmiPresentarEncuestaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEncuestas;
    private javax.swing.JMenu jMenuPreguntas;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JMenuItem jmiAgregarPreguntas;
    private javax.swing.JMenuItem jmiCrearEncuesta;
    private javax.swing.JMenuItem jmiCrearPreguntas;
    private javax.swing.JMenuItem jmiDespachos;
    private javax.swing.JMenuItem jmiGestionarViajes;
    private javax.swing.JMenuItem jmiHabilitarVehiculos;
    private javax.swing.JMenuItem jmiHistorial;
    private javax.swing.JMenuItem jmiInvitarUsuarios;
    private javax.swing.JMenuItem jmiMisTiquetes;
    private javax.swing.JMenuItem jmiPresentarEncuesta;
    private javax.swing.JMenuItem jmiRegistrarUsuarios;
    private vistas.PanelInterno panelInterno1;
    // End of variables declaration//GEN-END:variables
}
