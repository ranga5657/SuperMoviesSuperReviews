package org.functional.programming;

import java.util.Arrays;
import java.util.List;


@SuppressWarnings("unused")
public class FP01_STRUCTURAL {

	public static void main(String[] args) {
		
		// in java 8 arras.aslist,,
		// in java 9 we use List.of
		
		//printAllNumbersinList(Arrays.asList(12,9,13,4,6,12,15,4));
		
		printallnumbersinlist(List.of(12,9,13,4,6,12,15,4));

	}

	private static void printallnumbersinlist(List<Integer>  numbers) {
		
		for(int num:numbers) {
			if(num%2==0) {
				System.out.println(num);
				
			}
			
			
			
			
		}
		// TODO Auto-generated method stub
		
	}

	
	private static void printAllNumbersinList(List<Integer> asList) {
		
		
		for (int num1:asList) {
			System.out.println(num1);
			
			 
			
		}
				
	}
	
	

}
