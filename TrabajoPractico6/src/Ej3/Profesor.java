/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            // Sincronizar el lado del curso
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
            System.out.println("Curso " + c.getNombre() + " agregado al profesor " + nombre);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            // Sincronizar el lado del curso
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
            System.out.println("Curso " + c.getNombre() + " eliminado del profesor " + nombre);
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no tiene cursos asignados.");
            return;
        }
        System.out.println("=== CURSOS DEL PROFESOR " + nombre.toUpperCase() + " ===");
        for (Curso curso : cursos) {
            System.out.println("Código: " + curso.getCodigo() + " - Nombre: " + curso.getNombre());
        }
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        System.out.println("------------------------");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List getCursos() {
        return cursos;
    }
    
}
