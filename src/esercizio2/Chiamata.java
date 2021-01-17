/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author Irene
 */
public class Chiamata {
    
    private final int durataMinuti;
    private final String destinatario;

    public Chiamata(int durataMinuti, String destinatario) {
        this.durataMinuti = durataMinuti;
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
   
    
    public int getDurataMinuti() {
        return durataMinuti;
    }

    @Override
   public String toString(){
       String s ="";
       return s = "Destinatario:"+ destinatario + "\n" + "Durata:"+ durataMinuti;
   }

    
    
    
    
    
    
    
    
}
