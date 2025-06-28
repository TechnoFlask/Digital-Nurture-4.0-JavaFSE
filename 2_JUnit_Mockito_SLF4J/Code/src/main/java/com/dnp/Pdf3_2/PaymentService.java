package com.dnp.Pdf3_2;

public class PaymentService {
     private final NetworkClient networkClient;

     public PaymentService(NetworkClient networkClient) {
          this.networkClient = networkClient;
     }

     public String processPayment(double amount) {
          String payload = "{\"amount\":" + amount + "}";
          String response = networkClient.postData("https://api.payments.com/pay", payload);
          return "Payment status: " + response;
     }
}
