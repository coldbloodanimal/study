package generics.me;

import java.util.ArrayList;
import java.util.List;

class Dog{}

public class DogGenerator<T>{

	private static final String T = null;

	public T generator() {
		// TODO Auto-generated method stub
		T t=new T();
		return t;
	}

}
