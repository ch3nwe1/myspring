package com.akon.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable{
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 5; i++){
            executorService.execute(new DaemonFromFactory());
        }
        System.out.println("all daemons started");
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
