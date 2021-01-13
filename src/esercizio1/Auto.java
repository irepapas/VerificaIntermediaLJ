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
    private int porte;
    private char alimentazione;

    public Auto(int porte, char alimentazione, String marca, int anno, int cyl) {
        super(marca, anno, cyl);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    public char getAlimentazione() {
        return alimentazione;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getAnno() {
        return anno;
    }

    @Override
    public int getCyl() {
        return cyl;
    }
    
    @Override
    public String toString(){
        String st = getId() +"\n " + getMarca() +"\n " + getAnno() + "\n " + getCyl() + "\n";
        st+= getPorte() + "\n" + getAlimentazione() + "\n";
        return st;
        
    }
    
    
    
}
