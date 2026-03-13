/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a03;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author evama
 */
public class U03_2_A03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // Generar número secreto entre 1 y 100
        int numeroSecreto = random.nextInt(99)+1;
        int intento = 0;
        
        System.out.println("Adivina el número secreto (entre 1 y 100).");
        System.out.println("Introduce -1 si te rindes.");
        
        // Pedimos el primer número
        System.out.print("Introduce tu número: ");
        intento = sc.nextInt();
        
        // Bucle principal del juego
        while (intento != -1 && intento != numeroSecreto) {
            
            if (intento < numeroSecreto) {
                System.out.println("El número secreto es MAYOR.");
            }
            if (intento > numeroSecreto) {
                System.out.println("El número secreto es MENOR.");
            }
            
            System.out.print("Intenta de nuevo (-1 para rendirte): ");
            intento = sc.nextInt();
        }
        
        // Resultado final
        if (intento == numeroSecreto) {
            System.out.println("¡Enhorabuena! Has acertado el número secreto.");
        } else if (intento == -1) {
            System.out.println("Te has rendido. El número secreto era: " + numeroSecreto);
        }
        
        System.out.println("Fin del juego.");
    }
}
