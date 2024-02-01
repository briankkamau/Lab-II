// Main class to test the ElectricVehicle hierarchy
public class Main {
    public static void main(String[] args) {
        // Create an instance of ElectricCar
        ElectricCar electricCar = new ElectricCar();
        // Call the batteryType() method for ElectricCar
        electricCar.batteryType();

        // Create an instance of ElectricBike
        ElectricBike electricBike = new ElectricBike();
        // Call the batteryType() method for ElectricBike
        electricBike.batteryType();
    }
}
