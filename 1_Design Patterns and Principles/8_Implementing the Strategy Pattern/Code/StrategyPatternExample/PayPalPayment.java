package StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {
     private String paypalID = null;

     public PayPalPayment(String paypalID) {
          this.paypalID = paypalID;
     }

     @Override
     public void pay(int amount) {
          System.out.println("Paying " + amount + " dollars using paypal ID " + paypalID);
     }
}
