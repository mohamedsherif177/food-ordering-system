public class SmsNotification implements NotificationService {
    @Override
    public void send(Customer customer, String message) {
        System.out.println("the sms " + customer.getPhone() + " the message" + message);
    }
}
