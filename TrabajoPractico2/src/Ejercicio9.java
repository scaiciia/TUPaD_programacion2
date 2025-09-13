/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio9 {
    
    private static double calcularCosto(double peso, String zona) {
        return zona.equals("Nacional") ? 5 * peso : 10 * peso;
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = in.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = in.nextDouble();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = in.next();
        
        double costo = calcularCosto(peso, zona);
        System.out.printf("El costo del envio es: %.2f\n", costo);
        
        double total = calcularTotalCompra(precio, costo);
        System.out.printf("El total a pagar es: %.2f\n", total);
        
        in.close();
        
    }
    
}
