import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private List<OrderItem> items;
    private PaymentMethod paymentMethod;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }
    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }
    public void printSummary() {

        System.out.println("customer name : " + customer.getName());

        for (OrderItem item : items) {
            System.out.println(
                    item.getItem().getName() + " x " + item.getQuantity() + " = $" + item.getSubtotal()
            );
        }
        System.out.println("Total: " + calculateTotal());

        if (paymentMethod != null) {
            System.out.println("Payment Method: "
                    + paymentMethod.getClass().getSimpleName());
        }
    }
}
