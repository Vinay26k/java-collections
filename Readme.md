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
			- listIterator(), listIterator(int) - starts iterator and iterator at specific index
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

### Queue interface
	>> javap java.util.Queue;
```java
	Compiled from "Queue.java"
	public interface java.util.Queue<E> extends java.util.Collection<E> {
  		public abstract boolean add(E);
  		public abstract boolean offer(E);
  		public abstract E remove();
  		public abstract E poll();
  		public abstract E element();
  		public abstract E peek();
  	}
```

	- Key things to Note:
		- [FIFO] -> add at back, remove at front
		- add/offer - both adds but add throws exception like IllegalStateException, NPE, ClassCast, IllegalArgument whereas offer returns false if operation failed
		- remove/poll - remove throws NoSuchElementException if queue is empty but poll returns null
		- element/peek - element() throws NSE exception if queue is empty, but peek() returns null value

### Set interface
	>> javap java.util.Set;
```java
Compiled from "Set.java"
public interface java.util.Set<E> extends java.util.Collection<E> {
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
  public abstract boolean retainAll(java.util.Collection<?>);
  public abstract boolean removeAll(java.util.Collection<?>);
  public abstract void clear();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public java.util.Spliterator<E> spliterator();
  public static <E> java.util.Set<E> of();
  public static <E> java.util.Set<E> of(E);
  public static <E> java.util.Set<E> of(E, E);
  public static <E> java.util.Set<E> of(E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E...);
  public static <E> java.util.Set<E> copyOf(java.util.Collection<? extends E>);
}
```

	- Key things to note:
		- it has same methods as list
		- List is an ordered collection of elements which allows duplicates
		- Set is an unordered collection of non-duplicate elements

### ArrayList Class [Code](CompleteTutorials/3.%20List%20Interface/3.1%20ArrayList/ArrayListDemo.java)
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


### Deque interface
	>> javap java.util.Deque;
```java
	Compiled from "Deque.java"
	public interface java.util.Deque<E> extends java.util.Queue<E> {
	  public abstract void addFirst(E);
	  public abstract void addLast(E);
	  public abstract boolean offerFirst(E);
	  public abstract boolean offerLast(E);
	  public abstract E removeFirst();
	  public abstract E removeLast();
	  public abstract E pollFirst();
	  public abstract E pollLast();
	  public abstract E getFirst();
	  public abstract E getLast();
	  public abstract E peekFirst();
	  public abstract E peekLast();
	  public abstract boolean removeFirstOccurrence(java.lang.Object);
	  public abstract boolean removeLastOccurrence(java.lang.Object);
	  public abstract boolean add(E);
	  public abstract boolean offer(E);
	  public abstract E remove();
	  public abstract E poll();
	  public abstract E element();
	  public abstract E peek();
	  public abstract boolean addAll(java.util.Collection<? extends E>);
	  public abstract void push(E);
	  public abstract E pop();
	  public abstract boolean remove(java.lang.Object);
	  public abstract boolean contains(java.lang.Object);
	  public abstract int size();
	  public abstract java.util.Iterator<E> iterator();
	  public abstract java.util.Iterator<E> descendingIterator();
	}
```

	- Key things to Note [interface extended from Queue]
		- [DEQUE - aka Double ended Queue] -> can insert and remove at both ends
		- addFirst()/offerFist() - same operation but addFirst throws exception similar to queue
		- addLast()/offerLast() - adds element at the last, difference is similar to queue
		- removeFirst()/pollFirst() - removes first element from deque
		- removeLast()/pollLast() - removes last element from deque
		- getFirst()/peekFirst() - gets the first element
		- getLast()/peekLast() - gets the last element
		- removeFirstOccurence() - removes first occurence of element
		- removeLastOccurence() - removes last Occurence of element
		- add()/offer()
		- remove()/poll()
		- element()/peek()
		- push() - push element to the deque
		- pop() - pops element from the deque
		- remove(object)
		- descendingIterator() - iterates over elements in deque in reverse Order


### LinkedList Class
	>> javap java.util.LinkedList;
