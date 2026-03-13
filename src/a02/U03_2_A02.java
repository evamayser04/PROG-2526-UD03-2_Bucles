/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int edad = 0;
        int sumaEdades = 0;
        int contador = 0;
        int mayoresEdad = 0;

        // Pedimos la primera edad
        System.out.print("Introduce la edad del alumno (número negativo para terminar): ");
        edad = sc.nextInt();

        // Mientras la edad sea positiva
        while (edad >= 0) {
            sumaEdades = sumaEdades + edad;
            ++contador;

            if (edad >= 18) {
                mayoresEdad = mayoresEdad + 1;
            }

            // Pedir otra edad
            System.out.print("Introduce la edad del alumno (número negativo para terminar): ");
            edad = sc.nextInt();
        }

        // Cuando termina el bucle, mostramos los resultados
        if (contador > 0) {
            double media = (double) sumaEdades / contador;

            System.out.println("\n--- Resultados ---");
            System.out.println("Suma total de edades: " + sumaEdades);
            System.out.println("Número de alumnos: " + contador);
            System.out.println("Media de edad: " + media);
            System.out.println("Mayores de edad: " + mayoresEdad);
        } else {
            System.out.println("No se introdujeron edades válidas.");
        }

        System.out.println("Fin del programa.");
    }
}
