package ch17funcrional;

import java.util.List;

public class SampleStreamRunner {

	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(2, 3, 4, 5);

		int sum = list.stream().reduce(0, (number1, number2) -> number1 + number2);
		
		System.out.println(sum);

		
	}
}
