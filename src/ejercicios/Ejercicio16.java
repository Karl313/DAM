package ejercicios;

import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        String usuario = "";
        String contrasena = "ovejita123";
        String comprobar = "";
        
        System.out.println("introduce usuario");
        Scanner sc = new Scanner(System.in);
        usuario = sc.nextLine();
        System.out.println("introduce contraseña");
        comprobar = sc.nextLine();
        if (contrasena.equals(comprobar)) {
            System.out.println("Enhorabuena");
        } else if (contrasena != comprobar) {
            System.out.println("introduce la contraseña correcta");

            for (int i = 1; i <= 3; i++) {
                System.out.println("introduce contraseña");
                comprobar = sc.nextLine();
                
            }System.out.println("Has agotado los intentos");
        }//fin del main
    }
}// fin de la clase
