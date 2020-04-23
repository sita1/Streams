package exercise;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.google.common.collect.ImmutableList;

public class Practice4 {
	
	@Test
	public void distictData() throws Exception {
		final List<Integer> numbers = ImmutableList.of(1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5, 5,6,6,6,6,6, 2, 3, 4, 7);
		numbers.stream().filter(i->i==3).collect(Collectors.toList());
	}
	
	@Test
	public void transformDataIntoDTO() throws Exception {
		final List<Integer> numbers = ImmutableList.of(1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5, 5,6,6,6,6,6, 2, 3, 4, 7);
		numbers.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}

}
