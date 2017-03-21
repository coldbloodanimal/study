//: generics/GenericsAndCovariance.java
import java.util.*;

public class GenericsAndCovariance {
  public static void main(String[] args) {
    // Wildcards allow covariance:
    List<? extends Fruit> flist;
    List<Apple> apples=new ArrayList<Apple>();
    apples.add(new Apple());
    flist=apples;
    // Compile Error: can't add any type of object:
//     flist.add(new Apple());
//     flist.add(new Fruit());
//     flist.add(new Object());
    flist.add(null); // Legal but uninteresting
    // We know that it returns at least Fruit:
    Fruit f = flist.get(0);
  }
} ///:~
