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
public class App {
    
    public static void main(String[] args) {
       
        Garage garage = new Garage();
        Auto a1= new Auto(4, Auto.Alimentazione.Benzina, "Fiat", 2000, 200);
        garage.entra(a1);
        Furgone f1= new Furgone(2500, "Ducato", 1998, 2287);
        garage.entra(f1);
        Moto m1 = new Moto(4, "Honda", 2005, 78);
        garage.entra(m1);
        
        garage.esci(m1);
        
        
        
        
       
    }
}
