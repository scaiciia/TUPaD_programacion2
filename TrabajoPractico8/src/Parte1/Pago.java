package Parte1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Pupa
 */
public interface Pago {
    
    default void procesarPago(double monto) {
        System.out.printf("[Pago] Procesando pago estándar por $%.2f\n", monto);
    }
    
}
