public class Main {
    public static void main(String[] args) {


        // 1. Requesting a Car
        Vehicle myCar = VehicleFactory.createVehicle("CAR");
        printVehicleDetails(myCar);

        // 2. Requesting a Bike
        Vehicle myBike = VehicleFactory.createVehicle("BIKE");
        printVehicleDetails(myBike);

        // 3. Requesting a Truck
        Vehicle myTruck = VehicleFactory.createVehicle("TRUCK");
        printVehicleDetails(myTruck);
    }

    // Helper method to display vehicle details
    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Vehicle Type: " + vehicle.getName());
        System.out.println("Wheels: " + vehicle.getnumberofwheels());
        System.out.println("Capacity: " + vehicle.getcapacity());
    }
}