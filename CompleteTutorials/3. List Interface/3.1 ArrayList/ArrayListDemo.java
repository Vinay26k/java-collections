import java.util.ArrayList;
import java.util.Collections;
class ArrayListExample{
	public static void someMethod(){
		//initialize 
		ArrayList<String> list = new ArrayList<>(){{
			add("hello");
			add("world");
			add("check");
		}};
		list.forEach(System.out::println);
		ArrayList<String> temp = new ArrayList<>(10);
		System.out.println(temp.size());
		temp.add("one");
		temp.add("two");
		temp.add("three");
		temp.add("four");
		temp.forEach(System.out::println);
		System.out.println(temp.size());
		// given 10 initial capacity, but only four elements added
		// we can trim to its size
		temp.trimToSize();
		//till 20 elements are added, there will be no resizing in between
		temp.ensureCapacity(20);
		//System.out.println("Element at index 2: "+ temp.elementAt(temp.get(0),2));
		temp.subList(1,2).clear();
		temp.forEach(System.out::println);
	}
}

public class ArrayListDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		ArrayListExample ale = new ArrayListExample();
		ale.someMethod();	
	}
}