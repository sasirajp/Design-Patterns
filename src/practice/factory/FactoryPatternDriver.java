package practice.factory;

public class FactoryPatternDriver {
    public static void main(String[] args) {
        new VehicleFactory().getVehicle("car").printVehicleType();
    }
}

interface Vehicle {
    void printVehicleType();
}

class Car implements Vehicle {

    @Override
    public void printVehicleType() {
        System.out.println("car");
    }
}

class Bike implements Vehicle {

    @Override
    public void printVehicleType() {
        System.out.println("bike");
    }
}

class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if (type=="bike") return new Bike();
        else if (type == "car") return new Car();
        else return null;
    }
}