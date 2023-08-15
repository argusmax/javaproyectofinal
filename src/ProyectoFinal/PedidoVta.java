package ProyectoFinal;

import static ProyectoFinal.principal.listaClientes;
import static ProyectoFinal.principal.matrizclientes;
import static ProyectoFinal.principal.invMercaderias;
import static ProyectoFinal.principal.matrizproductos;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PedidoVta extends javax.swing.JInternalFrame {
        
    float totpedido = 0;
        
    DecimalFormat df = new DecimalFormat( "#,##0.00");
    
    DefaultTableModel modeldetallvta = new DefaultTableModel();
    
    
    public PedidoVta() {
        
        initComponents();
        cargarcombo();
        cargarmercaderia();

        jlbl_nrototal.setText(df.format(totpedido));
        
        cargadetallvta();
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbx_clientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_facturar = new javax.swing.JTable();
        jbtn_agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_detallevta = new javax.swing.JTable();
        jspn_venta = new javax.swing.JSpinner();
        jbtn_eliminar = new javax.swing.JButton();
        jlbl_invMerc = new javax.swing.JLabel();
        jlbl_spinner = new javax.swing.JLabel();
        jlbl_detalldvta = new javax.swing.JLabel();
        jlbl_totpedido = new javax.swing.JLabel();
        jlbl_nrototal = new javax.swing.JLabel();
        jbtn_guardarpedido = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Pedido de Venta");
        setPreferredSize(new java.awt.Dimension(1296, 788));

        cbx_clientes.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cbx_clientes.setToolTipText("");

        jtbl_facturar.setAutoCreateRowSorter(true);
        jtbl_facturar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_facturar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_facturar.setFocusable(false);
        jtbl_facturar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbl_facturar);

        jbtn_agregar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbtn_agregar.setText(">>> Agregar");
        jbtn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarActionPerformed(evt);
            }
        });

        jtbl_detallevta = new javax.swing.JTable(){
            public boolean isCellEditable(int filaindice, int columnindice){
                return false;
            }
        };
        jtbl_detallevta.setAutoCreateRowSorter(true);
        jtbl_detallevta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_detallevta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_detallevta.setFocusable(false);
        jtbl_detallevta.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtbl_detallevta);

        jspn_venta.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jspn_venta.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jbtn_eliminar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbtn_eliminar.setText("Eliminar Item <<");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jlbl_invMerc.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jlbl_invMerc.setText("Inventario de mercaderias: seleccione de a un Ítem por vez");

        jlbl_spinner.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jlbl_spinner.setText("Fijar cantidad de unidades");

        jlbl_detalldvta.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jlbl_detalldvta.setText("Detalle Pedido de Venta");

        jlbl_totpedido.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jlbl_totpedido.setForeground(new java.awt.Color(0, 0, 255));
        jlbl_totpedido.setText("Monto total $");

        jlbl_nrototal.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jlbl_nrototal.setForeground(new java.awt.Color(0, 0, 255));

        jbtn_guardarpedido.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbtn_guardarpedido.setText("GUARDAR PEDIDO");
        jbtn_guardarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarpedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(cbx_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jlbl_spinner))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jspn_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbl_totpedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn_guardarpedido)
                                    .addComponent(jlbl_nrototal, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbl_invMerc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbl_detalldvta)
                        .addGap(60, 60, 60)
                        .addComponent(jbtn_eliminar)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jlbl_spinner)
                        .addGap(13, 13, 13)
                        .addComponent(jspn_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_agregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(cbx_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbl_invMerc)
                            .addComponent(jlbl_detalldvta)
                            .addComponent(jbtn_eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_totpedido)
                    .addComponent(jlbl_nrototal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtn_guardarpedido)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void jbtn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarActionPerformed
                                      
        int spincant = (int) jspn_venta.getValue();
            
        if (jtbl_facturar.getSelectedRow() !=-1 && spincant > 0 && cbx_clientes.getSelectedIndex() != 0){                    
            
        int seleccionfila = jtbl_facturar.getSelectedRow();
                        
            if (Integer.parseInt(jtbl_facturar.getValueAt(jtbl_facturar.getSelectedRow(), 3).toString()) < spincant) {

                JOptionPane.showMessageDialog(this,"Supera la cantidad al stock disponible.\nPor favor ajustar la cantidad de unidades.\n\nGracias.");
                return;

            }
            
            
            float preciounit = Float.parseFloat(jtbl_facturar.getValueAt(jtbl_facturar.getSelectedRow(), 2).toString());
                                                
            totpedido = totpedido + (preciounit * spincant);
                        
            jlbl_nrototal.setText(df.format(totpedido));

            
            String info [] = new String [4];
            info[0] = jtbl_facturar.getValueAt(seleccionfila,0).toString();
            info[1] = jtbl_facturar.getValueAt(seleccionfila,1).toString();
            info[2] = jtbl_facturar.getValueAt(seleccionfila,2).toString();
            info[3] = jspn_venta.getValue().toString();

            modeldetallvta.addRow(info);
                        
            jtbl_facturar.setValueAt(Integer.parseInt(jtbl_facturar.getValueAt(seleccionfila, 3).toString()) - spincant, seleccionfila, 3); // FUNCIONA MODIFICAR DATO DEL MOMENTO EN TABLA
            
        
        } else {
        
            JOptionPane.showMessageDialog(this,"Por favor, seleccione:\n\n * Un cliente.\n\n* Al menos un item del stock.\n\n* La cantidad de unidades debe ser mayor de 0. Gracias.",
                    "                                                  INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        
        }
                
        jspn_venta.setValue(0);
                  
    }//GEN-LAST:event_jbtn_agregarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        
        if (jtbl_detallevta.getSelectedRow() !=-1){
            
            String codigodvta = jtbl_detallevta.getValueAt(jtbl_detallevta.getSelectedRow(), 0).toString();
                                    
            String vtacant = jtbl_detallevta.getValueAt(jtbl_detallevta.getSelectedRow(), 3).toString();
            
            float subtot = Float.parseFloat(jtbl_detallevta.getValueAt(jtbl_detallevta.getSelectedRow(), 3).toString())*Float.parseFloat(jtbl_detallevta.getValueAt(jtbl_detallevta.getSelectedRow(), 2).toString());
                        
            for (int i = 0; i < jtbl_facturar.getRowCount(); i++){
                
                if (jtbl_facturar.getValueAt(i, 0).toString().equals(codigodvta)){
            
                    //jtbl_facturar.setValueAt((Integer.parseInt(jtbl_facturar.getValueAt(i, 3).toString())) + vtacant, (int) jtbl_facturar.getValueAt(i, 3), 3);
                    
                    //jtbl_facturar.setValueAt(Integer.parseInt(jtbl_facturar.getValueAt(i, 3).toString()) + vtacant, i, 3); //funciona pero suma como string
                    
                    jtbl_facturar.setValueAt((int)jtbl_facturar.getValueAt(i, 3) + Integer.parseInt (vtacant), i, 3); // FUNCIONA FINAL                                        
                    
                }
            
            }
                        
            totpedido = totpedido - subtot;
            
            jlbl_nrototal.setText(df.format(totpedido));
            
            modeldetallvta.removeRow(jtbl_detallevta.getSelectedRow());
                        
        }
                
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jbtn_guardarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarpedidoActionPerformed
        
        if (jtbl_detallevta.getRowCount() == 0){
                                    
        } else {

             for (int i = 0; i < jtbl_detallevta.getRowCount() ; i++){
                                  
                for (int j = 0; j < invMercaderias.size(); j++){ 
                    
                    if (invMercaderias.get(j).getCodigo().equals(jtbl_facturar.getValueAt(i, 0).toString())){
                        
                        invMercaderias.get(i).setCantidad(String.valueOf(Integer.parseInt(invMercaderias.get(i).getCantidad())- Integer.parseInt(jtbl_detallevta.getValueAt(i, 3).toString()))); 

                    }

                }

            }
             
             JOptionPane.showMessageDialog(this, "Se ha generado el pedido exitosamente.\n\nEl stock ha sido actualizado.","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
             
            jspn_venta.setValue(0);
            
            cargadetallvta();
        }
                
    }//GEN-LAST:event_jbtn_guardarpedidoActionPerformed

    
    public void cargarcombo (){
    
        String veclientes [] = new String [listaClientes.size()];
        
        for (int i = 0; i < listaClientes.size(); i++ ){
        
            veclientes [i] = matrizclientes[i][0];
        
        }
        
        
        for (int j = 0; j < veclientes.length; j++) {
            
            for (int k = 0; k < veclientes.length && j != k; k++){
            
                if (veclientes[j].compareToIgnoreCase(veclientes[k]) < 0){
                
                    String  aux = veclientes[j];
                    veclientes[j] = veclientes[k];
                    veclientes[k] = aux;
                
                }            
            }       
        }
        
        cbx_clientes.addItem("Por favor seleccione un cliente...");
                
        for (int m = 0; m < listaClientes.size(); m++) {
        
            cbx_clientes.addItem(veclientes[m]);
        
        }
                           
    }
    
    
    public void cargadetallvta (){
    
        modeldetallvta = new DefaultTableModel();                  
        modeldetallvta.addColumn("CODIGO");
        modeldetallvta.addColumn("DESCRIPCION");
        modeldetallvta.addColumn("PRECIO");
        modeldetallvta.addColumn("CANTIDAD");                                
        jtbl_detallevta.setModel(modeldetallvta);    
        
    }
    
    
    public void cargarmercaderia (){
    
    matrizproductos = new String [invMercaderias.size()][4];
        
        for (int j = 0; j < invMercaderias.size(); j++) {
            
            matrizproductos[j][0] = invMercaderias.get(j).getCodigo();
            matrizproductos[j][1] = invMercaderias.get(j).getDescripcion();
            matrizproductos[j][2] = invMercaderias.get(j).getPrecio();
            matrizproductos[j][3] = invMercaderias.get(j).getCantidad();

        }
        
        jtbl_facturar.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jtbl_facturar.setModel(new javax.swing.table.DefaultTableModel(
                                        
            matrizproductos,    

                
            new String [] {"CODIGO", "DESCRIPCION", "PRECIO", "STOCK"}){
            
                @Override
                public boolean isCellEditable(int filastock, int columnastock){

                return (false);

                }
            
            });
                                                   
    }
    
              
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_clientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_agregar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_guardarpedido;
    private javax.swing.JLabel jlbl_detalldvta;
    private javax.swing.JLabel jlbl_invMerc;
    private javax.swing.JLabel jlbl_nrototal;
    private javax.swing.JLabel jlbl_spinner;
    private javax.swing.JLabel jlbl_totpedido;
    private javax.swing.JSpinner jspn_venta;
    private javax.swing.JTable jtbl_detallevta;
    private javax.swing.JTable jtbl_facturar;
    // End of variables declaration//GEN-END:variables
}
