/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author Irene
 */
public class App {
    public static void main(String[] args) {
        
        Sim s= new Sim("012456789", 5, 25.30);
        s.inserisciChiamata("789", 12, 3);
        s.inserisciChiamata("456", 10, 1);
        s.inserisciChiamata("789", 5, 4);
        s.calcoloMinutiTot();
        s.chimateToSomeone();
        s.toString();
    }
}
