package Ej4;

public class Animal {

    protected String nombre;
    protected String especie;
    
    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico");
    }
    
    public void describirAnimal() {
        System.out.println(nombre + " es un " + especie);
    }

}
