/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irene
 */
public class Apparecchio {

    private final int id;
    private int tot;//totale costo riparazione
    private String marca;
    private List<Riparazione>elencoRiparazioni;

    public Apparecchio(int id, String marca) {
        this.id = id;
        this.tot = 0;
        this.marca = marca;
        this.elencoRiparazioni=new ArrayList<>();
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
    
    public void AggiungiRiparazione(String rip, double prz){
        this.elencoRiparazioni.add(new Riparazione(rip, prz));
        this.tot+=prz;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
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
        final Apparecchio other = (Apparecchio) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    }
