package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        System.out.println("Dime si el dia es laboral o no");
        Scanner sc = new Scanner(System.in);
        String diaGuardado = sc.nextLine();
        System.out.println("comparando el dia con el dia escrito");
        String Lunes = "Lunes";
        String martes = "martes";
        String miercoles = "miercoles";
        String jueves = "Jueves";
        String viernes = "viernes";
        String sabado = "sabado";
        String domingo = "domingo";
        if (diaGuardado.equalsIgnoreCase(Lunes)) {
            System.out.println("el dia es laboral");
        } else if (diaGuardado.equalsIgnoreCase(martes)) {
            System.out.println("el dia es laboral");
        } else if (diaGuardado.equalsIgnoreCase(miercoles)) {
            System.out.println("el dia es laboral");
        } else if (diaGuardado.equalsIgnoreCase(jueves)) {
            System.out.println("el dia es laboral");
        } else if (diaGuardado.equalsIgnoreCase(viernes)) {
            System.out.println("el dia es laboral");
            } else if (diaGuardado.equalsIgnoreCase(sabado)) {
            System.out.println("el dia no es laboral");
        } else if (diaGuardado.equalsIgnoreCase(domingo)) {
            System.out.println("el dia no es laboral");
        }
    }//fin del main

}// fin de la clase
