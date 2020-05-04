package exercise;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.google.common.collect.ImmutableList;

import mockData.MockData;
import streams.Person;
import streams.PersonDTO;

public class Practice6 {

	@Test
	public void findAnyExample() throws Exception {
		final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6,
				6, 6, 6, 6, 2, 3, 4, 7);
		int anyNumber = numbers.stream().filter(i -> i < 5).findAny().get();
		System.out.print(anyNumber);
	}

	@Test
	public void findFirstExample() throws Exception {
		final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6,
				6, 6, 6, 6, 2, 3, 4, 7);
		int anyNumber = numbers.stream().filter(i -> i < 5).findFirst().get();
		System.out.print(anyNumber);
	}

}
