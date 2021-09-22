package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero de ventas");
        int nVentas = sc.nextInt();

        int sumatoria = 0;
        for (int i = 0; i < nVentas; i++) {
            System.out.println("introduce las cantidades de las ventas");
            int valorVentas = sc.nextInt();
            //sumatoria=sumatoria+valorVentas;
            sumatoria += valorVentas;
        }
        System.out.println("la suma de las cantidades es " + sumatoria);

    }//fin del main

}// fin de la clase
