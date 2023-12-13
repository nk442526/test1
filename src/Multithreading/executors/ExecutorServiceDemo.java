package Multithreading.executors;

import java.util.concurrent.*;


public class ExecutorServiceDemo {
    public static void main(String[] args) {
        Test test= new Test();
        ExecutorService executorService= Executors.newCachedThreadPool();// newCachedThreadPool is creating new thread and executing
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(test,10, TimeUnit.MINUTES);// it will schedule with a delay of 10 sec
        //ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(test, 10, MINUTES);
        //ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(test, 10, TimeUnit.MINUTES);

        for(int i=0;i<10;i++)
        scheduledExecutorService.submit(test);

        // executorService.shutdown();
    }
}
