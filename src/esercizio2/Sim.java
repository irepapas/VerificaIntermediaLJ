/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irene
 */
public class Sim {

    private final String numero;
    private double credito;
    private final List<Chiamata> listaChiamate;

    public Sim(String numero,double credito) {
        this.numero = numero;
        this.credito = credito;
        this.listaChiamate = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public double getCredito() {
        return credito;
    }


    public void inserisciChiamata(String numero, int durataMinuti, int costoMinuto) {
        Chiamata c1 = new Chiamata(durataMinuti, numero, costoMinuto);
        listaChiamate.add(c1);
        credito -= (double) durataMinuti * costoMinuto;
        listaChiamate.listIterator();
    }

    public int calcoloMinutiTot() {
        int tot = 0;
        for (int i = 0; i < listaChiamate.size(); i++) {
            tot += listaChiamate.get(i).getDurataMinuti();
        }
        return tot;
    }

    public String chimateToSomeone() {
        String someone = "";
        for (int i = 0; i < listaChiamate.size(); i++) {
            someone = listaChiamate.get(i).getNumero();
        }
        return someone;
    }

    @Override
    public String toString() {
        String st = "numero:" + getNumero() + " credito:" + getCredito() + "\n";
        for (int i = 0; i < listaChiamate.size(); i++) {
            st += listaChiamate.get(i).getNumero() + " " + listaChiamate.get(i).getDurataMinuti() + "\n";
        }
        return st;
    }
}
