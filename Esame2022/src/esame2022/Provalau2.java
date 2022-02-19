/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package esame2022;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/**
 *
 * @author lauma
 */
public class Provalau2 extends javax.swing.JFrame {

    java.util.Timer tmrAttesa;
    MiaAttesa ttkAttesa;

    /**
     * Creates new form Provalau
     */
    public Provalau2() {
        initComponents();

        ImageIcon A = new ImageIcon("media/1nuvola-01.png");
        Image B = A.getImage().getScaledInstance(lbNuvola1.getWidth(), lbNuvola1.getHeight(), java.awt.Image.SCALE_DEFAULT);
        lbNuvola1.setIcon(new ImageIcon(B));

        A = new ImageIcon("media/2nuvola-01.png");
        B = A.getImage().getScaledInstance(lbNuvola2.getWidth(), lbNuvola2.getHeight(), java.awt.Image.SCALE_DEFAULT);
        lbNuvola2.setIcon(new ImageIcon(B));

        A = new ImageIcon("media/3nuvola-01.png");
        B = A.getImage().getScaledInstance(lbNuvola3.getWidth(), lbNuvola3.getHeight(), java.awt.Image.SCALE_DEFAULT);
        lbNuvola3.setIcon(new ImageIcon(B));

        A = new ImageIcon("media/4nuvola-01.png");
        B = A.getImage().getScaledInstance(lbNuvola4.getWidth(), lbNuvola4.getHeight(), java.awt.Image.SCALE_DEFAULT);
        lbNuvola4.setIcon(new ImageIcon(B));

        A = new ImageIcon("media/5nuvola-01.png");
        B = A.getImage().getScaledInstance(lbNuvola5.getWidth(), lbNuvola5.getHeight(), java.awt.Image.SCALE_DEFAULT);
        lbNuvola5.setIcon(new ImageIcon(B));

        lbNuvola1.setVisible(false);

        lbNuvola2.setVisible(false);

        lbNuvola3.setVisible(false);

        lbNuvola4.setVisible(false);

        lbNuvola5.setVisible(false);
        
        lbProva.setVisible(false);

        //QUI METTERE LBPROVA dove partirà il gioco FALSE
        ttkAttesa = new MiaAttesa();
        tmrAttesa = new java.util.Timer();

        tmrAttesa.schedule(ttkAttesa, 0, 1000);  //1000=1sec

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btSalta = new javax.swing.JButton();
        lbProva = new javax.swing.JLabel();
        lbLibro = new javax.swing.JLabel();
        lbNuvola5 = new javax.swing.JLabel();
        lbNuvola4 = new javax.swing.JLabel();
        lbNuvola3 = new javax.swing.JLabel();
        lbNuvola2 = new javax.swing.JLabel();
        lbNuvola1 = new javax.swing.JLabel();
        lbVirgilio = new javax.swing.JLabel();
        lbDante = new javax.swing.JLabel();
        lbSfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        btSalta.setBackground(new java.awt.Color(170, 130, 130));
        btSalta.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btSalta.setForeground(new java.awt.Color(255, 255, 255));
        btSalta.setText("SALTA");
        btSalta.setBorderPainted(false);
        btSalta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSaltaMouseClicked(evt);
            }
        });
        btSalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaltaActionPerformed(evt);
            }
        });
        jPanel2.add(btSalta);
        btSalta.setBounds(285, 430, 90, 25);

        lbProva.setForeground(new java.awt.Color(255, 255, 51));
        lbProva.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\spada2.png")); // NOI18N
        lbProva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProvaMouseClicked(evt);
            }
        });
        jPanel2.add(lbProva);
        lbProva.setBounds(50, 310, 250, 70);

        lbLibro.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\libromov1.gif")); // NOI18N
        jPanel2.add(lbLibro);
        lbLibro.setBounds(0, 0, 660, 470);

        lbNuvola5.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\5nuvola-01.png")); // NOI18N
        jPanel2.add(lbNuvola5);
        lbNuvola5.setBounds(0, 0, 660, 470);

        lbNuvola4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\4nuvola-01.png")); // NOI18N
        jPanel2.add(lbNuvola4);
        lbNuvola4.setBounds(0, 0, 660, 470);

        lbNuvola3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\3nuvola-01.png")); // NOI18N
        jPanel2.add(lbNuvola3);
        lbNuvola3.setBounds(0, 0, 660, 470);

        lbNuvola2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\2nuvola-01.png")); // NOI18N
        jPanel2.add(lbNuvola2);
        lbNuvola2.setBounds(0, 0, 660, 470);

        lbNuvola1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\1nuvola-01.png")); // NOI18N
        jPanel2.add(lbNuvola1);
        lbNuvola1.setBounds(0, 0, 660, 470);

        lbVirgilio.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\movirg1.gif")); // NOI18N
        jPanel2.add(lbVirgilio);
        lbVirgilio.setBounds(0, 0, 660, 470);

        lbDante.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\dantemov6.gif")); // NOI18N
        jPanel2.add(lbDante);
        lbDante.setBounds(0, 0, 660, 472);

        lbSfondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\sfondoanimepic.jpg")); // NOI18N
        jPanel2.add(lbSfondo);
        lbSfondo.setBounds(0, 0, 660, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSaltaActionPerformed

    private void btSaltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSaltaMouseClicked
        // TODO add your handling code here:

        Esame2022.finGioco.setVisible(true);
        
        Esame2022.finGioco.btTimer.setVisible(false);
        Esame2022.finGioco.btTimer.doClick();

        Esame2022.finIniziale.setVisible(false);  // nasconde sè stessa    

// TODO add your handling code here:

    }//GEN-LAST:event_btSaltaMouseClicked

    private void lbProvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProvaMouseClicked
        // TODO add your handling code here:

        Esame2022.finGioco.setVisible(true);

        Esame2022.finIniziale.setVisible(false);  // nasconde sè stessa

    }//GEN-LAST:event_lbProvaMouseClicked

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
            java.util.logging.Logger.getLogger(Provalau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Provalau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Provalau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Provalau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Provalau2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalta;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbDante;
    private javax.swing.JLabel lbLibro;
    private javax.swing.JLabel lbNuvola1;
    private javax.swing.JLabel lbNuvola2;
    private javax.swing.JLabel lbNuvola3;
    private javax.swing.JLabel lbNuvola4;
    private javax.swing.JLabel lbNuvola5;
    private javax.swing.JLabel lbProva;
    private javax.swing.JLabel lbSfondo;
    private javax.swing.JLabel lbVirgilio;
    // End of variables declaration//GEN-END:variables

    class MiaAttesa extends TimerTask {

        long contatore;

        public MiaAttesa() {
            contatore = 0;
        } // endof costruttore

        public void run() {

            contatore = contatore + 1;

            if (contatore == 6) {
                // contatore = 0; 

                lbNuvola1.setVisible(true);

            } // endif contatore

            if (contatore == 8) {
                // contatore = 0; 

                lbNuvola2.setVisible(true);

            } // endif contatore

            if (contatore == 9) {

                lbNuvola1.setVisible(false);

            } // endif contatore 10

            if (contatore == 11) {

                lbNuvola2.setVisible(false);

            } // endif contatore 10

            if (contatore == 13) {
                // contatore = 0; 

                lbNuvola3.setVisible(true);

            } // endif contatore 10

            if (contatore == 25) {

                lbNuvola3.setVisible(false);

            } // endif contatore 10

            if (contatore == 26) {
                // contatore = 0; 

                lbNuvola4.setVisible(true);

            } // endif contatore 10

            if (contatore == 38) {

                lbNuvola4.setVisible(false);

            } // endif contatore 10

            if (contatore == 41) {
                // contatore = 0; 

                lbNuvola5.setVisible(true);

            } // endif contatore 10

            if (contatore == 50) {

                lbNuvola5.setVisible(false);

            } // endif contatore 10

            
            
            if (contatore == 62) {

                lbProva.setVisible(true);

            } // endif contatore 10
            
            
            
            if (contatore > 10000) {
                contatore = 0;
            }

        } // endof run 

    } // endof miaAttesa

}
