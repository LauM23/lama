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
        
        ImageIcon A = new ImageIcon("media/nuvola1-01.png");
        Image B = A.getImage().getScaledInstance(lbNuvola1.getWidth(), lbNuvola1.getHeight(), java.awt.Image.SCALE_DEFAULT);
        lbNuvola1.setIcon(new ImageIcon(B));

        A = new ImageIcon("media/nuvola2-01.png");
        B = A.getImage().getScaledInstance(lbNuvola2.getWidth(), lbNuvola2.getHeight(), java.awt.Image.SCALE_DEFAULT);
        lbNuvola2.setIcon(new ImageIcon(B));
        
        
        
        
        lbNuvola1.setVisible(false);
        
        lbNuvola2.setVisible(false);

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
        btContinua = new javax.swing.JButton();
        lbNuvola2 = new javax.swing.JLabel();
        lbNuvola1 = new javax.swing.JLabel();
        lbGif = new javax.swing.JLabel();
        lbSfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        btContinua.setBackground(new java.awt.Color(255, 255, 255));
        btContinua.setForeground(new java.awt.Color(255, 153, 0));
        btContinua.setText("CONTINUA");
        btContinua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btContinuaMouseClicked(evt);
            }
        });
        btContinua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContinuaActionPerformed(evt);
            }
        });
        jPanel2.add(btContinua);
        btContinua.setBounds(300, 430, 90, 23);

        lbNuvola2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\nuvolaAIb-01.png")); // NOI18N
        jPanel2.add(lbNuvola2);
        lbNuvola2.setBounds(0, 0, 660, 470);

        lbNuvola1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\nuvola1-01.png")); // NOI18N
        jPanel2.add(lbNuvola1);
        lbNuvola1.setBounds(0, 0, 660, 470);

        lbGif.setIcon(new javax.swing.ImageIcon("C:\\Users\\lauma\\OneDrive\\Documenti\\GitHub\\lama\\Esame2022\\media\\dantemov5.gif")); // NOI18N
        jPanel2.add(lbGif);
        lbGif.setBounds(0, 0, 660, 472);

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

    private void btContinuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btContinuaActionPerformed

    private void btContinuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContinuaMouseClicked
        // TODO add your handling code here:

        ImageIcon A = new ImageIcon("media/Nuvolabase.png");

        Image B = A.getImage().getScaledInstance(lbSfondo.getWidth(), lbSfondo.getHeight(), java.awt.Image.SCALE_DEFAULT);

        lbSfondo.setIcon(new ImageIcon(B));

// TODO add your handling code here:

    }//GEN-LAST:event_btContinuaMouseClicked

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
    private javax.swing.JButton btContinua;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbGif;
    private javax.swing.JLabel lbNuvola1;
    private javax.swing.JLabel lbNuvola2;
    private javax.swing.JLabel lbSfondo;
    // End of variables declaration//GEN-END:variables

    class MiaAttesa extends TimerTask {

        long contatore;

        public MiaAttesa() {
            contatore = 0;
        } // endof costruttore

        public void run() {

            contatore = contatore + 1;

            if (contatore == 7 ) {
               // contatore = 0; 

                lbNuvola1.setVisible(true);
              
            } // endif contatore
            
            
            if (contatore == 9 ) {
               // contatore = 0; 

                lbNuvola2.setVisible(true);
            
            } // endif contatore
            
            
            if (contatore == 11) {

                lbNuvola1.setVisible (false);

            } // endif contatore 10
            
           
            
            if (contatore == 13) {

                lbNuvola2.setVisible (false);

            } // endif contatore 10
            
            
            
            
            
            
            if (contatore > 10000) { contatore = 0; }
            

        } // endof run 

    } // endof miaAttesa

}
