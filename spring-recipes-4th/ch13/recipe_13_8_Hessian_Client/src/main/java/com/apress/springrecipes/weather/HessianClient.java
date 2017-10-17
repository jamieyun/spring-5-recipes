package com.apress.springrecipes.weather;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.springrecipes.weather.config.WeatherConfigHessianClient;

public class HessianClient {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(WeatherConfigHessianClient.class);

        WeatherServiceClient client = context.getBean(WeatherServiceClient.class);
       TemperatureInfo temperature = client.getTodayTemperature("Houston");
        System.out.println("Min temperature : " + temperature.getMin());
        System.out.println("Max temperature : " + temperature.getMax());
        System.out.println("Average temperature : " + temperature.getAverage());
    }
}
