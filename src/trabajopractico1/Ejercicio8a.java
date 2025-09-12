/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio8a {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = in.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = in.nextInt();
        
        int resultado = numero1 / numero2;
        
        System.out.println("Resultado de la división (int): " + resultado);
        
        in.close();
        
    }
}
