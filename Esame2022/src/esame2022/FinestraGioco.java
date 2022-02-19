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
    
    public MiaClipAudio MC1;

    /**
     * Creates new form FinestraGioco
     */
    public FinestraGioco() {
        initComponents();
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
        lbTimer = new javax.swing.JLabel();
        lbProvaogg = new javax.swing.JLabel();
        btTimer = new javax.swing.JButton();
        lbProvaoggNOME = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lbTimer.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        lbTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTimer);
        lbTimer.setBounds(180, 0, 300, 60);

        lbProvaogg.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\spada2.png")); // NOI18N
        lbProvaogg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProvaoggMouseClicked(evt);
            }
        });
        jPanel1.add(lbProvaogg);
        lbProvaogg.setBounds(10, 40, 360, 180);

        btTimer.setText("START");
        btTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimerActionPerformed(evt);
            }
        });
        jPanel1.add(btTimer);
        btTimer.setBounds(280, 290, 90, 30);

        lbProvaoggNOME.setForeground(new java.awt.Color(255, 255, 0));
        lbProvaoggNOME.setText("SPADA");
        lbProvaoggNOME.setToolTipText("");
        jPanel1.add(lbProvaoggNOME);
        lbProvaoggNOME.setBounds(480, 370, 50, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\sfondoinf.jpg")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 470);

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

    private void lbProvaoggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProvaoggMouseClicked
        // TODO add your handling code here:

        numerotrovati = numerotrovati + 1;
        this.lbProvaoggNOME.setVisible(false);
        this.lbProvaogg.setVisible(false);
        
        MC1 = new MiaClipAudio ("media/button-09a.mp3");


    }//GEN-LAST:event_lbProvaoggMouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:

        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void btTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimerActionPerformed
        // TODO add your handling code here:
        
        mttContoRovescia = new ContoRovescia();
        tmrContoRovescia = new java.util.Timer();
        tmrContoRovescia.schedule(mttContoRovescia, 0, 1000);

        
    }//GEN-LAST:event_btTimerActionPerformed

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
    public javax.swing.JButton btTimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbProvaogg;
    private javax.swing.JLabel lbProvaoggNOME;
    private javax.swing.JLabel lbTimer;
    // End of variables declaration//GEN-END:variables

    class ContoRovescia extends TimerTask {

        long contatore;

        public ContoRovescia() {
            contatore = 180; //3min
        } // endof costruttore

        public void run() {

            contatore = contatore - 1;

            if (contatore <= 0) { //qui finito tempo
                contatore = 180;

                if (numerotrovati < 8) {
                    numerotrovati = 0;
                }

            } // endif contatore   

            // lbTimer.setText("Rimangono " + contatore + " secondi"); 
            lbTimer.setText ("Trovati " + numerotrovati + "/8" + " Rimangono " + contatore + " secondi");  

            if (numerotrovati == 8) {

                // finestravittoria
            }

        } // endof run

    } // endof ContoRovescia

}
