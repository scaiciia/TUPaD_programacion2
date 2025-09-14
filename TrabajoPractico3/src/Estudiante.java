/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public String mostrarInfo() {
        return String.format("Apellido y nombre: %s, %s - Curso: %s - Calificación: %.2f", apellido, nombre, curso, calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
    }    

}
