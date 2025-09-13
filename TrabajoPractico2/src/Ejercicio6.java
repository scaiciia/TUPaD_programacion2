/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int num = in.nextInt();
            
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.printf("Positivos: %d\nNegativos: %d\nCeros: %d\n", positivos, negativos, ceros);
    }
}
