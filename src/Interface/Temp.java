package Interface;

public class Temp implements Bank, Bank1{
    @Override
    public String getBankname() {
        return "Temp method of child";
    }
    public String defaultMethod(){
        return Bank.super.defaultMethod();
    }
    public static void main(String[] args) {
        Temp child= new Temp();
        System.out.println(child.getBankname());
       System.out.println(child.defaultMethod());
    }




}
