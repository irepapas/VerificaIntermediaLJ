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
    
  private final List <Apparecchio> elencoApparecchi;
  private int id =0;

    public Aggiusteria(int id) {
        this.id = id;
        elencoApparecchi= new ArrayList<>(id);
        inizializza();
    }

    public int getId() {
        return id;
    }
     public void inserisci(Apparecchio a) {
        if (riparazioniInCorso() == -1) {
            throw new AggiusteriaException("Lavoro pieno...");
        }
        elencoApparecchi.set(riparazioniInCorso(), a);
    }
    
     public Apparecchio elimina(int id) {
        if (id >= this.id || elencoApparecchi.get(id) == null) {
            throw new AggiusteriaException("L'id non esiste oppure è vuoto");
        }
        Apparecchio a = elencoApparecchi.get(id);
        elencoApparecchi.set(id, null);
        return a;
    }
     
     public void stampaSituazione() {
        for (int id = 0; id < elencoApparecchi.size(); id++) {
            if (elencoApparecchi.get(id) != null) {
                System.out.println("--------------- ID " + id + "------------------");
                System.out.println(elencoApparecchi.get(id));
                System.out.println("---------------------------------");
                System.out.println();
            }

        }
    }

  
    private void inizializza() {
        for(int i=0; i<this.id; i++){
           elencoApparecchi.add(null);
        }
    }
    
    private int riparazioniInCorso() {
        return elencoApparecchi.indexOf(null);
    }
    
    
    
}
