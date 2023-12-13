package Multithreading.executors;

public class Test implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name of task is :"+ Thread.currentThread().getName());
    }
}
