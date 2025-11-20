package Ej3;

public class EmpleadoTemporal extends Empleado {

    private double sueldoPorDia;
    private int diasTrabajados;

    public EmpleadoTemporal(String nombre, int diasTrabajados, double sueldoPorDia) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.sueldoPorDia = sueldoPorDia;
    }

    @Override
    public double calcularSueldo() {
        return diasTrabajados * sueldoPorDia;
    }

}
