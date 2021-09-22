package ejercicios;


import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int cifras;
        char car;
        do {
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras = 0;
        } while (n != 0);
        n = n / 10;
        cifras++;

        System.out.println("El número tiene " + cifras + " cifras");
    }
}// fin de la clase
