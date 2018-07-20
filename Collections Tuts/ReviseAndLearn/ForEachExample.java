import java.util.List;
import java.util.ArrayList;

class ForEachExample{
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Mahesh");
        a1.add("Suresh");
        a1.add("Ramesh");
        a1.add("Naresh");
        a1.add("Kalpesh");
        a1.forEach(System.out::println);
    }
  
}