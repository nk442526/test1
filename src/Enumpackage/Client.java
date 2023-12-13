package Enumpackage;

public class Client{
    public static void main(String[] args) {
        try{
        System.out.println(Parent.valueOf(Parent.HDFC.getVal()));
       System.out.println(Parent.valueOf(Parent.HDFC.name()));
       }catch (Exception e) {
           System.out.println(e);

        }
    }
}
