public class WarehouseItem
{
    private String name;
    private int quantity;

    public WarehouseItem(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public void reduceStock(int amount) throws OutOfStockException
    {
        if (amount > quantity)
        {
            throw new OutOfStockException("Error: Not enough units for " + name);
        }
        quantity -= amount;
    }

    public String getStatus()
    {
        return name + ": " + quantity + " units left";
    }
}