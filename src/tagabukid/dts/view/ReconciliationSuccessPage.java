/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagabukid.dts.view;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author rufino
 */
@Template({FormPage.class})
public class ReconciliationSuccessPage extends javax.swing.JPanel {

    /**
     * Creates new form SuccessPage
     */
    public ReconciliationSuccessPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xLabel1 = new com.rameses.rcp.control.XLabel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xLabel2 = new com.rameses.rcp.control.XLabel();

        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xLabel1.setText("Document offline reconciliation successful. ");

        xTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        xTextField1.setName("entity.din"); // NOI18N
        xTextField1.setReadonly(true);

        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xLabel2.setText("Please use the ff. identification no. for tracking purposes.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(xLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(xLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
}