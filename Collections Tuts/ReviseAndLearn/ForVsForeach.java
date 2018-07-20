import java.text.Format;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class ForVsForeach{
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Mahesh");
        a1.add("Suresh");
        a1.add("Ramesh");
        a1.add("Naresh");
        a1.add("Kalpesh");
        List<String> a2 = new ArrayList<>();
        a2.add("Mahesh");
        a2.add("Suresh");
        a2.add("Ramesh");
        a2.add("Naresh");
        a2.add("Kalpesh");

        ForVsForeach test = new ForVsForeach();
        System.out.println("Sorting with java7 methods");
        test.sortUsingJava7(a1);
        System.out.println(a1);
        test.sortUsingJava8(a2);
        System.out.println(a2);

    }
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);

            }
        });
    }
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1,s2)-> s1.compareTo(s2));
    }
}