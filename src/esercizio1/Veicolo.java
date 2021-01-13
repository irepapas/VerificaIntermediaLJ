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
    
    private static int counter;
    private final int id;
    private final String marca; // azienda produttrice
    private final int anno; // anno di fabbricazione 
    private final int cyl; // cilindrata

    public Veicolo(String marca, int anno, int cyl) {
        this.id=++counter;
        this.marca = marca;
        this.anno = anno;
        this.cyl = cyl;
        
        
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

    public int getId() {
        return id;
    }
    
    @Override
     public String toString(){
        String st = "Marca:" + getMarca() +"\n " + "Anno:"+ getAnno() + "\n " +  "Cilindrata:"+ getCyl() + "\n";
        return st;
     }
    
    
}
