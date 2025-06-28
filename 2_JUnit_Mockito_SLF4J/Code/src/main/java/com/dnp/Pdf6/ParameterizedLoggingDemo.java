package com.dnp.Pdf6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingDemo {
     private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingDemo.class);

     public static void main(String[] args) {
          String userId = "user123";
          String operation = "TRANSFER_FUNDS";
          double amount = 1200.50;

          logger.info("Starting operation {} for user {}", operation, userId);
          logger.debug("Transaction amount: {}", amount);

          try {
               performOperation(userId, operation, amount);
          } catch (Exception e) {
               logger.error("Operation {} failed for user {}", operation, userId, e);
          }

          logger.info("Finished operation processing.");
     }

     private static void performOperation(String userId, String operation, double amount) {
          if ("TRANSFER_FUNDS".equals(operation) && amount > 1000) {
               throw new IllegalArgumentException("Transfer limit exceeded for user " + userId);
          }
          logger.info("Operation {} for user {} completed successfully.", operation, userId);
     }
}
