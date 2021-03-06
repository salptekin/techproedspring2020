package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda06 {

	public static void main(String[] args) {
		//1) Find the max number in the list by using "Functional" programming
		//2) Find the min number in the list by using "Functional" programming
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
		
		System.out.println(maxElement(list));
		System.out.println(minElement(list));

	}
	
	public static int maxElement(List<Integer> list) {
		return list.stream()
				   .reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x : y);
	}
	
	public static int minElement(List<Integer> list) {
		return list.stream()
				   .reduce(Integer.MAX_VALUE, (x,y)-> x<y ? x : y);
	}

}
