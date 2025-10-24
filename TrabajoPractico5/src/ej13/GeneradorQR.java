/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        
        System.out.printf("Codigo: %s\n\tUsuario: %s - Email: %s", 
                valor, usuario.getNombre(), usuario.getEmail());
    }
    
}
