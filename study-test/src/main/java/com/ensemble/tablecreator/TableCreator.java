package com.ensemble.tablecreator;

public class TableCreator {
	private int start;
	private String parameters;
	
	
	
	public static void main(String[] args){
		
		String parameters="bal_os,this_od,this_oc,sum_od,sum_oc,end_os";
		String descriptions="期初数,本期借方发生数,本期贷方发生数,本年借方累计数,本年贷方累计数,结余数";
		int start=5;
		TableCreator tablecreator=new TableCreator();
	//	tablecreator.columnCreator(parameters,descriptions, start);

	}
	
	public void columnCreator(String parameters,String descriptions,int start){
		String p=parameters;
		String d[]=descriptions.split(",");
		String s[]=p.split(",");
		if(d.length==s.length){
			System.out.println("//nice ! ");
		}else{
			System.out.println("parameters.length "+s.length);
			System.out.println("descriptions.length "+d.length);
		}
		for(int i=0;i<s.length;i++){
			//将下划线命名法变成骆驼命名法 nametype
			//String ll;
			//System.out.println(i);
			//Property emeNum As %Integer [ SqlColumnNumber = 6, SqlFieldName = eme_num ];
			System.out.println("//"+d[i]);
			//System.out.println("Property "+nametype(s[i])+" As %Integer [ InitialExpression = \"0\",SqlColumnNumber = "+(start+i+1)+", SqlFieldName = "+s[i]+" ];");
			System.out.println("Property "+nametype(s[i])+" As %Numeric(MAXVAL = 20, SCALE = 4) [ InitialExpression = \"0.0000\",SqlColumnNumber = "+(start+i+1)+", SqlFieldName = "+s[i]+" ];");
			System.out.println();
		}
		//System.out.println(s.length);
		
		
	}
	
	public String nametype(String name){

		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='_'){
				
				name=name.substring(0,i)+name.substring(i+1,i+2).toUpperCase()+name.substring(i+2);
			}
		}
		
		return name;
		
	}

}
