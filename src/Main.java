import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Mohamed",
                "mohamed@gmail.com",
                "01012345678"
        );

        Menu menu = new Menu();
        menu.addItem(new MenuItem(1, "Falafel", 15));
        menu.showMenu();

        Order order = new Order(customer);
        order.addItem(new OrderItem(menu.findItemById(1), 2));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose payment method (1: Cash, 2: Card): ");
        int choice = scanner.nextInt();

        PaymentMethod payment = (choice == 1) ? new CashPayment() : new CardPayment();
        order.setPaymentMethod(payment);
        order.printSummary();

        double total = order.calculateTotal();
        System.out.println("Total Price: $" + total);
        payment.pay(total);

        NotificationService email = new EmailNotification();
        NotificationService sms = new SmsNotification();
        email.send(customer, "Order confirmed");
        sms.send(customer, "Order confirmed");
        scanner.close();
    }
}