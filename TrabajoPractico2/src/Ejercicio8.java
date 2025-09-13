/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Saatiago Caiciia Massello
 */
public class Ejercicio8 {
    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        impuesto = impuesto / 100;
        descuento = descuento / 100;
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = in.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = in.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = in.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.printf("El precio final del producto es: %.2f\n", precioFinal);
        
        in.close();
        
    }
}
