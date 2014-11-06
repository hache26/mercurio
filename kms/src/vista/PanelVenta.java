/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * prueba.java
 *
 * Created on 29/12/2009, 09:51:02 AM
 */
package vista;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

import control.CatalogosManager;
import javax.swing.JCheckBox;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;

/**
 *
 * @author JUAN
 */
public class PanelVenta extends javax.swing.JPanel {

    CatalogosManager fachada;

    public PanelVenta() {
        initComponents();
        fachada = CatalogosManager.getInstancia();
        cargarComboCajero();
        cargarComboProducto();
//      cargarComboDia();
        visibleCajero(false);
        visibleFecha(false);
        visibleProducto(false,3);
        this.setSize(800, 500);
        this.setVisible(false);
    }

    public JDateChooser getJdateDesdeC() {
        return jdateDesdeC;
    }

    public JDateChooser getJdateHastaC() {
        return jdateHastaC;
    }

    public JRadioButton getJbCajero() {
        return jbCajero;
    }

    public JRadioButton getJbFecha() {
        return jbFecha;
    }

    public JYearChooser getjAño() {
        return jAño;
    }

    public JMonthChooser getJcbMes() {
        return jcbMes;
    }

    public JRadioButton getJbProducto() {
        return jbProducto;
    }

    public JRadioButton getJbProductoDiario() {
        return jbProductoDiario;
    }

    public JComboBox getJcbCajero() {
        return jcbCajero;
    }

    public JCheckBox getjCheckDetallado() {
        return jCheckDetallado;
    }

    public JDateChooser getJdateDesde() {
        return jdateDesde;
    }

    public JDateChooser getJdateHasta() {
        return jdateHasta;
    }

