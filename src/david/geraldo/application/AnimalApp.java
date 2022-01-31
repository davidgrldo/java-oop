package david.geraldo.application;

import david.geraldo.data.Animal;
import david.geraldo.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Garfield";
        animal.run();
    }
}
