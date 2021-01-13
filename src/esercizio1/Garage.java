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

    static ArrayList <Veicolo> elencoVeicoli = new ArrayList<Veicolo>();
  
    
    public void entra(Veicolo v){
        
        elencoVeicoli.add(v);
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
            System.out.println(elencoVeicoli.get(posto));
            
        }
        return;
    }
    }    
        
       
        
   
    
   
    
}
