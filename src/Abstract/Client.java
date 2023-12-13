package Abstract;

public class Client {
    public static void main(String[] args) {
        //Class inside Class

        Outterclass outterclass = new Outterclass();
        System.out.println("print age: "+ outterclass.getAge());

        Outterclass.innerClass demo =  outterclass.new innerClass();
        //Outterclass.innerClass demo1= new Outterclass.innerClass();

        //System.out.println("print roll: "+ outterclass.getRoll()); ----> showing error that create getRoll method in outterclass. It means outer class cannat access
        //data of inner class.
        System.out.println("Roll is: "+ demo.getRoll());
        //System.out.println("Roll is: "+ demo1.getRoll());


        //Interface inside interface

        System.out.println("age inside interface is" + Outerinterface.age);
        System.out.println("roll inside interface is" +Outerinterface.innerinterface.roll);

        //Interface inside Class

        Classinterfacedemo classinterfacedemo= new Classinterfacedemo();
        System.out.println(classinterfacedemo.getData());

      //  Classinterfacedemo classinterfacedemo1= Outerinterface.innerinterface.roll;



    }
}

