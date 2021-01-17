/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author Irene
 */
public class Chiamata {
    
    private int durataMinuti;
    private final String numero;
    private double costoMinuto;

    public Chiamata(int durataMinuti, String numero, double costoMinuto) {
        this.durataMinuti = durataMinuti;
        this.numero = numero;
        this.costoMinuto = costoMinuto;
    }
    
    

    
    public int getDurataMinuti() {
        return durataMinuti;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }
    

    public String getNumero() {
        return numero;
    }
    
    
    
    
    
    
    
    
}
