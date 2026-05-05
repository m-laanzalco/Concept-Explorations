/**
 * Main class to demonstrate how Polymorphism works.
 * It treats different objects (Car, Bike) as a general 'Vehicle'.
 */
public class VehicleTestBench
{
    public static void main(String[] args)
    {
        // We define them as 'Vehicle' but they behave like their specific type
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorcycle();
        Vehicle basicVehicle = new Vehicle();

        System.out.println("--- Testing Vehicle Acceleration ---");

        myCar.increaseSpeed();    // Outputs car-specific message
        myBike.increaseSpeed();   // Outputs bike-specific message
        basicVehicle.increaseSpeed(); // Outputs default message
    }
}