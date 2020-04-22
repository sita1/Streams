package exercise;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import mockData.MockData;
import streams.Person;

// find persons age less or equal 18 
// and another method to find first 10 person whose age less than 18
public class Practice2 {

	@Test
	public void printInclusiveAndExclusive()
	{
		System.out.println("exclusive through range method");
		IntStream.range(0, 10).forEach(System.out::println);
		
		System.out.println("inclusive through range method");
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
	}
	

    @Test
    public void rangeIteratingLists() throws Exception {
      List<Person> people = MockData.getPeople();
      
      IntStream.range(0, people.size()).forEach(index->{
    	  Person person = people.get(index);
    	  System.out.print(person);
    	  });
     
    }
    
    @Test
    public void printConsecutiveIntegers() throws Exception {
    IntStream.iterate(0, operand->operand+1).filter(i->i%2==0).limit(20).forEach(System.out::println);
      
    
     
    }
	
	
	
}
