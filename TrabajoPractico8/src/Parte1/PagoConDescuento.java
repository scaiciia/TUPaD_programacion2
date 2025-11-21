package Parte1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public interface PagoConDescuento {
    
    void aplicarDescuento(double montoOriginal);
    
    default void procesarPago(double monto) {
        System.out.printf("[PagoConDescuento] Procesando pago con descuento final $%.2f", monto);
    }
    
}
