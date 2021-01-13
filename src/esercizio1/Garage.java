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
    
    private int cercaVeicolo(Veicolo v){
        int result = -1;
        for(int i=0;i<elencoVeicoli.size();i++){
            if(elencoVeicoli.get(i).equals(v))
                result = i;}
        return result;
        }
    
    public void esci(Veicolo v){
        if (cercaVeicolo(v)==-1)
            return;
        elencoVeicoli.remove(cercaVeicolo(v));
    }
    
   
        
        
       
        
   
    
   
    
}
