public class Square extends Shape
{
    private final double side;

    public Square(double side)
    {
        // Validating that the side length is greater than zero
        if (side <= 0)
        {
            throw new IllegalArgumentException("Side length must be a positive value");
        }
        this.side = side;
    }

    @Override
    public double calculateArea()
    {
        return Math.pow(side, 2);
    }

    public double getSide()
    {
        return side;
    }
}