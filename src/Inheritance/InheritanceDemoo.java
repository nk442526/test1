package Inheritance;

public class InheritanceDemoo {
    public String data1="inheritanve";
    String student;
    Address address;

    public InheritanceDemoo(String student, Address address){
        this.student=student;
        this.address=address;
    }

    public InheritanceDemoo(){
        System.out.println("constructor of Inheritancedemo");
    }

    public void parentMethod(){
        System.out.println("parent");
    }


}
