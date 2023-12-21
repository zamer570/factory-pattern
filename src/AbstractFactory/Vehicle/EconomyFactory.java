package AbstractFactory.Vehicle;

import AbstractFactory.Vehicle.Bike.Bike;
import AbstractFactory.Vehicle.Bike.Fz;
import AbstractFactory.Vehicle.Bike.Harley;
import AbstractFactory.Vehicle.Car.BMW;
import AbstractFactory.Vehicle.Car.Car;
import AbstractFactory.Vehicle.Car.Hyundai;
import AbstractFactory.Vehicle.Vehicle;
import AbstractFactory.VehicleFactory;

public class EconomyFactory implements VehicleFactory {

    @Override
    public Car createCar(String car) {
        return switch (car){
            case "hyundai" -> new Hyundai();
            default -> null;
        };
    }

    @Override
    public Bike createBike(String bike) {
        return switch (bike) {
            case "hyundai" -> new Fz();
            default -> null;
        };
    }
}
