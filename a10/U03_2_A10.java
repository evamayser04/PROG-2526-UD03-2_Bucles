/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a10;

/**
 *
 * @author evama
 */
public class U03_2_A10 {
    public static void main(String[] args) {
        
        int contador = 0; // Contará cuántos números impares llevamos (hasta 10)
        int suma = 0;     // Acumulará la suma de los impares
        
        // Empezamos en a = 1 e iremos aumentando hasta conseguir 10 impares
        for(int a = 1; contador < 10; ++a){
            
            // Comprobamos si 'a' es impar usando módulo 2
            if (a % 2 != 0){
                ++contador; // Llevamos 1 impar más
                suma += a;  // Sumamos el impar a la suma total
            }
        }
        
        // Mostramos el resultado final
        System.out.println("La suma de los primeros 10 números impares es: " + suma);
    }
}
