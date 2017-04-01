package com.ensemble.method;

public class MyUpdate implements Update{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" orgDr, copyDr, index_type_code, index_type_name, type_desc, use_range, is_stop, end_date";
				
		String tablename="herpg_sys_data.DictIndexType";
		Update update=new MyUpdate();
		String global="^global";
		update.createUpdate(tablename,s,global);
		//System.out.println(s.substring(s.indexOf("(")+1,s.indexOf(")")).toLowerCase());
	}

	public String createUpdate(String tablename,String s,String global) {
		
		
		String original=s;
		
		s=s.replace(" ", "");
		String[] stringArray=s.split(",");
		String values="";
		String parameters="";
		String actualParameters="";
		
		
		
		for(int i=0;i<stringArray.length;i++){
			
	//		System.out.println(" 	i "+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase()+" '=\"\""+"  s Plist("+(i+2)+") = "+stringArray[i]);
			parameters=parameters+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase()+",";
			actualParameters=actualParameters+"\"\",";
		}
		actualParameters=actualParameters.substring(0,actualParameters.lastIndexOf(","));
		parameters="rowid,"+parameters.substring(0,parameters.lastIndexOf(","));
		System.out.println("/// Others:w ##class(yourclassname).UpdateRec("+actualParameters+")");
		System.out.println("ClassMethod UpdateRec("+parameters+") As %String");
		System.out.println("{");
		System.out.println("\tn ("+parameters+")");
		System.out.println();
		System.out.println("\ti code'=\"\"");
		System.out.println("\t{");
		System.out.println("\ts tmpRowid=0");
		System.out.println("\ts tmpRowid=..IfRepCode(code)");
		System.out.println("\tq:(tmpRowid'=0)&(tmpRowid'=rowid) \"RepCode\"");
		System.out.println("\t}");
		System.out.println();
		System.out.println("\ti name'=\"\"");
		System.out.println("\t{");
		System.out.println("\ts tmpRowid=0");
		System.out.println("\ts tmpRowid=..IfRepName(name)");
		System.out.println("\tq:(tmpRowid'=0)&(tmpRowid'=rowid) \"RepName\"");
		System.out.println("\t}");
		System.out.println();
		
		for(int i=0;i<stringArray.length;i++){
			//	i IsDirector=""   s IsDirector=$list(^DHCSRMDeptUserD(rowId),4)
			System.out.println(" 	i "+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase()+" =\"\""+"  s Plist("+(i+2)+") = "+"$list("+global+"(rowid),"+(i+2)+")");
			
			//parameters=parameters+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase()+",";
		}
		
		for(int i=0;i<stringArray.length;i++){
			//	i IsDirector=""   s IsDirector=$list(^DHCSRMDeptUserD(rowId),4)
			//System.out.println(" 	i "+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase()+" =\"\""+"  s Plist("+(i+2)+") = "+"$list("+global+"(rowid),"+i+2+")");
			System.out.println(" 	i "+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase()+" '=\"\""+"  s Plist("+(i+2)+") = "+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase());
			//parameters=parameters+stringArray[i].substring((stringArray[i].lastIndexOf("_")+1)).toLowerCase()+",";
		}
		//&sql(UPDATE herp_acct_check.DataCheckItem VALUES Plist() where %ID=:rowId)
		String updateString="&sql(UPDATE "+tablename+" VALUES Plist() where %ID=:rowid)";
		System.out.println("\t"+updateString);
		System.out.println("\tq SQLCODE");
		System.out.println("}");
	
		return null;
	}
	


}
