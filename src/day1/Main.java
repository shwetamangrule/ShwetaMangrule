package day1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Assignments");
		System.out.println("1.Print Generic Array");
		System.out.println("2.Power Calculator");
		System.out.println("3.Check Palindrom");
		
		System.out.println("Please Select:");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Integer[] arr1 = {1,2,3};
			String[] arr2 = {"Hello","World"};
			GenericArrayPrinter.printArray(arr1);
			GenericArrayPrinter.printArray(arr2);
			break;
		case 2:
			while(sc.hasNextInt()) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				long result = 0;
				try {
					result = Calculator.power(a,b);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(result);
			}
			break;
		case 3:
			System.out.println("Please Enter number");
			int number =sc.nextInt();
			System.out.println(IntegerPalindromCheck.check(number));
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		sc.close();
	}

}
