/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektalgorytmy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jacek Cierpka
 */
public class Interfejs extends javax.swing.JFrame {
       
    /**
     * Creates new form OknoBazy
     */
    public Interfejs() {
        initComponents();   
        }
    
     public static String slownikPath = null;
     public static String postyPath = null;
     public static String ulubionePath = null;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        guz_Adres_slownika = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pokaz_slownik = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pokaz_posty = new javax.swing.JTextPane();
        Uruchom = new javax.swing.JButton();
        zatwierdz = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pokaz_wyniki = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        pokaz_ulubione = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Slownik");

        guz_Adres_slownika.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guz_Adres_slownika.setText("Adres");
        guz_Adres_slownika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guz_Adres_slownikaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Posty");

        pokaz_slownik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokaz_slownikMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pokaz_slownik);

        pokaz_posty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokaz_postyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pokaz_posty);

        Uruchom.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Uruchom.setText("Uruchom");
        Uruchom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UruchomMouseClicked(evt);
            }
        });

        zatwierdz.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        zatwierdz.setText("Zatwierdz");
        zatwierdz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zatwierdzMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable1);

        pokaz_wyniki.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pokaz_wyniki.setText("Pokaz");
        pokaz_wyniki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokaz_wynikiActionPerformed(evt);
            }
        });

        pokaz_ulubione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokaz_ulubioneMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(pokaz_ulubione);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guz_Adres_slownika, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zatwierdz, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Uruchom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pokaz_wyniki, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guz_Adres_slownika, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(zatwierdz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pokaz_wyniki, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uruchom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.getAccessibleContext().setAccessibleName("Post");
        zatwierdz.getAccessibleContext().setAccessibleName("zatwierdz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
	
    private void guz_Adres_slownikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guz_Adres_slownikaActionPerformed

        JFileChooser slownik=new JFileChooser();
        slownik.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt", "txt");
        slownik.addChoosableFileFilter(filter);
        int result = slownik.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedSlownik = slownik.getSelectedFile();
            String sciezkaSlownik = selectedSlownik.getAbsolutePath();
            slownikPath=sciezkaSlownik;
            //pokaz_slownik.setText(slownikPath);
        }
        else{
            System.out.println("Nie wybrano pliku");
        }
        
    }//GEN-LAST:event_guz_Adres_slownikaActionPerformed

    private void pokaz_slownikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokaz_slownikMouseClicked
        pokaz_slownik.setText(slownikPath);        
    }//GEN-LAST:event_pokaz_slownikMouseClicked

    private void pokaz_postyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokaz_postyMouseClicked
        String przod=slownikPath.substring(0,slownikPath.length()-11);
        String tyl="posty.txt";
        //postyPath=slownikPath.substring(0,slownikPath.length()-9);
        pokaz_posty.setText(przod+tyl);
    }//GEN-LAST:event_pokaz_postyMouseClicked

    private void UruchomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UruchomMouseClicked
                System.out.println(slownikPath);
                System.out.println(postyPath);
                System.out.println(ulubionePath);
        
             ProjektAlgorytmy run = new ProjektAlgorytmy();
                 
                 try {
			run.slowniczek(slownikPath);                        
			run.posty(postyPath);
                        run.ulubione(ulubionePath);
                        //run.slowniczek("C:\\Users\\Jacek Cierpka\\Documents\\NetBeansProjects\\ApkaWsp\\src\\apkawsp\\train.txt");
			//run.posty("C:\\Users\\Jacek Cierpka\\Documents\\NetBeansProjects\\ApkaWsp\\src\\apkawsp\\TestFile.txt");
			System.out.println("Wczytalo");
		} catch (IOException e) {
			System.out.println("Blad odczytu plikow");
		}
    }//GEN-LAST:event_UruchomMouseClicked

    private void zatwierdzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zatwierdzMouseClicked
        postyPath=pokaz_posty.getText();
        ulubionePath=pokaz_ulubione.getText();
    }//GEN-LAST:event_zatwierdzMouseClicked

    private void pokaz_wynikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokaz_wynikiActionPerformed
        String sciezkaWyniki="C:\\Users\\Jacek Cierpka\\Documents\\NetBeansProjects\\ProjektAlgorytmy\\wyniki.txt";
        File plik= new File(sciezkaWyniki);
        try{
            BufferedReader in = new BufferedReader(new FileReader(plik));
            String firstLine=in.readLine().trim();
            String[] columnsName=firstLine.split("\t");
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] linie=in.lines().toArray();
            for(int i=0;i<linie.length;i++){
                String line=linie[i].toString();
                String[] dataRow=line.split("\t");
                model.addRow(dataRow);
            }
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(Interfejs.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Interfejs.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_pokaz_wynikiActionPerformed

    private void pokaz_ulubioneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokaz_ulubioneMouseClicked
         String przod=slownikPath.substring(0,slownikPath.length()-11);
        String tyl="ulubione.txt";
        //postyPath=slownikPath.substring(0,slownikPath.length()-9);
        pokaz_ulubione.setText(przod+tyl);
    }//GEN-LAST:event_pokaz_ulubioneMouseClicked

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
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfejs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Interfejs().setVisible(true);
                			
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Uruchom;
    private javax.swing.JButton guz_Adres_slownika;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextPane pokaz_posty;
    public static javax.swing.JTextPane pokaz_slownik;
    public static javax.swing.JTextPane pokaz_ulubione;
    private javax.swing.JButton pokaz_wyniki;
    private javax.swing.JButton zatwierdz;
    // End of variables declaration//GEN-END:variables
}
