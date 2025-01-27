/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.CtlCrearEncuesta;
import excepciones.ConexionException;
import excepciones.PreguntasInsuficientesException;
import excepciones.YaExistenteException;
import javax.swing.JOptionPane;
import java.sql.Date;
import javax.swing.JInternalFrame;
import modelo.Encuesta;

/**
 *
 * @author nicolasdurangarces
 */
public class FrmCrearEncuesta extends javax.swing.JInternalFrame {

    public static int idSubcategoria;
    int idCategoria;
    int idEncuesta;
    CtlCrearEncuesta controlador;

    /**
     * Creates new form FRMCrearEncuesta
     */
    public FrmCrearEncuesta() {
        initComponents();
        btnAgregarParticipantes.setEnabled(false);
        controlador = new CtlCrearEncuesta();
        optPublica.setSelected(true);
        jspCantidadPreguntas.setEnabled(false);
        cargarCategorias();
        setVisible(true);
        setMaximizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipoEncuesta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jdtFechaFin = new com.toedter.calendar.JDateChooser();
        jdtFechaInicio = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        optPrivada = new javax.swing.JRadioButton();
        optPublica = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jspMaximoEncuestados = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jspEdadMinima = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jspEdadMaxima = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbSubcategoria = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaObjetivo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        Genero = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        chkAutomatica = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jspCantidadPreguntas = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnAgregarParticipantes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 113, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombre.setCaretColor(new java.awt.Color(0, 113, 193));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 175, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 113, 193));
        jLabel2.setText("Tipo de Encuesta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 218, -1, -1));

        btnCrear.setBackground(new java.awt.Color(0, 51, 102));
        btnCrear.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/guardar.png"))); // NOI18N
        btnCrear.setText("Registrar");
        btnCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 113, 193));
        jLabel4.setText("Descripción: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 106, -1, -1));

        jdtFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jdtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 419, 173, -1));

        jdtFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jdtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 373, 173, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/buscar-usuario.png"))); // NOI18N
        jButton1.setText("Buscar Encuesta");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 469, 163, -1));

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 113, 193));
        jLabel5.setText("Fecha De Inicio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 377, -1, -1));

        optPrivada.setBackground(new java.awt.Color(255, 255, 255));
        btgTipoEncuesta.add(optPrivada);
        optPrivada.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        optPrivada.setForeground(new java.awt.Color(0, 113, 193));
        optPrivada.setText("Privada");
        optPrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPrivadaActionPerformed(evt);
            }
        });
        jPanel1.add(optPrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 214, -1, -1));

        optPublica.setBackground(new java.awt.Color(255, 255, 255));
        btgTipoEncuesta.add(optPublica);
        optPublica.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        optPublica.setForeground(new java.awt.Color(0, 113, 193));
        optPublica.setText("Publica");
        optPublica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPublicaActionPerformed(evt);
            }
        });
        jPanel1.add(optPublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 214, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 113, 193));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 113, 193));
        jLabel6.setText("Fecha De Fin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 419, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 113, 193));
        jLabel7.setText("Maximos Encuestados");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 266, -1, 16));

        jspMaximoEncuestados.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jspMaximoEncuestados.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 1));
        jspMaximoEncuestados.setBorder(null);
        jspMaximoEncuestados.setPreferredSize(new java.awt.Dimension(50, 22));
        jPanel1.add(jspMaximoEncuestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 258, 61, 20));

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 113, 193));
        jLabel8.setText("Edad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 324, -1, -1));

        jspEdadMinima.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jspEdadMinima.setModel(new javax.swing.SpinnerNumberModel(12, 12, null, 1));
        jspEdadMinima.setBorder(null);
        jspEdadMinima.setMinimumSize(new java.awt.Dimension(50, 22));
        jPanel1.add(jspEdadMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 316, 61, 20));

        jLabel9.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 113, 193));
        jLabel9.setText("a");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 12, -1));

        jspEdadMaxima.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jspEdadMaxima.setModel(new javax.swing.SpinnerNumberModel(80, 12, null, 1));
        jspEdadMaxima.setBorder(null);
        jspEdadMaxima.setMinimumSize(new java.awt.Dimension(50, 22));
        jPanel1.add(jspEdadMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 316, 61, 20));

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 113, 193));
        jLabel10.setText("Objetivo de la encuesta:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 106, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/eliminar.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 110, -1));

        jLabel11.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 113, 193));
        jLabel11.setText("Categoria");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        cmbCategoria.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 173, 29));

        jLabel12.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 113, 193));
        jLabel12.setText("SubCategoria");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 56, -1, -1));

        cmbSubcategoria.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cmbSubcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSubcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubcategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSubcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 173, 29));

        txaObjetivo.setColumns(20);
        txaObjetivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txaObjetivo.setRows(5);
        jScrollPane3.setViewportView(txaObjetivo);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 144, 353, 64));

        txaDescripcion.setColumns(20);
        txaDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txaDescripcion.setRows(5);
        jScrollPane4.setViewportView(txaDescripcion);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 142, 353, 64));

        Genero.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        Genero.setForeground(new java.awt.Color(0, 113, 193));
        Genero.setText("Genero");
        jPanel1.add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 267, -1, -1));

        cmbGenero.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Hombres", "Mujeres" }));
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 264, 173, 27));

        chkAutomatica.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        chkAutomatica.setForeground(new java.awt.Color(0, 113, 193));
        chkAutomatica.setText("Añadir preguntas automáticamente");
        chkAutomatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutomaticaActionPerformed(evt);
            }
        });
        jPanel1.add(chkAutomatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 324, -1, 31));

        jLabel13.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 113, 193));
        jLabel13.setText("Cantidad de preguntas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 382, -1, 16));

        jspCantidadPreguntas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jspCantidadPreguntas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jspCantidadPreguntas.setBorder(null);
        jPanel1.add(jspCantidadPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 44, 20));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 175, 10));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 60, 10));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 60, 10));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 60, 10));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 40, 10));

        btnAgregarParticipantes.setBackground(new java.awt.Color(0, 51, 102));
        btnAgregarParticipantes.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnAgregarParticipantes.setText("Agegar Participantes a esta encuesta");
        btnAgregarParticipantes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarParticipantesActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 340, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 82, 1170, 540));

        jPanel2.setBackground(new java.awt.Color(0, 113, 193));

        jLabel14.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons/listado.png"))); // NOI18N
        jLabel14.setText("REGISTRO DE ENCUESTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(454, 454, 454))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            int id = 0;
            String nombre = txtNombre.getText();
            String descripcion = txaDescripcion.getText();
            boolean publica = true;
            if (optPrivada.isSelected()) {
                publica = false;
            }
            Date fechaInicio = new java.sql.Date(jdtFechaInicio.getDate().getTime());
            Date fechaFin = new java.sql.Date(jdtFechaFin.getDate().getTime());
            int maximoEncuestados = (Integer) jspMaximoEncuestados.getValue();
            String objetivo = txaObjetivo.getText();
            int edadMinima = (Integer) jspEdadMinima.getValue();
            int edadMaxima = (Integer) jspEdadMaxima.getValue();
            String generoObjetivo = cmbGenero.getSelectedItem().toString().charAt(0)+"";
            boolean isAleatoria = false;
            if(chkAutomatica.isSelected()){
                isAleatoria=true;
            }
            int cantidadPreguntas = 0;
            if (isAleatoria) {
                cantidadPreguntas = (Integer) jspCantidadPreguntas.getValue();
            }
            idSubcategoria = controlador.getListaSubcategorias().get(cmbSubcategoria.getSelectedIndex()).getId();
            Encuesta encuesta = new Encuesta(id, nombre, descripcion, publica, fechaInicio, fechaFin, maximoEncuestados, objetivo, edadMinima, edadMaxima, generoObjetivo, idSubcategoria);
            idEncuesta = controlador.crear(encuesta, idSubcategoria, isAleatoria, cantidadPreguntas);
            limpiar();
            JOptionPane.showMessageDialog(this, "Encuesta creada satisfactoriamente");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese sólo caracteres numéricos");
            ex.printStackTrace();
        } catch (ConexionException | PreguntasInsuficientesException | YaExistenteException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void chkAutomaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutomaticaActionPerformed
        if (jspCantidadPreguntas.isEnabled()) {
            jspCantidadPreguntas.setEnabled(false);
            jspCantidadPreguntas.setValue(0);
        } else {
            jspCantidadPreguntas.setEnabled(true);
        }
    }//GEN-LAST:event_chkAutomaticaActionPerformed

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void cmbSubcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSubcategoriaActionPerformed

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

    private void btnAgregarParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarParticipantesActionPerformed
        JInternalFrame invitarUsuarios = new FrmInvitarUsuarios(idEncuesta);
        
        MenuPrincipal.panelInterno1.remove(MenuPrincipal.ventanaActual);
        MenuPrincipal.panelInterno1.repaint();
        MenuPrincipal.ventanaActual = invitarUsuarios;
        MenuPrincipal.panelInterno1.add(MenuPrincipal.ventanaActual);
    }//GEN-LAST:event_btnAgregarParticipantesActionPerformed

    private void optPrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPrivadaActionPerformed
        btnAgregarParticipantes.setEnabled(true);
    }//GEN-LAST:event_optPrivadaActionPerformed

    private void optPublicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPublicaActionPerformed
        btnAgregarParticipantes.setEnabled(false);
    }//GEN-LAST:event_optPublicaActionPerformed

    public void cargarCategorias() {
        try{
            cmbCategoria.removeAllItems();
            for (int i = 0; i < controlador.obtenerCategorias().size(); i++) {
                cmbCategoria.addItem(controlador.obtenerCategorias().get(i).getNombre());
            }
        } catch (ConexionException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    public void limpiar(){
        
        txtNombre.setText("");
        txaDescripcion.setText("");
        optPublica.setSelected(true);
        jspMaximoEncuestados.setValue(10);
        jspEdadMinima.setValue(12);
        jspEdadMaxima.setValue(12);
        jdtFechaInicio.setDate(null);
        jdtFechaFin.setDate(null);
        cmbCategoria.setSelectedIndex(0);
        txaObjetivo.setText("");
        cmbGenero.setSelectedItem("Todos");
        
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
            java.util.logging.Logger.getLogger(FrmCrearEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmCrearEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Genero;
    private javax.swing.ButtonGroup btgTipoEncuesta;
    private javax.swing.JButton btnAgregarParticipantes;
    private javax.swing.JButton btnCrear;
    private javax.swing.JCheckBox chkAutomatica;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbSubcategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private com.toedter.calendar.JDateChooser jdtFechaFin;
    private com.toedter.calendar.JDateChooser jdtFechaInicio;
    private javax.swing.JSpinner jspCantidadPreguntas;
    private javax.swing.JSpinner jspEdadMaxima;
    private javax.swing.JSpinner jspEdadMinima;
    private javax.swing.JSpinner jspMaximoEncuestados;
    private javax.swing.JRadioButton optPrivada;
    private javax.swing.JRadioButton optPublica;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextArea txaObjetivo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
