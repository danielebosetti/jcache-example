package util;

public class User {

  public void go() {
    System.out.println("go");
  }
  public void go2() {
    throw new RuntimeException();
  }
}
