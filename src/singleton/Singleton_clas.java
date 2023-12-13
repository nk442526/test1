package singleton;

public class Singleton_clas {

    private static Singleton_clas var;
    public Singleton_clas(){
        System.out.println("object of singleton is created");
    }

    private static Singleton_clas method(){
        if(var==null) var = new Singleton_clas();
        return var;
    }

    public static void main(String[] args) {
        Singleton_clas a = Singleton_clas.method();
        Singleton_clas b = Singleton_clas.method();
        Singleton_clas c = Singleton_clas.method();

        System.out.println("Print hashcode value of a: " + a.hashCode()+ " b: "+ b.hashCode()+ " c: "+ c.hashCode());
    }
}
