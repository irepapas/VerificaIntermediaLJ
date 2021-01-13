/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irene
 */
public class Garage {

    private final List <Veicolo> elencoVeicoli;
    private final int posti;

    public Garage(int posti) {
        this.posti = posti;
       elencoVeicoli= new ArrayList<>(posti);
        inizializza();
    }

    public int getPosti() {
        return posti;
    }
    
    
    public void entra(Veicolo v) {
        if (postoLibero() == -1) {
            throw new GarageException("Il garage è pieno...");
        }
        elencoVeicoli.set(postoLibero(), v);
    }
    
 
    public Veicolo esci(int posto) {
        if (posto >= this.posti || elencoVeicoli.get(posto) == null) {
            throw new GarageException("Il posto non esiste oppure è vuoto");
        }
        Veicolo v = elencoVeicoli.get(posto);
        elencoVeicoli.set(posto, null);
        return v;
    }
 
    public void stampaSituazionePosti() {
        for (int posto = 0; posto < elencoVeicoli.size(); posto++) {
            if (elencoVeicoli.get(posto) != null) {
                System.out.println("--------------- POSTO " + posto + "------------------");
                System.out.println(elencoVeicoli.get(posto));
                System.out.println("---------------------------------");
                System.out.println();
            }

        }
    }
    
    public boolean isLibero() {
        return postoLibero() != -1;
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
