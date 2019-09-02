package uvu.cs.cs3250.inclass;

import java.util.List;

public class LoopDemo {
	public int sumWithVariableArguments(int... numbers) {
		int s = 0;
		for (int n = 0; n< numbers.length; n++) {
			s += numbers[n];
		}
		
		return s;
	}
	
	public int sumUsingForEach(List<Integer> numbers) {
		int s = 0;
		for(int number: numbers) {
			s += number;
		}
		return s;
	}
	
	public int sumWithWhileLoop(int[] numbers) {
		int s = 0;
		int n = 0;
		while (n < numbers.length) {
			s += numbers[n];
			n++;
		}
		
		return s;
	}
}
