package ej1;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Pasaporte {
    
    private int numero;
    private Date fechaEmision;
    private Titular titular;
    private Foto foto;
    
    public Pasaporte(int numero, Date fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
    }
    
    public Pasaporte(int numero, Date fechaEmision, byte[] imagen, String formato){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        foto = new Foto(imagen, formato);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
}
