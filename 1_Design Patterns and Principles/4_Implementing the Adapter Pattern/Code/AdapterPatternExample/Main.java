package AdapterPatternExample;

import AdapterPatternExample.adapters.PaypalAdapter;
import AdapterPatternExample.adapters.StripeAdapter;
import AdapterPatternExample.gateways.PaypalGateway;
import AdapterPatternExample.gateways.StripeGateway;

public class Main {
     public static void main(String[] args) {
          PaymentProcessor p = null;

          p = new StripeAdapter(new StripeGateway());
          p.processPayment(24);

          p = new PaypalAdapter(new PaypalGateway());
          p.processPayment(47);
     }
}
