/**
 * Specific implementation for a Car.
 */
class Car extends Vehicle
{
    @Override
    void increaseSpeed()
    {
        System.out.println("The car is accelerating smoothly on four wheels.");
    }
}