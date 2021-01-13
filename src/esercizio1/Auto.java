/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author Irene
 */
public class Auto extends Veicolo{
    public static enum Alimentazione {Benzina, Diesel};
    private int porte;
    public Alimentazione alimentazione;

    public Auto(int porte, Alimentazione alimentazione, String marca, int anno, int cyl) {
        super(marca, anno, cyl);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

  
   

    public int getPorte() {
        return porte;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    

    
    @Override
    public String toString(){
        String st =  super.toString();
        st+= getPorte() + "\n" + getAlimentazione() + "\n";
        return st;
        
    }
    
    
    
}
