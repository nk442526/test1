package ExceptionEx;

public class DifferentKeyword {

    int a;
    public int test(int a){
        int b=10;
        int c;
        try{
            System.exit(0);//whenever you use this then finally block will not execute. if you will use this after line below c=b/a; then koi asar nhi hoga isse
            //use krne ka. Because exception hone k baad ye catch me chla jayega.
            c=b/a;
            System.out.println("Print c: "+ c);
            //System.exit(0);
            return 0;
        } catch (NullPointerException e){
            System.out.println("Value of c is throwing exception ");
            //e.printStackTrace();
            //return 1;
        } catch(Exception e){
            throw e;
            //e.printStackTrace();
            //System.out.println("Value of c is throwing exception ");
            //return 1;
        } finally {
            System.out.println("Final block will always get exceuted");
        }
        return 0;
    }

    //This function we are already aware ki haa ye exception throw kar rha hai and we are not handeling it by try catch block to tumhe throws keyword use krna hi hoga.
    public void function() throws Exception {
        throw new Exception("some");
    }

    public void func() throws Exception{
        function();
    }

    //we can write above method by handeling with try catch as well
    /*public void func(){
        try {
            function();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/

    public static void main(String[] args) throws Exception{
        DifferentKeyword differentKeyword = new DifferentKeyword();
        differentKeyword.func();

    }

}
