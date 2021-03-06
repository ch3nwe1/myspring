package com.akon.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NativeExceptionHandling {

    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(new ExceptionThread());
        }catch (RuntimeException e){
            System.out.println("Exception has been hadnled");
        }
    }

}
