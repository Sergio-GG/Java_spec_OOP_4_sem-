public class Order {

    String customerName;

    String productName;

    int amount;

    static int orderId = 0;


    public Order(String customerName, String productName, int amount) {
        this.customerName = customerName;
        this.productName = productName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
