package junit.test;

import java.util.Scanner;

@SuppressWarnings("PMD.AtLeastOneConstructor")
public class calculator {

	
	public  int add(int i,int j) {
		
		Scanner SC=new Scanner(System.in); 
		 int b=SC.nextInt();
		 int a =SC.nextInt();
		int result=j+i;
		return result;
	}
	
	public int multiply(int i,int j)
	{
		return i*j;
	}
}
