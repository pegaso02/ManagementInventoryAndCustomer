
package Vista;

import Controller.ConexionBd;
import Model.orderItems;
import Service.invoiceService;
import java.awt.List;
<<<<<<< HEAD
=======
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
>>>>>>> funcionalidad-impresion
import java.math.BigDecimal;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Order extends javax.swing.JFrame {
    
    // CREAMOS EL MODELO PARA LA TABLA PRODUCTOS
    DefaultTableModel defaultTableModelProductos;
    
    // CREAMOS EL MODELO PARA LA TABLA CARRITO
    DefaultTableModel defaultTableModelCarrito;


    public Order() {
        initComponents();
        setLocationRelativeTo(null);
        
        // CREAMOS ARRAY CON EL NOMBRE DE LAS COLUMNAS PARA LAS TABLAS PRODUCTOS Y CARRITO
        String [] columnsTable = {"ProductId", "ProductName","Price","qty" };
        
        // CREAMOS INSTANCIA DEL MODELO DE PRODUCTOS Y LE PASAMOS EL ARRAY CON LOS NOMBRES DE COLUMNAS
        defaultTableModelProductos = new DefaultTableModel(columnsTable, 0);
        
        
        // SETIAMOS EN LA TABLA PRODUCTOS EL MODELO INSTANCIADO
        jTableProductos.setModel(defaultTableModelProductos);
        
        // CARGAMOS LA INFORMACION CON EL METODO LOAD DATA
        loadData();
        
        // CREAMOS INSTANCIA TABLEMODEL PARA LA TABLA CARRITO Y LE PASAMOS EL NOMBRE DE LAS COLUMNAS
        defaultTableModelCarrito = new DefaultTableModel(columnsTable,0);
        jTableCarrito.setModel(defaultTableModelCarrito);
    }
    
<<<<<<< HEAD
=======

    
>>>>>>> funcionalidad-impresion
    
    public void loadData(){
        
        String query = "SELECT ProductId, ProductName, Price,Qty FROM Product";
        
        try(
                Connection con = ConexionBd.getConnection();
                PreparedStatement ps = con.prepareStatement(query);
                ) {
            
           ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {                
                String productId = rs.getString("ProductId");
                String productName = rs.getString("ProductName");
                BigDecimal Price = rs.getBigDecimal("Price");
                int qty = rs.getInt("Qty");
                
                Object []filas = {productId,productName,Price,qty};
                
                defaultTableModelProductos.addRow(filas);
                
                
            }
            
            
            
        } catch (Exception e) {
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jBtnAddCart = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCarrito = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTfCustomerId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnCreateOrder = new javax.swing.JButton();
<<<<<<< HEAD
=======
        Imprimir = new javax.swing.JButton();
>>>>>>> funcionalidad-impresion

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        jBtnAddCart.setText("> > ");
        jBtnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddCartActionPerformed(evt);
            }
        });

        jTableCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableCarrito);

        jLabel1.setText("CustomerID");

        jLabel2.setText("Shopping cart");

        jLabel3.setText("Fecha");

        jBtnCreateOrder.setText("Create Invoice");
        jBtnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateOrderActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

>>>>>>> funcionalidad-impresion
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTfCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnAddCart))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCreateOrder))))
                .addContainerGap(65, Short.MAX_VALUE))
=======
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCreateOrder)
                .addGap(47, 47, 47)
                .addComponent(Imprimir)
                .addGap(277, 277, 277))
>>>>>>> funcionalidad-impresion
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jBtnAddCart)))
<<<<<<< HEAD
                .addGap(30, 30, 30)
                .addComponent(jBtnCreateOrder)
                .addContainerGap(384, Short.MAX_VALUE))
=======
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCreateOrder)
                    .addComponent(Imprimir))
                .addContainerGap(381, Short.MAX_VALUE))
>>>>>>> funcionalidad-impresion
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addGap(0, 12, Short.MAX_VALUE))
=======
                .addGap(0, 0, Short.MAX_VALUE))
>>>>>>> funcionalidad-impresion
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        /*El usuario hace clic en una fila de la tabla de productos.
            El programa detecta el clic y obtiene los datos de esa fila.
            Los datos se copian a la tabla del carrito de compras.*/
        

        
    }//GEN-LAST:event_jTableProductosMouseClicked

    private void jBtnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddCartActionPerformed
        
        agregarAlCarrito();
        
       
    }//GEN-LAST:event_jBtnAddCartActionPerformed
<<<<<<< HEAD

    // BOTON CREAR FACTURA
    private void jBtnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateOrderActionPerformed
        
        String customerId = jTfCustomerId.getText();
