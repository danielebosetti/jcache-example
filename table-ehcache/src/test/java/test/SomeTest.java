package test;

import org.junit.Test;
import util.SomeLogic;

public class SomeTest {

  @Test(expected = Exception.class)
  public void someTest() {
    SomeLogic o = new SomeLogic();
    o.go();
  }


}
