package exercise;

import java.util.stream.IntStream;

// find persons age less or equal 18 
// and another method to find first 10 person whose age less than 18
public class Practice2 {
	public static void main(String ab[])
	{
		Practice2 practice2 = new Practice2();
		practice2.printInclusiveAndExclusive();
	}
	
	public void printInclusiveAndExclusive()
	{
		System.out.println("exclusive through range method");
		IntStream.range(0, 10).forEach(System.out::println);
		
		System.out.println("inclusive through range method");
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
	}
	
	
}
