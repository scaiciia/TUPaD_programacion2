package Ej1;

public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.printf("Marca: %s\n", this.marca);
        System.out.printf("Modelo: %s\n", this.modelo);
    }
    
}
