package Encapsulation;

public class practice {
    //prime number
    public static void main(String[] args) {
        // 1 3 5 7 11 13
        int n=30; // 13/2  11
        int m=n/2;
        int flag=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {System.out.println("NOt prime"); flag=1; break;}

        }
        if(flag==0)
        System.out.println("NUmber is prime");
    }
}

//n- sqrt(n)
