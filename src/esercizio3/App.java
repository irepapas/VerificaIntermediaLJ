/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;

/**
 *
 * @author Irene
 */
public class App {
    
    public static void main(String[] args) {
        
         Aggiusteria e= new Aggiusteria(0);
         e.inserisci(new Motozappa(2, "Alko"), 0);
         e.inserisci(new Tosaerba(4, "McCulloch"), 0);
         e.inserisci(new Decespugliatore(true, "Ehinell") , 0);
         
         e.inserisciLavorazione(0, new Riparazione("Cambio ruote", 45, "Alko"));
         e.riparazioneStampa(0);
         
        
       

        
        
        
       
        
    }
 
 

}
