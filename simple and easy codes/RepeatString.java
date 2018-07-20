class RepeatTheString{
	public static String repeatingString(int repeat, String string){
		return java.util.stream.IntStream.range(0,repeat).mapToObj(i-> string).
		collect( java.util.stream.Collectors.joining() ).toString();
	}
	public static String stringBuilderRepeat(int repeat, String string){
		StringBuilder res = new StringBuilder();
		java.util.stream.IntStream.range(0,repeat).forEach(i-> res.append(string));
		return res.toString();

	}
}
public class RepeatString{
	/* code by vinay26k */
	public static void main(String [] args){
		RepeatTheString instance = new RepeatTheString();
		System.out.println(instance.repeatingString(5,"hello"));
		System.out.println(instance.stringBuilderRepeat(5,"aBc"));
	}
}