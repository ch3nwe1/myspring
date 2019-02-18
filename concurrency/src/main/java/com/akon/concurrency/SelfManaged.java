package com.akon.concurrency;

import java.util.concurrent.TimeUnit;

public class SelfManaged implements Runnable{


    private int countDown = 5;
    private Thread t = new Thread(this);
    public SelfManaged() throws Exception{
        TimeUnit.SECONDS.sleep(1);
        t.start();
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + "(" + countDown + ") --- ";
    }


    public void run() {
        while (true){
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++){
            new SelfManaged();
        }
    }
}
