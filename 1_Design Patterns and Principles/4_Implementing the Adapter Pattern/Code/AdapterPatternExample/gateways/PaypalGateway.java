package AdapterPatternExample.gateways;

public class PaypalGateway {
     public void transferMoney(int usd) {
          System.out.println("Transferring " + usd + " dollars via paypal");
     }
}
