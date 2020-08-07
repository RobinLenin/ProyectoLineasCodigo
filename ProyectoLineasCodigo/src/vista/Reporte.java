/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Reportes;
import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class Reporte extends javax.swing.JFrame {
    /**
     * Creates new form Reporte
     */
    
    Reportes con_reportes;
    public Reporte() {
        initComponents();
        
        
        double lines = con_reportes.kloc(VentanaPrincipal.n_lines);
        
        jtf_n_lineas.setText(Double.toString(lines));
        
        
        String modo = VentanaPrincipal.jtf_modo_metrica.getText();
        
        double mx = VentanaPrincipal.factor_ajuste; 

        double esfuerzo = con_reportes.esfuerzo(lines, modo, mx);
        esfuerzo = Math.round(esfuerzo * Math.pow(10, 2)) / Math.pow(10, 2);
       
        jtf_esfuerzo.setText(Double.toString(esfuerzo));
        
        double tiempo_desarrollo = con_reportes.tiempoDesarrollo(esfuerzo, modo);
        tiempo_desarrollo = Math.round(tiempo_desarrollo * Math.pow(10, 2)) / Math.pow(10, 2);
       
        jtf_tiempo.setText(Double.toString(tiempo_desarrollo));
        
        
        
        
        
        
        double numero_personas = (Double)esfuerzo/tiempo_desarrollo;
        
        numero_personas = Math.round(numero_personas * Math.pow(10, 2)) / Math.pow(10, 2);
        
        jtf_personas.setText(Double.toString(numero_personas));
        
        double salario_medio = Double.parseDouble(VentanaPrincipal.jtf_salario.getText().toString());
        double costo = (Double)numero_personas * salario_medio;
        
        costo = Math.round(costo * Math.pow(10, 2)) / Math.pow(10, 2);
        
        jtf_costo_proyecto.setText(Double.toString(costo));
        
        
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_n_lineas = new javax.swing.JLabel();
        jtf_n_lineas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtf_esfuerzo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_tiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_personas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtf_costo_proyecto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_n_lineas.setText("Número de Líneas del Proyecto(KLOC): ");

        jtf_n_lineas.setEditable(false);

        jLabel1.setText("El esfuerzo aplicado en persona-mes:");

        jtf_esfuerzo.setEditable(false);

        jLabel2.setText("El tiempo de desarrollo en meses:");

        jtf_tiempo.setEditable(false);

        jLabel3.setText("El número de personas para el Proyecto:");

        jtf_personas.setEditable(false);

        jLabel4.setText("Costo total del proyecto:");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtf_costo_proyecto.setEditable(false);

        jLabel5.setText("ESTIMACIONES COCOMO 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(lbl_n_lineas)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_costo_proyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jtf_personas)
                    .addComponent(jtf_n_lineas)
                    .addComponent(jtf_esfuerzo)
                    .addComponent(jtf_tiempo))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_n_lineas)
                    .addComponent(jtf_n_lineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_esfuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtf_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_costo_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jtf_costo_proyecto;
    private javax.swing.JTextField jtf_esfuerzo;
    private javax.swing.JTextField jtf_n_lineas;
    private javax.swing.JTextField jtf_personas;
    private javax.swing.JTextField jtf_tiempo;
    private javax.swing.JLabel lbl_n_lineas;
    // End of variables declaration//GEN-END:variables

}
