package StrategyPatternExample;

public class Main {
     public static void main(String[] args) {
          PaymentContext pc = new PaymentContext();
          PaymentStrategy ps = new CreditCardPayment("1234");
          pc.setPaymentStrategy(ps);
          pc.initiatePayment(231);

          ps = new PayPalPayment("wer452");
          pc.setPaymentStrategy(ps);
          pc.initiatePayment(546);
     }
}
