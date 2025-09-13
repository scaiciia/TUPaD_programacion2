/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio11 {
    
    private static double entradaSalida = 0.10;
    
    private static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * entradaSalida;
        System.out.printf("El descuento especial aplicado es: %.2f\n", descuentoAplicado);
        return precio - descuentoAplicado;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = in.nextInt();
        
        double total = calcularDescuentoEspecial(precio);
        
        System.out.printf("El precio final con descuento es: %.2f\n", total);
    }
    
}
