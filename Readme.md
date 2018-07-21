# github.com/Vinay26k
## [Resume](https://vinay26k.github.io/Resume.html)
## Java Collections Framework - Complete Tutorials by Me [In process]

![alt collections-image.png](Collection-framework-hierarchy.png)



### Iterable Interface [Code](CompleteTutorials/1.%20Iterable%20Interface/IterableDemo.java)
	>> javap java.lang.Iterable
```java
	Compiled from "Iterable.java"
	public interface java.lang.Iterable<T> {
		public abstract java.util.Iterator<T> iterator();
		public void forEach(java.util.function.Consumer<? super T>);
		public java.util.Spliterator<T> spliterator();
	}
```

	- Key things to Note:
		- It has Iterator interface in it
		- forEach method
		- It also has Spliterator interface
			- which is combination of splitting + iterator
			- it provides tryAdvance() method which is equivalent to both next() and hasNext() from iterator
			- it can't be used on Map data structure




### Iterator Interface [Code](CompleteTutorials/1.%20Iterable%20Interface/IteratorDemo.java)
	>> javap java.util.Iterator
```java
	Compiled from "Iterator.java"
	public interface java.util.Iterator<E> {
  		public abstract boolean hasNext();
  		public abstract E next();
  		public void remove();
  		public void forEachRemaining(java.util.function.Consumer<? super E>);
	}
```

	- Key things to Note:
		- hasNext() => checks whether element exists next in the sequence or not
		- next()  => returns the element and moves iterator/ cursor point to next element
		- remove() => removes last element returned by iterator
		- forEachRemaining() => Performs the given action for each remaining element until all elements have been processed or the action throws an exception.


### Spliterator Interface [Code](CompleteTutorials/1.%20Iterable%20Interface/SpliteratorDemo.java)
	>> javap java.util.Spliterator
```java
	Compiled from "Spliterator.java"
	public interface java.util.Spliterator<T> {
		public static final int ORDERED;
		public static final int DISTINCT;
		public static final int SORTED;
		public static final int SIZED;
		public static final int NONNULL;
		public static final int IMMUTABLE;
		public static final int CONCURRENT;
		public static final int SUBSIZED;
		public abstract boolean tryAdvance(java.util.function.Consumer<? super T>);
		public void forEachRemaining(java.util.function.Consumer<? super T>);
		public abstract java.util.Spliterator<T> trySplit();
		public abstract long estimateSize();
 		public long getExactSizeIfKnown();
		public abstract int characteristics();
		public boolean hasCharacteristics(int);
		public java.util.Comparator<? super T> getComparator();
	}
```

	- Key things to Note:
		- SIZED – if it’s capable of returning an exact numer of elements with the estimateSize() method
		- SORTED – if it’s iterating through a sorted source
		- SUBSIZED – if we split the instance using a trySplit() method and obtain Spliterators that are SIZED as well
		- CONCURRENT – if source can be safely modified concurrently
		- DISTINCT – if for each pair of encountered elements x, y, !x.equals(y)
		- IMMUTABLE – if elements held by source can’t be structurally modified
		- NONNULL – if source holds nulls or not
		- ORDERED – if iterating over an ordered sequence



### Collection interface [Code](CompleteTutorials/2.%20Collection%20Interface/CollectionInterfaceDemo.java)

	- it defines all the methods inherited by other collections
	>> javap java.util.Collection
```java
	Compiled from "Collection.java"
	public interface java.util.Collection<E> extends java.lang.Iterable<E> {
  		public abstract int size();
  		public abstract boolean isEmpty();
  		public abstract boolean contains(java.lang.Object);
  		public abstract java.util.Iterator<E> iterator();
  		public abstract java.lang.Object[] toArray();
  		public abstract <T> T[] toArray(T[]);
  		public abstract boolean add(E);
  		public abstract boolean remove(java.lang.Object);
  		public abstract boolean containsAll(java.util.Collection<?>);
  		public abstract boolean addAll(java.util.Collection<? extends E>);
  		public abstract boolean removeAll(java.util.Collection<?>);
  		public boolean removeIf(java.util.function.Predicate<? super E>);
  		public abstract boolean retainAll(java.util.Collection<?>);
  		public abstract void clear();
  		public abstract boolean equals(java.lang.Object);
  		public abstract int hashCode();
  		public java.util.Spliterator<E> spliterator();
  		public java.util.stream.Stream<E> stream();
  		public java.util.stream.Stream<E> parallelStream();
	}
```

	- Key things to Note:
		- size() - size of the collection
		- isEmpty() - check empty or not
		- contains() - check if contains element
		- (Iterator) iterator() -> implements hasNext(), next(), remove(), forEachRemaining()
		- toArray() - convert collection to array
		- add() - add element to collection
		- remove() - remove element from collection
		- containsAll() - check if some collection is present
		- addAll() -  add one collection to other
		- removeAll() - remove the passed collection elements from collection
		- removeIf() - checks condition and removes element
		- retainAll() - keep common elements from passed collection
		- clear() - clear the collection
		- equals() - check if one object equals to other
		- hashCode() - returns hashCode for each object
		- (Spliterator) spliterator() -> implements trySplit(), tryAdvance(), forEachRemaining()..
		- (java.util.stream.Stream) stream() -> stream object to perform stream operations
		- parallelStream() -> similar to stream object

### List interface [Code](CompleteTutorials/3.%20List%20Interface/ListInterfaceDemo.java)
	>> javap java.util.List;
