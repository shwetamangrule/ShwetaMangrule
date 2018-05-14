package day1;

public class GenericArrayPrinter {

	public static <E> void printArray(E[] array) {
		for(E element : array) {
			System.out.println(element);
		}
	}
}
