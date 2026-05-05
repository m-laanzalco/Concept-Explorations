public class GeometryWorkshop
{

    public static void main(String[] args)
    {
        try
        {
            // Instantiating shapes with test data
            Shape myCircle = new Circle(5.0);
            Shape mySquare = new Square(4.0);

            System.out.println("=== Geometry Lab Execution Report ===");

            // Using a centralized method to display results
            displayShapeMetrics("Circle", myCircle);
            displayShapeMetrics("Square", mySquare);

        } catch (IllegalArgumentException e) {
            System.err.println("Configuration Error: " + e.getMessage());
        }
    }

    /**
     * Prints shape details using polymorphism.
     * @param label The name of the shape type.
     * @param shape The shape object to analyze.
     */
    private static void displayShapeMetrics(String label, Shape shape)
    {
        System.out.printf("[%s] -> Area: %.4f units²%n", label, shape.calculateArea());
    }
}