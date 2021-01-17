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
public class Apparecchio {

    private final int id;
    private int tot;//totale costo riparazione
    private String marca;

    public Apparecchio(int id, String marca) {
        this.id = id;
        this.tot = 0;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public int getTot() {
        return tot;
    }

    public String getMarca() {
        return marca;
    }

    

    @Override
    public String toString() {
        String s = "id:" + id + " marca:" + marca + " tot:" + tot;
        return s;
    }
}
