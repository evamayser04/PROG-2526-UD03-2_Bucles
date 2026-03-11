/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author evama
 */
public class U03_2_A05 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int num1;
        int num2;
        int respuesta;
        int operacionesCorrectas = 0;
        
        System.out.println("Juego de cálculo mental: suma los dos números.");
        System.out.println("Si te equivocas, el juego termina.");
        
        do {
        // Generar los dos primeros números aleatorios
        num1 = random.nextInt(99)+1;
        num2 = random.nextInt(99)+1;
        
        System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
        respuesta = sc.nextInt();
        
        if (respuesta == num1 + num2) {
                operacionesCorrectas = operacionesCorrectas + 1;
                System.out.println("¡Correcto!");
            }
        
       } while (respuesta == num1 + num2);
            
            // Cuando se equivoca, el bucle termina
            System.out.println("Incorrecto. Fin del juego.");
            System.out.println("Has acertado " + operacionesCorrectas + " sumas.");
        
        System.out.println("Fin del programa.");
    }
}
