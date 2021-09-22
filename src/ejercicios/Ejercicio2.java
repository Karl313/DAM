package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("introduce un numero para pasarlo a codigo ascii");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char caracter = (char) num;
        System.out.println("el numero "+num+ " corresponde al caracter "+ caracter);
    }//fin del main

}// fin de la clase
