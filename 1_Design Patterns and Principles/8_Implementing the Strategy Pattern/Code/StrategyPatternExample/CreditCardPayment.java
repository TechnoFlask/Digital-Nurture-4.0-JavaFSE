package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
     private String cardNumber = null;

     public CreditCardPayment(String cardNumber) {
          this.cardNumber = cardNumber;
     }

     @Override
     public void pay(int amount) {
          System.out.println("Paying " + amount + " dollars using credit card " + cardNumber);
     }
}
