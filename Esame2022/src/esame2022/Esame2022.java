/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esame2022;

/**
 *
 * @author lauma
 */
public class Esame2022 {

    public static Provalau2 finIniziale;
    public static FinestraGioco finGioco;
    public static FinestraAudio FA;
    

    
    public static void main(String[] args) {
        // TODO code application logic here

        finIniziale = new Provalau2();
        finIniziale.setLocation(438, 180);
        finIniziale.setVisible(true);

        finGioco = new FinestraGioco();
        finGioco.setLocation(438, 180);
        finGioco.setVisible(false);
        
        FA = new FinestraAudio();
        FA.setLocation(0, 0);
        FA.setVisible(false);

    }

}
