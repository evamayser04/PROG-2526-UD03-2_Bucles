/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a01;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class U03_2_A01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = 1;
        
        while (num > 0 || num < 0) {
            System.out.print("Introduce tu número: ");
            num = sc.nextInt();
            
            if (num %2 == 0) {
                System.out.println("Tu número es par");
            }
            if (num > 0){
                System.out.println("Tu número es positivo");
            }
             double cuadrado = Math.pow(num, 2);
             
             System.out.println("Fin del programa.");
        }
    }
 
}
