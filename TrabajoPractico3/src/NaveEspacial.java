/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class NaveEspacial {
    
    private String nombre;
    private double combustible;
    
    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar() {
        double combustiblePorDespegue = 15; // Combustible gastado por despegue
        if (this.combustible < combustiblePorDespegue) {
            System.out.println("No hay combustible suficiente para despegar");
            return;
        }
        this.combustible -= combustiblePorDespegue;
    }
    
    public void avanzar(double distancia) {
        double combustibleXKm = 0.5;
        if ((distancia * combustibleXKm) > combustible) {
            System.out.println("No hay combustible suficiente");
            return;
        }
        
        this.combustible -= (distancia * combustibleXKm);
    }
    
    public void recargarCombustible(double cantidad) {
        this.combustible += cantidad;
    }
    
    public String mostrarEstado() {
        return String.format("Nombre: %s\nCombustible: %s", nombre, combustible);
    }
    
}
