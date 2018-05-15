package day1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Assignments");
		System.out.println("1.Print Generic Array");
		System.out.println("2.Power Calculator");
		System.out.println("3.Check Palindrom");
		System.out.println("4.Reverse String Order");
		System.out.println("5. Check Odd With Lambda");
		System.out.println("6.Check Prime With Lambda");
		System.out.println("7.Check Palindrom with Lambda");
		PerformOperation operation = new PerformOperation();
		System.out.println("Please Select:");
		int choice =Integer.parseInt(sc.nextLine());
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
			System.out.println(PalindromCheck.check(number));
			break;
		case 4:
			System.out.println("Please Enter a String:");
			String s = sc.nextLine();
			String revString = "";
			for(int i = s.length()-1 ; i >= 0;i--) {
				revString += s.charAt(i);
			}
			System.out.println(revString);
			break;
		case 5:
			System.out.println("Enter a number:");
			int numOdd = sc.nextInt();
			System.out.println(operation.isOdd(numOdd));
			break;
		case 6:
			System.out.println("Enter a number:");
			int numPrime = sc.nextInt();
			System.out.println(operation.isPrime(numPrime));
			break;
		case 7:
			System.out.println("Enter a number:");
			int numPalindrom = sc.nextInt();
			System.out.println(operation.isPalindrom(numPalindrom));
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		sc.close();
	}

}
