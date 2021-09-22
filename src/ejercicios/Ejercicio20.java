package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        System.out.println("introduce un numero y te digo si es primo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo = true) {
            System.out.println("es primo");
        } else if (primo = false) {
            System.out.println("No es primo");
        } else if (n < 0) {
            System.out.println("error");
        }
    }


}// fin de la clase
