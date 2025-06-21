/*
Exercise 7: Financial Forecasting

— Understanding Recursion —

Recursion is a method where a function calls itself to solve smaller instances of the same problem.
It simplifies problems that are naturally hierarchical or repetitive.

For example:
  Future Value = Current Value × (1 + growth rate)^n
This can be recursively modeled as:
  FV(n) = FV(n-1) × (1 + r)

— Recursive Algorithm —

Function: recursiveForecast(value, rate, years)
Base Case: if years == 0, return currentValue
Recursive Step: call recursiveForecast with one fewer year and updated value

— Time Complexity —

• Naive Recursion:
  - Time Complexity: O(n)
  - Space Complexity: O(n) due to recursive call stack

• Optimized Version (using Math.pow):
  - Time Complexity: O(1)
  - Space Complexity: O(1)

— Optimization —

Recursive solutions can be slow due to repeated calculations or deep stacks.
To avoid this:
✓ Use mathematical simplification when possible
✓ Use memoization or iteration for large n
✓ Avoid recalculating intermediate results

*/

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter current value: ");
          double currentValue = scanner.nextDouble();

          System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
          double growthRate = scanner.nextDouble();

          System.out.print("Enter number of years: ");
          int years = scanner.nextInt();

          System.out.println("\n--- Recursive Forecast ---");
          double resultRecursive = Forecast.recursiveForecast(currentValue, growthRate, years);
          System.out.printf("Predicted Future Value (Recursive): %.2f\n", resultRecursive);

          System.out.println("\n--- Optimized Forecast ---");
          double resultOptimized = Forecast.fastForecast(currentValue, growthRate, years);
          System.out.printf("Predicted Future Value (Optimized): %.2f\n", resultOptimized);
     }
}
