package com.dnp.Pdf1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q4Test {

     private Q4 q4;

     @BeforeEach
     void setUp() {
          q4 = new Q4();
     }

     @AfterEach
     void tearDown() {
          q4.clear();
     }

     @Test
     void testAddition() {
          // Arrange
          int value = 5;

          // Act
          q4.add(value);

          // Assert
          assertEquals(5, q4.getTotal());
     }

     @Test
     void testAdditionTwice() {
          // Arrange
          int first = 3;
          int second = 4;

          // Act
          q4.add(first);
          q4.add(second);

          // Assert
          assertEquals(7, q4.getTotal());
     }
}
