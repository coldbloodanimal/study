//: access/IceCream.java
// Demonstrates "private" keyword.

class Sundae {
  private int age;
  public int sex;
  private Sundae() {}
  static Sundae makeASundae() {
    return new Sundae();
  }
}

public class IceCream {
  public static void main(String[] args) {
    //! Sundae x = new Sundae();
	  
    Sundae x = Sundae.makeASundae();
  }
} ///:~
