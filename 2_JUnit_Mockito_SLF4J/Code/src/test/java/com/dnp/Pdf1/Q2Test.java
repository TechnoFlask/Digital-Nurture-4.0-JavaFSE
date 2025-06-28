package com.dnp.Pdf1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Q2Test {
     private Q2 q2;

     @BeforeEach
     public void setUp() {
          q2 = new Q2();
     }

     @Test
     public void testAddNumbers() {
          assertEquals(9, q2.addNumbers(4, 5));
     }

     @Test
     public void testPower() {
          assertEquals(8, q2.power(2, 3));
     }

     @Test
     public void testFactorial() {
          assertEquals(120, q2.factorial(5));
     }
}