```java
	Compiled from "List.java"
	public interface java.util.List<E> extends java.util.Collection<E> {
	  public abstract int size();
	  public abstract boolean isEmpty();
	  public abstract boolean contains(java.lang.Object);
	  public abstract java.util.Iterator<E> iterator();
	  public abstract java.lang.Object[] toArray();
	  public abstract <T> T[] toArray(T[]);
	  public abstract boolean add(E);
	  public abstract boolean remove(java.lang.Object);
	  public abstract boolean containsAll(java.util.Collection<?>);
	  public abstract boolean addAll(java.util.Collection<? extends E>);
	  public abstract boolean addAll(int, java.util.Collection<? extends E>);
	  public abstract boolean removeAll(java.util.Collection<?>);
	  public abstract boolean retainAll(java.util.Collection<?>);
	  public void replaceAll(java.util.function.UnaryOperator<E>);
	  public void sort(java.util.Comparator<? super E>);
	  public abstract void clear();
	  public abstract boolean equals(java.lang.Object);
	  public abstract int hashCode();
	  public abstract E get(int);
	  public abstract E set(int, E);
	  public abstract void add(int, E);
	  public abstract E remove(int);
	  public abstract int indexOf(java.lang.Object);
	  public abstract int lastIndexOf(java.lang.Object);
	  public abstract java.util.ListIterator<E> listIterator();
	  public abstract java.util.ListIterator<E> listIterator(int);
	  public abstract java.util.List<E> subList(int, int);
	  public java.util.Spliterator<E> spliterator();
	  public static <E> java.util.List<E> of();
	  public static <E> java.util.List<E> of(E);
	  public static <E> java.util.List<E> of(E, E);
	  public static <E> java.util.List<E> of(E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E...);
	  public static <E> java.util.List<E> copyOf(java.util.Collection<? extends E>);
	}
```

	- Key things to Note:
		- extra methods apart from Collection Interface are
			- addAll(index, collection) - adds all the collection at given index
			- replaceAll() - replaces all the elements with the given or specified function using apply operator
			- Collections.sort() - sort elements of list accordingly optionally comparator can be passed
			- get(index) - get element at given index
			- set(index, val) - set element at given index
			- add(index, ele) - add at index
			- indexOf(val) - get the index of given val
			- remove(index) - remove element using index
			- lastIndexOf(val) - last occurence index
			- listIterator(), listIterator(int)
			- subList(startIndex, endIndex)
			- of() - combine muliple objects to umodifiablelist
			- copyOf() - create copyOf umodifiablelist

### Comparable interface [Code](CompleteTutorials/0.%20Comparable%20Interface/ComparableInterfaceDemo.java)
	>> javap java.lang.Comparable;
```java
	Compiled from "Comparable.java"
	public interface java.lang.Comparable<T> {
  		public abstract int compareTo(T);
	}
```

	- Key things to Note:
		- abstract method compareTo(Object) -> must be implemented by any class implementing it.

### ArrayList Class
	>> javap java.util.ArrayList;
```java
	Compiled from "ArrayList.java"
	public class java.util.ArrayList<E> extends java.util.AbstractList<E> implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {
		transient java.lang.Object[] elementData;
  		public java.util.ArrayList(int);
  		public java.util.ArrayList();
  		public java.util.ArrayList(java.util.Collection<? extends E>);
  		public void trimToSize();
  		public void ensureCapacity(int);
  		public int size();
  		public boolean isEmpty();
  		public boolean contains(java.lang.Object);
  		public int indexOf(java.lang.Object);
  		public int lastIndexOf(java.lang.Object);
  		public java.lang.Object clone();
  		public java.lang.Object[] toArray();
  		public <T> T[] toArray(T[]);
  		E elementData(int);
  		static <E> E elementAt(java.lang.Object[], int);
  		public E get(int);
  		public E set(int, E);
  		public boolean add(E);
  		public void add(int, E);
  		public E remove(int);
  		public boolean remove(java.lang.Object);
  		public void clear();
  		public boolean addAll(java.util.Collection<? extends E>);
  		public boolean addAll(int, java.util.Collection<? extends E>);
  		protected void removeRange(int, int);
  		public boolean removeAll(java.util.Collection<?>);
  		public boolean retainAll(java.util.Collection<?>);
  		boolean batchRemove(java.util.Collection<?>, boolean, int, int);
  		public java.util.ListIterator<E> listIterator(int);
  		public java.util.ListIterator<E> listIterator();
  		public java.util.Iterator<E> iterator();
  		public java.util.List<E> subList(int, int);
  		public void forEach(java.util.function.Consumer<? super E>);
  		public java.util.Spliterator<E> spliterator();
  		public boolean removeIf(java.util.function.Predicate<? super E>);
  		boolean removeIf(java.util.function.Predicate<? super E>, int, int);
  		public void replaceAll(java.util.function.UnaryOperator<E>);
  		public void sort(java.util.Comparator<? super E>);
  		void checkInvariants();
  		static int access$000(java.util.ArrayList);
  		static {};
	}
```

	- Key things to Note:
		- ArrayList(int size) - how much initial capacity to be allotted
		- trimToSize() - after elements are filled, remaining capacity can be removed by this method
		- ensureCapacity(int) - ArrayList resizes automatically, to make sure of good performance at once we can ensure with minimum capacity there by decreasing arraylist resizing frequency
		- removeRange(int,int) - protected method can't be used, instead subList(int,int).clear()