package filestreamspack;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person= new Person("Raja", 16);
        writeObjectOfFile(person);
        readObjectFromFile();
    }

    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("/Users/nehakumari/Desktop/my_code/demo.txt");

        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
    }

    public static void writeObjectOfFile(Person p) throws IOException {
        FileOutputStream fileOutputStream= new FileOutputStream("/Users/nehakumari/Desktop/my_code/demo.txt");

        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p);
    }
}

/* Agr toString me change hua and readObjectFromFile() ko agr bs call kiye writeObjectOfFile() ko call nhi kiye to error return kar rha why??
Ans->
Jab bhi humlog serialize krte hai to serialversionUID change hota hai. And "writeObjectOfFile" method call krne par
wo hi serialversionUID file me write kiya jata hai. And jab "readObjectFromFile()" method call hota hai to file me
write serialversionUID ke according data read krta hai.
But here in this case what is happening ki humlog data change kiye jiske karan serialversionUID change ho gya.
but "writeObjectOfFile" method call nhi kr rhe jiske krn old wla serialversionUID hai store file me and jab "readObjectFromFile()" call kr rhe to
ye new wale serialversionUID ke according data mil hi nhi rha..jiske karan error return kr rha hai.

Well we can solve this problem by giving by default serialversionUID. Lets try that


 */