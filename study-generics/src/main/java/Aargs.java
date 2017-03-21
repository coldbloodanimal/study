import java.util.ArrayList;
import java.util.List;

public class Aargs {
	
	public static <T> List<T> makelist(T... args){
		List<T> list=new ArrayList<T>();
		for(T t:args){
			list.add(t);
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.print(makelist("adsfasdjflas".split("")));

	}

}
