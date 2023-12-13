package ExceptionEx;

public class ExceptionDemo {
    //agr hume lgta hia koi error de skta hai to hum usse try catch block me dalna chhaiye.
    int a;
    public int test(int a){
        int b=10;
        int c;
        try{
            System.exit(0);//whenever you use this then finally block will not execute. if you will use this line below c=b/a; then koi asar nhi hoga isse
            //use krne ka. Because exception hone k baad ye catch me chla jayega.
            c=b/a;
            System.out.println("Print c: "+ c);
            //System.exit(0);
           return 0;//Method return type is int so kuchh toreturn krna hi hota h
        } catch (NullPointerException e){
            e.printStackTrace();
            return 1;
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Value of c is throwing exception ");
            return 1;
        } finally {
            System.out.println("Final block will always get exceuted");
        }
    }

    public static void main(String[] args) {
       ExceptionDemo exceptionDemo = new ExceptionDemo();
       exceptionDemo.test(0);
       System.out.println("Now exception is get handeeled");
    }

}
