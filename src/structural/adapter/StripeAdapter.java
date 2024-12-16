package structural.adapter;

public class StripeAdapter implements MyPaymentProcessor {

    private final StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }


    @Override
    public boolean processPayment(double amount) {
        return stripeGateway.doPayment(amount);
    }
}
