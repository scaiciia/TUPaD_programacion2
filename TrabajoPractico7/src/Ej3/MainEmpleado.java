package Ej3;

import java.util.ArrayList;

public class MainEmpleado {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Luis Bacigalupo", 2500000.00));
        empleados.add(new EmpleadoTemporal("Jorge Escudero", 15, 35000));
        empleados.add(new EmpleadoPlanta("Pepe Mujica", 1600000.30));
        empleados.add( new EmpleadoTemporal("Mauri Macri", 35, 55000));
        empleados.add( new EmpleadoPlanta("Rosa Meloni", 2500000.00));
        empleados.add( new EmpleadoTemporal("Silvia Cortes", 20, 45500));
        empleados.add(new EmpleadoPlanta("Jorge Luis Borges", 1800000.00));
        empleados.add(new EmpleadoTemporal("Jose Luis Chilavert", 44, 38000));
        empleados.add(new EmpleadoPlanta("Burrito Ortega", 2000000.00));
        empleados.add(new EmpleadoTemporal("Tata Martino", 50, 37000));

        System.err.println("Lista de empleados");
        for (Empleado empleado : empleados) {
            System.err.printf("%s cobra $%.2f", empleado.getNombre(), empleado.calcularSueldo());

            // Uso de instanceof
            if (empleado instanceof EmpleadoPlanta) {
                System.err.println(" -> Es empleado de planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.err.println(" -> Es empleado temporal");
            }

            System.err.println("--------------------------------------------------------------");
        }
    }
}
