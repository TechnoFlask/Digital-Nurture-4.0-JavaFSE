package com.dnp.Pdf1;

public class Q2 {
     public int addNumbers(int a, int b) {
          return a + b;
     }

     public int power(int base, int exponent) {
          int res = 1;
          for (int i = 0; i < exponent; i++)
               res *= base;
          return res;
     }

     public int factorial(int number) {
          int res = 1;
          for (int i = 2; i <= number; i++)
               res *= i;
          return res;
     }
}
