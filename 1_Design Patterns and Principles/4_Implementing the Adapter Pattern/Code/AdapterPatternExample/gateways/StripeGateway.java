package AdapterPatternExample.gateways;

public class StripeGateway {
     public void makeStripePayment(int amountInDollars) {
          System.out.println("Paying " + amountInDollars + " dollars via stripe");
     }
}
