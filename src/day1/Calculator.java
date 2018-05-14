package day1;

public class Calculator {

	public static long power(int a, int b) throws Exception {
		if(a < 0 || b < 0) {
			throw new Exception("n or p should not be negative");
		}
		if(a == 0 || b == 0) {
			throw new Exception("n or p should not be zero");
		}
		long result = 1;
		for(int i=0;i<b;i++) {
			result *= a;
		}
		return result;
	}
}
