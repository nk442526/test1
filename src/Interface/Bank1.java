package Interface;

public interface Bank1 {
    int num=10;
    String getBankname();

    default String defaultMethod(){
        return "Bank1 Default";
    }

}
