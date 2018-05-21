package day4;

import java.util.ArrayList;

public class GenericsInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("generics");
		list.add("in");
		list.add("java");
		
		
		String s = list.get(1);
		String s1 = list.get(0);
		System.out.println("Element is: " +s);
		System.out.println("Element is: " +s1);
			

	}

}
