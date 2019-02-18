package com.akon.concurrency;

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable{
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(" this should always run?");
        }
    }
}
