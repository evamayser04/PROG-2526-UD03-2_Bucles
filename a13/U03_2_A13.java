/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a13;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero"); // Pedimos al usuario el tamaño del triángulo
        
        // Bucle externo: controla las filas del triángulo
        // 'num' empieza con el número introducido y va disminuyendo hasta 1
        for(int num = sc.nextInt(); num > 0; --num){
            
            // Bucle interno: imprime los asteriscos de cada fila
            // 'asterisco' empieza con el valor de 'num' y va disminuyendo hasta 1
            for(int asterisco = num; asterisco > 0; --asterisco){
                System.out.print("*"); // Imprime un asterisco sin salto de línea
            }
            
            System.out.println(" "); // Salto de línea para pasar a la siguiente fila
        }
    }
}
