/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = in.nextInt();

        if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)){
            System.out.printf("El año %d es bisiesto.", anio);
        } else {
            System.out.printf("El año %d no es bisiesto.", anio);
        }
        
        in.close();
    }
}
