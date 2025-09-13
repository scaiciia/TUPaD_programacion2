/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota;
        do {
            System.out.print("Ingrese una nota: ");
            nota = in.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while(nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
    }
    
}
