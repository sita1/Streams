package exercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import mockData.MockData;
import streams.Person;

public class Practice7 {
	
	@Test
	public void groupingData() throws Exception {
	      List<Person> people = MockData.getPeople();
	 Map<String, List<Person>> groupedData=    people.stream().collect(Collectors.groupingBy(Person::getName));
	 groupedData.forEach((name,person)->{System.out.print(name);
	 person.forEach(System.out::println);});	     
	}
	


	


}
