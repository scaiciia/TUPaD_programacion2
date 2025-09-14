/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Libro libro = new Libro("El señor de los anillos: La comunidad del anillo", "J.R.R. Tolkien", 1954);
    
        libro.setAñoPublicacion(2027);
        
        libro.setAñoPublicacion(1955);
        
        System.out.printf("Libro: %s\nAutor: %s\nAño puublicacion: %d\n", libro.getTitulo(), libro.getAutor(), libro.getAñoPublicacion());
    }
}
