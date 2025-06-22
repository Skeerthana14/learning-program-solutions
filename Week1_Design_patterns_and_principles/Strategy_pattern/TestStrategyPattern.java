public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "Keerthana");
        context.setPaymentStrategy(creditCard);
        context.processPayment(2500.00);

        // Use PayPal
        PaymentStrategy paypal = new PayPalPayment("keerthana@example.com");
        context.setPaymentStrategy(paypal);
        context.processPayment(1000.00);
    }
}
