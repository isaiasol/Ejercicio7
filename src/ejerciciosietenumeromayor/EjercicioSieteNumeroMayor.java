/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosietenumeromayor;

import java.util.Scanner;

/**
 *
 * @author OrtizL
 */
public class EjercicioSieteNumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero1, numero2, numero3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        numero1=teclado.nextLine();
        System.out.println("Introduce el segundo número:");
        numero2=teclado.nextLine();
        System.out.println("Introduce el tercer número:");
        numero3=teclado.nextLine();
        double num1=Double.parseDouble(numero1);
        double num2=Double.parseDouble(numero2);
        double num3=Double.parseDouble(numero3);
        double mayor=0;
        if (num1>mayor){mayor=num1;}
        if (num2>mayor){mayor=num2;}
        if (num3>mayor){mayor=num3;}
        System.out.println("El número mayor es: "+ mayor);
    }
    
}
