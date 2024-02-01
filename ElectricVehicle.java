// Abstract class ElectricVehicle
abstract class ElectricVehicle {
    // Abstract method to be implemented by subclasses
    abstract void batteryType();
}

// Concrete subclass ElectricCar
class ElectricCar extends ElectricVehicle {
    // Implementation of the batteryType() method for ElectricCar
    @Override
    void batteryType() {
        System.out.println("Electric Car uses Lithium-ion battery.");
    }
}

// Concrete subclass ElectricBike
class ElectricBike extends ElectricVehicle {
    // Implementation of the batteryType() method for ElectricBike
    @Override
    void batteryType() {
        System.out.println("Electric Bike uses Nickel-metal hydride battery.");
    }
}

