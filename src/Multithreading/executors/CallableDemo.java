package Multithreading.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask task= new CallableTask();

        // Thread thread = new Thread(task);// this is giving error because u can't call object of callable in thread. as we we do in runnable.

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Future<String> result= executorService.submit(task);// future is an interface. whcich says ki abhi mere apss value nhi h but i will give you value latter..
        //wherever u will required. and to aquire value we can use get() method.

        System.out.println("here!");
        System.out.println(result.get());
        System.out.println("here!");
    }

}
