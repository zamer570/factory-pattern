import AbstractFactory.Vehicle.Car.Car;
import AbstractFactory.Vehicle.EconomyFactory;
import AbstractFactory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        //factory pattern
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape = shapeFactory.getShape("circle");
//        shape.draw();

        //abstract factory pattern
        VehicleFactory vehicleFactory = new EconomyFactory();
        Car car = vehicleFactory.createCar("hyundai");
        System.out.println(car.getDescription());
    }
}