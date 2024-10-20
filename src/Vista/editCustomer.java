
package Vista;

import Controller.CustomerController;
import Model.CustomerModel;
import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class editCustomer extends javax.swing.JFrame {
    
    DefaultTableModel ModelEditCustomer;
    CustomerModel customerModel;

    public editCustomer() {
        
    }
    
    
    
    
    public editCustomer(List<CustomerModel> customers) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
            String columnas[] = {"Customerid" ,"Name", "Mail","Nit"};
        
        ModelEditCustomer = new DefaultTableModel(columnas, 0);
        
        jTableEditCustomer.setModel(ModelEditCustomer);
        
        fillTable(customers);
        
        
        
        
    }
    
    public void fillTable(List<CustomerModel> customers){  // Method for load customer information in table for edit
        
        for (CustomerModel i : customers) {
            
            Object [] filas = new Object[4];
            
            filas[0] = i.getCustomerId();
            filas[1]=i.getName();
            filas[2]=i.getMail();
            filas[3]=i.getNit();
            
            ModelEditCustomer.addRow(filas); 
        }        
    } 
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEditCustomer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableEditCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableEditCustomer);

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        // CAPTURAR LOS CAMPOS DE LA FILA SELECCIONADA 
        
        int rowSelected = jTableEditCustomer.getSelectedRow();
        
        if(rowSelected >= 0 ){
            int customerId = Integer.parseInt(jTableEditCustomer.getValueAt(rowSelected, 0).toString());
            String Name = String.valueOf(jTableEditCustomer.getValueAt(rowSelected, 1));
            String Mail = String.valueOf(jTableEditCustomer.getValueAt(rowSelected, 2));
            String Nit = String.valueOf(jTableEditCustomer.getValueAt(rowSelected, 3));
           
            editCustomer1 editCustomer1 = new editCustomer1(customerId,Name, Mail, Nit); // MANDO POR CONSTRUCTOR LOS DATOS CAPTURADOS DE LA FILA DE LA TABLA AL FORMULARIO 
            
            
            editCustomer1.setVisible(true);
            // setiar datos capturados de la fila en el editCustomer1 para su edicion
            
            
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEditCustomer;
    // End of variables declaration//GEN-END:variables
}
