package Multithreading;

public class Task implements Runnable{

    @Override
    public void run() {

        System.out.println("thread running by runnable");
    }

   /* public static void main(String[] args) {
        Task task = new Task();
        Thread thread= new Thread(task);
        thread.start();
        TaskUsingThread taskUsingThread = new TaskUsingThread();
        taskUsingThread.start();

    }*/
}
