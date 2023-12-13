package Multithreading;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread= new Thread(task);

        TaskUsingThread taskUsingThread = new TaskUsingThread();

        thread.start();
        taskUsingThread.start();
        taskUsingThread.join();

        /*thread.setName("neha thread");
        thread.setPriority(8);
       // thread.setDaemon(true);
        System.out.println(thread.getPriority());
        System.out.println(thread.getName());
        System.out.println(thread.getId());

        System.out.println(thread.getThreadGroup());

        System.out.println(thread.isAlive());
        System.out.println(thread.getContextClassLoader());
        System.out.println(thread.getStackTrace());
        System.out.println(thread.getState());

        System.out.println(thread.isDaemon());
        System.out.println(thread.getState());

       /// System.out.println(thread.set);
    */

    }
}
