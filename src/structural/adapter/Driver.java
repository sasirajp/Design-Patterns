package structural.adapter;

public class Driver {
    public static void main(String[] args) {

        StripeGateway stripeGateway = new StripeGateway();

        MyPaymentProcessor myPaymentProcessor = new StripeAdapter(stripeGateway);
        myPaymentProcessor.processPayment(100);

    }
}
