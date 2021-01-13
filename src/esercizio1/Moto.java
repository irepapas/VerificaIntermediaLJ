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
    public static enum Tempi {DUETEMPI,QUATTROTEMPI}
    private final Tempi tempi;

    public Moto(Tempi tempi, String marca, int anno, int cyl) {
        super(marca, anno, cyl);
        this.tempi = tempi;
    }

    public Tempi getTempi() {
        return tempi;
    }


    @Override
    public String toString(){
        return super.toString() + "\n" + "Moto{" + "tempi=" + tempi + '}';
    }
    
}
