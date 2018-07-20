import java.util.stream.IntStream;
class SmallestIntegerFinder{
	public static int findSmallestInt(int[] args){
		return IntStream.of(args).min().getAsInt();
	}
}
public class findSmallestInArray{
	/* code by vinay26k */
	public static void main(String [] args){
		SmallestIntegerFinder instance = new SmallestIntegerFinder();
		int [] arr = new int[]{32,45,28,11,2,95,4};
		int min = instance.findSmallestInt(arr);
		System.out.println(min);
		System.out.println("hello world, Im trying to fit in "+String.valueOf(856)+" as integer string");
	}
}
