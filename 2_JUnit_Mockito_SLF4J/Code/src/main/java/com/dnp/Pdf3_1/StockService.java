package com.dnp.Pdf3_1;

public class StockService {
     private final StockApiClient stockApiClient;

     public StockService(StockApiClient stockApiClient) {
          this.stockApiClient = stockApiClient;
     }

     public double getAveragePrice(String symbol) {
          double price1 = stockApiClient.getStockPrice(symbol);
          double price2 = stockApiClient.getStockPrice(symbol);
          return (price1 + price2) / 2;
     }
}
