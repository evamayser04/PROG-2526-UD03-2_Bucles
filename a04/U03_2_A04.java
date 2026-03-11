/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int etiqueta = 0;              // Número de árbol (comienza en 0)
        int altura = 0;               // Altura introducida
        int etiquetaMasAlto = -1;    // Guardará la etiqueta del árbol más alto
        int alturaMax = 0;          // Guardará la altura máxima
        
        System.out.println("Introduce la altura (en cm) de cada árbol.");
        System.out.println("Introduce -1 para terminar.");
        
        System.out.print("Altura del árbol " + etiqueta + ": ");
        altura = sc.nextInt();
        
        // Bucle hasta que el usuario introduzca -1
        while (altura != -1) {
            
            // Comprobamos si es el árbol más alto hasta ahora
            if (altura > alturaMax) {
                alturaMax = altura;
                etiquetaMasAlto = etiqueta;
            }
            
            // Pasamos al siguiente árbol
            ++etiqueta;
            
            System.out.print("Altura del árbol " + etiqueta + ": ");
            altura = sc.nextInt();
        }
        
        // Mostrar resultados
        if (etiquetaMasAlto != -1) {
            System.out.println("El árbol más alto es el número " + etiquetaMasAlto);
            System.out.println("Su altura es de " + alturaMax + " cm.");
        } else {
            System.out.println("No se introdujeron alturas válidas.");
        }
        
        System.out.println("Fin del programa.");
    }
}
