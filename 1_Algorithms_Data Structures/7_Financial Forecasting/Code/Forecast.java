public class Forecast {
     // FV = PV × (1 + r)^n
     public static double recursiveForecast(double currentValue, double growthRate, int years) {
          if (years == 0)
               return currentValue;
          return recursiveForecast(currentValue * (1 + growthRate), growthRate, years - 1);
     }

     public static double fastForecast(double currentValue, double growthRate, int years) {
          return currentValue * Math.pow(1 + growthRate, years);
     }
}