=======
    
     String customerId ;
     
     public String getcustomerId(){
         return this.customerId;
     }
     
    // BOTON CREAR FACTURA
    private void jBtnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateOrderActionPerformed
        
        customerId = jTfCustomerId.getText();
>>>>>>> funcionalidad-impresion

        
        // Validar si el cliente existe en base de datos, para hacer el pedido
        String consulta = "SELECT * from Customer WHERE CustomerId = ?";
        
               
        try(Connection con = ConexionBd.getConnection();
                
                PreparedStatement ps = con.prepareStatement(consulta);
                
               ) {
            

     
             if(!customerId.trim().isEmpty() && customerId != null){
                 
                 
                             int customIdInt = Integer.parseInt(customerId);
                 
                            ps.setInt(1, customIdInt);
                            ResultSet rs = ps.executeQuery();
            
            
                            if (rs.next()  ) {  // SI EXISTE EL CLIENTE GENERAMOS LA FACTURA
                
                            
                           double total = calcularTotal();
                      
                           invoiceService service = new invoiceService();  // INSTANCIA INVOICE SERVICE

                           service.createInvoice(customIdInt, total);
                           
                           
                           
                            // INSERTAR DETALLE EN LA TABLA InvoiceProduct Y DESCONTAR LAS CANTIDADES AL INVENTARIO
                           
                           String query1 = "INSERT INTO InvoiceProduct (InvoiceId,ProductId,Quantity,Price,ProductName) VALUES (?,?,?,?,?)";
                           
                           PreparedStatement psInvoiceProduct = con.prepareStatement(query1);
                           
                           DefaultTableModel modelCarrito = (DefaultTableModel)jTableCarrito.getModel();
                           
                           int row = modelCarrito.getRowCount(); // Obtenemos la cantidad de filas de la tabla carrito
                           
                           psInvoiceProduct.setInt(1, service.getfacturaid());
                           
                                System.out.println("llego hasta aqui");
                                
                            // Instancia de invoice service para traer el valor de bandera
                                 invoiceService invoice = new invoiceService();
                                
                           for(int i = 0 ; i < row ; i++){
                               
                               // ITERAR SOBRE LAS FILAS CARRITO
                               int productId = Integer.parseInt(jTableCarrito.getValueAt(i, 0).toString());
                               int quantity = Integer.parseInt(jTableCarrito.getValueAt(i, 3).toString());
                               String productName = String.valueOf(jTableCarrito.getValueAt(i, 1));
                               Double price = Double.parseDouble(jTableCarrito.getValueAt(i, 2).toString());
                               Double total1 = quantity * price;
                               
                               // ESTABLECER PARAMETROS SOBRE LA CONSULTA SQL
                               psInvoiceProduct.setInt(2, productId);
                               psInvoiceProduct.setInt(3, quantity);
                               psInvoiceProduct.setDouble(4, total1);
                               psInvoiceProduct.setString(5, productName);
                         
                            
                               
                               int filasAfectadas = psInvoiceProduct.executeUpdate();
                               
                    
                               
                              
                                 
                               if(filasAfectadas > 0){
                                   System.out.println("Datos ingresados con exito");
                                   
                                   // TRAER LOS PRODUCT ID DE LAS FILAS DE CARRITO PARA DESCONTAR EN PRODUCT
                                 // DESCONTAR INVENTARIO
                                  String queryDescontarQty = "UPDATE Product set Qty = ? WHERE ProductId = ?";
                                  
                                  // query validar cantidades para restarle las pedidas en carrito
                                  String queryQtyInventario = "SELECT Qty FROM Product WHERE ProductId = ?";
                                  PreparedStatement psQtyInventario = con.prepareStatement(queryQtyInventario);
                                  psQtyInventario.setInt(1, productId);
                                  ResultSet rsQtyInventario = psQtyInventario.executeQuery();
                                  int QtyInventario = 0;
                                   if(rsQtyInventario.next()){
                                       QtyInventario = rsQtyInventario.getInt("Qty");
                                   }
                                  
                                  
                                  PreparedStatement psDescontarQty = con.prepareStatement(queryDescontarQty);
                                  
                                  psDescontarQty.setInt(1, QtyInventario-quantity);// pasar la cantidad del inventario para restarle y quede la diferencia
                                  psDescontarQty.setInt(2, productId);
                               
                              int filasAfectadasInventario = psDescontarQty.executeUpdate();
                              if(filasAfectadasInventario > 0){
                                  System.out.println("Se desconto del inventario Correctamente");
                              } else{
                                  System.out.println("Ninguna fila fue afectada en inventario");
                              }
                              
                               } else{
                                   System.out.println("Ninguna fila fue afectada");
                               }
                               
                               
                           }
                           
                        
                           
                          
                           
              
            } else{
                JOptionPane.showMessageDialog(null, "No existe el cliente ");
            }
             } else{
                 JOptionPane.showMessageDialog(null, "idCustomer no existe ");
             }
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "error desde order "+e);
        }
        
        
        
       
        
        

        

        
    }//GEN-LAST:event_jBtnCreateOrderActionPerformed

