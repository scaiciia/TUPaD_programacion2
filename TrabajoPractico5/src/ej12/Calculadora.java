/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre del contribuyente.");
        String nombre = in.next();
        System.out.println("Ingrese el cuil del contribuyente");
        String cuil = in.next();
        Contribuyente contribuyente = new Contribuyente(nombre, cuil);
        impuesto.setContribuyente(contribuyente);
        
        System.out.printf("Calcular impuesto:\n\tMonto: $%.2f\n\tNombre: %s\n\tCUIL: %s",
                impuesto.getMonto(), nombre, cuil);
        
        in.close();
    }
    
}
