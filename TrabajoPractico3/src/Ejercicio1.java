/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("Santiago", "Perez", "Programacion II", 9);
        
        System.out.println(estudiante.mostrarInfo());
        
        estudiante.subirCalificacion(1);
        estudiante.bajarCalificacion(1);
        
    }
}
