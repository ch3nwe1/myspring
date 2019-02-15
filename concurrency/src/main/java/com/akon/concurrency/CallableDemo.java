package com.akon.concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++){
            Future<String> submit = executorService.submit(new TaskWithResult(i));
            results.add(submit);
        }

        for (Future<String> fs : results)
            try {
                System.out.println(fs.get());
            }catch (InterruptedException e){
                e.printStackTrace();
            }catch (ExecutionException e){
                e.printStackTrace();
            }finally {
                executorService.shutdown();
            }

    }
}

class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }

//    public String call(){
//        return "result of TaskWithResult " + id;
//    }

    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}
