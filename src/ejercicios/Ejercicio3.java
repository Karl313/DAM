package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el precio sin iva y te digo el precio con iva");
        double precio = sc.nextDouble();
        final double IVA5 = 1.05;
        final double IVA21 =  1.21;
        System.out.println("el precio final al 21% es " + precio*IVA5 +"€");
        System.out.println("el precio final al 5% es " + precio*IVA21 + "€");
    }//fin del main

}// fin de la clase
