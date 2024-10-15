
package Vista;

import Service.ProductService;
import javax.swing.table.DefaultTableModel;
import java.util.List;


public class updateProduct extends javax.swing.JFrame {
    
    DefaultTableModel modelProduct;
  
    public updateProduct() {
        initComponents();
        
             
        String columnas[] = {"ProductId","ProductName","Price", "Qty"}; // Columnas de la tabla a editar
        
        modelProduct = new DefaultTableModel(columnas, 0); // le pasamos al modelo las columnas
        
        jTableUpdateProduct.setModel(modelProduct); // setiamos modelo a la tabla
        
        ProductService ps = new ProductService();
        
        List<Object[]> filas2 = ps.updateProduct(); // recibimos las filas de la tabla productos
        
        for(int i = 0; i < filas2.size();i++){
            modelProduct.addRow(filas2.get(i)); // iteramos en el arraylist y guardamos cada fila en la tabla
        }
        
        
//        int rowSelect = jTableUpdateProduct.getSelectedRow();
        
//        if(rowSelect>0){
//            
//        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUpdateProduct = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableUpdateProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableUpdateProduct);

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // traer los datos de la fila seleccionada en las cajas de texto para poderlas modificar
        
         int rowSelect = jTableUpdateProduct.getSelectedRow(); // Guardamos la fila seleccionada
         
         if(rowSelect >= 0){ // Si selecciono alguna
             
            int ProductId = Integer.parseInt(jTableUpdateProduct.getValueAt(rowSelect, 0).toString());
            String productName = jTableUpdateProduct.getValueAt(rowSelect, 1).toString(); // Guardamos las columnas de la fila seleccionada en variables 
            Double price = Double.parseDouble(jTableUpdateProduct.getValueAt(rowSelect, 2).toString());
            int qty = Integer.parseInt(jTableUpdateProduct.getValueAt(rowSelect, 3).toString());
             
            EditProduct epc = new EditProduct(ProductId,productName, price, qty);// Pasamos por parametros los valores de las columnas de la fila
            
            epc.setVisible(true);
     

          }
      
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUpdateProduct;
    // End of variables declaration//GEN-END:variables
}
