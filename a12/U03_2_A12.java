/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a12;

/**
 *
 * @author evama
 */
public class U03_2_A12 {
    public static void main(String[] args) {
     // Encabezado de columnas (opcional)
        System.out.println("Tablas de multiplicar (1 a 10):");

    // Primer bucle: recorre los números del 1 al 10
    // Cada valor de 'i' corresponde a una tabla de multiplicar diferente
    for (int i = 1; i <= 10; i++){

        // Título que indica qué tabla se está mostrando
        System.out.println("Tabla del:" + i);

        // Segundo bucle: genera cada operación de la tabla actual
        for (int j = 1; j <= 10; j++){

            // Muestra la multiplicación: i * j = resultado
            System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
