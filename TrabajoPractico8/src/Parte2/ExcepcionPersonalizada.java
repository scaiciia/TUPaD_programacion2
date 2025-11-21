/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

import java.util.Scanner;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class ExcepcionPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
    }
    
}
