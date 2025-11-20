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
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
        } else {
            System.out.println("No se pudo realizar la asignación. Verifique los datos.");
        }
    }
    
    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores en la universidad.");
            return;
        }
        System.out.println("=== PROFESORES DE " + nombre.toUpperCase() + " ===");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos en la universidad.");
            return;
        }
        System.out.println("=== CURSOS DE " + nombre.toUpperCase() + " ===");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con el profesor si existe
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("No se encontró curso con código: " + codigo);
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null los cursos que dictaba
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("No se encontró profesor con ID: " + id);
        }
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos");
            profesor.listarCursos();
            System.out.println();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
