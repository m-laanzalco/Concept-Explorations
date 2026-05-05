import java.util.ArrayList;

public class Order
{
    private String orderId;
    private ArrayList<Product> items = new ArrayList<>();

    public Order(String orderId)
    {
        this.orderId = orderId;
    }

    public void addProduct(Product p)
    {
        items.add(p);
    }

    public double calculateTotal()
    {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public void showInvoice()
    {
        System.out.println("--- Invoice for Order: " + orderId + " ---");
        for (Product p : items)
        {
            System.out.println("- " + p.getName() + ": " + p.getPrice() + "€");
        }
        System.out.println("Grand Total: " + calculateTotal() + "€");
    }
}