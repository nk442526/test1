package Multithreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorDemo {
    public static void main(String[] args) throws InterruptedException {
        VisitorsCountTask visitorsCountTask = new VisitorsCountTask();
        ExecutorService executorService= Executors.newFixedThreadPool(4);//newFixedThreadPool create a fixed number of thread.
        //newSingleThreadPool create thread with corePoolSize=1 and MaxPoolSize=1.


        for(int i=1;i<200000;i++){
            executorService.submit(visitorsCountTask);
        }
        executorService.shutdown();
       executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("total num of thread: "+ visitorsCountTask.getVisitors());

    }
}
