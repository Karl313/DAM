package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        System.out.println("introduce 2 numeros");
        System.out.println("introduce el primer numero");

        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        System.out.println("introduce el segundo numero");
        double n2 = sc.nextDouble();
        

        int n = sc.nextInt();
        boolean primo = true;
        for (n1 = sc.nextDouble(); n1 <= n2; n1++) {
            for (int i = 2; i < n; i++) {
                if (n % i == 1) {
                    primo = true;
                    System.out.println(n);
                }
            }
        }
        System.out.println("los numeros primos comprendidos entre n1 y n2 son los siguientes");

    }//fin del main

}// fin de la clase
