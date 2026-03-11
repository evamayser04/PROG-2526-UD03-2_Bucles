/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a09;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A09 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        int num; // Variable donde guardamos el número introducido por el usuario
        
        // Bucle do-while para asegurarnos de que el usuario introduce un número válido
        do {
            System.out.println("Introduzca un numero de 1 a 10");
            num = sc.nextInt(); // Leemos el número
        } while (!(1 <= num && num <= 10));
        // Repetimos el bucle si el número NO está entre 1 y 10
        
         // Mostramos un título indicando de qué número es la tabla
        System.out.println("Tabla del " + num + ":");
        
        // Bucle for que genera la tabla de multiplicar desde 1 hasta 10
        for (int i = 1; i <= 10; i++) {
            // Mostramos cada línea de la tabla: num x i = resultado
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
