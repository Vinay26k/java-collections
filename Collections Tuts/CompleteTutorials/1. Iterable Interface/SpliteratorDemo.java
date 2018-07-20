import java.util.Spliterator;
import java.util.ArrayList;

class SpliteratorExample{
	public static void someMethodToDemonstrateSpliterator(ArrayList <Integer> list){
		System.out.println("Contents of the ArrayList :");
		// initialize spliterator and perform actions
		Spliterator <Integer> splitr1 = list.spliterator();
		System.out.println("Estimate size : "+splitr1.estimateSize());
		System.out.println("Exact size : "+splitr1.getExactSizeIfKnown());
		System.out.println("splitr1 has characteristics : "+splitr1.hasCharacteristics(splitr1.characteristics()));
		splitr1.forEachRemaining(System.out::println);

		//re-assign splitr1
		splitr1 = list.spliterator();

		//tryAdvance() => to perfom operation on next element
		ArrayList <Integer> a2 = new ArrayList<>();
		while(splitr1.tryAdvance((n)-> a2.add(Math.abs(n))));

		//re-assign splitr1
		splitr1 = list.spliterator();
		//try splitting
		Spliterator <Integer> splitr2 = splitr1.trySplit();
		// if splitr1 could be split, use splitr2 first
		if(splitr2!=null){
			System.out.println("Output from splitr2 : ");
			splitr2.forEachRemaining(System.out::println);
		}
		System.out.println("Output from splitr1 : ");
		splitr1.forEachRemaining(System.out::println);

		System.out.println("Contents of ArrayList2 : ");
		Spliterator <Integer> splitra = a2.spliterator();
		while(splitra.tryAdvance((n)-> System.out.println(n)));
	}
}

public class SpliteratorDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		SpliteratorExample se = new SpliteratorExample();
		ArrayList <Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(-2);
		arr.add(5);
		arr.add(6);
		arr.add(-4);
		arr.add(-3);
		se.someMethodToDemonstrateSpliterator(arr);
	}
}