package day1;

public class PerformOperation {
	
	interface Operation{
		public boolean perform();
	}
	
	public boolean isOdd(int num) {
		Operation operation = () -> {
			return num%2 != 0;
		};
		
		return operation.perform();
	}

	public boolean isPrime(int num) {
		// logic to check prime number
		return false;
	}

	public boolean isPalindrom(int num) {
		// logic to check palindrom
		return false;
	}

}
