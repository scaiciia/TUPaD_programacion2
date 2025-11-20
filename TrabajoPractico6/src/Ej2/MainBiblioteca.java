/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Jorge Luis Borges", "Argentina");
        
        // 3. Agregar 5 libros asociados a autores
        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("L002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("L003", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("L004", "Ficciones", 1944, autor3);
        biblioteca.agregarLibro("L005", "El aleph", 1949, autor3);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 4. Listar todos los libros
        biblioteca.listarLibros();
        
        // 5. Buscar libro por ISBN
        System.out.println("BUSCAR LIBRO POR ISBN:");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("L003");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        }
        
        // 6. Filtrar libros por año
        biblioteca.filtrarLibrosPorAnio(1985);
        
        // 7. Eliminar un libro
        biblioteca.eliminarLibro("L001");
        biblioteca.listarLibros();
        
        // 8. Mostrar cantidad total de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Listar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
