/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

/**
 *
 * @author DAW
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico nevera=new Electrodomestico(1,"morado",'h',1);
        
        System.out.println(nevera.getColor());
        String a="\nblANco";
        System.out.println(a.toLowerCase());
    }
    
}
