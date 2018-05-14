package day1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Assignments");
		System.out.println("1.Print Generic Array");
		
		
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Integer[] arr1 = {1,2,3};
			String[] arr2 = {"Hello","World"};
			GenericArrayPrinter.printArray(arr1);
			GenericArrayPrinter.printArray(arr2);
		}
		
		sc.close();
	}

}
