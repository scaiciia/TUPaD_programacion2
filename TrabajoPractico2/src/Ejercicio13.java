/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio13 {
    
    private static void recorridoRecursivo(double[] dato, int inicio, int fin) {
        if (inicio == fin) {
            System.out.printf("Precio: %.2f\n", dato[inicio]);
        } else {
            System.out.printf("Precio: %.2f\n", dato[inicio]);
            recorridoRecursivo(dato, inicio + 1, fin);
        }
    }   
    
    public static void main(String[] args) {
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.printf("Precio: %.2f\n", precio);
        }
        
        precios[2] = 599.99;
        
        System.out.println("Precios modificados:");
        recorridoRecursivo(precios, 0, precios.length - 1);
        
    }
}