```java
	Compiled from "LinkedList.java"
	public class java.util.LinkedList<E> extends java.util.AbstractSequentialList<E> implements java.util.List<E>, java.util.Deque<E>, java.lang.Cloneable, java.io.Serializable {
	  transient int size;
	  transient java.util.LinkedList$Node<E> first;
	  transient java.util.LinkedList$Node<E> last;
	  public java.util.LinkedList();
	  public java.util.LinkedList(java.util.Collection<? extends E>);
	  void linkLast(E);
	  void linkBefore(E, java.util.LinkedList$Node<E>);
	  E unlink(java.util.LinkedList$Node<E>);
	  public E getFirst();
	  public E getLast();
	  public E removeFirst();
	  public E removeLast();
	  public void addFirst(E);
	  public void addLast(E);
	  public boolean contains(java.lang.Object);
	  public int size();
	  public boolean add(E);
	  public boolean remove(java.lang.Object);
	  public boolean addAll(java.util.Collection<? extends E>);
	  public boolean addAll(int, java.util.Collection<? extends E>);
	  public void clear();
	  public E get(int);
	  public E set(int, E);
	  public void add(int, E);
	  public E remove(int);
	  java.util.LinkedList$Node<E> node(int);
	  public int indexOf(java.lang.Object);
	  public int lastIndexOf(java.lang.Object);
	  public E peek();
	  public E element();
	  public E poll();
	  public E remove();
	  public boolean offer(E);
	  public boolean offerFirst(E);
	  public boolean offerLast(E);
	  public E peekFirst();
	  public E peekLast();
	  public E pollFirst();
	  public E pollLast();
	  public void push(E);
	  public E pop();
	  public boolean removeFirstOccurrence(java.lang.Object);
	  public boolean removeLastOccurrence(java.lang.Object);
	  public java.util.ListIterator<E> listIterator(int);
	  public java.util.Iterator<E> descendingIterator();
	  public java.lang.Object clone();
	  public java.lang.Object[] toArray();
	  public <T> T[] toArray(T[]);
	  public java.util.Spliterator<E> spliterator();
	}
```
	
	- Key things to Note:
		- implemented from both List and Deque Interface
		- it has both list and deque methods

### Vector Class
	>> javap java.util.Vector;
```java
Compiled from "Vector.java"
public class java.util.Vector<E> extends java.util.AbstractList<E> implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {
  protected java.lang.Object[] elementData;
  protected int elementCount;
  protected int capacityIncrement;
  public java.util.Vector(int, int);
  public java.util.Vector(int);
  public java.util.Vector();
  public java.util.Vector(java.util.Collection<? extends E>);
  public synchronized void copyInto(java.lang.Object[]);
  public synchronized void trimToSize();
  public synchronized void ensureCapacity(int);
  public synchronized void setSize(int);
  public synchronized int capacity();
  public synchronized int size();
  public synchronized boolean isEmpty();
  public java.util.Enumeration<E> elements();
  public boolean contains(java.lang.Object);
  public int indexOf(java.lang.Object);
  public synchronized int indexOf(java.lang.Object, int);
  public synchronized int lastIndexOf(java.lang.Object);
  public synchronized int lastIndexOf(java.lang.Object, int);
  public synchronized E elementAt(int);
  public synchronized E firstElement();
  public synchronized E lastElement();
  public synchronized void setElementAt(E, int);
  public synchronized void removeElementAt(int);
  public synchronized void insertElementAt(E, int);
  public synchronized void addElement(E);
  public synchronized boolean removeElement(java.lang.Object);
  public synchronized void removeAllElements();
  public synchronized java.lang.Object clone();
  public synchronized java.lang.Object[] toArray();
  public synchronized <T> T[] toArray(T[]);
  E elementData(int);
  static <E> E elementAt(java.lang.Object[], int);
  public synchronized E get(int);
  public synchronized E set(int, E);
  public synchronized boolean add(E);
  public boolean remove(java.lang.Object);
  public void add(int, E);
  public synchronized E remove(int);
  public void clear();
  public synchronized boolean containsAll(java.util.Collection<?>);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  public boolean removeIf(java.util.function.Predicate<? super E>);
  public synchronized boolean addAll(int, java.util.Collection<? extends E>);
  public synchronized boolean equals(java.lang.Object);
  public synchronized int hashCode();
  public synchronized java.lang.String toString();
  public synchronized java.util.List<E> subList(int, int);
  protected synchronized void removeRange(int, int);
  public synchronized java.util.ListIterator<E> listIterator(int);
  public synchronized java.util.ListIterator<E> listIterator();
  public synchronized java.util.Iterator<E> iterator();
  public synchronized void forEach(java.util.function.Consumer<? super E>);
  public synchronized void replaceAll(java.util.function.UnaryOperator<E>);
  public synchronized void sort(java.util.Comparator<? super E>);
  public java.util.Spliterator<E> spliterator();
  void checkInvariants();
}
```

