package Ej2;

public class MainFigura {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo("Círculo A", 5.0),
            new Rectangulo("Rectángulo B", 4.0, 6.0),
            new Circulo("Círculo C", 3.0)
        };
        
        for (Figura figura : figuras) {
            System.out.printf("Area: %.2f\n", figura.calcularArea());
        }
    }
}
