package com.dnp.Pdf1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Q3Test {
     @Test
     public void testAssertions() {
          Q3 q3 = new Q3();

          assertEquals(7, q3.equalTestable());
          assertNotEquals(5, q3.equalTestable());

          assertTrue(q3.boolTestable());
          assertFalse(!q3.boolTestable());

          assertNull(q3.nullTestable());
          assertNotNull(new Object());
     }
}
