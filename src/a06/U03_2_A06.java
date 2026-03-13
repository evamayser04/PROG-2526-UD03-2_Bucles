/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06;
import  java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pedir un número al usuario
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        // Mostrar los números del 1 al n
        for (int i = 1; i <= n; i++) {
            System.out.println("" + i);
        /*Se declara la variable, si esa variable declarada es mayor
          o igual que el numero que se pide se suma 1 y asi se sumaria
          primero se mostraria por pantalla y luego se suma hasta que sea igual a n*/
        }
    }
}
