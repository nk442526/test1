package filestreamspack;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialversionUID= -1099669936693539662L;
    private String name;
    transient private int age;
   // private int pass;

    public Person(String name, int age){
        //this.pass=pass;
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person {" + "name: " + name+ ", age: " + age + "}";
    }
}
