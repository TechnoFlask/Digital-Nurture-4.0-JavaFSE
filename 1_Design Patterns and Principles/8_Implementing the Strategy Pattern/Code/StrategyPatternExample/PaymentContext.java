package StrategyPatternExample;

public class PaymentContext {
     private PaymentStrategy ps = null;

     public void setPaymentStrategy(PaymentStrategy ps) {
          this.ps = ps;
     }

     public void initiatePayment(int amount) {
          ps.pay(amount);
     }
}
