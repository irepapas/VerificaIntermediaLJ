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
        
        Sim s= new Sim("0124", 20.30);
        s.chiamata(12, "789");
        s.chiamata(14, "123");
        s.chiamata(2, "567");
        s.chiamata(4, "789");
        s.calcoloMinutiTot();
        s.chimateToSomeone();
        s.toString();
    }
}
