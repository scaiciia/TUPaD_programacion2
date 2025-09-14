/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int id, int edad, int huevos) {
        this.idGallina = id;
        this.edad = edad;
        this.huevosPuestos = huevos;
    }
    
    public void ponerHuevo() {
        this.huevosPuestos++;
    }
    
    public void envejecer() {
        this.edad++;
    }
    
    public String mostrarEstado() {
        return String.format("ID: %d\nEdad:: %d\nHuevos puestos: %d", this.idGallina, this.edad, this.huevosPuestos);
    }
    
}
