package exercise;

import java.util.List;
import java.util.stream.Collectors;

import streams.Person;

// find persons age less or equal 18 
// and another method to find first 10 person whose age less than 18
public class Practice1 {
	
	public void findPeopleLessThanEqual18(List<Person> personList)
	{
		personList.stream().filter(i->i.getAge()<=18).collect(Collectors.toList()).forEach(System.out::println);
	
	}
	
	public void findFirst10PeopleLessThanEqual18(List<Person> personList)
	{
		personList.stream().filter(i->i.getAge()<=18).limit(10).collect(Collectors.toList()).forEach(System.out::println);
	}

}
