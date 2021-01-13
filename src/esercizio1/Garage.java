/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.ArrayList;

/**
 *
 * @author Irene
 */
public class Garage {

    private final ArrayList <Veicolo> elencoVeicoli;
    private final int posti;

    public Garage(int posti) {
        elencoVeicoli = new ArrayList<>(posti);
        this.posti = posti;
        inizializza();
    }

    public int getPosti() {
        return posti;
    }
    
    
    
    public void entra(Veicolo v){
        if(postoLibero()==-1){
            throw new IllegalStateException("Il garage e pieno");
        }
        elencoVeicoli.set(postoLibero(),v);
    }
    
 
    public Veicolo esci(int posto){
        Veicolo v= elencoVeicoli.get(posto);
        elencoVeicoli.set(posto,null);
        return v;
        
    }
    public void stampaSituazionePosti(){
     for (int posto=0; posto<elencoVeicoli.size();posto++){
         if(elencoVeicoli.get(posto) !=null){
            System.out.println("Posto:" + posto);
            System.out.println();
            System.out.println(elencoVeicoli.get(posto));
            System.out.println();
        }
        return;
    }
    }    

    private void inizializza() {
        for(int i=0; i<this.posti; i++){
            elencoVeicoli.add(null);
        }
    }

    private int postoLibero() {
        return elencoVeicoli.indexOf(null);
    }
        
       
        
   
    
   
    
}
