
package Vista;

import Service.ReportService;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Vector;


public class billingReport extends javax.swing.JFrame {

    DefaultTableModel modelBillingReport;
    
    public billingReport() {
        initComponents();
        
        String columnas[] = {"InvoiceId","Date","Customer Name","Product Name","Quantity","Total"};   // Columnas de la tabla BillingReport
        
        modelBillingReport = new DefaultTableModel(columnas, 0);
        
        jTableBillingReport.setModel(modelBillingReport);
        
        ReportService rs = new ReportService();
        
        List<Object []> columnas1 = rs.loadDatabilling();
        
//        for (Object[] i : columnas1) {
//            modelBillingReport.addRow(i);
//        }
        
        for (int i = 0; i < columnas1.size(); i++) {
            modelBillingReport.addRow(columnas1.get(i));
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBillingReport = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableBillingReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableBillingReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBillingReport;
    // End of variables declaration//GEN-END:variables
}
