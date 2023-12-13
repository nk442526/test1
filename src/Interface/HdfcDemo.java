package Interface;

public class HdfcDemo implements Bank{

    @Override
    public String getBankname() {
        return "Hdfc";
    }

    public String defaultMethod(){
        return "Htfc Default";
    }
}
