package Multithreading.executors;

//  Code for memory consistency issue
/*public class VolatileDemoTask implements Runnable{

    private String type;
    private static int value=0;


    public VolatileDemoTask(String type){
        this.type=type;
    }

    @Override
    public void run() {
        if(type=="W"){
            while(value!=5){
                value++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Write is: "+ value);
            }
        }else{
            int temp=0;
            while (true){
                if(temp!=value){
                    temp=value;
                    System.out.println("Read is: "+ value);
                }
            }
        }
    }
}*/

// For solving the problem coming because of abovr code we will not use keyword volatile...jisse read wale ko pta chal jayega ki valuee update ho gya.
//Volatile keyword use krne se data ko RAM me store krta hai
public class VolatileDemoTask implements Runnable{

    private String type;
    private volatile static int value=0;


    public VolatileDemoTask(String type){
        this.type=type;
    }

    @Override
    public void run() {
        if(type=="W"){
            while(value!=5){
                value++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Write is: "+ value);
            }
        }else{
            int temp=0;
            while (true){
                if(temp!=value){
                    temp=value;
                    System.out.println("Read is: "+ value);
                }
            }
        }
    }
}
