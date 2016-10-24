/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagabukid.subay.views;

import com.rameses.osiris2.themes.OKCancelPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author rufino
 */
@Template({OKCancelPage.class})
@StyleSheet
public class DocumentOfflineReconciliationPage extends javax.swing.JPanel {

    /**
     * Creates new form DocumentRedFlag
     */
    public DocumentOfflineReconciliationPage() {
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

        xHorizontalPanel1 = new com.rameses.rcp.control.XHorizontalPanel();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        xTextArea3 = new com.rameses.rcp.control.XTextArea();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Document Information");
        xHorizontalPanel1.setBorder(xTitledBorder1);
        xHorizontalPanel1.setBorderSeparator(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xHorizontalPanel1.setPreferredSize(new java.awt.Dimension(1008, 215));

        xFormPanel3.setCaptionWidth(150);
        xFormPanel3.setName(""); // NOI18N
        xFormPanel3.setPreferredSize(new java.awt.Dimension(500, 100));

        xLabel1.setBorder(new com.rameses.rcp.control.border.XLineBorder());
        xLabel1.setCaption("DIN");
        xLabel1.setExpression("#{entity.din}");
        xLabel1.setOpaque(true);
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 16));
        xFormPanel3.add(xLabel1);

        xLabel2.setBorder(new com.rameses.rcp.control.border.XLineBorder());
        xLabel2.setCaption("Document Title");
        xLabel2.setExpression("#{entity.title}");
        xLabel2.setOpaque(true);
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 16));
        xFormPanel3.add(xLabel2);

        xLabel5.setBorder(new com.rameses.rcp.control.border.XLineBorder());
        xLabel5.setCaption("Author");
        xLabel5.setExpression("#{entity.author}");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 18));
        xFormPanel3.add(xLabel5);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 40));

        xTextArea1.setEditable(false);
        xTextArea1.setCaption("Document Description");
        xTextArea1.setName("entity.description"); // NOI18N
        jScrollPane1.setViewportView(xTextArea1);

        xFormPanel3.add(jScrollPane1);

        xLabel6.setBorder(new com.rameses.rcp.control.border.XLineBorder());
        xLabel6.setCaption("Document Type");
        xLabel6.setExpression("#{entity.documenttype.name}");
        xLabel6.setOpaque(true);
        xLabel6.setPreferredSize(new java.awt.Dimension(300, 16));
        xFormPanel3.add(xLabel6);

        xLabel4.setBorder(new com.rameses.rcp.control.border.XLineBorder());
        xLabel4.setCaption("Date Created");
        xLabel4.setExpression("#{entity.recordlog.datecreated}");
        xLabel4.setFor("");
        xLabel4.setOpaque(true);
        xLabel4.setPreferredSize(new java.awt.Dimension(300, 16));
        xFormPanel3.add(xLabel4);

        xLabel7.setBorder(new com.rameses.rcp.control.border.XLineBorder());
        xLabel7.setCaption("Created By");
        xLabel7.setExpression("#{entity.recordlog.createdbyuser}");
        xLabel7.setFor("");
        xLabel7.setName(""); // NOI18N
        xLabel7.setOpaque(true);
        xLabel7.setPreferredSize(new java.awt.Dimension(300, 16));
        xFormPanel3.add(xLabel7);

        xLabel3.setCaption("");
        xLabel3.setExpression("#{entity.state}");
        xLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        xLabel3.setForeground(new java.awt.Color(255, 0, 0));
        xLabel3.setName(""); // NOI18N
        xLabel3.setOpaque(true);
        xLabel3.setPreferredSize(new java.awt.Dimension(300, 40));
        xFormPanel3.add(xLabel3);

        xHorizontalPanel1.add(xFormPanel3);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Offline Reconciliation");
        xFormPanel1.setBorder(xTitledBorder2);
        xFormPanel1.setCaptionWidth(150);

        xComboBox1.setCaption("Action");
        xComboBox1.setItems("reconciliationActions");
        xComboBox1.setName("entity.reconciliationAction"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(300, 20));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(300, 63));

        xTextArea3.setCaption("Message");
        xTextArea3.setName("entity.message"); // NOI18N
        xTextArea3.setRequired(true);
        jScrollPane3.setViewportView(xTextArea3);

        xFormPanel1.add(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addComponent(xHorizontalPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xHorizontalPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XHorizontalPanel xHorizontalPanel1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextArea xTextArea3;
    // End of variables declaration//GEN-END:variables
}
