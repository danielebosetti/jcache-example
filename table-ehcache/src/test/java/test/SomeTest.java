package test;

import org.junit.Test;
import pack.Main;
import pack.UseEhCache;
import util.User;

/**
 * 
 * @author danielebosetti.hp
 */
public class SomeTest {

  @Test
  public void test1() {
    User u = new User();
    u.go();
  }
  
  @Test
  public void test2() {
    Main.main(null);
  }
  
  @Test
  public void test3() {
    UseEhCache.main(null);
  }
  
  
}
