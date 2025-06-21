package AdapterPatternExample.adapters;

import AdapterPatternExample.PaymentProcessor;
import AdapterPatternExample.gateways.PaypalGateway;

public class PaypalAdapter implements PaymentProcessor {
     private PaypalGateway pg = null;

     public PaypalAdapter(PaypalGateway pg) {
          this.pg = pg;
     }

     @Override
     public void processPayment(int amount) {
          pg.transferMoney(amount);
     }
}