### Stack Class
	>> javap java.util.Stack;
```java
Compiled from "Stack.java"
public class java.util.Stack<E> extends java.util.Vector<E> {
  public java.util.Stack();
  public E push(E);
  public synchronized E pop();
  public synchronized E peek();
  public boolean empty();
  public synchronized int search(java.lang.Object);
}
```

	- Key things to Note:
		- Stack[LIFO] extends Vector
		- push(ele) -> push element to top
		- pop(ele) -> pop element at top
		- peek() -> gets the top element
		- empty() -> checks if stack collections is empty
		- search(obj) -> searches for object in stack

### PriorityQueue Class
	>> javap java.util.PriorityQueue;
```java
Compiled from "PriorityQueue.java"
public class java.util.PriorityQueue<E> extends java.util.AbstractQueue<E> implements java.io.Serializable {
  transient java.lang.Object[] queue;
  int size;
  transient int modCount;
  public java.util.PriorityQueue();
  public java.util.PriorityQueue(int);
  public java.util.PriorityQueue(java.util.Comparator<? super E>);
  public java.util.PriorityQueue(int, java.util.Comparator<? super E>);
  public java.util.PriorityQueue(java.util.Collection<? extends E>);
  public java.util.PriorityQueue(java.util.PriorityQueue<? extends E>);
  public java.util.PriorityQueue(java.util.SortedSet<? extends E>);
  public boolean add(E);
  public boolean offer(E);
  public E peek();
  public boolean remove(java.lang.Object);
  boolean removeEq(java.lang.Object);
  public boolean contains(java.lang.Object);
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  public java.util.Iterator<E> iterator();
  public int size();
  public void clear();
  public E poll();
  E removeAt(int);
  public java.util.Comparator<? super E> comparator();
  public final java.util.Spliterator<E> spliterator();
}
```

	- Key things to Note:
		- PriorityQueue(), PriorityQueue(int initialCapacity), PriorityQueue(Comparator),PriorityQueue(int initialCapacity, Comparator), PriorityQueue(Collection), PriorityQueue(PriorityQueue), PriorityQueue(SortedSet) -> initializers of the class
		- add()/Offer()
		- peek()
		- remove()/poll()
		- removeEq() -> checks for equality and removes [ refer differnce between equals() and equality(==)]
		- removeAt(index)

### ArrayDeque Class
	>> javap java.util.ArrayDeque;
```java
Compiled from "ArrayDeque.java"
public class java.util.ArrayDeque<E> extends java.util.AbstractCollection<E> implements java.util.Deque<E>, java.lang.Cloneable, java.io.Serializable {
  transient java.lang.Object[] elements;
  transient int head;
  transient int tail;
  public java.util.ArrayDeque();
  public java.util.ArrayDeque(int);
  public java.util.ArrayDeque(java.util.Collection<? extends E>);
  static final int inc(int, int);
  static final int dec(int, int);
  static final int inc(int, int, int);
  static final int sub(int, int, int);
  static final <E> E elementAt(java.lang.Object[], int);
  static final <E> E nonNullElementAt(java.lang.Object[], int);
  public void addFirst(E);
  public void addLast(E);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean offerFirst(E);
  public boolean offerLast(E);
  public E removeFirst();
  public E removeLast();
  public E pollFirst();
  public E pollLast();
  public E getFirst();
  public E getLast();
  public E peekFirst();
  public E peekLast();
  public boolean removeFirstOccurrence(java.lang.Object);
  public boolean removeLastOccurrence(java.lang.Object);
  public boolean add(E);
  public boolean offer(E);
  public E remove();
  public E poll();
  public E element();
  public E peek();
  public void push(E);
  public E pop();
  boolean delete(int);
  public int size();
  public boolean isEmpty();
  public java.util.Iterator<E> iterator();
  public java.util.Iterator<E> descendingIterator();
  public java.util.Spliterator<E> spliterator();
  public void forEach(java.util.function.Consumer<? super E>);
  public boolean removeIf(java.util.function.Predicate<? super E>);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  public boolean contains(java.lang.Object);
  public boolean remove(java.lang.Object);
  public void clear();
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  public java.util.ArrayDeque<E> clone();
  void checkInvariants();
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
}
```
	- Key things to Note:
		- All the deque methods are implemented by ArrayDeque
		- clone() - method to create copy of deque

