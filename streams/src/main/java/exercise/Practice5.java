package exercise;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import mockData.MockData;
import streams.Person;
import streams.PersonDTO;

public class Practice5 {
	
	@Test
	public void map() throws Exception {
	      List<Person> people = MockData.getPeople();
	     List<PersonDTO> transformtoDtoList =  people.stream().map(PersonDTO :: map).collect(Collectors.toList());
	     transformtoDtoList.forEach(System.out :: println);
	}
	
	
	@Test
	public void mapToDouble() throws Exception {
	      List<Person> people = MockData.getPeople();
	   double avergae =   people.stream().mapToDouble(Person ::getSalary).average().orElse(0);
	   System.out.println(avergae);
	}
	


}
