/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class TrabajoPractico4 {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(1, "Juan Pérez", "Desarrollador SemiSenior", 2500000.0);
        Empleado empleado2 = new Empleado("María García", "Diseñadora");
        Empleado empleado3 = new Empleado("Carlos López", "Analista");
        Empleado empleado4 = new Empleado(4, "Ana Rodríguez", "Gerente", 4000000.0);
        
        empleado1.actualizarSalario(10.0);
        empleado2.actualizarSalario(500000);
        empleado3.actualizarSalario(15.0);
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        System.out.printf("Total de empleados creados: %d\n", Empleado.mostrarTotalEmpleados());
        
        empleado1.setPuesto("Desarrollador Senior");
        System.out.printf("Nuevo puesto de %s: %s\n", empleado1.getNombre(), empleado1.getPuesto());
        
    }
}
