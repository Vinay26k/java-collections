import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

class CollectionExample{
	public static void someMethod(){
		Collection<String> c = new ArrayList<>();
		c.add("hello");
		c.add("world");
		c.add("iam");
		c.add("adding");
		c.add("to");
		c.add("the");
		c.add("collection");
		//size()
		System.out.println("Size of string Collection : "+c.size());
		//isEmpty()
		System.out.println("Is empty : "+c.isEmpty());
		System.out.println("Check if Empty [dummy] : "+ new ArrayList().isEmpty());
		//contains()
		System.out.println("Check if world is in collection : "+c.contains("world"));
		//iterator() ArrayList already implements
		Iterator <String> itr = c.iterator();
		//forEach we can use
		c.forEach(System.out::println);
		//toArray()
		//String [] someWords = c.toArray(new String [c.size()]);
		String [] someWords = c.toArray(new String[]{});
		String res = "";
		for(String word: someWords){
			res += word+" ";
		}
		System.out.println(res);
		//itr removing hello
		while(itr.hasNext()){
			String somek = itr.next();
			if(somek.equals("hello")){
				itr.remove();
				break;
			}
		}
		// removing world with collection method
		c.remove("world");
		// following line creates ConcurrentModificationException
		// import java.util.concurrent.CopyOnWriteArrayList;
		// to handle this collection must be created as Collection <String> c = new CopyOnWriteArrayList<>();
		// itr.forEachRemaining(System.out::println);
		c.forEach(System.out::println);
		//containsAll()
		Collection <String> c2 = new ArrayList<>(c);
		c2.remove("adding");
		// c has all elements of c2 plus some more of its own
		System.out.println("Collection c contains all elements of c2 : "+c.containsAll(c2));
		Collection <String> c3 = new ArrayList<>(){{add("lets");add("just");add("check");add("it");}};
		//c3.forEach(System.out::println);
		//addAll()
		c.addAll(c3);
		c.forEach(word -> System.out.print(word +" "));
		System.out.println("\nRemoving all added elements");
		// removeAll()
		c.removeAll(c3);
		c.forEach(word -> System.out.print(word +" "));
		System.out.println();

		//removeIf
		c.removeIf(word -> word.equals("iam"));
		c.forEach(word -> System.out.print(word + " "));
		System.out.println();
		//retainAll()
		c2.forEach(word -> System.out.print(word + " "));
		c.retainAll(c2);
		System.out.println();
		c.forEach(word -> System.out.print(word+" "));
		c2.clear();
		c3.clear();
		System.out.println("\nCollection c2 and c3 are clear ? "+ c2.isEmpty()+" "+c3.isEmpty());
		//stream()
		c.stream().filter(word -> !word.equals("to")).forEach(System.out::println);
		//parallelStream() use it mainly for parallel processing of high volumes of data
		c.parallelStream().filter(word -> !word.equals("to")).forEach(System.out::println);

	}
}

public class CollectionInterfaceDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		CollectionExample ce = new CollectionExample();
		ce.someMethod();
	}
}