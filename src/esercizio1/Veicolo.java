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
public class Veicolo {
    protected int id; // identifica posto
    protected String marca; // azienda produttrice
    protected int anno; // anno di fabbricazione 
    protected int cyl; // cilindrata

    public Veicolo(String marca, int anno, int cyl) {
        this.marca = marca;
        this.anno = anno;
        this.cyl = cyl;
        
        
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public int getCyl() {
        return cyl;
    }

    @Override
     public String toString(){
        String st = getId() +"\n " + getMarca() +"\n " + getAnno() + "\n " + getCyl() + "\n";
        return st;
     }
    
    
}