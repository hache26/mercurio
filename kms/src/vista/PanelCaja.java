/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelCaja.java
 *
 * Created on 28/05/2010, 05:52:29 PM
 */

package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author JUAN FERNANDO
 */
public class PanelCaja extends javax.swing.JPanel {
private FachadaInterfaz fachada;
    /** Creates new form PanelCaja */
    public PanelCaja() {
        initComponents();
        fachada = FachadaInterfaz.getInstancia();
        cargarCombo();
        habilitarCombo(false);
        habilitarDia(false);

        this.jFechaDesde.setVisible(false);
        this.jFechaHasta.setVisible(false);
        this.lblDesde.setVisible(false);
        this.lblHasta.setVisible(false);

        this.setSize(500,300);
        this.setVisible(false);
    }

    public JDateChooser getjFechaDesde() {
        return jFechaDesde;
    }

    public JDateChooser getjFechaHasta() {
        return jFechaHasta;
    }

    public JRadioButton getJrCajero() {
        return jrCajero;
    }

    public JRadioButton getJrTodos() {
        return jrTodos;
    }

    public JRadioButton getJrCierres() {
        return jrCierres;
    }

    public JRadioButton getJrMovimientos() {
        return jrMovimientos;
    }


    public JDateChooser getDia() {
        return dia;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrTodos = new javax.swing.JRadioButton();
        jrCajero = new javax.swing.JRadioButton();
        jcbCajero = new javax.swing.JComboBox();
        jFechaDesde = new com.toedter.calendar.JDateChooser();
        jFechaHasta = new com.toedter.calendar.JDateChooser();
        lblDesde = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        dia = new com.toedter.calendar.JDateChooser();
        jrMovimientos = new javax.swing.JRadioButton();
        jrCierres = new javax.swing.JRadioButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos de Caja"));

        buttonGroup1.add(jrTodos);
        jrTodos.setText("Todos");
        jrTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrCajero);
        jrCajero.setText("Por Cajero");
        jrCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCajeroActionPerformed(evt);
            }
        });

        lblDesde.setText("Fecha desde");

        lblHasta.setText("Fecha Hasta");

        buttonGroup2.add(jrMovimientos);
        jrMovimientos.setText("Movimientos");
        jrMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMovimientosActionPerformed(evt);
            }
        });

        buttonGroup2.add(jrCierres);
        jrCierres.setText("Cierres");
        jrCierres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCierresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblHasta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(lblDesde)
                        .addGap(10, 10, 10)
                        .addComponent(jFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrCajero)
                                .addGap(220, 220, 220))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrMovimientos)
                                        .addGap(18, 18, 18)
                                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jrCierres))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDesde)
                        .addComponent(jrTodos))
                    .addComponent(jFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrCajero)
                .addGap(7, 7, 7)
                .addComponent(jcbCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrMovimientos)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCierres)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTodosActionPerformed
      habilitarCombo(false);
      habilitarDia(false);
    }//GEN-LAST:event_jrTodosActionPerformed

    private void jrCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCajeroActionPerformed
      habilitarCombo(true);
    }//GEN-LAST:event_jrCajeroActionPerformed

    private void jrMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMovimientosActionPerformed
       habilitarDia(true);
    }//GEN-LAST:event_jrMovimientosActionPerformed

    private void jrCierresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCierresActionPerformed
       habilitarDia(true);
    }//GEN-LAST:event_jrCierresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dia;
    private com.toedter.calendar.JDateChooser jFechaDesde;
    private com.toedter.calendar.JDateChooser jFechaHasta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbCajero;
    private javax.swing.JRadioButton jrCajero;
    private javax.swing.JRadioButton jrCierres;
    private javax.swing.JRadioButton jrMovimientos;
    private javax.swing.JRadioButton jrTodos;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblHasta;
    // End of variables declaration//GEN-END:variables

    private void habilitarCombo(boolean b) {
        this.jcbCajero.setEnabled(b);
        this.jrMovimientos.setVisible(b);
        this.jrCierres.setVisible(b);

    }
    public void cargarCombo(){
        this.jcbCajero.setModel(new ModeloCombo(fachada.getEmpleados()));

    }
    public String getCodigoCajero(){
        return (String) ((ModeloCombo)this.jcbCajero.getModel()).getSelectedIndex();
    }

    private void habilitarDia(boolean b) {
        this.dia.setVisible(b);
        this.jFechaDesde.setVisible(!b);
        this.jFechaHasta.setVisible(!b);
        this.lblDesde.setVisible(!b);
        this.lblHasta.setVisible(!b);
    }

}