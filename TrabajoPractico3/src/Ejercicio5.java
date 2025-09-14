/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        NaveEspacial nave = new NaveEspacial("Soyokaze", 50);
        
        System.out.print("Ingrese la distancia a recorrer: ");
        double distancia = in.nextDouble();
        
        nave.despegar();
        nave.avanzar(distancia);
        
        System.out.print("Ingrese la cantidad de combustible a recargar: ");
        double recarga = in.nextDouble();
        nave.recargarCombustible(recarga);
        
        System.out.print("Ingrese la distancia a recorrer: ");
        distancia = in.nextDouble();
        nave.avanzar(distancia);
        
        System.out.println(nave.mostrarEstado());
        
    }
}
