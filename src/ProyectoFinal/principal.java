package ProyectoFinal;

import java.util.ArrayList;

public class principal extends javax.swing.JFrame {

    public static ArrayList<Producto> invMercaderias = new ArrayList<>();
    public static String matrizproductos[][];
    
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static String matrizclientes[][];

    public principal() {
        initComponents();
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Cargar = new javax.swing.JMenu();
        jAlta_Clientes = new javax.swing.JMenuItem();
        jInv_Merc = new javax.swing.JMenuItem();
        jMenu_Procesos = new javax.swing.JMenu();
        jFacturar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARGUS © - Sistema de Gestion");
        setPreferredSize(new java.awt.Dimension(1300, 840));
        setResizable(false);

        jEscritorio.setPreferredSize(new java.awt.Dimension(1300, 840));

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1610, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        jMenu_Cargar.setText("CARGAR");
        jMenu_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_CargarActionPerformed(evt);
            }
        });

        jAlta_Clientes.setText("Alta Clientes");
        jAlta_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlta_ClientesActionPerformed(evt);
            }
        });
        jMenu_Cargar.add(jAlta_Clientes);

        jInv_Merc.setText("Inventario Mercaderias");
        jInv_Merc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInv_MercActionPerformed(evt);
            }
        });
        jMenu_Cargar.add(jInv_Merc);

        jMenuBar1.add(jMenu_Cargar);

        jMenu_Procesos.setText("PROCESOS");

        jFacturar.setText("Pedido de venta");
        jFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFacturarActionPerformed(evt);
            }
        });
        jMenu_Procesos.add(jFacturar);

        jMenuBar1.add(jMenu_Procesos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAlta_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlta_ClientesActionPerformed
        
        AltaCliente ac = new AltaCliente();
        jEscritorio.add(ac);
        ac.setVisible(true);
        
    }//GEN-LAST:event_jAlta_ClientesActionPerformed
    
    private void jMenu_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_CargarActionPerformed
        

    }//GEN-LAST:event_jMenu_CargarActionPerformed
   
    private void jInv_MercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInv_MercActionPerformed
        
        InvMercaderias invmerc = new InvMercaderias();
        jEscritorio.add(invmerc);
        invmerc.setVisible(true);
        
    }//GEN-LAST:event_jInv_MercActionPerformed

    private void jFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFacturarActionPerformed
        
        PedidoVta facturar = new PedidoVta();
        jEscritorio.add(facturar);
        facturar.setVisible(true);
        
    }//GEN-LAST:event_jFacturarActionPerformed


    public static void main(String args[]) {                       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAlta_Clientes;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jFacturar;
    private javax.swing.JMenuItem jInv_Merc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Cargar;
    private javax.swing.JMenu jMenu_Procesos;
    // End of variables declaration//GEN-END:variables
}



