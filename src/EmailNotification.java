public class EmailNotification implements NotificationService {
    @Override
    public void send(Customer customer, String message) {
        System.out.println("the email " + customer.getEmail() + " the message" + message);
    }
}
