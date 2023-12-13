package Multithreading;

import java.math.BigInteger;

public class FactorialRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(FactorialRunnable.getFactorial(10));
        System.out.println("RUnning inside FactorialRunnable: "+ Thread.currentThread());

    }

    public static BigInteger getFactorial(int num){
        BigInteger result = BigInteger.valueOf(1);
        for(int i=2;i<=num;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        FactorialRunnable factorialRunnable = new FactorialRunnable();
        Thread t1= new Thread(factorialRunnable);
        Thread t2= new Thread(factorialRunnable);

        t2.join();
        t1.start();

        t2.start();
        System.out.println("inside main");

    }
}
