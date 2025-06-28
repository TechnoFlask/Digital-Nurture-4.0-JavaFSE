package com.dnp.Pdf2;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(OrderAnnotation.class)
class OrderedTests {

     @Test
     @Order(2)
     void secondTest() {
          System.out.println("Running secondTest");
          assertTrue(true);
     }

     @Test
     @Order(1)
     void firstTest() {
          System.out.println("Running firstTest");
          assertTrue(true);
     }

     @Test
     @Order(3)
     void thirdTest() {
          System.out.println("Running thirdTest");
          assertTrue(true);
     }
}
