/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagabukid.subay.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author rufino
 */
@Template({FormPage.class})
public class CabinetPage extends javax.swing.JPanel {

    /**
     * Creates new form CabinetPage
     */
    public CabinetPage() {
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

        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xButton1 = new com.rameses.rcp.control.XButton();

        xTextField1.setCaption("Cabinet Code");
        xTextField1.setCaptionWidth(100);
        xTextField1.setName("entity.code"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(150, 19));
        xTextField1.setRequired(true);
        xTextField1.setSpaceChar('_');
        xFormPanel1.add(xTextField1);

        xTextField2.setCaption("Cabinet Title");
        xTextField2.setCaptionWidth(100);
        xTextField2.setName("entity.title"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(200, 20));
        xTextField2.setRequired(true);
        xFormPanel1.add(xTextField2);

        xFormPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel2.setViewType("");

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel2.setCaption("Parent");
        xLabel2.setCaptionWidth(100);
        xLabel2.setExpression("#{entity.parent.code} - #{entity.parent.title}");
        xLabel2.setPreferredSize(new java.awt.Dimension(200, 19));
        xFormPanel2.add(xLabel2);

        xButton1.setCaption("");
        xButton1.setCaptionFontStyle("");
        xButton1.setCaptionWidth(1);
        xButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        xButton1.setName("transferParent"); // NOI18N
        xButton1.setPreferredSize(new java.awt.Dimension(49, 19));
        xButton1.setText("Transfer");
        xFormPanel2.add(xButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    // End of variables declaration//GEN-END:variables
}