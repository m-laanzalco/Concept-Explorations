/**
 * A general representation of a vehicle.
 * This class serves as a parent for specific vehicle types.
 */
class Vehicle
{
    /**
     * General acceleration logic. 
     * This method is intended to be overridden by subclasses.
     */
    void increaseSpeed()
    {
        System.out.println("The vehicle is gaining speed...");
    }
}