public class OrderProcessor
{
    public static void main(String[] args)
    {
        // Creiamo un ordine specifico per un cliente
        Order clientOrder = new Order("ORD-2026-X1");

        // Aggiungiamo i prodotti all'ordine
        clientOrder.addProduct(new Product("Laptop Pro 16", 1250.00));
        clientOrder.addProduct(new Product("Wireless Mouse", 45.50));
        clientOrder.addProduct(new Product("USB-C Hub", 30.00));

        // Generiamo il riepilogo per il cliente
        clientOrder.showInvoice();
    }
}