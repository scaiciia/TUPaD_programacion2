/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio10 {
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stock = in.nextInt();
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = in.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = in.nextInt();
        
        int nuevoStock = actualizarStock(stock, cantVendida, cantRecibida);
        
        System.out.printf("El nuevo stock del producto es: %d\n", nuevoStock);
        
        in.close();
        
    }
}
