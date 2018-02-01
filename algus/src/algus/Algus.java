/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 * Esimene katsetu. Muutujad, valik, masiiv
 * @author if17
 */
public class Algus {

    /**
     * *Arvamus ilma kohta
     * */
     
    public static void ilmaKommentaar(int temperatuur){
        if(temperatuur > 30){
            System.out.println("palav");
        }else if(temperatuur == 0){
            System.out.println("ei muutu");
        }else if(temperatuur >= 25){
            System.out.println("sulab");
        }else{
            System.out.println("jaatub");
        }
    }
    /**
    * programmi algus tookoht. Siit algustakse kaivitamise 
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        System.out.println("Hello, web");
        ilmaKommentaar(1);
    }
}
