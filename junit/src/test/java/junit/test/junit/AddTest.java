package junit.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.test.calculator;

public class AddTest {

	static calculator cal=new calculator();
	/*@Before
	public static void beforeme()
	{
	 int result =cal.add(1,0);
	}*/
	@Test
	public void addTest()
	{
	assertEquals(1,cal.add(1, 0));
	}
	@Test
	public void addTest2()
	{
		
	assertEquals(30,cal.multiply(5, 6) );
	}
}
