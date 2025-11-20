package Ej4;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Mimi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Fido"));
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("---");
        }
    }
}
