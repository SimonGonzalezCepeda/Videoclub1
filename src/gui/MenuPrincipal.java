/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JLabel;
import videoclub.Videoclub;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import videoclub.Usuari;

/**
 *
 * @author pau
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private Object jLabel1;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null) ; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotoAlquilar = new javax.swing.JButton();
        BotoCategoria = new javax.swing.JButton();
        BotoPerfil = new javax.swing.JButton();
        BotoDesconectar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 51));

        BotoAlquilar.setBackground(new java.awt.Color(0, 0, 102));
        BotoAlquilar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotoAlquilar.setForeground(new java.awt.Color(204, 204, 0));
        BotoAlquilar.setText("Alquilar");
        BotoAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoAlquilarActionPerformed(evt);
            }
        });

        BotoCategoria.setBackground(new java.awt.Color(0, 0, 102));
        BotoCategoria.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotoCategoria.setForeground(new java.awt.Color(204, 204, 0));
        BotoCategoria.setText("Categorias");
        BotoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoCategoriaActionPerformed(evt);
            }
        });

        BotoPerfil.setBackground(new java.awt.Color(0, 0, 102));
        BotoPerfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotoPerfil.setForeground(new java.awt.Color(204, 204, 0));
        BotoPerfil.setText("Mi Perfil");
        BotoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoPerfilActionPerformed(evt);
            }
        });

        BotoDesconectar.setBackground(new java.awt.Color(0, 0, 102));
        BotoDesconectar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotoDesconectar.setForeground(new java.awt.Color(204, 204, 0));
        BotoDesconectar.setText("Desconectar");
        BotoDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoDesconectarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Videoclub");

        jLabel3.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("http://www.diesl.com/wp-content/uploads/2012/03/peliculas-gratis-330x200.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotoDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotoAlquilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(BotoAlquilar)
                        .addGap(62, 62, 62)
                        .addComponent(BotoCategoria)
                        .addGap(62, 62, 62)
                        .addComponent(BotoPerfil)
                        .addGap(59, 59, 59)
                        .addComponent(BotoDesconectar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoCategoriaActionPerformed
        // TODO add your handling code here:  
              Categorias frame = new Categorias();  
              frame.show();
              dispose();
    }//GEN-LAST:event_BotoCategoriaActionPerformed

    private void BotoAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoAlquilarActionPerformed
        // TODO add your handling code here:
              Listado frame = new Listado();  
              frame.show();
              dispose();
    }//GEN-LAST:event_BotoAlquilarActionPerformed

    private void BotoDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoDesconectarActionPerformed
        // TODO add your handling code here:
              Login frame = new Login();  
              frame.show();
              dispose();
    }//GEN-LAST:event_BotoDesconectarActionPerformed

    private void BotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoPerfilActionPerformed
        // TODO add your handling code here:
        Usuari usuari = new Usuari();
        usuari.MostrarDadesUsuari();
        Usuario frame = new Usuario();  
        frame.show();
        dispose();
    }//GEN-LAST:event_BotoPerfilActionPerformed

    /**
     *
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotoAlquilar;
    private javax.swing.JButton BotoCategoria;
    private javax.swing.JButton BotoDesconectar;
    private javax.swing.JButton BotoPerfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
