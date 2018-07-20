import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class JavaFunctionalInterface{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //predicate returns bool
        System.out.println("Print all numbers");
        eval(list, n->true);

        //print even numbers
        System.out.println("Print even numbers");
        eval(list, n->n%2==0);

        //print odd numbers
        System.out.println("Print odd numbers");
        eval(list, n->n%2==1);

        //print numbers greated than 3
        System.out.println("Print numbers > 3");
        eval(list, n->n>3);

    }
    public static void eval(List<Integer> list, Predicate<Integer>predicate) {
        for(Integer n: list){
            if(predicate.test(n)){
                System.out.println(n+" ");
            }
        }
    }
}