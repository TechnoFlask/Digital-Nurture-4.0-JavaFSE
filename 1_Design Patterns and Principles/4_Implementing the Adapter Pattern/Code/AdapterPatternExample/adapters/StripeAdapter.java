package AdapterPatternExample.adapters;

import AdapterPatternExample.PaymentProcessor;
import AdapterPatternExample.gateways.StripeGateway;

public class StripeAdapter implements PaymentProcessor {
     private StripeGateway sg = null;

     public StripeAdapter(StripeGateway sg) {
          this.sg = sg;
     }

     @Override
     public void processPayment(int amount) {
          sg.makeStripePayment(amount);
     }
}
