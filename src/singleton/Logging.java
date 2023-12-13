package singleton;

public class Logging {
    public static Logging instance;

    private Logging(){} // constructor ko private bnaye taki koi or access na kare..kyuki iska ek hi object possible hota hai

    //Since constructor is private so inorder to create an object i created this method

    public static Logging getInstance() {
        if (instance == null) {
            System.out.println("Inside if ");
            instance = new Logging();
            return instance;
        } else {
            System.out.println("Inside else ");
            return instance;
        }
    }

    /*
    Ab tak humne jaise instantiation kiya hai wo Lazy Instanctiation hai. Ye humlog tb create krte hai jab tak ek dam Mazboori na ho jaye.
    For Early instantiation -> humlog jb "public static Logging instance;" create kr rhe hote h to usi wakt isko aise nhi likh kar
    "public static Logging instance= new Logging();" aise likhte hai. in that case we dont required
     public static Logging getInstance(){
        if(instance==null) {
            System.out.println("Inside if ");
            instance= new Logging();
            return instance;
        }else{
            System.out.println("Inside else ");
            return instance;
        }



     */

}
