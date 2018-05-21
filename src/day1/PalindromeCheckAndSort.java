/**
 * 
 */
package day1;

import java.util.Scanner;

/**
 * Programmer Name: Shweta Shivraj Mangrule
 * DateOfRelease: 19-May-2018
 * @author trainee
 *
 */
/**************************************************************************************************************
* Program: Check whether a number is Palindrome and sort the list descending order. 
* Description: 
*************************************************************************************************************/

public class PalindromeCheckAndSort {
	
	public static int check(int[] array) {
		
		//int[] reverseNum = null;
		for(int i= 0; i<array.length;i++) {
		if(array[i] < 0) {
			System.out.println("Number should be greater than 0");	
		}
		int reverseNum[] = revNum(array);
		if(reverseNum[i] == array[i]) {
			System.out.println("Number is palindrome"+reverseNum[i]);	
		}
				
		}
		return 0;

	}
	 public static int[] revNum(int[] arr) {
			int[] revNumber = null ;

		for(int data: arr) {
			int reverseNum = 0;
			while(arr[data] != 0) {
				int remainder = arr[data] % 10;
				arr[data] /= 10;
				reverseNum = reverseNum*10 +remainder;		
			}
			for(int iterator = 0 ; iterator < arr.length; iterator++)
				revNumber[iterator] = reverseNum; 
			//System.out.println("List of Palindrome numbers");
			//if(reverseNum = arr[data])
	}
	
	return revNumber ;
	}
public static void main(String[] args) {
	int[] arr = new int[2];
	System.out.println("Eneter the numbers to check Palindrome");
	Scanner scanner = new Scanner(System.in);
	for(int i = 0; i<arr.length; i++) {
		arr[i]= scanner.nextInt();	
	}//System.out.println(PalindromCheckAndSort.check(int[] arr));
		
		PalindromeCheckAndSort.check(arr);
	}

}