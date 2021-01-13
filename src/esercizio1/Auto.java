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
public class Auto extends Veicolo{
    private int porte;
    private char alimentazione;

    public Auto(int porte, char alimentazione, String marca, int anno, int cyl) {
        super(marca, anno, cyl);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    public char getAlimentazione() {
        return alimentazione;
    }


    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getAnno() {
        return anno;
    }

    @Override
    public int getCyl() {
        return cyl;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public void setAlimentazione(char alimentazione) {
        this.alimentazione = alimentazione;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public void setCyl(int cyl) {
        this.cyl = cyl;
    }
    
    @Override
    public String toString(){
        String st =  getMarca() +"\n " + getAnno() + "\n " + getCyl() + "\n";
        st+= getPorte() + "\n" + getAlimentazione() + "\n";
        return st;
        
    }
    
    
    
}
