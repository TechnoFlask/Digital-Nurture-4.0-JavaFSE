package com.dnp.Pdf3_1;

public class WeatherService {

     private final WeatherApiClient weatherApiClient;

     public WeatherService(WeatherApiClient weatherApiClient) {
          this.weatherApiClient = weatherApiClient;
     }

     public String getWeatherReport(String city) {
          String weather = weatherApiClient.getCurrentWeather(city);
          return "Weather in " + city + " is " + weather;
     }
}
