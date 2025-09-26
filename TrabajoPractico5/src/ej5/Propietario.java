package ej5;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class Propietario {

    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(Computadora computadora, String dni) {
        this.computadora = computadora;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

}
