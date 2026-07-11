public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with cash" + amount );
    }
}
