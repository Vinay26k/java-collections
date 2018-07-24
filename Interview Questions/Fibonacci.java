import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
class Solutions{
	public static void Fibonacci(int n){
		long a=0, b=1, temp;
		for (int i=0; i<n; i++) {
			temp = a+b;
			a = b;
			b = temp;
			System.out.println(b);
		}
	}
	public static int FibonacciRecursive(int n){
		if (n <= 1)
      		return n;
   		return FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
	}

	public static boolean primeCheck(int n){
		//6k±1
		if(n<=1) return false;
		if(n<=3) return true;
		if(n%2==0 || n%3==0) return false;
		for(int i=5;i*i<n;i+=6){
			if(n%i == 0 || n%(i+2) == 0) return false;
		}
		return true;
	}
	public static int swapFunc(int X, int Y){
		return X;
	}
	public static String reverseString(String string){
		char [] chars = string.toCharArray();
		int i = 0, j = string.length()-1;
		while(i<j){
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;j--;
		}
		//string = new String(chars);
		return String.valueOf(chars);
	}
	public static void reverseArray(int [] arr){
		int i=0,j=arr.length-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;j--;
		}
	}
	public static int reverseNumber(int number){
		int reversed = 0;
		while(number!=0){
			reversed = (reversed*10)+number%10;
			number /=10;
		}
		return reversed;
	}
	public static long factorial(int n){
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static long sumOfDigits(int number){
		long sum = 0;
		while(number!=0){
			sum += number%10;
			number /= 10;
		}
		return sum;
	}
	public static void sortMap(Map<String,Integer> map){

	}
	public static boolean perfectNumber(int number){
		int temp = 0;
		for(int i=1;i<number/2 +1;i++){
			if(number%i==0) temp += i;
		}
		return temp==number ? true: false;
	}
	public static void bubbleSort(int [] arr){
		for (int i=0; i<arr.length; i++) {
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]) 
					arr[j] = (arr[i]+arr[j])-(arr[i]=arr[j]);
			}
		}
	}
	public static boolean isBinary(int number){
		while(number!=0){
			int temp = number%10;
			if(temp >1){
				return false;
			}
			number/=10;
		}
		return true;
	}
	public static boolean isArmstrong(long number){
		long len = 0, temp=number, finalCheck=number;
		while(number!=0){
			len++;
			number/=10;
		}
		long sum = 0;
		while(temp!=0){
			sum += Math.pow(temp%10,len);
			temp /= 10;
		}
		//System.out.println(sum);
		return sum==finalCheck;
	}
	public static void commonElements(int [] arr1, int [] arr2){
		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> list2 = new ArrayList<>();
		IntStream stream1 = Arrays.stream(arr2);
		stream1.forEach(x->list2.add(Integer.valueOf(x)));
		list1.retainAll(list2);
		System.out.println("Common Elements");
		list1.forEach(System.out::println);
	}
	public static String reverseStringRecur(String string){
		if(string==null || string.length()<=1) return string;
		return reverseStringRecur(string.substring(1))+string.charAt(0);
	}
	public static boolean areAnagrams(String first, String second){
		if(first.length()!=second.length()){return false;}
		Map <Character, Integer> m = new HashMap<>();
		for(char k: first.toCharArray()){
			m.put(k,m.getOrDefault(k,0)+1);
		}
		for(char k: second.toCharArray()){
			if(m.getOrDefault(k,0)==0) return false;
			m.put(k,m.get(k)-1);
		}
		return true;
	}
	public static void factorsOfNumberInRange(int number, int start, int end){
		Set <Integer> l = new TreeSet<>();
		for(int i=start;i<number/2 +1 && i<end;i++){
			if(number%i==0) {l.add(i); l.add(number/i);}
		}
		l.forEach(System.out::println);
	}
	public static void findSecondLargest(int [] arr){
		int first = Integer.MIN_VALUE, second=Integer.MIN_VALUE;
		for(int i:arr){
			if(first<i){second=first; first=i;}
		}
		if(second==Integer.MIN_VALUE) System.out.println("Not Found");
		else System.out.println(second);
	}
	public static void printNumbersWithoutLoop(int n, int end){
		if(end>=n){
			System.out.println(n);
			printNumbersWithoutLoop(n+1,end);
		}
		else
			return;
	}
	public static int findMissingNumber(int [] arr, int start, int end){
		int xor=arr[0], check = end;
		for(int i=1;i<arr.length;i++){
			xor ^= arr[i];
		}
		for(int i=start;i<end;i++){
			check ^= i;
		}
		return xor^check;
	}
	public static void duplicates(int [] arr){
		Set<Integer> s = new HashSet<>();
		System.out.println("Duplicate elements in array");
		for(int i:arr){
			if(s.contains(i))
				System.out.println(i);
			else
				s.add(i);
		}
	}
	public static int numberOfWords(String string){
		return string.split(" ").length;
	}
	public static int countOccurence(String string, String k){
		return string.length()- string.replace(k,"").length();
	}
	public static int binaryNumber(int number){
		int res = 0;
		while(number !=0){
			res = res*10 + (number%2);
			number /= 2;
		}
		return res;
	}
}


public class Fibonacci{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		Solutions.Fibonacci(5);
		System.out.println(Solutions.FibonacciRecursive(5));
		System.out.println(Solutions.primeCheck(8191));
		int x=2, y=3;
		y = Solutions.swapFunc(x,x=y);
		System.out.println(x+" "+y);
		x=2; y=3;
		// x += (y-(y=x));
		y = (x+y) - (x=y);
		System.out.println(x+" "+y);
		String val = "helloworld";
		System.out.println(Solutions.reverseString(val));
		int [] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
		Solutions.reverseArray(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Solutions.reverseNumber(123567));
		System.out.println(Solutions.factorial(12));
		System.out.println(Solutions.sumOfDigits(123));
		System.out.println(Solutions.perfectNumber(496));
		int [] arr1 = new int[]{2,3,7,4,1,2,9,6,0};
		Solutions.bubbleSort(arr1);
		for(int i:arr1){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Solutions.isBinary(102022));
		System.out.println(Solutions.isBinary(10111101));
		System.out.println(Solutions.isArmstrong(371));
		int[] array1 = {1, 2, 3, 4, 5, 7, 9};
        int[] array2 = {3, 4, 5, 6, 7, 10, 40, 2};
        Solutions.commonElements(array1, array2);
        System.out.println(Solutions.reverseStringRecur("hello"));
        System.out.println(Solutions.areAnagrams("acek","caeh"));
        Solutions.factorsOfNumberInRange(10,1,100);
        Solutions.findSecondLargest(array1);
        Solutions.printNumbersWithoutLoop(1,3);
        int [] temp = {3, 4, 1, 6, 7, 10, 8, 9, 2};
        System.out.println(Solutions.findMissingNumber(temp,1,10));
        int [] temp1 = {3, 4, 1, 3, 7, 10, 9, 9, 2, 7, 6};
        Solutions.duplicates(temp1);
        System.out.println(Solutions.numberOfWords("hello world lets check it"));
        System.out.println(Solutions.countOccurence("hello world lets check it","e"));
        System.out.println("hello world lets check it".replace(" ",""));
        System.out.println(Solutions.binaryNumber(5));
	}
}