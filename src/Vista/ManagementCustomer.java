
package Vista;

import Model.CustomerModel;
import Service.UserService;
import java.util.List;

public class ManagementCustomer extends javax.swing.JFrame {
    
    
      UserService userService = new UserService();    
      CustomerModel customerModel = new CustomerModel();

  
    public ManagementCustomer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnCustomer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnCustomer.setText("New Client");
        jBtnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCustomerActionPerformed(evt);
            }
        });

        jButton1.setText("Update Client");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Client");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jBtnCustomer)
                .addGap(68, 68, 68)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton2)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCustomer)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


            
    private void jBtnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCustomerActionPerformed

        CustomerVista customer = new CustomerVista();
        if (userService.getAdministrador()) {

            customer.setVisible(true);
        } else{

            customer.setVisible(false);
        }

    }//GEN-LAST:event_jBtnCustomerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


List<CustomerModel> customers = customerModel.getAllCustomer(); // Obtiene la lista de clientes
        editCustomer ec = new editCustomer(customers); // Pasa la lista al constructor
        ec.setVisible(true);
        
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        List<CustomerModel> customers = customerModel.getAllCustomer();
        deleteCustomer deleteCustom = new deleteCustomer(customers);
        deleteCustom.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
