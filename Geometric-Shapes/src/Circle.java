public class Circle extends Shape
{
    private final double radius;

    public Circle(double radius)
    {
        // Input validation to ensure physical consistency
        if (radius <= 0)
        {
            throw new IllegalArgumentException("Radius must be a positive value");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius()
    {
        return radius;
    }
}