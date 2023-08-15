package ProyectoFinal;

import static ProyectoFinal.principal.listaClientes;
import static ProyectoFinal.principal.matrizclientes;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AltaCliente extends javax.swing.JInternalFrame {
    
    public AltaCliente() {
        
        initComponents();
        cargarcliente();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtf_apellynom = new javax.swing.JTextField();
        jtxtf_dni = new javax.swing.JTextField();
        jtxtf_fchnac = new javax.swing.JTextField();
        jtxtf_telef = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtf_mail = new javax.swing.JTextField();
        jtxtf_domi = new javax.swing.JTextField();
        jtxtf_prov = new javax.swing.JTextField();
        jtxtf_local = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl = new javax.swing.JTable();
        jbtnCargar = new javax.swing.JButton();
        jbtn_eliminareg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("Alta Clientes");
        setMaximumSize(new java.awt.Dimension(1296, 788));
        setPreferredSize(new java.awt.Dimension(1296, 788));

        jPanel1.setPreferredSize(new java.awt.Dimension(1296, 788));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APELLIDO y NOMBRE");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FCH. NACIMIENTO");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TELÉFONO");

        jtxtf_apellynom.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_apellynom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_apellynomKeyTyped(evt);
            }
        });

        jtxtf_dni.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jtxtf_fchnac.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_fchnac.setText("...ej. 02/06/1982");

        jtxtf_telef.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_telef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_telefKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jtxtf_apellynom, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtf_fchnac, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtf_telef, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtf_apellynom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_fchnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_telef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DOMICILIO");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PROVINCIA");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LOCALIDAD");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MAIL");

        jtxtf_mail.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_mailKeyTyped(evt);
            }
        });

        jtxtf_domi.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_domi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_domiActionPerformed(evt);
            }
        });
        jtxtf_domi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_domiKeyTyped(evt);
            }
        });

        jtxtf_prov.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_provKeyTyped(evt);
            }
        });

        jtxtf_local.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jtxtf_local.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtf_localKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jtxtf_domi, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtf_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtf_local, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtf_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtf_domi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_mail)))
        );

        jtbl = new javax.swing.JTable(){
            public boolean isCellEditable (int filaindica, int columnaindica){

                return false;
            }
        };
        jtbl.setAutoCreateRowSorter(true);
        jtbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl.setModel(jtbl.getModel());
        jtbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtbl.setFocusable(false);
        jtbl.setRowHeight(22);
        jtbl.getTableHeader().setReorderingAllowed(false);
        jtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbl);

        jbtnCargar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbtnCargar.setText("GUARDAR REGISTRO");
        jbtnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCargarMouseClicked(evt);
            }
        });
        jbtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCargarActionPerformed(evt);
            }
        });

        jbtn_eliminareg.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbtn_eliminareg.setText("ELIMINAR REGISTRO SELECCIONADO");
        jbtn_eliminareg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_eliminaregMouseClicked(evt);
            }
        });
        jbtn_eliminareg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminaregActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setText("* Doble clic sobre un cliente seleccionado permite editar su información.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1378, 1378, 1378))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCargar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(419, 419, 419)
                                .addComponent(jbtn_eliminareg))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_eliminareg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCargarActionPerformed
         
        String apellido = jtxtf_apellynom.getText();
        
        if ("".equals(apellido) || jtxtf_apellynom.getText().startsWith(" ")){
        
            JOptionPane.showMessageDialog(this, "Por favor, el campo no puede estar vacio o inciar con espacio/s", "                                  ***     APELLIDO     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_apellynom.grabFocus();
            return;

        }

        
        try {

            int dni = Integer.parseInt(jtxtf_dni.getText());
            
            String sdni = jtxtf_dni.getText();
                       
            if (0 == listaClientes.size()) {
                                            
            } else {
            
                for (int i = 0; i < listaClientes.size(); i++){
                                        
                        if (matrizclientes[i][1].equals(sdni)){
                            
                            JOptionPane.showMessageDialog(this,"El DNI ya existe para: "+ matrizclientes[i][0] );
                            
                            jtxtf_dni.grabFocus();

                            return;
                                            
                    }
                
                }            
            
            }            
            
                        
            if (dni > 99999999 || dni < 1000000) {

                JOptionPane.showMessageDialog(this, "Por favor ingresar un DNI valido; 7 u 8 dígitos", "                                  ***     DNI     ***", JOptionPane.INFORMATION_MESSAGE);
                jtxtf_dni.grabFocus();
                return;

            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Por favor ingresar numeros enteros positvos sin espacios. 8 dígitos", "                                  ***     DNI     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_dni.grabFocus();
            return;
        }

        
        try {

            String fechanac = jtxtf_fchnac.getText();         
            Date fechain = new SimpleDateFormat("dd/MM/yyyy").parse(fechanac);
            String fechaout = new SimpleDateFormat("dd/MM/yyyy").format(fechain);
            Calendar calendar = GregorianCalendar.getInstance();
            
            
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 18);
                                                        
            if (((calendar.getTime().after(fechain)) == true) && (fechanac.equals(fechaout))) {
                       
            } else {
            
                JOptionPane.showMessageDialog(this,"La fecha debe ser válida y la edad mayor de 18\n Formato: dd/mm/aaaa", "        *** ATENCION ***",JOptionPane.INFORMATION_MESSAGE);
                jtxtf_fchnac.grabFocus();
                return;
            }
                        
        } catch (ParseException e) {
            
            JOptionPane.showMessageDialog(this, "La fecha debe ser válida y la edad mayor de 18\n Formato: dd/mm/aaaa");
            jtxtf_fchnac.grabFocus();
            return;

        }

        
        String telefono = jtxtf_telef.getText();
        if ("".equals(telefono)) {

            JOptionPane.showMessageDialog(this, "Por favor, el campo no puede estar vacio", "                                  ***     TELEFONO     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_telef.grabFocus();
            return;

        }
        
        
        String domicilio = jtxtf_domi.getText();
        if ("".equals(domicilio) || domicilio.startsWith(" ")) {

            JOptionPane.showMessageDialog(this, "Por favor, el campo no puede estar vacio o inciar con espacio/s", "                                  ***     DOMICILIO     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_domi.grabFocus();
            return;

        }
        
        
        String provincia = jtxtf_prov.getText();
        if ("".equals(provincia) || jtxtf_prov.getText().startsWith(" ")) {

            JOptionPane.showMessageDialog(this, "Por favor, el campo no puede estar vacio o iniciar con espacio/s", "                                  ***     PROVINCIA     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_prov.grabFocus();
            return;

        }
        
               
        String localidad = jtxtf_local.getText();
        if("".equals(localidad) || jtxtf_local.getText().startsWith(" ") ) {
            
            JOptionPane.showMessageDialog(this, "Por favor, el campo no puede estar vacio o iniciar con espacio/s", "                                  ***     LOCALIDAD     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_local.grabFocus();
            return;
            
        }
        
        
        String mail = jtxtf_mail.getText();
        if (esCorreo(jtxtf_mail.getText())== false || ("".equals(mail)) || jtxtf_mail.getText().startsWith(" ")) {
            
            JOptionPane.showMessageDialog(this, "Por favor, ingresar un mail válido\n El campo no puede estar vacio o iniciar con espacio/s", "                                  ***     MAIL     ***", JOptionPane.INFORMATION_MESSAGE);
            jtxtf_mail.grabFocus();
            return;
            
        } else {
                                           
        }
        
                
        Cliente cliente = new Cliente(jtxtf_apellynom.getText(),jtxtf_dni.getText(),jtxtf_fchnac.getText(),jtxtf_telef.getText(),
                                      jtxtf_domi.getText(),jtxtf_prov.getText(),jtxtf_local.getText(),jtxtf_mail.getText());
        
        listaClientes.add(cliente);
        
        Collections.sort(listaClientes);
        
        cargarcliente();
        
        jtxtf_apellynom.setText("");
        jtxtf_dni.setText("");
        jtxtf_domi.setText("");
        jtxtf_fchnac.setText("");
        jtxtf_local.setText("");
        jtxtf_mail.setText("");
        jtxtf_prov.setText("");
        jtxtf_telef.setText("");
                                                               
    }//GEN-LAST:event_jbtnCargarActionPerformed

    
    public void cargarcliente(){
    
        matrizclientes = new String [listaClientes.size()][8];
            
        for (int i = 0; i < listaClientes.size(); i++) {
            
            matrizclientes[i][0] = listaClientes.get(i).getApellyNom();
            matrizclientes[i][1] = listaClientes.get(i).getDNI();
            matrizclientes[i][2] = listaClientes.get(i).getFechanac();
            matrizclientes[i][3] = listaClientes.get(i).getTelefono();
            matrizclientes[i][4] = listaClientes.get(i).getDomicilio();
            matrizclientes[i][5] = listaClientes.get(i).getProvincia();
            matrizclientes[i][6] = listaClientes.get(i).getLocalidad();
            matrizclientes[i][7] = listaClientes.get(i).getMail();
            
        }
            
        jtbl.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jtbl.setModel(new javax.swing.table.DefaultTableModel(

            matrizclientes,
                
            new String [] {
                
                "APELLIDO y NOMBRE", "DNI", "FECHA NACIMIENTO", "TELEFONO", "DOMICILIO", "PROVINCIA", "LOCALIDAD", "E-MAIL"                    
                    
            }
        ));
                        
    }
    
    
    public static boolean esCorreo(String Correo){

        Pattern patron = Pattern.compile ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher comparar = patron.matcher(Correo);
        return comparar.find();

    }   
            
   
    private void jtxtf_apellynomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_apellynomKeyTyped

        char checkposicion = evt.getKeyChar();
               
        if (Character.isLetter(checkposicion) || (checkposicion == KeyEvent.VK_SPACE) || (checkposicion == KeyEvent.VK_BACK_SPACE) || (Character.isLowerCase(evt.getKeyChar()))) {
            
                evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));

        } else {

            evt.consume();

            JOptionPane.showMessageDialog(this, "Por favor ingresar solo letras", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jtxtf_apellynomKeyTyped

    
    
    private void jtxtf_telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_telefKeyTyped
        
        char checkposicion = evt.getKeyChar(); 
                                        
            Pattern pt = Pattern.compile("^([0-9\\-()]*)$");
            Matcher mt = pt.matcher(Character.toString(checkposicion));

            boolean matchFound = mt.find();

            if(!matchFound && checkposicion != KeyEvent.VK_BACK_SPACE) {

               evt.consume();
               JOptionPane.showMessageDialog(this,"Por favor no ingresar letras ni espacios\n\n Se permiten los siguientes simbolos:\n - ) (","Atención",JOptionPane.INFORMATION_MESSAGE);

            }   
         
    }//GEN-LAST:event_jtxtf_telefKeyTyped

    
    private void jtxtf_domiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_domiActionPerformed
        
    }//GEN-LAST:event_jtxtf_domiActionPerformed

    
    private void jtxtf_domiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_domiKeyTyped
              
        if (Character.isLowerCase(evt.getKeyChar())) {
            
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
            
        }
        
    }//GEN-LAST:event_jtxtf_domiKeyTyped

    
    private void jtxtf_provKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_provKeyTyped
        
        if (Character.isLowerCase(evt.getKeyChar())) {
            
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
            
        }
                                
    }//GEN-LAST:event_jtxtf_provKeyTyped

    private void jtxtf_localKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_localKeyTyped
        
        if (Character.isLowerCase(evt.getKeyChar())){
        
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));        
            
        }

    }//GEN-LAST:event_jtxtf_localKeyTyped

    private void jtxtf_mailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtf_mailKeyTyped
        
        if (Character.isUpperCase(evt.getKeyChar())) {
            
            evt.setKeyChar(Character.toLowerCase(evt.getKeyChar()));
            
        }
        
    }//GEN-LAST:event_jtxtf_mailKeyTyped

    private void jbtnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCargarMouseClicked
                
    }//GEN-LAST:event_jbtnCargarMouseClicked

    private void jtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblMouseClicked
        
        if (evt.getClickCount()==2){
            
            jtxtf_apellynom.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 0).toString());
            jtxtf_dni.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 1).toString());
            jtxtf_fchnac.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 2).toString());
            jtxtf_telef.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 3).toString());
            jtxtf_domi.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 4).toString());
            jtxtf_prov.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 5).toString());
            jtxtf_local.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 6).toString());
            jtxtf_mail.setText(jtbl.getValueAt(jtbl.getSelectedRow(), 7).toString());
            
            listaClientes.remove(jtbl.getSelectedRow());
            
            cargarcliente();
            
        }        
                        
    }//GEN-LAST:event_jtblMouseClicked

    private void jbtn_eliminaregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_eliminaregMouseClicked
        
    }//GEN-LAST:event_jbtn_eliminaregMouseClicked

    private void jbtn_eliminaregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminaregActionPerformed
                        
        if (jtbl.getRowCount() == 0){
        
        } else if (jtbl.getSelectedRow() != -1) {
        
            int m = JOptionPane.showConfirmDialog(this, "Confirma eliminar la fila seleccionada?","¡¡¡AVISO!!!",JOptionPane.YES_NO_OPTION);

                if (m == 0){

                listaClientes.remove(jtbl.getSelectedRow());

                cargarcliente();

                }
                
        }        
      
    }//GEN-LAST:event_jbtn_eliminaregActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnCargar;
    private javax.swing.JButton jbtn_eliminareg;
    private javax.swing.JTable jtbl;
    private javax.swing.JTextField jtxtf_apellynom;
    private javax.swing.JTextField jtxtf_dni;
    private javax.swing.JTextField jtxtf_domi;
    private javax.swing.JTextField jtxtf_fchnac;
    private javax.swing.JTextField jtxtf_local;
    private javax.swing.JTextField jtxtf_mail;
    private javax.swing.JTextField jtxtf_prov;
    private javax.swing.JTextField jtxtf_telef;
    // End of variables declaration//GEN-END:variables
}
