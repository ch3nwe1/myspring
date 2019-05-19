package com.akon.observer.simple;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 注册观察者
     *
     * @param observer 观察者实例
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(observer);
        }
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
}
