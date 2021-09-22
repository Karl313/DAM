package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        int nVentas = 0;
        int sumatoria = 0;
        int valorVentas = 0;
        String salida = String.valueOf(valorVentas);
        String asterisco = "*";
        do {

            System.out.println("introduce el numero de ventas");
            Scanner sc = new Scanner(System.in);
            nVentas = sc.nextInt();
            for (int i = 0; i < nVentas; i++) {
                System.out.println("introduce las cantidades de las ventas");
                valorVentas = sc.nextInt();
                if("*".equals(valorVentas)){
                    
                }
                //sumatoria=sumatoria+valorVentas;
                sumatoria += valorVentas;
            }
            System.out.println("la suma de las cantidades es " + sumatoria);

        } while (true);

        sumatoria += valorVentas;

        System.out.println("la suma de las cantidades es " + sumatoria);

    }//fin del main

}// fin de la clase
