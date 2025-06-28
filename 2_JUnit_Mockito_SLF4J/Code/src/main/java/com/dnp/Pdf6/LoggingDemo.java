package com.dnp.Pdf6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
     private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

     public static void main(String[] args) {
          logger.info("Starting the application...");

          String filePath = "/tmp/data.txt";

          if (filePath.endsWith(".txt")) {
               logger.warn("Using a plain text file might not be secure: {}", filePath);
          }

          try {
               processFile(filePath);
          } catch (RuntimeException e) {
               logger.error("An error occurred while processing the file: {}", filePath, e);
          }

          logger.info("Application finished.");
     }

     private static void processFile(String path) {
          logger.debug("Processing file: {}", path);
          throw new RuntimeException("Failed to read file contents");
     }
}
