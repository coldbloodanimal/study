package com.ensemble.method;

public class MyDelete implements Delete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tablename="herpg_sys_data.DictIndexType";
		Delete delete =new MyDelete();
		delete.createDelete(tablename);
	}

	@Override
	public void createDelete(String tablename) {
		// TODO Auto-generated method stub
		String values="\t&sql( DELETE FROM "+tablename+" WHERE %ID=:rowid)";

		System.out.println("ClassMethod Delete(rowid) As %String");
		System.out.println("{");
		System.out.println(""+values);
		System.out.println();

		System.out.println("\tq SQLCODE");
		System.out.println("}");
		
		
	}

//	ClassMethod Delete(rowId) As %String
//	{
//	 	n (rowId)
//
//		&sql(Delete from herp_acct_check.DataCheckItem where DataCheckItemID=:rowId)	
//		
//		q SQLCODE
//	}


}
