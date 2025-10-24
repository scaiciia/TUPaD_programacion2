/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Reserva {
    
    private Date fecha;
    private LocalTime hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(Date fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public Reserva(Date fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
