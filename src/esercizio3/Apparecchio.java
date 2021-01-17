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
    private Riparazione[] elencoRiparazioni;

    public Apparecchio(int id, String marca) {
        this.id = id;
        this.tot = 0;
        this.marca = marca;
        elencoRiparazioni = new Riparazione[10];
        for (int i = 0; i < elencoRiparazioni.length; i++) {
            elencoRiparazioni[i] = new Riparazione("", 0);
        }
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
        if(elencoRiparazioni[0].getprz()!=0)
        for(int j=0;j < elencoRiparazioni.length;j++){
            if(elencoRiparazioni[j].getprz()!=0)
                s+=elencoRiparazioni[j];
        }
        return s;
    }
    
    //incremento il totale del costo della riparazione
    public void setlista(String ripara, int prez) {
        for (int j = 0; j < elencoRiparazioni.length; j++) {
            if (elencoRiparazioni[j].getprz() == 0) {
                elencoRiparazioni[j] = new Riparazione(ripara, prez);
                tot += prez;
                break;
            }
        }
        
    }
    }
