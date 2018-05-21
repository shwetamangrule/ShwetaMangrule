package junit.test.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.test.JunitDuplicateNumber;

public class DuplicateNumber {

  
  JunitDuplicateNumber jd = new JunitDuplicateNumber();
  
  @Test
  public void duplicate()
  {
    assertTrue("Duplicate Number", jd.dupNumber(7));
  }
}
