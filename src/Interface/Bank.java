package Interface;

public interface Bank{
    int num=10;
    String getBankname();

    default String defaultMethod(){
        return "Bank Default";
    }

    public static void main(String[] args) {

    }
}

