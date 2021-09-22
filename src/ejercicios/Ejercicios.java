package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el radio del circulo");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es " + area);
        sc.close();
    }//fin del main

}// fin de la clase
