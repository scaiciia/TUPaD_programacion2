/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;
/**
 *
 * @author Pupa
 */
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un entero: ");
        int num1 = in.nextInt();
        System.out.print("Ingrese otro entero: ");
        int num2 = in.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
