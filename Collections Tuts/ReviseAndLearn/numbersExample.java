import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
class numbersExample{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of square of distinct numbers
        List<Integer> squaredList = getSquares(numbers);
        System.out.println(squaredList);

        squaredList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println(squaredList);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).summaryStatistics();
        System.out.println("Max : "+stats.getMax());
        System.out.println("Min : "+stats.getMin());
        System.out.println("Ave : "+stats.getAverage());
        System.out.println("Sum : "+stats.getSum());
        System.out.println("Class : "+stats.getClass());

    }
    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaredList = new ArrayList<>();
        for(Integer number : numbers){
            Integer square = new Integer(number.intValue()*number.intValue());
            if(!squaredList.contains(square)){
                squaredList.add(square);
            }
        }
        return squaredList;        
    }
}