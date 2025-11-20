package Ej1;

public class Auto extends Vehiculo {

   private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información del Auto");
        super.mostrarInfo();
        System.out.printf("Cantidad puertas: %d", this.cantidadPuertas);
    }
}
