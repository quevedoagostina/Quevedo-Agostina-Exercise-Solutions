package documents;

public class Order extends Document {
    private String orderNumber;
    private int quantity;

    public Order(String orderNumber, int quantity) {
        this.orderNumber = orderNumber;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Quantity: " + quantity);
    }
}
