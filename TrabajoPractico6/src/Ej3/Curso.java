/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya tenía un profesor, quitarnos de su lista
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar nuevo profesor
        this.profesor = nuevoProfesor;
        
        // Agregarnos a la lista del nuevo profesor
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
        System.out.println("------------------------");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
}
