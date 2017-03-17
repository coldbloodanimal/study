import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(47);
		for(int i=0;i<20;i++){
			System.out.println(r.nextInt(20));
		}

		
	}

}
