/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package esame2022;

import java.util.TimerTask;

/**
 *
 * @author lauma
 */
public class FinestraGioco extends javax.swing.JFrame {

    ContoRovescia mttContoRovescia;
    java.util.Timer tmrContoRovescia;
    int numerotrovati = 0;

    public MiaClipAudio MC2;

    /**
     * Creates new form FinestraGioco
     */
    public FinestraGioco() {

        setUndecorated(true);
        initComponents();

        lbHaivinto.setVisible(false);
        btRestart.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btRestart = new javax.swing.JButton();
        lbNOgg8 = new javax.swing.JLabel();
        lbNOgg7 = new javax.swing.JLabel();
        lbNOgg6 = new javax.swing.JLabel();
        lbNOgg5 = new javax.swing.JLabel();
        lbNOgg4 = new javax.swing.JLabel();
        lbNOgg3 = new javax.swing.JLabel();
        lbNOgg2 = new javax.swing.JLabel();
        lbNOgg1 = new javax.swing.JLabel();
        lbTimer = new javax.swing.JLabel();
        lbTrovati = new javax.swing.JLabel();
        lbHaivinto = new javax.swing.JLabel();
        lbOgg8 = new javax.swing.JLabel();
        lbOgg7 = new javax.swing.JLabel();
        lbOgg6 = new javax.swing.JLabel();
        lbOgg5 = new javax.swing.JLabel();
        lbOgg4 = new javax.swing.JLabel();
        lbOgg3 = new javax.swing.JLabel();
        lbOgg2 = new javax.swing.JLabel();
        lbOgg1 = new javax.swing.JLabel();
        btTimer = new javax.swing.JButton();
        lbSfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        btRestart.setBackground(new java.awt.Color(170, 130, 130));
        btRestart.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btRestart.setForeground(new java.awt.Color(255, 255, 255));
        btRestart.setText("RIPROVA");
        btRestart.setBorderPainted(false);
        btRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRestartMouseClicked(evt);
            }
        });
        btRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestartActionPerformed(evt);
            }
        });
        jPanel1.add(btRestart);
        btRestart.setBounds(260, 210, 140, 50);

        lbNOgg8.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg8.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg8.setText("TORCERE");
        jPanel1.add(lbNOgg8);
        lbNOgg8.setBounds(480, 440, 120, 17);

        lbNOgg7.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg7.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg7.setText("SPADA");
        jPanel1.add(lbNOgg7);
        lbNOgg7.setBounds(340, 440, 120, 17);

        lbNOgg6.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg6.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg6.setText("QUADRO");
        jPanel1.add(lbNOgg6);
        lbNOgg6.setBounds(200, 440, 120, 17);

        lbNOgg5.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg5.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg5.setText("MANTELLO");
        jPanel1.add(lbNOgg5);
        lbNOgg5.setBounds(60, 440, 120, 17);

        lbNOgg4.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg4.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg4.setText("LIBRO");
        jPanel1.add(lbNOgg4);
        lbNOgg4.setBounds(480, 400, 125, 30);

        lbNOgg3.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg3.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg3.setText("CONTRATTO");
        jPanel1.add(lbNOgg3);
        lbNOgg3.setBounds(340, 400, 125, 30);

        lbNOgg2.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg2.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg2.setText("COLOMBE");
        jPanel1.add(lbNOgg2);
        lbNOgg2.setBounds(200, 400, 123, 30);

        lbNOgg1.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbNOgg1.setForeground(new java.awt.Color(255, 255, 255));
        lbNOgg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNOgg1.setText("BOTOLA");
        lbNOgg1.setToolTipText("");
        jPanel1.add(lbNOgg1);
        lbNOgg1.setBounds(60, 400, 120, 30);

        lbTimer.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        lbTimer.setForeground(new java.awt.Color(178, 123, 142));
        lbTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTimer);
        lbTimer.setBounds(270, 20, 120, 30);

        lbTrovati.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbTrovati.setForeground(new java.awt.Color(255, 255, 255));
        lbTrovati.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTrovati);
        lbTrovati.setBounds(270, 0, 120, 20);

        lbHaivinto.setFont(new java.awt.Font("Perpetua", 1, 60)); // NOI18N
        lbHaivinto.setForeground(new java.awt.Color(255, 255, 255));
        lbHaivinto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHaivinto.setText("HAI VINTO!");
        jPanel1.add(lbHaivinto);
        lbHaivinto.setBounds(0, 0, 660, 470);

        lbOgg8.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\colomba-1.jpg")); // NOI18N
        lbOgg8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg8MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg8);
        lbOgg8.setBounds(560, 30, 90, 40);

        lbOgg7.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\spada.png")); // NOI18N
        lbOgg7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg7MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg7);
        lbOgg7.setBounds(478, 230, 70, 30);

        lbOgg6.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\torcereD.jpg")); // NOI18N
        lbOgg6.setText("jLabel1");
        lbOgg6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg6MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg6);
        lbOgg6.setBounds(150, 300, 70, 60);

        lbOgg5.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\pergamena1.jpg")); // NOI18N
        lbOgg5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg5MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg5);
        lbOgg5.setBounds(90, 40, 70, 90);

        lbOgg4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\leggio.png")); // NOI18N
        lbOgg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg4MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg4);
        lbOgg4.setBounds(380, 80, 60, 130);

        lbOgg3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\contratto.png")); // NOI18N
        lbOgg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg3MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg3);
        lbOgg3.setBounds(20, 300, 144, 76);

        lbOgg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\colombe.png")); // NOI18N
        lbOgg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg2MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg2);
        lbOgg2.setBounds(240, 60, 80, 50);

        lbOgg1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\botola.png")); // NOI18N
        lbOgg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOgg1MouseClicked(evt);
            }
        });
        jPanel1.add(lbOgg1);
        lbOgg1.setBounds(220, 190, 170, 90);

        btTimer.setText("START");
        btTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimerActionPerformed(evt);
            }
        });
        jPanel1.add(btTimer);
        btTimer.setBounds(280, 290, 90, 30);

        lbSfondo.setBackground(new java.awt.Color(255, 255, 0));
        lbSfondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\Sfondogiocodef.jpg")); // NOI18N
        lbSfondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSfondoMouseEntered(evt);
            }
        });
        jPanel1.add(lbSfondo);
        lbSfondo.setBounds(0, 0, 660, 472);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbOgg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg1MouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbNOgg1.setVisible(false);
        this.lbOgg1.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();


    }//GEN-LAST:event_lbOgg1MouseClicked

    private void lbSfondoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSfondoMouseEntered
        // TODO add your handling code here:


    }//GEN-LAST:event_lbSfondoMouseEntered

    private void btTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimerActionPerformed
        // TODO add your handling code here:

        mttContoRovescia = new ContoRovescia();
        tmrContoRovescia = new java.util.Timer();
        tmrContoRovescia.schedule(mttContoRovescia, 0, 1000);


    }//GEN-LAST:event_btTimerActionPerformed

    private void lbOgg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg3MouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbNOgg3.setVisible(false);
        this.lbOgg3.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();

    }//GEN-LAST:event_lbOgg3MouseClicked

    private void lbOgg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg4MouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbNOgg4.setVisible(false);
        this.lbOgg4.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();

    }//GEN-LAST:event_lbOgg4MouseClicked

    private void lbOgg5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg5MouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbNOgg5.setVisible(false);
        this.lbOgg5.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();

    }//GEN-LAST:event_lbOgg5MouseClicked

    private void lbOgg6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg6MouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbNOgg6.setVisible(false);
        this.lbOgg6.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();

    }//GEN-LAST:event_lbOgg6MouseClicked

    private void lbOgg7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg7MouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbNOgg7.setVisible(false);
        this.lbOgg7.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();

    }//GEN-LAST:event_lbOgg7MouseClicked

    private void lbOgg8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg8MouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbNOgg8.setVisible(false);
        this.lbOgg8.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();

    }//GEN-LAST:event_lbOgg8MouseClicked

    private void btRestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRestartMouseClicked
        // TODO add your handling code here:

        try {

            mttContoRovescia.cancel();
            tmrContoRovescia.cancel();

            mttContoRovescia = new ContoRovescia();
            tmrContoRovescia = new java.util.Timer();
            tmrContoRovescia.schedule(mttContoRovescia, 0, 1000);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        lbOgg1.setVisible(true);
        lbOgg2.setVisible(true);
        lbOgg3.setVisible(true);
        lbOgg4.setVisible(true);
        lbOgg5.setVisible(true);
        lbOgg6.setVisible(true);
        lbOgg7.setVisible(true);
        lbOgg8.setVisible(true);
        
        lbNOgg1.setVisible(true);
        lbNOgg2.setVisible(true);
        lbNOgg3.setVisible(true);
        lbNOgg4.setVisible(true);
        lbNOgg5.setVisible(true);
        lbNOgg6.setVisible(true);
        lbNOgg7.setVisible(true);
        lbNOgg8.setVisible(true);

        btRestart.setVisible(false);

    }//GEN-LAST:event_btRestartMouseClicked

    private void btRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRestartActionPerformed

    private void lbOgg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOgg2MouseClicked
        // TODO add your handling code here:
        
        numerotrovati = numerotrovati + 1;
        this.lbNOgg2.setVisible(false);
        this.lbOgg2.setVisible(false);

        MC2 = new MiaClipAudio("audio/button.wav");
        MC2.start();
        
    }//GEN-LAST:event_lbOgg2MouseClicked

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
            java.util.logging.Logger.getLogger(FinestraGioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraGioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraGioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraGioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraGioco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btRestart;
    public javax.swing.JButton btTimer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHaivinto;
    private javax.swing.JLabel lbNOgg1;
    private javax.swing.JLabel lbNOgg2;
    private javax.swing.JLabel lbNOgg3;
    private javax.swing.JLabel lbNOgg4;
    private javax.swing.JLabel lbNOgg5;
    private javax.swing.JLabel lbNOgg6;
    private javax.swing.JLabel lbNOgg7;
    private javax.swing.JLabel lbNOgg8;
    private javax.swing.JLabel lbOgg1;
    private javax.swing.JLabel lbOgg2;
    private javax.swing.JLabel lbOgg3;
    private javax.swing.JLabel lbOgg4;
    private javax.swing.JLabel lbOgg5;
    private javax.swing.JLabel lbOgg6;
    private javax.swing.JLabel lbOgg7;
    private javax.swing.JLabel lbOgg8;
    private javax.swing.JLabel lbSfondo;
    private javax.swing.JLabel lbTimer;
    private javax.swing.JLabel lbTrovati;
    // End of variables declaration//GEN-END:variables

    class ContoRovescia extends TimerTask {

        long contatore;

        public ContoRovescia() {
            contatore = 30; //180=3min
        } // endof costruttore

        public void run() {

            contatore = contatore - 1;

            if (contatore <= 0) { //qui finito tempo
                contatore = 30;

                try {
                    cancel();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                
                if (numerotrovati < 8) {
                    numerotrovati = 0;

                    btRestart.setVisible(true);

                }

            } // endif contatore   

            // lbTimer.setText("Rimangono " + contatore + " secondi"); 
            lbTimer.setText(contatore + " SEC");

            lbTrovati.setText("TROVATI " + numerotrovati + "/8");

            if (numerotrovati == 8) {

                lbHaivinto.setVisible(true);

                try {
                    cancel();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                
                // finestravittoria
            }

        } // endof run

    } // endof ContoRovescia

}
