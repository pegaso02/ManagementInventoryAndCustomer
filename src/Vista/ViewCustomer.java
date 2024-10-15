
package Vista;

import Service.CustomerService;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;



public class ViewCustomer extends javax.swing.JFrame {
    
    DefaultTableModel modelCustomer;

    public ViewCustomer() {
      initComponents();  
    setLocationRelativeTo(null);  // Centrar la ventana en la pantalla

    // Columnas de la tabla 
    Object columnas[] = {"CustomerId", "Name", "Mail", "Nit"};

    // Creamos un modelo de tabla con las columnas
    DefaultTableModel modelCustomer = new DefaultTableModel(columnas, 0);

    // Asignamos el modelo creado a la tabla
    jTableViewCustomer.setModel(modelCustomer);

    // Servicio que obtiene los datos de los clientes
    CustomerService cs = new CustomerService();

    // Obtenemos la lista de filas de la base de datos
    List<Object[]> listaClientes = cs.viewCustomer();

    // Verificamos si la lista de clientes no está vacía
    System.out.println("Número de clientes obtenidos: " + listaClientes.size());

    // Agregamos cada fila al modelo de la tabla
    for (Object[] i : listaClientes) {
        modelCustomer.addRow(i);
    }

    // Actualizamos la vista de la tabla (si es necesario)
    modelCustomer.fireTableDataChanged();
         
        
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewCustomer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTableViewCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableViewCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewCustomer;
    // End of variables declaration//GEN-END:variables
}
