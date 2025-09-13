/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int mayor = in.nextInt();
                
        for (int i = 1; i < 3; i++){
            System.out.print("Ingrese un numero: ");
            int numero = in.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        
        System.out.println("El mayor es: " + mayor);
        
        in.close();
    }
}
