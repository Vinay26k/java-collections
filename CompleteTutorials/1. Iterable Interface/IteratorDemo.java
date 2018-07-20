import java.util.Iterator;
import java.util.ArrayList;

class IteratorExample{
	public static void someMethodToDemonstrateIterator(ArrayList<String> list){
		// Initialize iterator
		Iterator<String> iter = list.iterator();
		// it has methods like
		// hasNext(), next(), remove(), forEachRemaining()
		while(iter.hasNext()){
			String word = iter.next();
			if("world".equals(word)){
				iter.remove();
				break;
			}
			System.out.println(word);
		}
		System.out.println("After breaking loop : ");
		iter.forEachRemaining(System.out::println);
	}
}

public class IteratorDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		IteratorExample ie = new IteratorExample();
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("hello");
		a1.add("world");
		a1.add("Iam");
		a1.add("printing");
		a1.add("after");
		a1.add("deleting");
		a1.add("the");
		a1.add("world");
		ie.someMethodToDemonstrateIterator(a1);
	}
}