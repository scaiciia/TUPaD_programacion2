/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.printf("Precio: %.2f\n", precio);
        }
        
        precios[2] = 599.99;
        
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.printf("Precio: %.2f\n", precio);
        }
        
    }
}
