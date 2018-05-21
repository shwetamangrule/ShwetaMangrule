package day4;

public class SimpleGeneric {
	
	
	public static <E> void print(E[] arr)
	{
		for(E data : arr)
			System.out.println(data);
	}
	
//	public static <E> void print(E string1) {
//		
//		System.out.println(string1);
//		
//	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Integer[] intArr = {1,2,3,4,5};
		Character[] charArr = {'A', 'B', 'C','D'};
		String[] str = {"Generics", "In", "Java"};
		//print("Genrics");
		
		System.out.println("--------Using Generics--------");
		System.out.println("**1.Printing Integer Array**");
		print(intArr);
		
		System.out.println("**2.Printing Character Array**");
		print(charArr);
		
		System.out.println("**3.Printig String**");
		print(str);

	}

}
