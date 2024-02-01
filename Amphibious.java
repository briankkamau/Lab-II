// Amphibious interface
interface Amphibious {
    void dock();
    void launch();
}

// AirVehicle interface
interface AirVehicle {
    void takeOff();
    void land();
}

// AmphibiousPlane class implementing both Amphibious and AirVehicle interfaces
class AmphibiousPlane implements Amphibious, AirVehicle {

    @Override
    public void dock() {
        System.out.println("AmphibiousPlane is docking on water.");
    }

    @Override
    public void launch() {
        System.out.println("AmphibiousPlane is launching from water.");
    }

    @Override
    public void takeOff() {
        System.out.println("AmphibiousPlane is taking off into the air.");
    }

    @Override
    public void land() {
        System.out.println("AmphibiousPlane is landing on the ground.");
    }

    //  methods specific to AmphibiousPlane

    public static void main(String[] args) {
        AmphibiousPlane amphibiousPlane = new AmphibiousPlane();

        // Calling Amphibious interface methods
        amphibiousPlane.dock();
        amphibiousPlane.launch();

        // Calling AirVehicle interface methods
        amphibiousPlane.takeOff();
        amphibiousPlane.land();
    }
}
