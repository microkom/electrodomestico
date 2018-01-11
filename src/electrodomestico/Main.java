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
        Electrodomestico[] nevera = new Electrodomestico[10];
        nevera[0] = new Electrodomestico(3, "azul", 'A', 11);
        nevera[1] = new Electrodomestico(4, "VERDE", 'B', 22);
        nevera[2] = new Electrodomestico(5, "rojo", 'E', 33);
        //
        for (int i = 0; i < nevera.length; i++) {
            if (nevera[i] != null) {
                System.out.println(nevera[i].getColor().toUpperCase());
                System.out.println(nevera[i].getConsumoEnergetico());
                System.out.println(nevera[i].getPeso());
                System.out.println(nevera[i].precioFinal()+"\n");
           }
        }
    }

}
