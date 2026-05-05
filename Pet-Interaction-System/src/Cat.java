/**
 * Cat implementation with overridden behavior.
 */
class Cat extends Pet
{
    @Override
    public String speak()
    {
        return "Don't give me orders. I speak when I want.";
    }
}