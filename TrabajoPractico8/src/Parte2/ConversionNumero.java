package Parte2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class ConversionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.printf("Número convertido: %d\n", numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no representa un número válido.");
        } finally {
            scanner.close();
        }
    }
}
