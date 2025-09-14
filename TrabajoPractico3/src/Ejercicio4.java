/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina(1, 2, 450);
        Gallina gallina2 = new Gallina(2, 0, 200);
        
        gallina1.envejecer();
        gallina2.envejecer();
        
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        
        System.out.println(gallina1.mostrarEstado());
        System.out.println(gallina2.mostrarEstado());
    
    }
}
