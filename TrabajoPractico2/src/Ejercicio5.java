/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int suma = 0;
        System.out.print("Ingrese un numero entero: ");
        int numero = in.nextInt();
        
        while(numero != 0) {
            if (numero % 2 == 0) {
                suma = suma + numero;
            }
            
            System.out.print("Ingrese un numero entero: ");
            numero = in.nextInt();
        }
        
        System.out.println("La suma de los números pares es: " + suma);
        in.close();
        
    }
}
