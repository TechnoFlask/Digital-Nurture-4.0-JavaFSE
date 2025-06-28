package com.dnp.Pdf3_2;

public class CurrencyService {
     private final CurrencyApiClient currencyApiClient;

     public CurrencyService(CurrencyApiClient currencyApiClient) {
          this.currencyApiClient = currencyApiClient;
     }

     public double convert(String fromCurrency, String toCurrency, double amount) {
          double rate = currencyApiClient.getExchangeRate(fromCurrency, toCurrency);
          return amount * rate;
     }
}
