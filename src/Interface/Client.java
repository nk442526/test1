package Interface;

public class Client {

    public static void main(String[] args) {
       Bank bank=new Bank() {
            @Override
            public String getBankname() {

                return "bank";
            }
        };


        HdfcDemo hdfc=new HdfcDemo();
        System.out.println(Bank.num);
        System.out.println(bank.getBankname());
        System.out.println(bank.defaultMethod());
        System.out.println(hdfc.defaultMethod());


    }
}
