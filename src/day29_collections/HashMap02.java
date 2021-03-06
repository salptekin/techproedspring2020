package day29_collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap02 {

	public static void main(String[] args) {
		
		 HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	        //Adding elements to HashMap
	        hashMap.put(11, "AB");
	        hashMap.put(2, "CD");
	        hashMap.put(33, "EF");
	        hashMap.put(9, "GH");
	        hashMap.put(3, "IJ");

	        //FOR LOOP
	        System.out.println("For Loop:");
	        for (HashMap.Entry me1 : hashMap.entrySet()) {
	          System.out.println("Key: "+me1.getKey() + " & Value: " + me1.getValue());
	        }

	        //WHILE LOOP & ITERATOR
	        System.out.println("While Loop:");
	        Iterator iterator = hashMap.entrySet().iterator();
	        while (iterator.hasNext()) {
	          HashMap.Entry me2 = (HashMap.Entry) iterator.next();
	          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
	        } 
	}

}

