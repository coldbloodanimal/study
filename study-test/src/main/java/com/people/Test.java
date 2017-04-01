package com.people;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		int nextid=9;
		//e=new Employee("jim","man",25);
		//System.out.println(e.toString());
		e=new Manager("jack","man",36,true);
		//Manager ee=(Manager)e;
		e.setId();
		//e.name="huha";
		System.out.println(e.getName()+"id:"+e.getId());
	
		Manager o = new Manager("mali","man",36,true);
		o.setId();
		System.out.println(o.getName()+"id:"+o.getId());
		//System.out.println(e.isBoss());
		System.out.println("----¡·"+o.getNextid()+"---->"+e.getNextid());
		System.out.println();
		System.out.println(Employee.getNextid());
		System.out.println(Employee.PI*2*2);
		o.hello();
		
	}

}
