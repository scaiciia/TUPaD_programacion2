/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error: Problema al leer el archivo.");
        }
    }
}
