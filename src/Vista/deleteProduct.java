
package Vista;

import Service.ProductService;
import java.util.Optional;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class deleteProduct extends javax.swing.JFrame {
    
     DefaultTableModel modelDeleteProduct;

    public DefaultTableModel getModelDeleteProduct() {
        return modelDeleteProduct;
    }

    public void setModelDeleteProduct(DefaultTableModel modelDeleteProduct) {
        this.modelDeleteProduct = modelDeleteProduct;
    }
     
     

    public JTable getjTableDeleteP() {
        return jTableDeleteP;
    }

    public void setjTableDeleteP(JTable jTableDeleteP) {
        this.jTableDeleteP = jTableDeleteP;
    }
    
   
    public deleteProduct() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        String columsName[] = {"Product Id", "Product Name", "Price", "Quantity"};
        
        modelDeleteProduct = new DefaultTableModel(columsName, 0);
        
        jTableDeleteP.setModel(modelDeleteProduct);
        
        ProductService ps = new ProductService();
        List<Object[]>filas =ps.updateProduct();
        
        for(int i = 0;i < filas.size();i++){
            modelDeleteProduct.addRow(filas.get(i));
        }
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDeleteP = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableDeleteP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDeleteP);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButtonDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       
        // LOGICA ELIMINAR
        ProductService ps = new ProductService();
        ps.DeleteProduct(this); // Pasamos 'this' que es la instancia actual de deleteProduct
        
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDeleteP;
    // End of variables declaration//GEN-END:variables
}
