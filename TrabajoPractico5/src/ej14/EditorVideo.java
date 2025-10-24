/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.printf("Renderizando: %s - Duracion: %.2f - Formato: %s", 
                render.getProyecto().getNombre(), 
                render.getProyecto().getDuracionMin(),
                render.getFormato());
    }
    
}
