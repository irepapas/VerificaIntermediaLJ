/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author Irene
 */
public class Riparazione extends Apparecchio{

   private  String tipoRiparazione;
   private double prezzo;

    public Riparazione(String tipoRiparazione, double prezzo, String marca) {
        super(marca);
        this.tipoRiparazione = tipoRiparazione;
        this.prezzo = prezzo;
    }

   

    public String getTipoRiparazione() {
        return tipoRiparazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

   

  

    

    @Override
    public String toString() {
        String s = "\tvoce:" + tipoRiparazione + " costo:" + prezzo+ "\n";
        return s;
    }
}
