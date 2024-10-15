
package Vista;

import Service.UserService;
import javax.swing.table.DefaultTableModel;


public class ProductManagement extends javax.swing.JFrame {


    public ProductManagement() {
        initComponents();
    }

 
    UserService userService = new UserService();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButtonDeleteProduct = new javax.swing.JButton();
        jButtonUpdateProduct1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton11.setText("New Product");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButtonDeleteProduct.setText("Delete Product");
        jButtonDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteProductActionPerformed(evt);
            }
        });

        jButtonUpdateProduct1.setText("Update Product");
        jButtonUpdateProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateProduct1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButtonUpdateProduct1)
                .addGap(62, 62, 62)
                .addComponent(jButtonDeleteProduct)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButtonDeleteProduct)
                    .addComponent(jButtonUpdateProduct1))
                .addContainerGap(374, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        Product product = new Product();
        if(userService.getAdministrador()){

            product.setVisible(true);
        } else{
            product.setVisible(false);
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButtonUpdateProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateProduct1ActionPerformed
        updateProduct up = new updateProduct();
        up.setVisible(true);
        up.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonUpdateProduct1ActionPerformed

    private void jButtonDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteProductActionPerformed
        
        
        deleteProduct dp = new deleteProduct();
        dp.setVisible(true);
     
        
        
                
        
        
    }//GEN-LAST:event_jButtonDeleteProductActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButtonDeleteProduct;
    private javax.swing.JButton jButtonUpdateProduct1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
