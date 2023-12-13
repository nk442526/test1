package Multithreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileClient {
    public static void main(String[] args) {
        VolatileDemoTask volatileDemoTask= new VolatileDemoTask("W");
        VolatileDemoTask volatileDemoTask1= new VolatileDemoTask("R");
        ExecutorService executorService= Executors.newFixedThreadPool(6);
        executorService.submit(volatileDemoTask);
        executorService.submit(volatileDemoTask1);

        executorService.shutdown();

    }
}
