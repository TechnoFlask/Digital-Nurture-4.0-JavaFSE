package com.dnp.Pdf2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
          CalculatorTest.class,
          StringUtilsTest.class
})
public class AllTests {
}