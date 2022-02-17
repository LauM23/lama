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

    public static Provalau2        finIniziale;
    public static FinestraGioco    finGioco;



    public static void main(String[] args) {
        // TODO code application logic here
        
        finIniziale = new Provalau2  ();
        finIniziale.setSize (661,472);
        finIniziale.setLocation(0, 0);
        finIniziale.setVisible(true);
        
        finGioco = new FinestraGioco ();
        finGioco.setSize (661,472);
        finGioco.setLocation (25,25);
        finGioco.setVisible(false);

    }
    
}