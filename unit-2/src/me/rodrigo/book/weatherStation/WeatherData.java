package me.rodrigo.book.weatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers; // atributos
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() { // constructor
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);

        if(index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) { // parametros
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
