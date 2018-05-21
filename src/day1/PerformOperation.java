package day1;

public class PerformOperation {
	
	interface Operation{
		public boolean perform();
	}
//	interface operation1{
//		public boolean perform(int num);
//
//	}
	
	public boolean isOdd(int num) {
		Operation operation = () -> {
			return num%2 != 0;
		};
		
		return operation.perform();
	}

	public boolean isPrime(int num) {
		// logic to check prime number
		Operation operation = () -> {
			
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0)
						return false;
				}
				return true;
			};
		return operation.perform();
		 
	}

	public boolean isPalindrom(int num) {
		//**** logic to check palindrom*****
		
		// Operation1 operation1 = (num) ->{
		Operation operation = () -> {
			System.out.println("palindrome");
			
			int number = num;
			int sum = 0; //temp=0 ;
			while(number!=0) {
				int rem = number%10;
				number = number/10;
				//num=temp;
				sum = sum*10 + rem;
			}
			if(sum == num) {
				return true;
			}
			return false;

			
		};
		
		return operation.perform();
		//return operation1.perform(121);
	}

}
