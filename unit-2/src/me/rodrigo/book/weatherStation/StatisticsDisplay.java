package me.rodrigo.book.weatherStation;

import java.util.Observer;
import java.util.Observable;

public class StatisticsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            temperature = weatherData.getTemperature();

            tempSum += temperature;
            numReadings++;

            if(temperature > maxTemp){
                maxTemp = temperature;
            }

            if(temperature < minTemp){
                minTemp = temperature;
            }

            display();
        }
    }

    public void display(){
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
