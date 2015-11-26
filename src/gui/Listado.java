/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import static gui.CategoriaFiltrada.lista;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListModel;
import videoclub.Temporada;
import videoclub.Videoclub;


/**
 *
 * @author pau
 */
public class Listado extends javax.swing.JFrame {

    /**
     * Creates new form Listado
     */
    public Listado() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BotoTornarMenu = new javax.swing.JButton();
        BotoAccedirPeli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Listado");

        jScrollPane1.setViewportView(lista2);

        BotoTornarMenu.setBackground(new java.awt.Color(204, 204, 0));
        BotoTornarMenu.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotoTornarMenu.setForeground(new java.awt.Color(0, 0, 102));
        BotoTornarMenu.setText("Menú Principal");
        BotoTornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoTornarMenuActionPerformed(evt);
            }
        });

        BotoAccedirPeli.setBackground(new java.awt.Color(0, 0, 102));
        BotoAccedirPeli.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotoAccedirPeli.setForeground(new java.awt.Color(204, 204, 0));
        BotoAccedirPeli.setText("Mostrar");
        BotoAccedirPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoAccedirPeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(BotoTornarMenu)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotoAccedirPeli)
                        .addGap(210, 210, 210))))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotoTornarMenu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotoAccedirPeli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotoTornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoTornarMenuActionPerformed
        // TODO add your handling code here:
        MenuPrincipal frame = new MenuPrincipal();
        frame.show();
        dispose();
    }//GEN-LAST:event_BotoTornarMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // TODO add your handling code here:
            Videoclub.desarBD(Videoclub.usuarios, Videoclub.peliculas, Videoclub.series);
        } catch (IOException ex) {
            Logger.getLogger(Listado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void BotoAccedirPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoAccedirPeliActionPerformed
        // TODO add your handling code here:
        int i, j = 0;
        videoclub.Serie serie;
        videoclub.Pelicula pelicula;
        ArrayList<Temporada> temps;
        videoclub.Temporada temp;
        String nom;
        String nom1;
        boolean p = false, s = false;
        for (i = 0; i < Videoclub.series.size(); i++) {
            serie = Videoclub.series.get(i);
            ListModel list = lista2.getModel(); // Comparacio Strings
            nom1 = list.getElementAt(lista2.getSelectedIndex()).toString().trim(); //Agafem seleccionat de la llista
            nom = serie.getNom().trim(); //Selecciono el de l'ArrayList
            if (nom.equals(nom1)) {
                Serie.jLabelTitulo.setText(serie.getNom());
                Serie.jLabelAño.setText(serie.getAny() + "");
                Serie.jLabelCategoria.setText(serie.getCategoria());
                if (serie.isEmissio()) {
                    Serie.jLabelEmision.setText("Temporada " + serie.getTotalTemporades());
                } else {
                    Serie.jLabelEmision.setText("No");
                }
                Serie.jLabelProductora.setText(serie.getProductora());
                Serie.AreaTextSerie.setText(serie.getSinopsis());
                temps = serie.getTemporadas();
                DefaultComboBoxModel model = new DefaultComboBoxModel();
                for (int k = 0; k < temps.size(); k++) {
                    temp = temps.get(k);
                    if (temp.isDisponible()) {
                    Serie.BotoDisponible.setText("Si");
                    } else {
                    Serie.BotoDisponible.setText("No");
                    }
                    model.addElement("Temporada " + temp.getNumeroTemporada());
                    Serie.jComboBoxTemporadas.setModel(model);
                }
                s = true;

            }
        } //endfor

        for (i = 0; i < Videoclub.peliculas.size(); i++) {
            pelicula = Videoclub.peliculas.get(i);
            ListModel list = lista2.getModel();
            nom1 = list.getElementAt(lista2.getSelectedIndex()).toString().trim();;
            nom = pelicula.getNom().trim();
            if (nom.equals(nom1)) {
                Pelicula.jLabelTitulo.setText(pelicula.getNom());
                Pelicula.jLabelAny.setText(pelicula.getAny() + "");
                Pelicula.jLabelCategoria.setText(pelicula.getCategoria());
                Pelicula.jLabelDurada.setText(pelicula.getDuracio() + "");
                Pelicula.jLabelProductora.setText(pelicula.getProductora());
                Pelicula.AreaText.setText(pelicula.getSinopsis());
                if (pelicula.isDisponible()) {
                    Pelicula.BotoDisponible.setText("Si");
                } else {
                    Pelicula.BotoDisponible.setText("No");
                }
                p = true;
            }

        }

        if (p) {
            Pelicula frame = new Pelicula();
            frame.show();
            this.dispose();
        }
        if (s) {
            Serie frame = new Serie();
            frame.show();
            this.dispose();
        }
    }//GEN-LAST:event_BotoAccedirPeliActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotoAccedirPeli;
    private javax.swing.JButton BotoTornarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JList lista2 = new javax.swing.JList();
    // End of variables declaration//GEN-END:variables
}
