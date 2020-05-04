package exercise;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import mockData.MockData;
import streams.Person;

public class Practice10 {

	@Test
	public void understandCollectMethod() throws Exception {
		List<Integer> people = MockData.getPeople().stream().map(Person::getAge).collect(ArrayList::new, ArrayList::add,
				ArrayList::addAll);

		people.forEach(System.out::println);

	}

	@Test
	public void understandCollectMethods() throws Exception {
		List<Integer> people = MockData.getPeople().stream().map(Person::getAge).collect(() -> new ArrayList<Integer>(),
				(list, element) -> list.add(element), (list1, list2) -> list1.addAll(list2));

		people.forEach(System.out::println);

	}

}
