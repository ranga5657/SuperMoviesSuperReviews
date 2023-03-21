package org.functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


@SuppressWarnings("unused")
public class optionalClass {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","banana","orange");
		
		
		Predicate <? super String >predicate = fruit -> fruit.startsWith("c");
		
		Optional<String> findFirst = fruits.stream().filter(predicate).findFirst();
		
		System.out.println(findFirst);

		System.out.println(findFirst.isEmpty());
		
		System.out.println(findFirst.isPresent());
		
		System.out.println(findFirst.get());
		
		
		
		
		

	}

}
