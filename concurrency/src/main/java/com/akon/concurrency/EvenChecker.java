package com.akon.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable{

    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        this.generator = g;
        this.id = ident;
    }

    public void run() {
        while (!generator.isCanceled()){
            int val = generator.next();
            System.out.println(Thread.currentThread() + "------" + val);
            if(val % 2 != 0){
                System.out.println(val + " not even!");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++){
            executorService.execute(new EvenChecker(gp,i));
        }
        executorService.shutdown();
    }

    public static void test(IntGenerator gp){
        test(gp, 10);
    }
}
