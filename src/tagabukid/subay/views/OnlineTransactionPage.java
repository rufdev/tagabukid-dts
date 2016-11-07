/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagabukid.subay.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author rufino
 */
@StyleSheet
@Template({FormPage.class})
public class OnlineTransactionPage extends javax.swing.JPanel {

    /**
     * Creates new form DTSReceivePage
     */
    public OnlineTransactionPage() {
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

        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xActionTextField2 = new com.rameses.rcp.control.XActionTextField();

        xActionTextField1.setText("xActionTextField1");

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Documents to Process");
        xDataTable1.setBorder(xTitledBorder1);
        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "din"}
                , new Object[]{"caption", "DIN"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "title"}
                , new Object[]{"caption", "Title"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "recordlog.datecreated"}
                , new Object[]{"caption", "Date Created"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "recordlog.createdbyuser"}
                , new Object[]{"caption", "Created By"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "remarks"}
                , new Object[]{"caption", "Remarks"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", true}
                , new Object[]{"editableWhen", "#{item.din != null}"}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            })
        });
        xDataTable1.setHandler("listHandler");
        xDataTable1.setName("selectedItem"); // NOI18N

        xFormPanel2.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xFormPanel2.setCaptionFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        xLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel3.setCaption("Document Count");
        xLabel3.setCaptionWidth(200);
        xLabel3.setDepends(new String[] {"din"});
        xLabel3.setExpression("#{document.size}");
        xLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel3.setForeground(new java.awt.Color(255, 0, 0));
        xLabel3.setName("documentcount"); // NOI18N
        xLabel3.setOpaque(true);
        xLabel3.setPreferredSize(new java.awt.Dimension(100, 23));
        xFormPanel2.add(xLabel3);

        xFormPanel3.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xFormPanel3.setCaptionFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xFormPanel3.setCaptionWidth(120);
        xFormPanel3.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);

        xLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        xLabel4.setCaption("Outgoing");
        xLabel4.setDepends(new String[] {"din"});
        xLabel4.setExpression("#{stats.outgoing}");
        xLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel4.setForeground(new java.awt.Color(255, 0, 0));
        xLabel4.setName("stats.outoging"); // NOI18N
        xLabel4.setOpaque(true);
        xLabel4.setPreferredSize(new java.awt.Dimension(100, 23));
        xFormPanel3.add(xLabel4);

        xLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        xLabel5.setCaption("Enroute");
        xLabel5.setDepends(new String[] {"din"});
        xLabel5.setExpression("#{stats.enroute}");
        xLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel5.setForeground(new java.awt.Color(255, 0, 0));
        xLabel5.setName("stats.enroute"); // NOI18N
        xLabel5.setOpaque(true);
        xLabel5.setPreferredSize(new java.awt.Dimension(100, 23));
        xFormPanel3.add(xLabel5);

        xLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        xLabel6.setCaption("Processing");
        xLabel6.setDepends(new String[] {"din"});
        xLabel6.setExpression("#{stats.processing}");
        xLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel6.setForeground(new java.awt.Color(255, 0, 0));
        xLabel6.setName("stats.processing"); // NOI18N
        xLabel6.setOpaque(true);
        xLabel6.setPreferredSize(new java.awt.Dimension(100, 23));
        xFormPanel3.add(xLabel6);

        xLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        xLabel7.setCaption("Archived");
        xLabel7.setDepends(new String[] {"din"});
        xLabel7.setExpression("#{stats.archived}");
        xLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel7.setForeground(new java.awt.Color(255, 0, 0));
        xLabel7.setName("stats.archived"); // NOI18N
        xLabel7.setOpaque(true);
        xLabel7.setPreferredSize(new java.awt.Dimension(100, 23));
        xFormPanel3.add(xLabel7);

        xActionTextField2.setActionCommand("barcodesearch");
        xActionTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        xActionTextField2.setHint("Search DIN");
        xActionTextField2.setName("din"); // NOI18N
        xActionTextField2.setPreferredSize(new java.awt.Dimension(300, 30));
        xActionTextField2.setShowCaption(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xFormPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xDataTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xActionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(500, 500, 500)
                        .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(141, 141, 141)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xActionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xDataTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(xFormPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XActionTextField xActionTextField2;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    // End of variables declaration//GEN-END:variables
}
