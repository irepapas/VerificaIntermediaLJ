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
public class Riparazione {

    String rip;
    double prz;

    public Riparazione(String rip, double prz) {
        this.rip = rip;
        this.prz = prz;
    }

   

    public double getprz() {
        return prz;
    }

    @Override
    public String toString() {
        String s = "\tvoce:" + rip + " costo:" + prz + "\n";
        return s;
    }
}
