package AbstractFactory.Vehicle;

import AbstractFactory.Vehicle.Bike.Bike;
import AbstractFactory.Vehicle.Bike.Harley;
import AbstractFactory.Vehicle.Car.BMW;
import AbstractFactory.Vehicle.Car.Car;
import AbstractFactory.Vehicle.Vehicle;
import AbstractFactory.VehicleFactory;

public class LuxuryFactory implements VehicleFactory {

    @Override
    public Car createCar(String car) {
        return switch (car){
            case "BMW" -> new BMW();
            default -> null;
        };
    }

    @Override
    public Bike createBike(String bike) {
        return switch (bike) {
            case "harley" -> new Harley();
            default -> null;
        };
    }
}
