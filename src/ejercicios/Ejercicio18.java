package ejercicios;


import java.util.Scanner;

/**
 * @author CFGS
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        System.out.println("introduce 2 numeros");
        System.out.println("introduce el primer numero");

        Scanner sc = new Scanner(System.in);
        int n1 = (int) sc.nextDouble();
        System.out.println("introduce el segundo numero");
        int n2 = (int) sc.nextDouble();
        System.out.println("---------------------------------------------------------------------------------------------");
        int n=(int) (Math.random()*100);
       
        
   for(int i=0;i<50;i++){
       System.out.println((int)(Math.random()*(n2-n1)+1));
   }
             
        
    }//fin del main

}// fin de la clase
