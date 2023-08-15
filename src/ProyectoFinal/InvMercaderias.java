package ProyectoFinal;

import static ProyectoFinal.principal.invMercaderias;
import static ProyectoFinal.principal.matrizproductos;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class InvMercaderias extends javax.swing.JInternalFrame {

    public InvMercaderias() {
        initComponents();
        cargarmercaderia();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jspn_unidades = new javax.swing.JSpinner();
        jtxtf_codigo = new javax.swing.JTextField();
        jtxtf_descripcion = new javax.swing.JTextField();
        jbtn_cargarmerc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_invmerc = new javax.swing.JTable();
        jtxtf_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtn_elimprod = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Inventario Mercaderias");
        setPreferredSize(new java.awt.Dimension(1296, 788));
        setVisible(false);

        jPanel2.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel1.setText("CODIGO");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setText("DESCRIPCION");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setText("Unidades");

        jspn_unidades.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jspn_unidades.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jspn_unidades.setToolTipText("");
        jspn_unidades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jspn_unidades.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspn_unidadesStateChanged(evt);
            }
        });
        jspn_unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jspn_unidadesKeyTyped(evt);
            }
        });

        jtxtf_codigo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_codigoKeyTyped(evt);
            }
        });

        jtxtf_descripcion.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_descripcionKeyTyped(evt);
            }
        });

        jbtn_cargarmerc.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbtn_cargarmerc.setText("GUARDAR");
        jbtn_cargarmerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cargarmercActionPerformed(evt);
            }
        });

        jtbl_invmerc.setAutoCreateRowSorter(true);
        jtbl_invmerc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_invmerc.setModel(jtbl_invmerc.getModel());
        jtbl_invmerc.setRowHeight(22);
        jtbl_invmerc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbl_invmerc.getTableHeader().setReorderingAllowed(false);
        jtbl_invmerc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_invmercMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_invmerc);

        jtxtf_precio.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtf_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtf_precioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_precioKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setText("Precio $");

        jbtn_elimprod.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbtn_elimprod.setText("ELIMINAR PRODUCTO SELECCIONADO");
        jbtn_elimprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_elimprodActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setText("* Doble clic sobre un producto seleccionado permite editar su información.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2)
                        .addGap(216, 216, 216)
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_elimprod))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtxtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jspn_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_cargarmerc))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspn_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_cargarmerc)
                    .addComponent(jtxtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_elimprod)
                    .addComponent(jLabel5))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

    
    private void jbtn_cargarmercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cargarmercActionPerformed
                        
        try {

            int codigo = Integer.parseInt(jtxtf_codigo.getText());
            
            String verifcod = String.valueOf(codigo);
            
            if (0 == invMercaderias.size()) {
                                            
            } else {
            
                for (int i = 0; i < invMercaderias.size(); i++){
                                        
                        if (matrizproductos[i][0].equals(verifcod)){
                            
                            JOptionPane.showMessageDialog(this,"El código ya existe para el producto: "+ matrizproductos[i][1] );

                            return;

                    }
                
                }            
            
            }
                                    
                if (codigo > 32767 || codigo < 1 ) {

                    JOptionPane.showMessageDialog(this, "Por favor ingresar un CODIGO valido; menor o igual a 32767.\n\nGracias", " "
                            + "                                         ***     CODIGO     ***", JOptionPane.INFORMATION_MESSAGE);
                    jtxtf_codigo.grabFocus();
                    return;

                }
            
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Por favor ingresar un codigo valido, menor o igual a 32767.\n\nGracias", ""
                    + "                                         ***     CODIGO     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_codigo.grabFocus();
            return;
            
        }
        
        
        String descripcion = jtxtf_descripcion.getText();
        if("".equals(descripcion) || jtxtf_descripcion.getText().startsWith(" ") ) {
            
            JOptionPane.showMessageDialog(this, "Por favor, el campo descripcion no puede estar vacio o iniciar con espacio/s", "                                  "
                    + "                 ***     DESCRIPCION     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_descripcion.grabFocus();
            return;
            
        }
        
               
        String precio = jtxtf_precio.getText();
        
        if ("".equals(precio)){
                
            JOptionPane.showMessageDialog(this, "Por favor ingresar un monto válido.\nEl campo precio no puede estar vacio o iniciar con espacio/s.\n\nGracias", "                                  ***     PRECIO     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_precio.grabFocus();
            return;

        }
        
                  
        if ((int) jspn_unidades.getValue() == 0){
        
           JOptionPane.showMessageDialog(this, "Por favor la cantidad de unidades no puede ser 0.\n\nGracias","INFORMACION", JOptionPane.INFORMATION_MESSAGE);            
           jspn_unidades.grabFocus();
           
           return;
                       
        }    
        
                   
        Producto producto = new Producto (jtxtf_codigo.getText(),jtxtf_descripcion.getText(),jtxtf_precio.getText(),jspn_unidades.getValue().toString());
                
        invMercaderias.add(producto);
        
        Collections.sort(invMercaderias);
        
        cargarmercaderia ();
        
        jtxtf_codigo.setText("");
        jtxtf_descripcion.setText("");
        jtxtf_precio.setText("");
        jspn_unidades.setValue(0);
                             
    }//GEN-LAST:event_jbtn_cargarmercActionPerformed

    
    public void cargarmercaderia (){
    
        matrizproductos = new String [invMercaderias.size()][4];
        
        for (int j = 0; j < invMercaderias.size(); j++) {
            
            matrizproductos[j][0] = invMercaderias.get(j).getCodigo();
            matrizproductos[j][1] = invMercaderias.get(j).getDescripcion();
            matrizproductos[j][2] = invMercaderias.get(j).getPrecio();           
            matrizproductos[j][3] = invMercaderias.get(j).getCantidad();
                                                                        
        }

        jtbl_invmerc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_invmerc.setModel(new javax.swing.table.DefaultTableModel(
                
            matrizproductos,    
       
            new String [] {"CODIGO", "DESCRIPCION", "PRECIO", "STOCK"}){
            
            
            @Override
            public boolean isCellEditable(int filainventario, int columnainventario){
            
                return (false);
                
            }
            
            });
        
                                
    }
    
            
    private void jtxtf_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_codigoKeyTyped
            
        char checkposicion = evt.getKeyChar(); 
                                                                
            Pattern pt = Pattern.compile("^([0-9]*)$");
            Matcher mt = pt.matcher(Character.toString(checkposicion));

            boolean matchFound = mt.find();

            if(!matchFound && checkposicion != KeyEvent.VK_BACK_SPACE) {

               evt.consume();
               JOptionPane.showMessageDialog(this,"Por favor ingresar solo números sin espacios.\nGracias.",
                       "                                                  Atención",JOptionPane.INFORMATION_MESSAGE);
               
            }
        
    }//GEN-LAST:event_jtxtf_codigoKeyTyped

    
    private void jspn_unidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jspn_unidadesKeyTyped
        
        char checkposicion = evt.getKeyChar(); 
        
        if (!Character.isDigit(checkposicion)) {
        
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor ingresar solo números sin espacios.\nGracias.",
                    "                                                  Atención",JOptionPane.INFORMATION_MESSAGE);            
        }
   
    }//GEN-LAST:event_jspn_unidadesKeyTyped

    
 
    private void jspn_unidadesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspn_unidadesStateChanged
                
    }//GEN-LAST:event_jspn_unidadesStateChanged

    private void jtxtf_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_descripcionKeyTyped
        
        char checkposicion = evt.getKeyChar();

        if (Character.isLetter(checkposicion) || (checkposicion == KeyEvent.VK_SPACE) || (checkposicion == KeyEvent.VK_BACK_SPACE) || (Character.isLowerCase(evt.getKeyChar()))) {
            
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
            
        }
        
    }//GEN-LAST:event_jtxtf_descripcionKeyTyped

    private void jtxtf_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_precioKeyTyped
                
            char checkposicion = evt.getKeyChar(); 
                                                               
            Pattern pt = Pattern.compile("^([0-9\\.]*)$"); 
            Matcher mt = pt.matcher(Character.toString(checkposicion));

            boolean matchFound = mt.find();

            if(!matchFound && checkposicion != KeyEvent.VK_BACK_SPACE) {

               evt.consume();
               JOptionPane.showMessageDialog(this,"Por favor no ingresar letras ni espacios\n\nSe permite el punto decimal.","Atención",JOptionPane.INFORMATION_MESSAGE);

            }
                       
    }//GEN-LAST:event_jtxtf_precioKeyTyped

    
    private void jtbl_invmercMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_invmercMouseClicked
        
        if (evt.getClickCount()==2){
        
            jtxtf_codigo.setText(jtbl_invmerc.getValueAt(jtbl_invmerc.getSelectedRow(), 0).toString());
            jtxtf_descripcion.setText(jtbl_invmerc.getValueAt(jtbl_invmerc.getSelectedRow(), 1).toString());
            jtxtf_precio.setText(jtbl_invmerc.getValueAt(jtbl_invmerc.getSelectedRow(), 2).toString());
            jspn_unidades.setValue(Integer.parseInt(jtbl_invmerc.getValueAt(jtbl_invmerc.getSelectedRow(), 3).toString()));
                      
            invMercaderias.remove(jtbl_invmerc.getSelectedRow());
            
            cargarmercaderia();
        }
        
    }//GEN-LAST:event_jtbl_invmercMouseClicked

    private void jbtn_elimprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_elimprodActionPerformed
        
        if (jtbl_invmerc.getRowCount() == 0){
        
        } else if (jtbl_invmerc.getSelectedRow() != -1) {
        
            int m = JOptionPane.showConfirmDialog(this, "Confirma eliminar la fila seleccionada?","¡¡¡AVISO!!!",JOptionPane.YES_NO_OPTION);

                if (m == 0){

                invMercaderias.remove(jtbl_invmerc.getSelectedRow());

                cargarmercaderia();

                }
                
        }
        
    }//GEN-LAST:event_jbtn_elimprodActionPerformed

    
    private void jtxtf_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_precioKeyReleased
        
    }//GEN-LAST:event_jtxtf_precioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_cargarmerc;
    private javax.swing.JButton jbtn_elimprod;
    private javax.swing.JSpinner jspn_unidades;
    private javax.swing.JTable jtbl_invmerc;
    private javax.swing.JTextField jtxtf_codigo;
    private javax.swing.JTextField jtxtf_descripcion;
    private javax.swing.JTextField jtxtf_precio;
    // End of variables declaration//GEN-END:variables
}
