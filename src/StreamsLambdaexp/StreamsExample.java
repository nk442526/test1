package StreamsLambdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsExample {
    //-> problem statement:- From list, filter the even number and then return the addition of square of each number.

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum=0;
        for(int i=0;i<l.size();i++){
            if(l.get(i)%2==0){
                sum+= (l.get(i)* l.get(i));
            }
        }
        System.out.println(sum);


        // Solving above problem using Stream
        //parallel ka use krne se ye series me nhi ho kr parallel me call hoga sara method.//parralle use krne se time reduce ho jayega.
        //Now when to use parallel - So Use NQ method for this. If N*Q is >10000 then use parallel method. ELse use Series.
        int sum2=l.stream().parallel().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer){
                return integer*integer;
            }
        }).reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });

        System.out.println("ans by stream method "+sum2);


        int sum3=l.stream().filter(integer -> integer%2==0).map(integer -> integer*integer).reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println("ans by lambda exp " + sum3);
    }



}
