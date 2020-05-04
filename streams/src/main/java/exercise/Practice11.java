package exercise;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import mockData.MockData;

public class Practice11 {

	@Test
	public void understandCollectMethod() throws Exception {
		List<Integer> people = MockData.getPeople().stream().filter(person -> {
			System.out.println("in filter");
			return person.getSalary() > 10000;
		}).map(person -> {
			System.out.println("in map");
			return person.getAge();
		}).collect(Collectors.toList());

		people.forEach(System.out::println);

	}

}
