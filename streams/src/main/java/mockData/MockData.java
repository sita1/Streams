package mockData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.annotation.Resource;
import javax.annotation.Resources;

import streams.Person;

public class MockData {
	
	 public static List<Person> getPeople() throws IOException {
		 
		List<Person> personList = new ArrayList<Person>();
		Person person =  new Person();
		person.setId(1);
		person.setAge(19);
		person.setName("AA");
		person.setSalary(1000);
		personList.add(person);
		
		Person person1 =  new Person();
		person1.setId(2);
		person1.setAge(14);
		person1.setName("AA1");
		person1.setSalary(10000);
		
		personList.add(person1);
		Person person2 =  new Person();
		person2.setId(3);
		person2.setAge(20);
		person2.setName("AA2");
		person2.setSalary(20000);
		personList.add(person2);
		Person person3 =  new Person();
		person3.setId(4);
		person3.setAge(10);
		person3.setName("AA3");
		person3.setSalary(3000);
		personList.add(person3);
		
		return 	personList;
	 }
	 

}
