/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author Santiago Caiciia Massello
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        Random random = new Random();
        id = random.nextInt();
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 850000;
        totalEmpleados++;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    public void actualizarSalario(double porcentaje) {
        salario += (salario * porcentaje / 100);
    }
    
    public void actualizarSalario(int cantidad) {
        salario += cantidad;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\n\tNombre: %s\n\tPuesto: %s\n\tSalario: $%.2f\n", id, nombre, puesto, salario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }
    
}
