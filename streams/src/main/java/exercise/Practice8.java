package exercise;

import java.util.DoubleSummaryStatistics;
import java.util.List;

import org.junit.jupiter.api.Test;

import mockData.MockData;
import streams.Person;

public class Practice8 {

	@Test
	public void count() throws Exception {
		List<Person> people = MockData.getPeople();
		long c = people.stream().filter(i -> i.getAge() > 10).count();
		System.out.print(c);

	}

	@Test
	public void min() throws Exception {
		List<Person> people = MockData.getPeople();
		double min = people.stream().mapToDouble(Person::getSalary).min().orElse(0);
		System.out.println(min);
	}

	@Test
	public void max() throws Exception {
		List<Person> people = MockData.getPeople();
		double max = people.stream().mapToDouble(Person::getSalary).max().orElse(0);
		System.out.println(max);
	}

	@Test
	public void sumOfSalary() throws Exception {
		List<Person> people = MockData.getPeople();
		double sumOfSalary = people.stream().mapToDouble(Person::getSalary).sum();
		System.out.println(sumOfSalary);

	}

	@Test
	public void statistics() throws Exception {
		List<Person> people = MockData.getPeople();
		DoubleSummaryStatistics statistics = people.stream().mapToDouble(Person::getSalary).summaryStatistics();
		System.out.println(statistics);

	}

}
