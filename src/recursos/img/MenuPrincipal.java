/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.img;

import excepciones.ConexionException;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import vistas.FrmAgregarPreguntas;
import vistas.FrmCrearEncuesta;
import vistas.FrmCrearPreguntas;
import vistas.FrmInvitarUsuarios;
import vistas.FrmRegistrarUsuario;

/**
 *
 * @author jose
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private JInternalFrame ventanaActual;

    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

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
        IntCrearEncuesta = new javax.swing.JMenuItem();
        IntAgregarPreguntas = new javax.swing.JMenuItem();
        IntInvitarUsuarios = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuTiquetes = new javax.swing.JMenu();
        IntRegistrarUsuarios = new javax.swing.JMenuItem();
        jmiMisTiquetes = new javax.swing.JMenuItem();
        jMenuViajes = new javax.swing.JMenu();
        jmiGestionarViajes = new javax.swing.JMenuItem();
        jmiDisponibilidad = new javax.swing.JMenuItem();
        jmiDespachos = new javax.swing.JMenuItem();
        jmiHistorial = new javax.swing.JMenuItem();
        jmiHabilitarVehiculos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1380, 735));
        setResizable(false);

        panelInterno1.setBackground(new java.awt.Color(204, 204, 204));
        panelInterno1.setDoubleBuffered(true);
        panelInterno1.setMaximumSize(new java.awt.Dimension(1380, 712));
        panelInterno1.setMinimumSize(new java.awt.Dimension(1380, 712));

        jMenuEncuestas.setText("Encuestas");

        IntCrearEncuesta.setText("Crear Encuesta");
        IntCrearEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntCrearEncuestaActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(IntCrearEncuesta);

        IntAgregarPreguntas.setText("Agregar Preguntas");
        IntAgregarPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntAgregarPreguntasActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(IntAgregarPreguntas);

        IntInvitarUsuarios.setText("Invitar Usuarios");
        IntInvitarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntInvitarUsuariosActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(IntInvitarUsuarios);

        jMenuItem1.setText("Crear Preguntas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuEncuestas.add(jMenuItem1);

        jMenuBar1.add(jMenuEncuestas);

        jMenuTiquetes.setText("Usuarios");

        IntRegistrarUsuarios.setText("Registrar Usuario");
        IntRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntRegistrarUsuariosActionPerformed(evt);
            }
        });
        jMenuTiquetes.add(IntRegistrarUsuarios);

        jmiMisTiquetes.setText("--");
        jmiMisTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMisTiquetesActionPerformed(evt);
            }
        });
        jMenuTiquetes.add(jmiMisTiquetes);

        jMenuBar1.add(jMenuTiquetes);

        jMenuViajes.setText("--");

        jmiGestionarViajes.setText("--");
        jmiGestionarViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarViajesActionPerformed(evt);
            }
        });
        jMenuViajes.add(jmiGestionarViajes);

        jmiDisponibilidad.setText("--");
        jmiDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDisponibilidadActionPerformed(evt);
            }
        });
        jMenuViajes.add(jmiDisponibilidad);

        jmiDespachos.setText("--");
        jmiDespachos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDespachosActionPerformed(evt);
            }
        });
        jMenuViajes.add(jmiDespachos);

        jmiHistorial.setText("--");
        jmiHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHistorialActionPerformed(evt);
            }
        });
        jMenuViajes.add(jmiHistorial);

        jmiHabilitarVehiculos.setText("--");
        jmiHabilitarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHabilitarVehiculosActionPerformed(evt);
            }
        });
        jMenuViajes.add(jmiHabilitarVehiculos);

        jMenuBar1.add(jMenuViajes);

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

    private void IntCrearEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntCrearEncuestaActionPerformed
        if (ventanaActual == null) {
            ventanaActual = new FrmCrearEncuesta();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();

        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmCrearEncuesta();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();
        }
    }//GEN-LAST:event_IntCrearEncuestaActionPerformed

    private void IntAgregarPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntAgregarPreguntasActionPerformed
        if (ventanaActual == null) {
            ventanaActual = new FrmAgregarPreguntas();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();
        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmAgregarPreguntas();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();
        }
    }//GEN-LAST:event_IntAgregarPreguntasActionPerformed

    private void IntInvitarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntInvitarUsuariosActionPerformed
        try {
            if (ventanaActual == null) {
                ventanaActual = new FrmInvitarUsuarios();
                panelInterno1.add(ventanaActual);
                Dimension desktopSize = panelInterno1.getSize();
                Dimension FrameSize = ventanaActual.getSize();
                ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                ventanaActual.show();
            } else {
                panelInterno1.remove(ventanaActual);
                panelInterno1.repaint();
                ventanaActual = new FrmInvitarUsuarios();
                panelInterno1.add(ventanaActual);
                Dimension desktopSize = panelInterno1.getSize();
                Dimension FrameSize = ventanaActual.getSize();
                ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                ventanaActual.show();
            }
        } catch (ConexionException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_IntInvitarUsuariosActionPerformed

    private void IntRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntRegistrarUsuariosActionPerformed
        if (ventanaActual == null) {
            ventanaActual = new FrmRegistrarUsuario();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();
        } else {
            panelInterno1.remove(ventanaActual);
            panelInterno1.repaint();
            ventanaActual = new FrmRegistrarUsuario();
            panelInterno1.add(ventanaActual);
            Dimension desktopSize = panelInterno1.getSize();
            Dimension FrameSize = ventanaActual.getSize();
            ventanaActual.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            ventanaActual.show();
        }
    }//GEN-LAST:event_IntRegistrarUsuariosActionPerformed

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

    private void jmiDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDisponibilidadActionPerformed
//        if (ventanaActual == null){
//            ventanaActual = new Tiquetes();
//            panelInterno1.add(ventanaActual);
//        }else{
//            panelInterno1.remove(ventanaActual);
//            panelInterno1.repaint();
//            ventanaActual = new Tiquetes();
//            panelInterno1.add(ventanaActual);
//        }
    }//GEN-LAST:event_jmiDisponibilidadActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
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
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IntAgregarPreguntas;
    private javax.swing.JMenuItem IntCrearEncuesta;
    private javax.swing.JMenuItem IntInvitarUsuarios;
    private javax.swing.JMenuItem IntRegistrarUsuarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEncuestas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuTiquetes;
    private javax.swing.JMenu jMenuViajes;
    private javax.swing.JMenuItem jmiDespachos;
    private javax.swing.JMenuItem jmiDisponibilidad;
    private javax.swing.JMenuItem jmiGestionarViajes;
    private javax.swing.JMenuItem jmiHabilitarVehiculos;
    private javax.swing.JMenuItem jmiHistorial;
    private javax.swing.JMenuItem jmiMisTiquetes;
    private vistas.PanelInterno panelInterno1;
    // End of variables declaration//GEN-END:variables
}
