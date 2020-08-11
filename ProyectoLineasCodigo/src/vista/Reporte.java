/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.Reportes;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author robin
 */
public class Reporte extends javax.swing.JFrame {

    /**
     * Creates new form Reporte
     */
    public double lines = 0.0;
    public double esfuerzo = 0.0;
    public double numero_personas = 0.0;
    public double tiempo_desarrollo = 0.0;
    public double costo = 0.0;
    
    Reportes con_reportes;

    public Reporte() {
        initComponents();
        this.setLocationRelativeTo(null);

        lines = con_reportes.kloc(VentanaPrincipal.n_lines);

        jtf_n_lineas.setText(Double.toString(lines));

        String modo = VentanaPrincipal.jtf_modo_metrica.getText();

        double mx = VentanaPrincipal.factor_ajuste;

        esfuerzo = con_reportes.esfuerzo(lines, modo, mx);
        
        esfuerzo = Math.round(esfuerzo * Math.pow(10, 2)) / Math.pow(10, 2);

        jtf_esfuerzo.setText(Double.toString(esfuerzo));

        tiempo_desarrollo = con_reportes.tiempoDesarrollo(esfuerzo, modo);
        
        tiempo_desarrollo = Math.round(tiempo_desarrollo * Math.pow(10, 2)) / Math.pow(10, 2);

        jtf_tiempo.setText(Double.toString(tiempo_desarrollo));

        numero_personas = (Double) esfuerzo / tiempo_desarrollo;

        numero_personas = Math.round(numero_personas * Math.pow(10, 2)) / Math.pow(10, 2);

        jtf_personas.setText(Double.toString(numero_personas));

        double salario_medio = Double.parseDouble(VentanaPrincipal.jtf_salario.getText().toString());
        
        costo = (Double) numero_personas * salario_medio * tiempo_desarrollo;

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

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtf_tiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_personas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_n_lineas = new javax.swing.JLabel();
        jtf_n_lineas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtf_esfuerzo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new rsbuttoncustom.RSButtonCustom();
        btn_generar_reporte = new rsbuttoncustom.RSButtonCustom();
        jtf_costo_proyecto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte");
        setBackground(new java.awt.Color(45, 60, 80));
        setMaximumSize(new java.awt.Dimension(450, 500));
        setMinimumSize(new java.awt.Dimension(450, 500));
        setPreferredSize(new java.awt.Dimension(450, 500));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(246, 149, 7));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ESTIMACIONES COCOMO 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(45, 60, 80));

        jtf_tiempo.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("El número de personas para el Proyecto:");

        jtf_personas.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Costo total del proyecto:");

        lbl_n_lineas.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lbl_n_lineas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n_lineas.setText("Número de Líneas del Proyecto(KLOC): ");

        jtf_n_lineas.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("El esfuerzo aplicado en persona-mes:");

        jtf_esfuerzo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El tiempo de desarrollo en meses:");

        jButton1.setBackground(new java.awt.Color(45, 60, 80));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_generar_reporte.setBackground(new java.awt.Color(45, 60, 80));
        btn_generar_reporte.setForeground(new java.awt.Color(255, 255, 255));
        btn_generar_reporte.setText("Generar Reporte");
        btn_generar_reporte.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btn_generar_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_n_lineas)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_tiempo)
                                    .addComponent(jtf_esfuerzo)
                                    .addComponent(jtf_n_lineas)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_personas)
                                    .addComponent(jtf_costo_proyecto)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btn_generar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_n_lineas)
                    .addComponent(jtf_n_lineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_esfuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtf_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_costo_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btn_generar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_generar_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_reporteActionPerformed
        String nombre_proyecto = "";
        
        try {
            nombre_proyecto = VentanaPrincipal.carpeta_proyecto.getName();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error");
        }

        Document reporte = new Document();
        if (nombre_proyecto.length() > 0) {
            try {
                String ruta = System.getProperty("user.home");

                PdfWriter.getInstance(reporte, new FileOutputStream(ruta + "/Desktop/Reporte_COCOMOII.pdf"));

                Font negrillaFont18 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
                
                Font negrillaFont14 = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
                
                Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 14);

                reporte.open();

                PdfPTable tabla = new PdfPTable(4);
                
                reporte.add(new Paragraph("Reporte Cocomo II", negrillaFont18));
                
                reporte.add(Chunk.NEWLINE);

                reporte.add(new Paragraph("Nombre del proyecto: " + nombre_proyecto, normalFont));

                Date fecha = new Date(); 

                String strDateFormat = "dd-MM-yyyy"; 
                
                SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); 
                
                reporte.add(new Paragraph("Fecha: " + objSDF.format(fecha), normalFont));
                
                reporte.add(Chunk.NEWLINE);
                
                reporte.add(new Paragraph("El presente documento emitido por la empresa 'JAR' indica en la siguiente Tabla las estimaciones de costo generadas a partir de la Métrica"
                        + " de líneas de Código.", normalFont));
                reporte.add(Chunk.NEWLINE);
                
                reporte.add(new Paragraph("Tabla de estimación: ", normalFont));
                
                reporte.add(Chunk.NEWLINE);
                
                tabla.addCell(new Phrase("KLOC", negrillaFont14));
                
                tabla.addCell(new Phrase("Esfuerzo/Mes", negrillaFont14));
                
                tabla.addCell(new Phrase("Tiempo/Mes", negrillaFont14));
                
                tabla.addCell(new Phrase("Persona/Mes", negrillaFont14));

                tabla.addCell(Double.toString(lines));
                
                tabla.addCell(Double.toString(esfuerzo));
                
                tabla.addCell(Double.toString(tiempo_desarrollo));
                
                tabla.addCell(Double.toString(numero_personas));
                reporte.add(tabla);
                
                reporte.add(Chunk.NEWLINE);
                
                reporte.add(new Paragraph("Costo total del Proyecto: " + Double.toString(costo), negrillaFont14));

                reporte.close();

                JOptionPane.showMessageDialog(null, "Reporte Creado");
                
                this.dispose();

            } catch (DocumentException | HeadlessException | FileNotFoundException e) {
                
                JOptionPane.showMessageDialog(null, "Error al Generar Reporte");
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "No existe Proyecto");
        }

    }//GEN-LAST:event_btn_generar_reporteActionPerformed

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
    private rsbuttoncustom.RSButtonCustom btn_generar_reporte;
    private rsbuttoncustom.RSButtonCustom jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtf_costo_proyecto;
    private javax.swing.JTextField jtf_esfuerzo;
    private javax.swing.JTextField jtf_n_lineas;
    private javax.swing.JTextField jtf_personas;
    private javax.swing.JTextField jtf_tiempo;
    private javax.swing.JLabel lbl_n_lineas;
    // End of variables declaration//GEN-END:variables

}
