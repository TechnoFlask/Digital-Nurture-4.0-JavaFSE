package com.dnp.Pdf2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionThrowerTest {
     @Test
     void testThrowException() {
          ExceptionThrower thrower = new ExceptionThrower();

          assertThrows(UnsupportedOperationException.class, thrower::throwException);
     }
}
