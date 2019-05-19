package com.akon.observer.simple;

/**
 * 观察者接口定义
 */
public interface Observer {

    /**
     * 更新
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);

}
