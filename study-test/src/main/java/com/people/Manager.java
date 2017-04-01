package com.people;
/**
 * 
 * @author badboy
 * Manager used to test final,static and extends
 */
public class Manager extends Employee{
	private boolean isBoss;



	public boolean isBoss() {
		return isBoss;
	}



	public Manager(String n, String s, int a, boolean isBoss) {
		super(n, s, a);
		this.isBoss = isBoss;
	}










	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	public Manager(String n, String s, int a) {
		super(n, s, a);
		// TODO Auto-generated constructor stub
	}



	public void setBoss(boolean isBoss) {
		this.isBoss = isBoss;
	}



	@Override
	public String toString() {
		return "Manager [isBoss=" + isBoss + ", getName()=" + getName() + "]";
	}
	
//	public void thesuper(){
//		super.hello();
//	};

	public void hello(){
		super.hello();
	}
}
