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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = in.next();
        
        System.out.print("Ingrese su edad: ");
        int edad = in.nextInt();
        
        System.out.println(String.format("Nombre: %s, Edad: %d", nombre, edad));
    }
}
