package structural.adapter;


public class StripeGateway {
    boolean doPayment(double amount) {
        System.out.printf("amount processed for %s rupees via Stripe %n", amount);
        return true;
    }
}
