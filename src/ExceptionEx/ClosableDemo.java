package ExceptionEx;

import java.io.Closeable;
import java.io.IOException;

public class ClosableDemo implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("I am inside close method");
    }

    public void printData(){
        System.out.println("printing some data");
    }

    public static void main(String[] args) throws IOException{
        try(ClosableDemo demo= new ClosableDemo()){
            demo.printData();
        }finally {
            System.out.println("I am inside finally");
        }
    }
}