### HashSet Class
	>> javap java.util.HashSet;
```java
Compiled from "HashSet.java"
public class java.util.HashSet<E> extends java.util.AbstractSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
  static final long serialVersionUID;
  public java.util.HashSet();
  public java.util.HashSet(java.util.Collection<? extends E>);
  public java.util.HashSet(int, float);
  public java.util.HashSet(int);
  java.util.HashSet(int, float, boolean);
  public java.util.Iterator<E> iterator();
  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public void clear();
  public java.lang.Object clone();
  public java.util.Spliterator<E> spliterator();
  static {};
}
```

	- Key things to Note:
		- HashSet is for non-duplicate elements collection without maintaining any order
		- add()/ remove()/ clear()
		- default initialCapacity - 16, loadFactor- 0.75
		- The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
		- HashSet(int initialCapacity, float loadFactor)

### LinkedHashSet Class
	>> javap java.util.LinkedHashSet;
```java
Compiled from "LinkedHashSet.java"
public class java.util.LinkedHashSet<E> extends java.util.HashSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
  public java.util.LinkedHashSet(int, float);
  public java.util.LinkedHashSet(int);
  public java.util.LinkedHashSet();
  public java.util.LinkedHashSet(java.util.Collection<? extends E>);
  public java.util.Spliterator<E> spliterator();
}
```

	- Key things to Note:
		- LinkedHashSet(int initialCapacity, float loadFactor)
		- We use this class, to maintain insertion order

### SortedSet interface
	>> javap java.util.SortedSet;
```java
Compiled from "SortedSet.java"
public interface java.util.SortedSet<E> extends java.util.Set<E> {
  public abstract java.util.Comparator<? super E> comparator();
  public abstract java.util.SortedSet<E> subSet(E, E);
  public abstract java.util.SortedSet<E> headSet(E);
  public abstract java.util.SortedSet<E> tailSet(E);
  public abstract E first();
  public abstract E last();
  public java.util.Spliterator<E> spliterator();
}
```

	- Key things to Note:
		- make note of word it is Sorted. So, all operations are method relates to sorted structure
		- subset(E minElement, E maxElement)
		- first() - minimum or first element
		- last() - maximum or last element
		- Comparator() - we can pass our own comparator like new TreeSet<>(){new Comparator<>())
		- headSet(element) - returns elements less than passed element
		- tailSet(element) - returns elements greater than passed element

### TreeSet Class
	>> javap java.util.TreeSet;
```java
Compiled from "TreeSet.java"
public class java.util.TreeSet<E> extends java.util.AbstractSet<E> implements java.util.NavigableSet<E>, java.lang.Cloneable, java.io.Serializable {
  java.util.TreeSet(java.util.NavigableMap<E, java.lang.Object>);
  public java.util.TreeSet();
  public java.util.TreeSet(java.util.Comparator<? super E>);
  public java.util.TreeSet(java.util.Collection<? extends E>);
  public java.util.TreeSet(java.util.SortedSet<E>);
  public java.util.Iterator<E> iterator();
  public java.util.Iterator<E> descendingIterator();
  public java.util.NavigableSet<E> descendingSet();
  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public void clear();
  public boolean addAll(java.util.Collection<? extends E>);
  public java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  public java.util.NavigableSet<E> headSet(E, boolean);
  public java.util.NavigableSet<E> tailSet(E, boolean);
  public java.util.SortedSet<E> subSet(E, E);
  public java.util.SortedSet<E> headSet(E);
  public java.util.SortedSet<E> tailSet(E);
  public java.util.Comparator<? super E> comparator();
  public E first();
  public E last();
  public E lower(E);
  public E floor(E);
  public E ceiling(E);
  public E higher(E);
  public E pollFirst();
  public E pollLast();
  public java.lang.Object clone();
  public java.util.Spliterator<E> spliterator();
  static {};
}
```
	
	- Key things to Note:
		- ceiling(ele) - returns the least element that is greater than or equal to the given element
		- floor() -returns the greatest element that is less than or equal to the given element
		- descendingSet() - returns reverse order of Set
		- higher() / lower() - return the least ele that is strictly greater than given ele/ returns the greates ele that is strictly less than given ele
		- subSet(minEle, boolean fromInclusive, maxEle, boolean toInclusive)
		- headSet(ele, boolean toInclusive)
		- tailSet(ele, boolean fromInclusive)

