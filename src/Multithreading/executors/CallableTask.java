package Multithreading.executors;

import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class CallableTask implements Callable {
    @Override
    public String call() throws Exception {
        sleep(1000);
        return "I am in the call method with the thread name: " + Thread.currentThread().getName();
    }
}
