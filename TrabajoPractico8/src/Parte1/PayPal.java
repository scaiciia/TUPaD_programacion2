package Parte1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class PayPal implements Pago, PagoConDescuento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.printf("Procesando pago con PayPal: $%.2f\n", monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.printf("Aplicando descuento del %.2f% con PayPal\n", porcentaje);
    }
}
