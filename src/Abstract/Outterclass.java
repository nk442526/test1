package Abstract;

public class Outterclass {

    private int age=22;

    public int getAge() {
        return age;
    }

    public class innerClass{ // if we will make this class static then we will create object of innerClass like this- Outterclass.innerClass demo1= new Outterclass.innerClass();

        private int roll=10;


        public int getRoll() {
            return roll;
        }
    }

    //Byte code never get generated seperately for inner class

}
