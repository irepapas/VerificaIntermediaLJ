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
public class Tosaerba extends Apparecchio {

      private int nruote;

    public Tosaerba(int nruote, int id, int tot, String marca) {
        super(id, tot, marca);
        this.nruote = nruote;
    }

    public int getNruote() {
        return nruote;
    }

       

      @Override
        public String toString() {
            String s = super.toString() + " num ruote:" + nruote;
            return s;
        }

    }
