/**
 * Generic Pet class to demonstrate inheritance.
 */
public class Pet
{
    private String name;

    public String getName() { return name; }
    public void setName(String petName) { name = petName; }

    public String speak()
    {
        return "I am a generic pet.";
    }
}