package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce el valor de a");
        int a = sc.nextInt();
        System.out.println("introduce el valor de b");
        int b = sc.nextInt();
        System.out.println("introduce el valor de c");
        int c = sc.nextInt();
        double x = 0;
        double discriminante = 0;

        discriminante = Math.pow(b, 2) - (4 * a * c);
        if (discriminante < 0) {
            System.out.println("no tiene solucion");
        } else if (discriminante > 0) {
            System.out.println("tiene 2 soluciones");
            double raiz = Math.sqrt(discriminante);
            x = ((b * (-1)) + raiz) / (2 * a);
            System.out.println(x);

            raiz = Math.sqrt(discriminante);
            double y = 0;
            y = ((b * (-1) - raiz )/ (2 * a));
            System.out.println(y);
        } else if (discriminante == 0) {

            System.out.println("tiene una solucion");
            double raiz = Math.sqrt(discriminante);
            x = ((b * (-1)) + raiz) / (2 * a);
            System.out.println(x);

        }

    }//fin del main

}// fin de la clase
