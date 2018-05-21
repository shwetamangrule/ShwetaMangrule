package junit.test;

import java.util.Scanner;

public class JunitReverseString {
  // Scanner sc = new Scanner(System.in);

  // String s = sc.nextLine();
  public String revString1(String s) {
    String[] words = s.split(" ");
    String revString = "";
    for (int i = 0; i < words.length; i++) {
      String w = words[i];
      String revWord = "";
      for (int j = w.length() - 1; j >= 0; j--) {
        revWord += w.charAt(j);
      }
      revString += revWord + " ";
    }
    System.out.println(revString);
    return revString;

  }
}
