/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur_Aly
 */

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Accueil_Etudiants extends JFrame {
    boolean mouvement = true;
    /**
     * Creates new form Accueil
     */
    public Accueil_Etudiants() {
        initComponents();
        Timer timer = new Timer();
        TimerTask t= new TimerTask(){
        public void run(){
            if(mouvement==true){b.setLocation(b.getLocation().x-5, b.getLocation().y);
            if(b.getLocation().x<0){
            mouvement=false;}}
            else if(mouvement==false){b.setLocation(b.getLocation().x+5, b.getLocation().y);
             if(b.getLocation().x>784){
                 mouvement=true;}
            }
        }};
                timer.scheduleAtFixedRate(t, 0, 25);
        setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("téléchargement.png")).getImage());
    }private void initComponents(JFrame jFrame) {
        jFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        Gestion_acces = new javax.swing.JButton();
        Gestion_salles = new javax.swing.JButton();
        info_salles = new javax.swing.JButton();
        ges_all = new javax.swing.JButton();
        
        emploiTemps = new javax.swing.JButton();
        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame.getContentPane());
        jFrame.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION DES SALLES DE CLASSES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 3, 24), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setName("jPanel1");
        javax.swing.GroupLayout jPAppliLayout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPAppliLayout);
        jPAppliLayout.setHorizontalGroup(
            jPAppliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1138, Short.MAX_VALUE)
        );
        jPAppliLayout.setVerticalGroup(
            jPAppliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        Gestion_acces.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gestion_acces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employe 32.png"))); // NOI18N
        Gestion_acces.setText("Gestion des acces");
        Gestion_acces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        Gestion_salles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gestion_salles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employe 32.png"))); // NOI18N
        Gestion_salles.setText("Gestion des salles");
        Gestion_salles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        info_salles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        info_salles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employe 32.png"))); // NOI18N
        info_salles.setText("Affichage des informations des salles");
        info_salles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });   
        ges_all.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ges_all.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employe 32.png"))); // NOI18N
        ges_all.setText("Gestion des allocations");
        ges_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             
            }
        });
        
        //rech.setText("Recherche");
        /*rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             
            }
        });*/
        //ver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        //ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employe 32.png"))); // NOI18N
        //ver.setText("Verification");
       /* ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
            }
        });*/
        emploiTemps.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emploiTemps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employe 32.png"))); // NOI18N
        emploiTemps.setText("Emploi Du Temps");
        emploiTemps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("jPanel1");

        pack();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        b = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        Gestion_acces = new javax.swing.JButton();
        Gestion_salles = new javax.swing.JButton();
        info_salles = new javax.swing.JButton();
        ges_all = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emploiTemps = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("accueil");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(51, 51, 255)))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1329, 440));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentRemoved(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));

        b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        b.setText("BIENVENUE DANS LE SYSTEME DE GESTION DES SALLES DE CLASSES DE L'UADB!!!!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uadb66.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b)
                .addGap(129, 129, 129))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel3);

        Text.setEditable(false);
        Text.setBackground(new java.awt.Color(204, 204, 0));
        Text.setColumns(20);
        Text.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Text.setForeground(new java.awt.Color(51, 51, 255));
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Gestion_acces.setBackground(new java.awt.Color(255, 255, 255));
        Gestion_acces.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gestion_acces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employe 32_1.png"))); // NOI18N
        Gestion_acces.setText("Gestion acces");
        Gestion_acces.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gestion_acces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gestion_accesActionPerformed(evt);
            }
        });

        Gestion_salles.setBackground(new java.awt.Color(255, 255, 255));
        Gestion_salles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gestion_salles.setForeground(new java.awt.Color(51, 7, 7));
        Gestion_salles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promotion 32.png"))); // NOI18N
        Gestion_salles.setText("gestion des salles");
        Gestion_salles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gestion_salles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gestion_sallesActionPerformed(evt);
            }
        });

        info_salles.setBackground(new java.awt.Color(255, 255, 255));
        info_salles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        info_salles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employe 32.png"))); // NOI18N
        info_salles.setText("Affichage des informations ");
        info_salles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        info_salles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_sallesActionPerformed(evt);
            }
        });

        ges_all.setBackground(new java.awt.Color(255, 255, 255));
        ges_all.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ges_all.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mod.PNG"))); // NOI18N
        ges_all.setText("Gestion des allocations");
        ges_all.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ges_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ges_allActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Vous etes :  Etudiants");

        emploiTemps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emploiTemps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crayon.PNG"))); // NOI18N
        emploiTemps.setText("emploi temps");
        emploiTemps.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emploiTemps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emploiTempsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gestion_acces, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Gestion_salles, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info_salles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ges_all, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emploiTemps, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info_salles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gestion_salles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gestion_acces, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ges_all, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emploiTemps, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentRemoved

    }//GEN-LAST:event_jPanel1ComponentRemoved

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded

    }//GEN-LAST:event_jPanel1ComponentAdded

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void Gestion_accesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestion_accesActionPerformed
        // TODO add your handling code here:
           Gestion_acces.setEnabled(false);
           Text.setText("Vous n'avez pas le droit de consulter ces données");
    }//GEN-LAST:event_Gestion_accesActionPerformed

    private void ges_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ges_allActionPerformed
        // TODO add your handling code here:
           ges_all.setEnabled(false);
           Text.setText("Vous n'avez pas le droit de consulter ces données");
    }//GEN-LAST:event_ges_allActionPerformed

    private void Gestion_sallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestion_sallesActionPerformed
        // TODO add your handling code here:
           Gestion_salles.setEnabled(false);
           Text.setText("Vous n'avez pas le droit de consulter ces données");
 
    }//GEN-LAST:event_Gestion_sallesActionPerformed

    private void info_sallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_sallesActionPerformed
        // TODO add your handling code here:
          info_salles.setEnabled(false);
           Text.setText("Vous n'avez pas le droit de consulter ces données");
    }//GEN-LAST:event_info_sallesActionPerformed

    private void emploiTempsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emploiTempsActionPerformed
         EmploiDuTemps_detaille emp = new EmploiDuTemps_detaille();
         jPanel1.removeAll();
        jPanel1.add(emp);
        jPanel1.validate();
    }//GEN-LAST:event_emploiTempsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(AccueilAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccueilAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccueilAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil_Etudiants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Gestion_acces;
    public static javax.swing.JButton Gestion_salles;
    public static javax.swing.JTextArea Text;
    private javax.swing.JLabel b;
    private javax.swing.JButton emploiTemps;
    public static javax.swing.JButton ges_all;
    public static javax.swing.JButton info_salles;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
