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
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veicolo other = (Veicolo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    @Override
     public String toString(){
        return "Veicolo{" + "id=" + id + ", marca=" + marca + ", anno=" + anno + ", colindrata=" + cyl + '}';
     }
    
    
}
