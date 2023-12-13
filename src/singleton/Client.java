package singleton;

public class Client {
    public static void main(String[] args) {
        //Logging logging = new Logging(); ---> this time i cannot create object like this because the constructor is private

        Logging logging = Logging.getInstance(); //---> Here we are calling method direct because we have static method.
        Logging logging1 = Logging.getInstance();

        /*
        In case of Early instance we can create object like this
        Logging logging = Logging.instance;
        Logging logging1 = Logging.instance;


         */

    }
}
