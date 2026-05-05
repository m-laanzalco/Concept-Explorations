import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WarehouseController
{
    public static void main(String[] args)
    {
        ArrayList<WarehouseItem> inventory = new ArrayList<>();
        inventory.add(new WarehouseItem("Smartphone X", 10));
        inventory.add(new WarehouseItem("Laptop Air", 5));

        try {

            System.out.println("Attempting to sell 2 Smartphones...");
            inventory.get(0).reduceStock(2);
            System.out.println("Smartphone sale successful.");


            System.out.println("Attempting to sell 10 Laptops...");
            inventory.get(1).reduceStock(10);


            System.out.println("Laptop sale successful.");

        } catch (OutOfStockException e) {

            System.err.println("\n[LOG] Transition failed: " + e.getMessage());
        }


        System.out.println("\nProceeding with report generation...");
    }
}