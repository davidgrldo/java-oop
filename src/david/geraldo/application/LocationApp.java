package david.geraldo.application;

import david.geraldo.data.City;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // error
        var city = new City();
        city.name = "Bekasi";

        System.out.println(city.name);

    }
}
