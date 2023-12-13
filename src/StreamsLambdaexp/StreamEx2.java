package StreamsLambdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        //Problem - length of string is greater than 10 or not. If not trim it to length 10. Check if first and last char of string is same or not

        List<String>l= Arrays.asList("kk", "kkkgsjskkkkkkkjsksk", "ywuwiisjsgs", "yehwhssdagsfjjkkllllmnbvcxz");

        // here no need of filter kyuki size 10 se jyda ho to trim krnaa hau and kam ho to aise hi pass kr dena hai.
        List<String>l1= l.stream().map(x  -> x.length()>10 ? x.substring(0,10):x).filter(x -> x.charAt(0)==x.charAt(x.length()-1)).collect(Collectors.toList());
        System.out.println(l1);

    }
}
