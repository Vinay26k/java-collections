import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

/*
Given an array containing int values and find out the numbers which occur exactly 2 times.
Example: arr = {1, 3, 4, 3, 1, 1, 2, 3, 2, 4, 5};
Output - 4,2
*/

class FindRepeatedNumbers{
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3, 4, 3, 1, 1, 2, 3, 2, 4, 5);
        Map<Integer,Integer> freq = new HashMap<>();
        for (Integer number : arr) {
            freq.put(number, freq.getOrDefault(number, Integer.valueOf(0))+Integer.valueOf(1));
        }
        //System.out.println(freq);
        freq.forEach((k,v)-> {
            if(Integer.valueOf(2).equals(v)){
            System.out.println(k);}
        });

        // Map<Integer, Long> frequency = arr.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(arr.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).entrySet().stream().filter(m->m.getValue() == Long.valueOf(2)).collect(Collectors.toList()));
        List<Integer> result = IntStream.range(1, 10).boxed().collect(Collectors.toList());
        System.out.println(result);
        IntStream.range(1, 5).boxed().map(i -> { System.out.print("Happy Birthday "); if (i == 3) return "dear NAME"; else return "to You"; }).forEach(System.out::println);
    }
}