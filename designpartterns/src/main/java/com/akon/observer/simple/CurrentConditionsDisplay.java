package com.akon.observer.simple;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 更新
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    /**
     * 展示布告板
     */
    public void display() {
        System.out.println("Current conditions:" + temperature + "" +
                "F degrees and " + humidity + "% humidity");
    }
}
