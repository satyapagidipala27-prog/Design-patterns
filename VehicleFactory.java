public class VehicleFactory {

    // Factory method to create and return vehicle instances
    public static Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }

        String type = vehicleType.trim().toUpperCase();

        switch (type) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "TRUCK":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}