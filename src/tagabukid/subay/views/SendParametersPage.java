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
public class SendParametersPage extends javax.swing.JPanel {

    /**
     * Creates new form SendParametersPage
     */
    public SendParametersPage() {
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

        xPanel1 = new com.rameses.rcp.control.XPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xRadio1 = new com.rameses.rcp.control.XRadio();
        xRadio2 = new com.rameses.rcp.control.XRadio();
        xRadio3 = new com.rameses.rcp.control.XRadio();
        xRadio4 = new com.rameses.rcp.control.XRadio();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();

        javax.swing.GroupLayout xPanel1Layout = new javax.swing.GroupLayout(xPanel1);
        xPanel1.setLayout(xPanel1Layout);
        xPanel1Layout.setHorizontalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        xPanel1Layout.setVerticalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        xFormPanel1.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xFormPanel1.setCaptionFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xFormPanel1.setCaptionWidth(150);
        xFormPanel1.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel1.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel1.setShowCaption(false);
        xFormPanel1.setVisibleWhen("#{mode == 'send'}");

        xRadio1.setCaption("Send Type");
        xRadio1.setName("entity.sendtype"); // NOI18N
        xRadio1.setOptionValue("local");
        xRadio1.setText("Local");
        xFormPanel1.add(xRadio1);

        xRadio2.setName("entity.sendtype"); // NOI18N
        xRadio2.setOptionValue("nonlocal");
        xRadio2.setShowCaption(false);
        xRadio2.setText("Nonlocal");
        xFormPanel1.add(xRadio2);

        xRadio3.setName("entity.sendtype"); // NOI18N
        xRadio3.setOptionValue("multiplelocal");
        xRadio3.setShowCaption(false);
        xRadio3.setText("Multiple(Local)");
        xFormPanel1.add(xRadio3);

        xRadio4.setName("entity.sendtype"); // NOI18N
        xRadio4.setOptionValue("multiplenonlocal");
        xRadio4.setShowCaption(false);
        xRadio4.setText("Multiple(Nonlocal)");
        xFormPanel1.add(xRadio4);

        xSubFormPanel1.setDepends(new String[] {"mode", "entity.sendtype"});
        xSubFormPanel1.setDynamic(true);
        xSubFormPanel1.setHandler("handler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xSubFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xSubFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XPanel xPanel1;
    private com.rameses.rcp.control.XRadio xRadio1;
    private com.rameses.rcp.control.XRadio xRadio2;
    private com.rameses.rcp.control.XRadio xRadio3;
    private com.rameses.rcp.control.XRadio xRadio4;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    // End of variables declaration//GEN-END:variables
}
