package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {
    // 1. Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.

    public static void main(String [] args){

        List<Integer> ls = Arrays.asList(5,2,6,3,3,3,2,1,1,7,4);
        //Iseven(ls);
        //IsUniques(ls);
        String s = "Mister Deepak Singh";
        // 3. Find the frequency of each character in a string using Java 8 streams
        Map<Character, Long> FrequencyMap = s.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(FrequencyMap);

       // 4 . Find the frequency of each element in an array or a list
       numberFreq(ls);

    }

    public static void Iseven(List<Integer> ls){
         List<Integer> newLS = ls.stream().filter(x -> x%2==0 ).toList();

        /* for(Integer c : newLS){
             System.out.print(c + ", ");
         }*/
        System.out.println(newLS.toString());
    }
   // 2. Remove duplicate elements from a list using Java 8 streams

    public static void IsUniques(List<Integer> ls){
        ls.stream().distinct().forEach(System.out::print);
    }
    private static void numberFreq(List<Integer> ls) {
        Map<Integer, Long> collect = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }






}