<<<<<<< HEAD
=======
    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        FormatPrinter formatPrinter = new  FormatPrinter(this);
       
       
        try {
            PrinterJob printer = PrinterJob.getPrinterJob();
            printer.setPrintable(formatPrinter);
            
            boolean cuadroDialogoImprimir = printer.printDialog(); // SI se da en el boton imprimir da verdadero, si cancel falso
            
            if(cuadroDialogoImprimir){
                printer.print();
            }
            
            
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "error desde metodo Imprimir en order clase"+e);
        }
        
    }//GEN-LAST:event_ImprimirActionPerformed

>>>>>>> funcionalidad-impresion

    
        public double  calcularTotal(){
        
        DefaultTableModel modelCarrito = (DefaultTableModel)jTableCarrito.getModel();
        Double total = 0.0;
        
        int cantidadFilas = modelCarrito.getRowCount();
        
        for(int i = 0; i < cantidadFilas; i++){
            
            Object precioObject = modelCarrito.getValueAt(i, 2); // Iterar sobre todas las filas y la columna Precio 
            int cantidadCarrito = (int) modelCarrito.getValueAt(i, 3); // Iterar sobre todas las filas y la columna Cantidad
            
              if(precioObject instanceof Number){
                  
                  double precio = ((Number) precioObject).doubleValue(); // Guardamos el valor precio de cada fila en una nueva variable de tipo double
                  System.out.println(cantidadCarrito);
                  double Precioqty =precio * cantidadCarrito; 
                  
                  // MULTIPLICAR POR CANTIDAD DE PRODUCTOS FILA 4 EN LA TABLA CARRITO
                  
                  total += Precioqty;
                  System.out.println(total);
                  
                  
              }else if(precioObject instanceof String){
                  System.out.println("es string");
                  double precio = Double.parseDouble((String)precioObject);
                  total += precio;
              }
        }
        
      return total;
        
    }
    
    public void agregarAlCarrito(){
        
        int fila = jTableProductos.getSelectedRow(); // OBTENEMOS LA FILA QUE SELECCIONEMOS
        
        if(fila >= 0){
                    
            TableModel modeloproductos = jTableProductos.getModel();
            DefaultTableModel modeloCarrito = (DefaultTableModel) jTableCarrito.getModel();

                    

            Object productId = jTableProductos.getValueAt(fila, 0);
            Object productName = jTableProductos.getValueAt(fila, 1);
            Object price = jTableProductos.getValueAt(fila, 2);
            Object qty = jTableProductos.getValueAt(fila, 3);
            

              // Verificamos la cantidad del producto antes de agregarlo al carrito


              int cantidadSolicitada = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad requerida: "));


               // Consulta para verificar el inventario del producto

               String queryProduct = "SELECT * from Product where ProductId = ?";

                try(Connection con = ConexionBd.getConnection()) {   

                    PreparedStatement ps = con.prepareStatement(queryProduct);

                    // PRIMERO SE PREPARA LA CONSULTA Y DESPUES SE EJECUTA CON RESULTSET

                    ps.setObject(1, productId);


                    ResultSet rst = ps.executeQuery();

                    
                    if(rst.next()){

                        int cantidadDisponible = rst.getInt("Qty");

                        // COMPARAMOS LA CANTIDAD DISPONIBLE CON LA INGRESADA POR EL USUARIO

                        if(cantidadSolicitada > 0 && cantidadSolicitada <= cantidadDisponible){

                            modeloCarrito.addRow(new Object[]{productId,productName,price,cantidadSolicitada});  //ANIADIMOS LA FILA DEL PRODUCTO CON LAS CANTIDADES SOLICITADAS
                            


                        } else{
                            JOptionPane.showMessageDialog(null, "cantidad no disponible");
                        }
                    }

                } catch (Exception e) {


                }




//            Object[] filaProductos = new Object [modeloproductos.getColumnCount()];
//
//
//            for(int i = 0; i < modeloproductos.getColumnCount();i++){
//
//                filaProductos[i] = modeloproductos.getValueAt(fila, i);
//
//
//            }
//
//            modeloCarrito.addRow(filaProductos);
        
        
        }
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
=======
    private javax.swing.JButton Imprimir;
>>>>>>> funcionalidad-impresion
    private javax.swing.JButton jBtnAddCart;
    private javax.swing.JButton jBtnCreateOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCarrito;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTfCustomerId;
    // End of variables declaration//GEN-END:variables
}
