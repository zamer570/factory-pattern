package AbstractFactory;

import AbstractFactory.Vehicle.Bike.Bike;
import AbstractFactory.Vehicle.Car.Car;
import AbstractFactory.Vehicle.Vehicle;

public interface VehicleFactory {
    Car createCar(String car);
    Bike createBike(String bike);
}
