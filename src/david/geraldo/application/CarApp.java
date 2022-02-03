package david.geraldo.application;

import david.geraldo.data.Avanza;
import david.geraldo.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();

        System.out.println(car.getTire());
        car.drive();
    }
}
