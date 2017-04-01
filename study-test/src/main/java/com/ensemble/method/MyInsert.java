package com.ensemble.method;

public class MyInsert implements Insert{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" orgDr, copyDr, index_type_code, index_type_name, type_desc, use_range, is_stop, end_date";
		String tablename="herpg_sys_data.DictIndexType";	
		Insert insert=new MyInsert();
		insert.creatInsert(tablename, s);
		//System.out.println(s.substring(s.indexOf("(")+1,s.indexOf(")")).toLowerCase());
	}

	@Override
	public void creatInsert(String tablename,String s) {
		String original=s;
		s=s.replace(" ", "");
		String[] stringArray=s.split(",");
		String values="";
		String parameters="";
		String actualParameters="";
		for(int i=0;i<stringArray.length;i++){
			stringArray[i]=stringArray[i].substring((stringArray[i].lastIndexOf("_")+1));
			values=values+":"+stringArray[i].toLowerCase()+",";
			parameters=parameters+stringArray[i].toLowerCase()+",";
			actualParameters=actualParameters+"\""+stringArray[i].toLowerCase()+"\""+",";
		}
		parameters=parameters.substring(0,parameters.lastIndexOf(","));
		actualParameters=actualParameters.substring(0,actualParameters.lastIndexOf(","));
		values="\t&sql(INSERT INTO "+tablename+" VALUES ("+values.substring(0,values.lastIndexOf(","))+" ))";
		System.out.println("/// Others:w ##class(yourclassname).InsertRec("+actualParameters+")");
		System.out.println("ClassMethod InsertRec("+parameters+") As %String");
		System.out.println("{");
		System.out.println("\tn ("+parameters+")");
		System.out.println();
		System.out.println("\ts rowid=0");
		System.out.println("\ts rowid=..IfRepCode(code)");
		System.out.println("\tq:rowid>0 \"RepCode\"");
		System.out.println();
		System.out.println("\ts rowid=0");
		System.out.println("\ts rowid=..IfRepName(name)");
		System.out.println("\tq:rowid>0 \"RepName\"");
		System.out.println();
		System.out.println(values);
		System.out.println();
		System.out.println("\tq SQLCODE");
		System.out.println("}");
	}

}