    public JDateChooser getjDateFechaDiario() {
        return jDateFechaDiario;
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
        jbFecha = new javax.swing.JRadioButton();
        jbCajero = new javax.swing.JRadioButton();
        pnlFecha = new javax.swing.JPanel();
        jdateDesde = new com.toedter.calendar.JDateChooser();
        jdateHasta = new com.toedter.calendar.JDateChooser();
        lblFecha_desde = new javax.swing.JLabel();
        lblFecha_hasta = new javax.swing.JLabel();
        pnlCajero = new javax.swing.JPanel();
        lblCajero = new javax.swing.JLabel();
        jcbCajero = new javax.swing.JComboBox();
        lblFecha_desde1 = new javax.swing.JLabel();
        jdateDesdeC = new com.toedter.calendar.JDateChooser();
        lblFecha_hasta1 = new javax.swing.JLabel();
        jdateHastaC = new com.toedter.calendar.JDateChooser();
        jbProducto = new javax.swing.JRadioButton();
        ventaProducto = new javax.swing.JPanel();
        jcbProducto = new javax.swing.JComboBox();
        jAño = new com.toedter.calendar.JYearChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbMes = new com.toedter.calendar.JMonthChooser();
        jCheckDetallado = new javax.swing.JCheckBox();
        jbProductoDiario = new javax.swing.JRadioButton();
        panelProductoDiario = new javax.swing.JPanel();
        jDateFechaDiario = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbProductoDiario = new javax.swing.JComboBox();

        buttonGroup1.add(jbFecha);
        jbFecha.setText("Por Fecha");
        jbFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFechaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jbCajero);
        jbCajero.setText("Por Cajero");
        jbCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCajeroActionPerformed(evt);
            }
        });

        pnlFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFecha_desde.setText("Fecha Desde");

        lblFecha_hasta.setText("Fecha Hasta");
        lblFecha_hasta.setAlignmentX(0.5F);

        javax.swing.GroupLayout pnlFechaLayout = new javax.swing.GroupLayout(pnlFecha);
        pnlFecha.setLayout(pnlFechaLayout);
        pnlFechaLayout.setHorizontalGroup(
            pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha_hasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(lblFecha_desde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateDesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdateHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlFechaLayout.setVerticalGroup(
            pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha_desde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha_hasta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCajero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCajero.setText("Cajero");

        jcbCajero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        lblFecha_desde1.setText("Fecha Desde");

        lblFecha_hasta1.setText("Fecha Hasta");
        lblFecha_hasta1.setAlignmentX(0.5F);

        javax.swing.GroupLayout pnlCajeroLayout = new javax.swing.GroupLayout(pnlCajero);
        pnlCajero.setLayout(pnlCajeroLayout);
        pnlCajeroLayout.setHorizontalGroup(
            pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCajeroLayout.createSequentialGroup()
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCajeroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCajero)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCajeroLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha_desde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFecha_hasta1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdateHastaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdateDesdeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)))
                .addContainerGap())
        );
        pnlCajeroLayout.setVerticalGroup(
            pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCajeroLayout.createSequentialGroup()
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCajero)
                    .addComponent(jcbCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha_desde1)
                    .addComponent(jdateDesdeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha_hasta1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdateHastaC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(jbProducto);
        jbProducto.setText("Venta Mensual Producto");
        jbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoActionPerformed(evt);
            }
        });

        ventaProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Producto");

        jLabel1.setText("Mes");

        jLabel3.setText("Año");

        jCheckDetallado.setText("Detallado");
        jCheckDetallado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDetalladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventaProductoLayout = new javax.swing.GroupLayout(ventaProducto);
        ventaProducto.setLayout(ventaProductoLayout);
        ventaProductoLayout.setHorizontalGroup(
            ventaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventaProductoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbProducto, 0, 100, Short.MAX_VALUE))
                    .addGroup(ventaProductoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventaProductoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckDetallado))
                .addContainerGap())
        );
        ventaProductoLayout.setVerticalGroup(
            ventaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventaProductoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(ventaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ventaProductoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(ventaProductoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ventaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckDetallado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(jbProductoDiario);
        jbProductoDiario.setText("Venta Diaria Producto");
        jbProductoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoDiarioActionPerformed(evt);
            }
        });

        panelProductoDiario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Fecha Especifica");

        jLabel5.setText("Producto");

        javax.swing.GroupLayout panelProductoDiarioLayout = new javax.swing.GroupLayout(panelProductoDiario);
        panelProductoDiario.setLayout(panelProductoDiarioLayout);
        panelProductoDiarioLayout.setHorizontalGroup(
            panelProductoDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoDiarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductoDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductoDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbProductoDiario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateFechaDiario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProductoDiarioLayout.setVerticalGroup(
            panelProductoDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductoDiarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductoDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jcbProductoDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProductoDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateFechaDiario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCajero)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbProductoDiario)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panelProductoDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ventaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbProducto))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(pnlFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(pnlCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCajero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbProductoDiario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductoDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ventaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFechaActionPerformed
        visibleFecha(true);
        visibleCajero(false);
        this.visibleProducto(false,3);
    }//GEN-LAST:event_jbFechaActionPerformed

    private void jbCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCajeroActionPerformed
        visibleFecha(false);
      this.visibleProducto(false,3);
        visibleCajero(true);
    }//GEN-LAST:event_jbCajeroActionPerformed

    private void jbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoActionPerformed
        visibleFecha(false);
        this.visibleProducto(true,1);
        visibleCajero(false);
    }//GEN-LAST:event_jbProductoActionPerformed

    private void jbProductoDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoDiarioActionPerformed
       this.visibleProducto(true,2);
        visibleFecha(false);
         visibleCajero(false);
    }//GEN-LAST:event_jbProductoDiarioActionPerformed

    private void jCheckDetalladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDetalladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckDetalladoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JYearChooser jAño;
    private javax.swing.JCheckBox jCheckDetallado;
    private com.toedter.calendar.JDateChooser jDateFechaDiario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jbCajero;
    private javax.swing.JRadioButton jbFecha;
    private javax.swing.JRadioButton jbProducto;
    private javax.swing.JRadioButton jbProductoDiario;
    private javax.swing.JComboBox jcbCajero;
    private com.toedter.calendar.JMonthChooser jcbMes;
    private javax.swing.JComboBox jcbProducto;
    private javax.swing.JComboBox jcbProductoDiario;
    private com.toedter.calendar.JDateChooser jdateDesde;
    private com.toedter.calendar.JDateChooser jdateDesdeC;
    private com.toedter.calendar.JDateChooser jdateHasta;
    private com.toedter.calendar.JDateChooser jdateHastaC;
    private javax.swing.JLabel lblCajero;
    private javax.swing.JLabel lblFecha_desde;
    private javax.swing.JLabel lblFecha_desde1;
    private javax.swing.JLabel lblFecha_hasta;
    private javax.swing.JLabel lblFecha_hasta1;
    private javax.swing.JPanel panelProductoDiario;
    private javax.swing.JPanel pnlCajero;
    private javax.swing.JPanel pnlFecha;
    private javax.swing.JPanel ventaProducto;
    // End of variables declaration//GEN-END:variables

    private void visibleFecha(boolean b) {
        pnlFecha.setVisible(b);
    }

    private void visibleCajero(boolean b) {
        pnlCajero.setVisible(b);

    }

    private void visibleProducto(boolean b, int tipo) {
        switch(tipo){
            case 1:{
                this.ventaProducto.setVisible(b);
                this.panelProductoDiario.setVisible(false);
                break;
            }case 2:{
                 this.ventaProducto.setVisible(false);
                this.panelProductoDiario.setVisible(b);
                break;
            }case 3:{
                 this.ventaProducto.setVisible(false);
                this.panelProductoDiario.setVisible(false);
                break;
            }
        }

    }

    public void cargarComboCajero() {
        this.jcbCajero.setModel(new ModeloCombo(fachada.getEmpleados()));
        jcbCajero.updateUI();
    }

    public void cargarComboProducto() {
        this.jcbProducto.setModel(new ModeloCombo(fachada.getProductos()));
        this.jcbProductoDiario.setModel(new ModeloCombo(fachada.getProductos()));
    }

    public String getCodigo(int tipo) {
        String codigo = null;
        switch (tipo) {
            case 1: {
                codigo = (String) ((ModeloCombo) jcbCajero.getModel()).getSelectedIndex();
                break;
            }
            case 2: {
                codigo = (String) ((ModeloCombo) jcbProducto.getModel()).getSelectedIndex();
                break;
            }case 3:{
                 codigo = (String) ((ModeloCombo) jcbProductoDiario.getModel()).getSelectedIndex();
                break;
            }
        }
        return codigo;
    }
//    public void cargarComboDia(){
//        for(int i=1; i <= 31; i++){
//            jcbDia.addItem(i);
//        }
//    }

//    public String obtenerMes() {
//        String cod;
//        int i = this.jcbMes.getSelectedIndex();
//        return cod = String.valueOf(i);
//    }
}