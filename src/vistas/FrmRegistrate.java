/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.CtlRegistrate;
import excepciones.ConexionException;
import excepciones.DniUnicoExcepcion;
import excepciones.UsuarioYaRegistradoExcepcion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Asset;
import modelo.Login;
import modelo.Usuario;

/**
 *
 * @author jose
 */
public class FrmRegistrate extends javax.swing.JFrame {

    
    CtlRegistrate controlador;

    /**
     * Creates new form FrmRegistrate
     */
    public FrmRegistrate() {
        initComponents();
        controlador = new CtlRegistrate();
        try {
            ArrayList<Asset> lista = controlador.listarCiudades();
            for (int i = 0; i < lista.size(); i++) {
                cmbCiudadResidencia.addItem(lista.get(i).getNombre());
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtOcupacion = new javax.swing.JTextField();
        cmbCiudadResidencia = new javax.swing.JComboBox<>();
        cmbGenero = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtPassword2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 113, 193));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 113, 193));
        jLabel1.setText("DIRECCION:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 322, -1, -1));

        lblDNI.setBackground(new java.awt.Color(0, 113, 193));
        lblDNI.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(0, 113, 193));
        lblDNI.setText("DNI:");
        jPanel1.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 28, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 113, 193));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 113, 193));
        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 36, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 113, 193));
        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 113, 193));
        jLabel4.setText("APELLIDO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 94, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 113, 193));
        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 113, 193));
        jLabel5.setText("EDAD:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 94, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 113, 193));
        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 113, 193));
        jLabel6.setText("GENERO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 170, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 113, 193));
        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 113, 193));
        jLabel7.setText("OCUPACION:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 248, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 113, 193));
        jLabel8.setText("CIUDAD DE RESIDENCIA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(null);
        txtDni.setCaretColor(new java.awt.Color(0, 51, 102));
        txtDni.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 58, 140, -1));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(0, 51, 102));
        txtNombre.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 60, 180, -1));

        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(null);
        txtApellido.setCaretColor(new java.awt.Color(0, 51, 102));
        txtApellido.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 122, 180, 20));

        txtOcupacion.setForeground(new java.awt.Color(0, 0, 0));
        txtOcupacion.setBorder(null);
        txtOcupacion.setCaretColor(new java.awt.Color(0, 51, 102));
        txtOcupacion.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        txtOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 278, 180, 20));

        cmbCiudadResidencia.setBackground(new java.awt.Color(255, 255, 255));
        cmbCiudadResidencia.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cmbCiudadResidencia.setForeground(new java.awt.Color(0, 0, 0));
        cmbCiudadResidencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(cmbCiudadResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 198, 180, -1));

        cmbGenero.setBackground(new java.awt.Color(255, 255, 255));
        cmbGenero.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cmbGenero.setForeground(new java.awt.Color(0, 0, 0));
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        jPanel1.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 198, 180, -1));

        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        txtDireccion.setCaretColor(new java.awt.Color(0, 51, 102));
        txtDireccion.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 350, 550, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrar.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/guardar.png"))); // NOI18N
        btnRegistrar.setText("Regístrate");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnRegistrar.setDisplayedMnemonicIndex(2);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 156, -1));

        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setBorder(null);
        txtEdad.setCaretColor(new java.awt.Color(0, 51, 102));
        txtEdad.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 118, 180, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator3.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 146, 180, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator5.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 370, 550, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator6.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 78, 180, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator7.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 142, 180, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator8.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 302, 180, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator1.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 78, 140, 10));

        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(0, 51, 102));
        txtUsername.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 180, 20));

        jLabel9.setBackground(new java.awt.Color(0, 113, 193));
        jLabel9.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 113, 193));
        jLabel9.setText("NOMBRE DE USUARIO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator9.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 180, 10));

        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(0, 51, 102));
        txtPassword.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 180, 20));

        jLabel10.setBackground(new java.awt.Color(0, 113, 193));
        jLabel10.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 113, 193));
        jLabel10.setText("CONTRASEÑA:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator10.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 180, 10));

        txtPassword2.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword2.setBorder(null);
        txtPassword2.setCaretColor(new java.awt.Color(0, 113, 193));
        txtPassword2.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 180, -1));

        jLabel11.setBackground(new java.awt.Color(0, 113, 193));
        jLabel11.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 113, 193));
        jLabel11.setText("CONFIRMAR CONTRASEÑA:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 113, 193));
        jSeparator11.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 180, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 700, 570));

        jPanel2.setBackground(new java.awt.Color(0, 113, 193));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 113, 193));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/registro_usuario.png"))); // NOI18N
        jLabel2.setText("REGISTRO DE USUARIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 34, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 310, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 699, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validarDatos()) {
            try {
                Usuario user = new Usuario(Long.parseLong(txtDni.getText()), txtNombre.getText(), txtApellido.getText(), Integer.parseInt(txtEdad.getText()),
                        (cmbGenero.getSelectedItem().toString().charAt(0) + ""), txtOcupacion.getText(), cmbCiudadResidencia.getSelectedIndex(), txtDireccion.getText());
                if (controlador.crearUsuario(user)) {
                    
                    Login login = new Login(txtUsername.getText(), txtPassword.getText(), "Usuario", (Long.parseLong(txtDni.getText())));
                    controlador.agregarDatosDeInicio(login);
                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                    Limpiar();
                    this.setVisible(false);
                }
            } catch (UsuarioYaRegistradoExcepcion | DniUnicoExcepcion | ConexionException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOcupacionActionPerformed

    public boolean validarDatos() {
        if (txtDni.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtEdad.getText().isEmpty()
                || txtOcupacion.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    public void Limpiar() {
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        cmbGenero.setSelectedIndex(0);
        cmbCiudadResidencia.setSelectedIndex(0);
        txtOcupacion.setText("");
        txtDireccion.setText("");
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
            java.util.logging.Logger.getLogger(FrmRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCiudadResidencia;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
