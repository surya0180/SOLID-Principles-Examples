package Principles.LiskovSubstitution;

/**
 * This implementation shows 2 classes, Payment as parent and PayPalPayment as child classes respectively.
 * The issue here is that, processPayment is completely altered in the child class which violates
 * Liskov's principle. In order to fix this, we need to make sure that child classes does not alter
 * the implementation of processPayment defined in parent class.
 */
class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount + " dollars.");
    }
}

class IncorrectPayPalPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        throw new UnsupportedOperationException("PayPalPayment does not support credit card payment processing!");
    }
}

public class IncorrectLiskovSubstitution {
    public static void main(String[] args) {
        Payment paymentMethod = new IncorrectPayPalPayment();
        paymentMethod.processPayment(100);  // This will throw an exception, violating LSP
    }
}
