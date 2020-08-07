/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Reportes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author robin
 */
public class FactorAjuste extends javax.swing.JFrame {
    
    Reportes con_reporte;
   
    /**
     * Creates new form FactorAjuste
     */
    public FactorAjuste() {
        initComponents();
        
        ArrayList<Integer> atributos = VentanaPrincipal.atributos;
        if (atributos.size() > 0) {
      
        cbx_fiabilidad.setSelectedIndex(atributos.get(0));
        
        cbx_base_datos.setSelectedIndex(atributos.get(1));
        
        cbx_complejidad.setSelectedIndex(atributos.get(2));
        
        cbx_restr_tiempo_ejecucion.setSelectedIndex(atributos.get(3));
       
        cbx_rest_memoria_virtual.setSelectedIndex(atributos.get(4));
        
        cbx_vol_maquina_virtual.setSelectedIndex(atributos.get(5));
        
        cbx_tiempo_respuesta.setSelectedIndex(atributos.get(6));
        
        cbx_analisis.setSelectedIndex(atributos.get(7));
        
        cbx_experiencia.setSelectedIndex(atributos.get(8));
        
        cbx_calidad.setSelectedIndex(atributos.get(9));
        
        cbx_expe_maquina_virtual.setSelectedIndex(atributos.get(10));
        
        cbx_expe_lenguaje.setSelectedIndex(atributos.get(11));
        
        cbx_tecnicas.setSelectedIndex(atributos.get(12));
        
        cbx_herramientas.setSelectedIndex(atributos.get(13));
        
        cbx_rest_tiempo_desarrollo.setSelectedIndex(atributos.get(14));    
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

        lbl_atrib_software = new javax.swing.JLabel();
        lbl_atrib_hardware = new javax.swing.JLabel();
        lbl_atrib_personal = new javax.swing.JLabel();
        lbl_atrib_proyecto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbx_fiabilidad = new javax.swing.JComboBox<>();
        cbx_base_datos = new javax.swing.JComboBox<>();
        cbx_complejidad = new javax.swing.JComboBox<>();
        cbx_restr_tiempo_ejecucion = new javax.swing.JComboBox<>();
        cbx_rest_memoria_virtual = new javax.swing.JComboBox<>();
        cbx_vol_maquina_virtual = new javax.swing.JComboBox<>();
        cbx_tiempo_respuesta = new javax.swing.JComboBox<>();
        cbx_analisis = new javax.swing.JComboBox<>();
        cbx_experiencia = new javax.swing.JComboBox<>();
        cbx_calidad = new javax.swing.JComboBox<>();
        cbx_expe_maquina_virtual = new javax.swing.JComboBox<>();
        cbx_expe_lenguaje = new javax.swing.JComboBox<>();
        cbx_tecnicas = new javax.swing.JComboBox<>();
        cbx_herramientas = new javax.swing.JComboBox<>();
        cbx_rest_tiempo_desarrollo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_atrib_software.setText("Atributos del Software");

        lbl_atrib_hardware.setText("Atributos del Hardware");

        lbl_atrib_personal.setText("Atributos Personal");

        lbl_atrib_proyecto.setText("Atributos del Proyecto");

        jLabel1.setText("Fiabilidad:");

        jLabel2.setText("Tamaño Base de Datos:");

        jLabel3.setText("Complejidad:");

        jLabel4.setText("Restricciones de tiempo de ejecución:");

        jLabel5.setText("Restricciones de memoria virtual:");

        jLabel6.setText("Volatilidad de la máquina virtual:");

        jLabel7.setText("Tiempo de respuesta:");

        jLabel8.setText("Capacidad de análisis:");

        jLabel9.setText("Experiencia en la aplicación:");

        jLabel10.setText("Calidad de los programadores:");

        jLabel11.setText("Experiencia en la máquina virtual:");

        jLabel12.setText("Experiencia en el lenguaje:");

        jLabel13.setText("Técnicas actualizadas de programación:");

        jLabel14.setText("Utilización de herramientas de software:");

        jLabel15.setText("Restricciones de tiempo de desarrollo:");

        cbx_fiabilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto" }));
        cbx_fiabilidad.setSelectedIndex(2);

        cbx_base_datos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Nominal", "Alto", "Muy Alto" }));
        cbx_base_datos.setSelectedIndex(1);

        cbx_complejidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto", "Extra Alto" }));
        cbx_complejidad.setSelectedIndex(2);

        cbx_restr_tiempo_ejecucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nominal", "Alto", "Muy Alto", "Extra Alto" }));
        cbx_restr_tiempo_ejecucion.setSelectedItem("Nominal");

        cbx_rest_memoria_virtual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nominal", "Alto", "Muy Alto", "Extra Alto" }));
        cbx_rest_memoria_virtual.setSelectedItem("Nominal");

        cbx_vol_maquina_virtual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Nominal", "Alto", "Muy Alto", " " }));
        cbx_vol_maquina_virtual.setSelectedItem("Nominal");

        cbx_tiempo_respuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Nominal", "Alto", "Muy Alto", " " }));
        cbx_tiempo_respuesta.setSelectedItem("Nominal");

        cbx_analisis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto", " " }));
        cbx_analisis.setSelectedItem("Nominal");

        cbx_experiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto" }));
        cbx_experiencia.setSelectedItem("Nominal");

        cbx_calidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto" }));
        cbx_calidad.setSelectedItem("Nominal");

        cbx_expe_maquina_virtual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", " " }));
        cbx_expe_maquina_virtual.setSelectedItem("Nominal");

        cbx_expe_lenguaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", " " }));
        cbx_expe_lenguaje.setSelectedItem("Nominal");

        cbx_tecnicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto", " " }));
        cbx_tecnicas.setSelectedItem("Nominal");

        cbx_herramientas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto" }));
        cbx_herramientas.setSelectedItem("Nominal");

        cbx_rest_tiempo_desarrollo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Bajo", "Bajo", "Nominal", "Alto", "Muy Alto", " " }));
        cbx_rest_tiempo_desarrollo.setSelectedIndex(2);
        cbx_rest_tiempo_desarrollo.setSelectedItem("Nominal");

        jLabel16.setText("FACTOR AJUSTE");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_atrib_personal)
                            .addComponent(lbl_atrib_hardware)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_atrib_proyecto))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_atrib_software))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbx_fiabilidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_base_datos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_complejidad, 0, 103, Short.MAX_VALUE)
                                .addComponent(cbx_restr_tiempo_ejecucion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_rest_memoria_virtual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_vol_maquina_virtual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_analisis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_experiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_calidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_expe_maquina_virtual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_expe_lenguaje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cbx_tiempo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_tecnicas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbx_herramientas, 0, 110, Short.MAX_VALUE)
                                    .addComponent(cbx_rest_tiempo_desarrollo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(3, 3, 3)
                .addComponent(lbl_atrib_software)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbx_base_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_complejidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_atrib_hardware)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbx_restr_tiempo_ejecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbx_rest_memoria_virtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_vol_maquina_virtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbx_tiempo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_atrib_personal)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbx_analisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbx_experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbx_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_expe_maquina_virtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbx_fiabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbx_expe_lenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_atrib_proyecto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbx_tecnicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbx_herramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbx_rest_tiempo_desarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        obtenerAtributos();
               
        this.setVisible(false);

    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FactorAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactorAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactorAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactorAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FactorAjuste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JComboBox<String> cbx_analisis;
    private javax.swing.JComboBox<String> cbx_base_datos;
    private javax.swing.JComboBox<String> cbx_calidad;
    private javax.swing.JComboBox<String> cbx_complejidad;
    private javax.swing.JComboBox<String> cbx_expe_lenguaje;
    private javax.swing.JComboBox<String> cbx_expe_maquina_virtual;
    private javax.swing.JComboBox<String> cbx_experiencia;
    private javax.swing.JComboBox<String> cbx_fiabilidad;
    private javax.swing.JComboBox<String> cbx_herramientas;
    private javax.swing.JComboBox<String> cbx_rest_memoria_virtual;
    private javax.swing.JComboBox<String> cbx_rest_tiempo_desarrollo;
    private javax.swing.JComboBox<String> cbx_restr_tiempo_ejecucion;
    private javax.swing.JComboBox<String> cbx_tecnicas;
    private javax.swing.JComboBox<String> cbx_tiempo_respuesta;
    private javax.swing.JComboBox<String> cbx_vol_maquina_virtual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_atrib_hardware;
    private javax.swing.JLabel lbl_atrib_personal;
    private javax.swing.JLabel lbl_atrib_proyecto;
    private javax.swing.JLabel lbl_atrib_software;
    // End of variables declaration//GEN-END:variables

    private void obtenerAtributos() {
        //https://es.stackoverflow.com/questions/8456/crear-una-lista-clave-valor-en-java
        int atributo = 0;
        ArrayList<Integer> atributos = new ArrayList<>();
        
        atributo  = cbx_fiabilidad.getSelectedIndex();
        atributos.add(atributo);
        cbx_fiabilidad.setSelectedIndex(atributo);
        atributo  = cbx_base_datos.getSelectedIndex();
        atributos.add(atributo);
        cbx_base_datos.setSelectedIndex(atributo);
        atributo  = cbx_complejidad.getSelectedIndex();
        atributos.add(atributo);
        cbx_complejidad.setSelectedIndex(atributo);
        atributo  = cbx_restr_tiempo_ejecucion.getSelectedIndex();
        atributos.add(atributo);
        cbx_restr_tiempo_ejecucion.setSelectedIndex(atributo);
        atributo  = cbx_rest_memoria_virtual.getSelectedIndex();
        atributos.add(atributo);
        cbx_rest_memoria_virtual.setSelectedIndex(atributo);
        atributo  = cbx_vol_maquina_virtual.getSelectedIndex();
        atributos.add(atributo);
        cbx_vol_maquina_virtual.setSelectedIndex(atributo);
        atributo  = cbx_tiempo_respuesta.getSelectedIndex();
        atributos.add(atributo);
        cbx_tiempo_respuesta.setSelectedIndex(atributo);
        atributo  = cbx_analisis.getSelectedIndex();
        atributos.add(atributo);
        cbx_analisis.setSelectedIndex(atributo);
        atributo  = cbx_experiencia.getSelectedIndex();
        atributos.add(atributo);
        cbx_experiencia.setSelectedIndex(atributo);
        atributo  = cbx_calidad.getSelectedIndex();
        atributos.add(atributo);
        cbx_calidad.setSelectedIndex(atributo);
        atributo  = cbx_expe_maquina_virtual.getSelectedIndex();
        atributos.add(atributo);
        cbx_expe_maquina_virtual.setSelectedIndex(atributo);
        atributo  = cbx_expe_lenguaje.getSelectedIndex();
        atributos.add(atributo);
        cbx_expe_lenguaje.setSelectedIndex(atributo);
        atributo  = cbx_tecnicas.getSelectedIndex();
        atributos.add(atributo);
        cbx_tecnicas.setSelectedIndex(atributo);
        atributo  = cbx_herramientas.getSelectedIndex();
        atributos.add(atributo);
        cbx_herramientas.setSelectedIndex(atributo);
        atributo  = cbx_rest_tiempo_desarrollo.getSelectedIndex();
        atributos.add(atributo);
        cbx_rest_tiempo_desarrollo.setSelectedIndex(atributo);
        
        double fa = con_reporte.calcularFactorAjuste(atributos);
        
        if (fa > 0) {
            VentanaPrincipal.factor_ajuste = fa;
        }
        
        VentanaPrincipal.atributos = atributos;
    }
}
