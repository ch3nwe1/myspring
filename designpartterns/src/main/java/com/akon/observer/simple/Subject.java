package com.akon.observer.simple;

/**
 * 主题接口定义
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer 观察者实例
     */
     void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
