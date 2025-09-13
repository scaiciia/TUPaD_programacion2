/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = in.nextDouble();
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = in.next();
        
        switch (cat) {
            case "A":
                System.out.println("Descuento aplicado: 10%");
                System.out.printf("Precio final: %.2f", (precio * 0.90));
                break;
            case "B":
                System.out.println("Descuento aplicado: 15%");
                System.out.printf("Precio final: %.2f", (precio * 0.85));
                break;
            case "C":
                System.out.println("Descuento aplicado: 20%");
                System.out.printf("Precio final: %.2f", (precio * 0.80));
                break;
        }
        
    }
}
