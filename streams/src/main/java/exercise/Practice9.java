package exercise;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.google.common.collect.ImmutableList;

public class Practice9 {  

	@Test
	public void joiningStringWithStream() throws Exception {
		List<String> stringsList = ImmutableList.of("anna", "joh", "aaaaaaaa", "bbb");

		String s = stringsList.stream().collect(Collectors.joining());

		System.out.println(s);
	}

	@Test
	public void joiningStringWithPipeStream() throws Exception {
		List<String> stringsList = ImmutableList.of("anna", "joh", "aaaaaaaa", "bbb");

		String s = stringsList.stream().collect(Collectors.joining("|"));

		System.out.println(s);
	}

}
