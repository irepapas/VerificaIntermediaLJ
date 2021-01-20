/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irene
 */
public class Aggiusteria {
    
 public static ArrayList<Apparecchio> lavorazioni = new ArrayList<>();
 public List <Apparecchio> eleApparecchi;
 private final int id_ordine;

    public Aggiusteria(int id) {
        this.id_ordine=id;
        this.eleApparecchi = new ArrayList<>();
        inizializza();
    }

    public int getId_ordine() {
        return id_ordine;
    }
     
 


     public void inserisci(Apparecchio a, int id) {
        if ( riparazioniInCorso()== -1) {
            throw new AggiusteriaException("Aggiusteria pieno...");
        }
        eleApparecchi.set(riparazioniInCorso(), a);
        a.setId_ordine(id++);
    }
    public void inserisciLavorazione(int id_ordine,Riparazione r) {
        try {
            if (riparazioniInCorso()== -1) {
                throw new AggiusteriaException("Raggiunto limite lavorazioni");
            }
            eleApparecchi.get(id_ordine).AggiungiRiparazione("", 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
     public void riparazioneStampa(Apparecchio a){
        System.out.println("Riparazione effettuata per: "+a.getMarca()+"\ncon id ordine: "+ a.getId_ordine());
        System.out.println("Sono state effettuate le seguenti riparazioni: ");
        for (Riparazione r: a.getElencoRiparazioni()) {
            System.out.println(r.toString());
            System.out.println("-----------------------");
        }
        System.out.println("Il costo totale delle riparazioni è: "+a.getTotRiparazioni());
        
        lavorazioni.set(lavorazioni.indexOf(a), null);
            
    }
     public Apparecchio elimina(int id) {
        if (id >= this.id_ordine|| eleApparecchi.get(id) == null) {
            throw new AggiusteriaException("L'id non esiste oppure è vuoto");
        }
        Apparecchio a = eleApparecchi.get(id);
        eleApparecchi.set(id, null);
        return a;
    }
      
    
     
     
   
  
    private void inizializza() {
        for(int i=0; i<this.id_ordine; i++){
           eleApparecchi.add(null);
        }
    }
    
    public int riparazioniInCorso() {
        return lavorazioni.indexOf(null);
    }
    
    
    
}
