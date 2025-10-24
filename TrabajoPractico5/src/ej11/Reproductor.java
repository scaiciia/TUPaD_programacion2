/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Reproductor {
    
    public void reproducir(Cancion cancion) {
        System.out.printf("Reproduciendo:\n\tCancion: %s\n\tArtista: %s\n\tGenero: %s", 
                cancion.getTitulo(), cancion.getArtista().getNombre(), cancion.getArtista().getGenero());
    }
    
}
