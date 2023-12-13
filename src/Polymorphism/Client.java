package Polymorphism;

public class Client {
    public static void main(String[] args) {

        // --->  UP Casting
        PolymorphismDemo demo=(PolymorphismDemo) new CheckPoly(); //-->Upcasting we do when the method is present in parent and we want to call that only method in parent
        //Or if method is present in both and we need to call the parent then super keyword comes into picture

        //---> DOWN CASTING
        PolymorphismDemo demo1=new CheckPoly();
        CheckPoly child= (CheckPoly) demo1;//---> DOWN CASTING

        System.out.println(((CheckPoly) demo1).sum(2,5));
        System.out.println(child.sum(2,5));
    }
}

/**
Example of DOWNCAST
 public static void main(String[] args) {
 PolymorphismDemo demo= new CheckPoly();
 CheckPoly child= (CheckPoly) demo;
 System.out.println(child.sum(2,5));
 }

 * */