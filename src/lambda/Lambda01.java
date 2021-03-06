package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

	// Difference between "Structured" and "Functional" programming.
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		printElementsInListByStructured(list);
		System.out.println();
		printElementsInListByFunctional01(list);
		System.out.println();
		printElementsInListByFunctional02(list);
		System.out.println();
		printElementsInListByFunctional03(list);


	}
	
	//Print all elements on the console by using "Structured" programming
	// We focus "How to do?" when we use "Structured" programming 
	public static void printElementsInListByStructured(List<Integer> list) {		
		for(int w: list) {
			System.out.print(w + " ");
		}
	}
	
	
	//Print all elements on the console by using "Functional" programming
	// We focus "What to do?" when we use "Functional" programming 
	// Type 1:
	public static void printElementsInListByFunctional01(List<Integer> list) {		
			list.stream() // stream() method converts horizontal to vertical [12, 9, 5] ==> 12
			              //                                                                 9
			              //                                                                 5
			    .forEach(t->System.out.print(t + " ")); // Lambda expression
	}
	// Type 2: Method Reference ==> Syntax: Class name::method name ==> I created the method 
	private static void print(int number) {
		System.out.print(number + " ");
	}
	public static void printElementsInListByFunctional02(List<Integer> list) {		
			list.stream()                                                              
			    .forEach(Lambda01::print);
	}
	// Type 3: Method Reference ==> I used the method Java created
	public static void printElementsInListByFunctional03(List<Integer> list) {		
			list.stream()                                                             
			    .forEach(System.out::print);
	}

}
