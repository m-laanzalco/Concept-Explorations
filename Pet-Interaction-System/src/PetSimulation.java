public class PetSimulation
{
    public static void main(String[] args)
    {
        Cat myCat = new Cat();
        myCat.setName("Puff Puff");
        System.out.println(myCat.getName() + " says: " + myCat.speak());

        Dog myDog = new Dog();
        myDog.setName("Fifi");
        System.out.println(myDog.getName() + " says: " + myDog.speak());
        System.out.println("Action: " + myDog.fetch());
    }
}