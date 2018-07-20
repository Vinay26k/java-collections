import java.util.*;
import java.util.stream.Collectors;
class stringExample{
    public static void main(String[] args) {
        StringBuilder stbuilder = new StringBuilder();
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        for(String string: strings){
            if(!string.isEmpty()){
                stbuilder.append(string);
                stbuilder.append(',');
            }
        }
        String res = stbuilder.toString();
        System.out.println(res.substring(0,res.length()-1));

        //remove empty strings
        List<String> filtered = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        //count empty strings
        long count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("Number of empty strings : "+ count);

        //length = 3  number of strings
        count = strings.stream().filter(string->string.length()==3).count();
        System.out.println("Length(3) number of strings : "+ count);

        //Eliminate empty string and join using comma.
        res = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("Merged string : "+res);

        
    }
}