
package Vista;

import Controller.CustomerController;
import Model.CustomerModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class deleteCustomer extends javax.swing.JFrame {

    DefaultTableModel defaultTable;
    CustomerController customerController;

    public deleteCustomer(List<CustomerModel> customers) {
        initComponents();
        setLocationRelativeTo(null);
        
        String filas [] = {"CustomerId","Name", "Mail", "Nit"}; // Columnas de la tabla
        
        defaultTable = new DefaultTableModel(filas, 0);  // setiamos las columnas al modelo
        
        jTableDelete.setModel(defaultTable); // Setiamos modelo a la tabla
        
        fillTable(customers);
        
    }
    
    public void fillTable(List<CustomerModel> customerModel){
        
        Object filas[] = new Object[4];
        
        for (CustomerModel iterador : customerModel) {
            filas[0] = iterador.getCustomerId();
            filas[1] = iterador.getName();
            filas[2] = iterador.getMail();
            filas[3] = iterador.getNit();
            
            defaultTable.addRow(filas);
        }
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDelete = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableDelete.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDelete);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButtonDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        int rowSelected = jTableDelete.getSelectedRow();
        
        if(rowSelected >= 0){
            int customerId = Integer.parseInt(jTableDelete.getValueAt(rowSelected, 0).toString());  // capturamos el id Del cliente a eliminar
            customerController = new CustomerController(this);
            customerController.deleteCustomer(customerId);
        }
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDelete;
    // End of variables declaration//GEN-END:variables
}
