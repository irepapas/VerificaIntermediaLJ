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
public class Moto extends Veicolo {
    private int tempi;

    public Moto(int tempi, String marca, int anno, int cyl) {
        super(marca, anno, cyl);
        this.tempi = tempi;
    }

    public int getTempi() {
        return tempi;
    }

    public void setTempi(int tempi) {
        this.tempi = tempi;
    }

    @Override
    public String toString(){
        String st = getMarca() +"\n " + getAnno() + "\n " + getCyl() + "\n";
        st+= getTempi();
        return st;
    }
    
}
