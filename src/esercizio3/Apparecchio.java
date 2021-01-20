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

    private int id_ordine;
    private String marca;
    private double totRiparazioni;
    private List <Riparazione> elencoRiparazioni;

    public Apparecchio(String marca) {
        this.marca = marca;
        this.elencoRiparazioni= new ArrayList<>();
    }

    public  int getId_ordine() {
        return id_ordine;
    }

    public String getMarca() {
        return marca;
    }

    public double getTotRiparazioni() {
        return totRiparazioni;
    }

    public List<Riparazione> getElencoRiparazioni() {
        return elencoRiparazioni;
    }

    public void setId_ordine(int id_ordine) {
        this.id_ordine = id_ordine;
    }

    
    public Riparazione AggiungiRiparazione(String tipoRiparazione, double prezzo){
        Riparazione x = new Riparazione(tipoRiparazione, prezzo, marca);
        this.elencoRiparazioni.add(x);
        this.totRiparazioni+=prezzo;
        return x;
    }
    
 
   
    
    
    }
