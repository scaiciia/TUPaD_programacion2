/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public String mostrarInfo() {
        return String.format("Nombre: %s\nEspecie: %s\nEdad: %s", nombre, especie, edad);
    }
    
    public void cumplirAnios() {
        edad++;
    }
    
}
