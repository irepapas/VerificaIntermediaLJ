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
       try{
        Garage garage = new Garage(15);
        garage.entra(new Auto(4, Auto.Alimentazione.BENZINA, "Fiat", 2000, 200));
        garage.entra(new Furgone(30, "Ducato",1998, 2278));
        garage.entra(new Moto(2, "Honda", 2005, 78));
        garage.stampaSituazionePosti();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        
        
        
       
    }
}
