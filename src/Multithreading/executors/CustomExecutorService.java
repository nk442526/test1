package Multithreading.executors;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//threadPoolExecutor  is a thread pool created by user not by executor
public class CustomExecutorService {
    public static void main(String[] args) throws InterruptedException {
        Test test=new Test();
        int corePoolSize=4;//corePoolSize 4 hai mtlb ek bar me 4 hi thread create hoga.
        int maxPoolSize=10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,maxPoolSize,30L, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        for (int i=0;i<10;i++)
            threadPoolExecutor.submit(test);

      threadPoolExecutor.shutdown();// running thread ko complete krega....then shutdown hoga.
     //   System.out.println(threadPoolExecutor.isShutdown());
      // threadPoolExecutor.shutdownNow();// immediate shutdown kr dega task ko. no matter task completed or not



        //await termination will wait till the time mentioned to got to the next line.
        // If all the tasks are done before the time specified..then the next line will get printed at the end (here that line is "Neha").
        //Else if task are not done in that time then the next statement will not wait more than the time given. and it will printed in the between.
        threadPoolExecutor.awaitTermination(1,TimeUnit.MILLISECONDS);
        System.out.println("Neha");

        for (int i=0;i<10;i++)
         threadPoolExecutor.submit(test);

    }
}
