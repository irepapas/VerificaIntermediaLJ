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
    // public static enum Alimentazione {Benzina, Diesel};
    private int porte;
    private String alimentazione;

    public Auto(int porte, String alimentazione, String marca, int anno, int cyl) {
        super(marca, anno, cyl);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

   

    public int getPorte() {
        return porte;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    
    @Override
    public String toString(){
        String st =  getMarca() +"\n " + getAnno() + "\n " + getCyl() + "\n";
        st+= getPorte() + "\n" + getAlimentazione() + "\n";
        return st;
        
    }
    
    
    
}
