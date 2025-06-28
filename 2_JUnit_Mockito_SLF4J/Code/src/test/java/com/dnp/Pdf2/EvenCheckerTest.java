package com.dnp.Pdf2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {
     @ParameterizedTest
     @ValueSource(ints = { 2, 4, 8, 232 })
     void testIsEven(int number) {
          EvenChecker ec = new EvenChecker();

          assertTrue(ec.isEven(number));
     }
}
