package equalhash;

public class Student {

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode(){
        return this.age.hashCode() +this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof Student)) return false;
        Student s= (Student)  obj;// downcastingnparent to child
        if(s.name==this.name && s.age==this.age) return true;
        return false;

    }

    public static void main(String[] args) {
        Student s=new Student("neha", 20);
        Student s1=new Student("neha", 20);
        System.out.println(s1.equals(s)); // output- true
        //output both has same hashcode
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        // ==
        String a="abc";
        String b="abc";
        System.out.println(a==b); // output true


        String x= new String("qwer");
        String y= new String("qwer");
        System.out.println(x==y); // output false

        String p= new String("qwer").intern();
        String q= new String("qwer").intern();
        System.out.println(x==y); // output true

    }
}
