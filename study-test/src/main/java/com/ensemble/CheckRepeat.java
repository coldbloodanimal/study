package com.ensemble;

public class CheckRepeat implements CheckRepeatBehaviour{


	public String checkrepeat(String global, String indexname, String checkword) {
		
		String sss="";
		System.out.println("ClassMethod IfRep"+checkword.substring(0,1).toUpperCase()+checkword.substring(1, checkword.length())+"("+checkword+") As %String");
		System.out.println("{");
		System.out.println("\tnew ("+checkword+")");
		System.out.println("\ts rowid=0");
		System.out.println("\ts rowid=$o("+global+"(\""+indexname+"\","+checkword+",rowid))");
		System.out.println("\ti rowid=\"\" d  s rowid=0");
		System.out.println("\tq rowid");
		System.out.println("}");
		sss="IfRep"+checkword.substring(0,1).toUpperCase()+checkword.substring(1, checkword.length())+"("+checkword+")";
		return sss;
	}

}
