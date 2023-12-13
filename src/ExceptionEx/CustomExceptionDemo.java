package ExceptionEx;

public class CustomExceptionDemo{
    public int method(int a) throws CustomException{
        if(a>10){
            System.out.println("Example of Checked-Inside if case"); return 0;
        }
        else
            throw new CustomException();
    }

    public int methodforunchecked(int a) { //In case of unchecked exception we dont need to checked....bina Uncheckex exception ko throw kiye hi kam chal jata h
        if(a>10){
            System.out.println("Example of Unchecked- Inside if case"); return 0;
        }
        else
            throw new CustomUncheckedException();
    }

    public static void main(String[] args)throws CustomException{
        CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
        System.out.println(customExceptionDemo.method(11));

        System.out.println(customExceptionDemo.methodforunchecked(1));

    }
}
