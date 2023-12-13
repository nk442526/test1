package StreamsLambdaexp;


@FunctionalInterface
public interface FunctionalnterfaceEx {
    int sum(int a, int b);
   // int add(int a, int b, int c);------>only one abstract method in possible in functional interface

    default int addition(int y, int x, int z) {
        return y+x+z;
    }


}
//
