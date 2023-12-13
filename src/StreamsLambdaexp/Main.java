package StreamsLambdaexp;

public class Main {
    public static void main(String[] args) {
        FunctionalnterfaceEx functionalnterfaceEx = new FunctionalnterfaceEx() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        System.out.println(functionalnterfaceEx.sum(2,3));

        //Call using Lambda exp-
        FunctionalnterfaceEx functionalnterfaceEx1= (int a, int b)->a+b;
        System.out.println("Using Labma exp->");

        System.out.println(functionalnterfaceEx1.sum(10,3));



    }



    // object.sum(2,3);
}

