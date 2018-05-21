
package junit.test;

public class JunitDuplicateNumber {
  
  int[] arr = {1,2,3,4,5,6};
  
  public boolean dupNumber(int num) {

  for (int i = 0; i < arr.length; i++)
  {
      
          if ((arr[i] == num) && (i != num))
          {
            return true;
              //System.out.println(input+ " Is Duplicate Number");
             
          }   
      
  }
  return false;

}
}