/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a08;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;   // Variable donde guardamos cada número introducido
        int suma = 0;  // Acumulador donde iremos sumando todos los números
        
        // Bucle for que se repite 10 veces, para pedir 10 números
        for(int contador = 0; contador != 10; ++contador){
            
            System.out.println("Dame un numero");
            num = sc.nextInt();  // Leemos el número introducido por el usuario
            
            suma += num; // Vamos sumando todos los números en la variable "suma"
        } 
        
        // Calculamos la media dividiendo la suma total entre 10
        System.out.println("La media de todos tus numeros es: " + suma / 10);
    }
}
