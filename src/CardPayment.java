public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("pay with card" + amount);
    }
}
