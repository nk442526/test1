package Multithreading.executors;

public class VisitorsCountTask implements Runnable {
    private int visitors;

    public VisitorsCountTask(){
        this.visitors=0;
    }

    public int getVisitors(){
        return visitors;
    }

    public synchronized void getAndAdd(){
        visitors++;
    }
    @Override
    public void run() {
       getAndAdd();
    }
}
