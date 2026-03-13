/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a11;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A11 {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        int fact = 1; // Variable donde almacenaremos el resultado del factorial
        
        System.out.println("Dame un número:");
        int num = sc.nextInt(); // Número introducido por el usuario
        
        // Bucle que calcula el factorial
        // Empieza en 'num' y va bajando hasta 1
        for(int contador = num; contador > 0; --contador){
            fact *= contador; // Multiplicamos fact por el valor actual del contador
        }
        
        // Mostramos el resultado final
        System.out.println("El factorial de su número es: " + fact);
    }   
}
