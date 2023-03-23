package org.functional.programming;

import java.util.List;

public class FP01_FUNCTIONAL {
	
	
	
	public static void main(String[] args) {
		
		// in java 8 arras.aslist,,
		// in java 9 we use List.of
		
		//printAllNumbersinList(Arrays.asList(12,9,13,4,6,12,15,4));
		
		printallnumbersinlistFunctional(List.of(12,9,13,4,6,12,15,4));
		FunctionalOdd(List.of(12,9,13,4,6,12,15,4));

		
		List <String> courses = List.of("Spring","Spring boot","api","microservices","docker","Aws",
				"kubernates","PCF");
		
		//courses.stream().forEach(System.out::println);
		
//		courses.stream().filter(course->course.contains("Spring")).
//		forEach(System.out::println);
//		
		courses.stream().filter(course-> course.length()>=4)
		.forEach(System.out::println);
		
		courses.stream().map(course->course + " " + course.length())
		.forEach(System.out::println);
//		
		
		
	}

	private static void printallnumbersinlistFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.filter(x->x%2==0)
		.map(number->number*number)
		 // method reference
		.forEach(System.out::println);
		
		//jjhgfdsuio
		
		
		
		
		
		
	}
	
	

	private static void FunctionalOdd(List<Integer> numbers) {
		
		numbers.stream()
		.filter(x->x%2!=0)
		 // method reference
		.forEach(System.out::println);
		
		
	}
	
	


//
//	private static void print(Integer integer1) {
//		System.out.print(integer1);
//		
//	}
//	
	
	
	
	
	

}
