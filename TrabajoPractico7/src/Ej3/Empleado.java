package Ej3;

public abstract class Empleado {

    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    abstract public double calcularSueldo();

    public String getNombre() {
        return nombre;
    }

}
