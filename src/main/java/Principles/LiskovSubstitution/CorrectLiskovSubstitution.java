package Principles.LiskovSubstitution;

/**
 * This interface removes the problem of inheriting the method of CreditCardPayment
 * class and changing its functionality thereby improving the code correctness of program.
 */
interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount + " dollars.");
    }
}

// Class for PayPal payment processing
class CorrectPayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount + " dollars.");
    }
}

public class CorrectLiskovSubstitution {

}
