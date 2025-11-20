/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class MainUniversidad {
    public static void main(String[] args) {
        
        Universidad universidad = new Universidad("Universidad Nacional");
        
        // 1. Crear al menos 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("PR001", "Dr. Carlos Méndez", "Matemáticas");
        Profesor prof2 = new Profesor("PR002", "Dra. Ana López", "Física");
        Profesor prof3 = new Profesor("PR003", "Dr. Roberto Díaz", "Programación");
        
        Curso curso1 = new Curso("C001", "Cálculo I");
        Curso curso2 = new Curso("C002", "Cálculo II");
        Curso curso3 = new Curso("C003", "Física I");
        Curso curso4 = new Curso("C004", "Programación I");
        Curso curso5 = new Curso("C005", "Programación II");
        
        // 2. Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 3. Asignar profesores a cursos
        universidad.asignarProfesorACurso("C001", "PR001");
        universidad.asignarProfesorACurso("C002", "PR001");
        universidad.asignarProfesorACurso("C003", "PR002");
        universidad.asignarProfesorACurso("C004", "PR003");
        universidad.asignarProfesorACurso("C005", "PR003");
        
        // 4. Listar cursos con su profesor y profesores con sus cursos
        universidad.listarCursos();
        universidad.listarProfesores();
        
        // Mostrar cursos por profesor
        System.out.println("CURSOS POR PROFESOR:");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();
        
        // 5. Cambiar el profesor de un curso
        System.out.println("CAMBIAR PROFESOR DE CURSO:");
        universidad.asignarProfesorACurso("C004", "PR001");
        curso4.mostrarInfo();
        prof1.listarCursos();
        prof3.listarCursos();
        
        // 6. Remover un curso
        System.out.println("ELIMINAR CURSO:");
        universidad.eliminarCurso("C002");
        universidad.listarCursos();
        prof1.listarCursos();
        
        // 7. Remover un profesor
        System.out.println("ELIMINAR PROFESOR:");
        universidad.eliminarProfesor("PR002");
        universidad.listarProfesores();
        universidad.listarCursos();
        
        // 8. Mostrar reporte de cursos por profesor
        universidad.mostrarReporteCursosPorProfesor();
        
    }
}
