package exercise;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.common.collect.ImmutableList;

// find persons age less or equal 18 
// and another method to find first 10 person whose age less than 18
public class Practice3 {

	@Test
	public void printMinNumber() throws Exception {
		final List<Integer> numbers = ImmutableList.of(1, 5, 2, 3, 4, 7);
		System.out.println(numbers.stream().min(Comparator.naturalOrder()).get());
	}
	
	@Test
	public void max() throws Exception {
		final List<Integer> numbers = ImmutableList.of(1, 5, 2, 3, 4, 7);
		System.out.println(numbers.stream().max(Comparator.naturalOrder()).get());
	}

}
