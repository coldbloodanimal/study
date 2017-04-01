package com.people;
/**
 * 
 * @author badboy
 * <code>Employee</code> used to test final,static and extends
 */
public abstract class Employee {
	/**
	 * used for circle
	 * 
	 **/
	public  static final double PI=3.14;
	public final String name;
	private String sex;
	private int age;
	private int id;
	private static int nextid=1;
	private static int nextid2=1;
	public Employee(String n,String s,int a){
		name=n;
		sex=s;
		age=a;
	}
	public Employee(String name){
		this.name=name;
	}


	/**
	 * getname
	 * @param null
	 * @return String
	 * @throws null
	 * 
	 * */
	public String getName(){
		return name;
	}
	public static int getNextid() {
		return nextid;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = nextid;
		nextid++;
	}
	public static int getNextid2() {
		return nextid2;
	}
	public static void setNextid2(int nextid2) {
		Employee.nextid2 = nextid2;
	};
	
	public void hello(){
		System.out.println("hello");
	}

	
}
