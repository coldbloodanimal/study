package com.ensemble;

import com.ensemble.method.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SELECT BonusSubIncomeRateID, IncItemCode, SickType, MakeBillDeptRate, ExecuteDeptRate, SickDeptRate, CheckMan, CheckDate, UpdateDate, State
		//FROM dhc_bonus_module.BonusIncomeRate
		/*
		 * 
		 * 关于as的支持
		 * SELECT a.BonusYear,a.BonusPeriod,c.WorkItemName,b.BonusUnitName,a.ItemNum nownum,a.ItemNum*a.ItemPrice AS nowreward, lastyear.ItemNum lastyearnum,lastyear.ItemNum*lastyear.ItemPrice AS lastyearreward, lastmonth.ItemNum lastmonthnum,lastmonth.ItemNum*lastmonth.ItemPrice AS lastmonthreward, myavrage.itemnum averagenum,myavrage.reward AS averagereward
		 * 
		 * */
		//用于常见检查重复的变量
		String globali="^DHCCJXQMCheckI";
		String globald="^DHCCJXQMCheckD"; 
		String indexname="CheckCode";
		String checkword="CheckCode";
		String indexname2="CheckName";
		String checkword2="CheckName";
		
		String tablename="dhc_qm_data.CheckInfo";
		String parameters="  Check_code, Check_name, Check_locType, Check_colType, Check_AssessType, Check_desc, Check_active, Check_photo, Check_spcil, Check_ObjectType";
		
		String s="SELECT Check_rowid, Check_code, Check_name, Check_locType, Check_colType, Check_AssessType, Check_desc, Check_active, Check_photo, Check_spcil, Check_ObjectType FROM dhc_qm_data.CheckInfo ";
		String splitSymbl=",";
		BackStageCodeCreator backcode=new BackStageCodeCreator();
		//获得检验重复的对象
		CheckRepeatBehaviour cr=backcode.getCheckRepeatBehaviour();
		//获得生成list的对象
		List list=backcode.getList();
		//生成检验重复代码
		//cr.checkrepeat(global, indexname, checkword);
		//cr.checkrepeat(global, indexname2, checkword2);
		//生成List代码,creatList方法的实现我现在做的很乱，也没有什么时间优化，先这样用着了
		
		list.creatList(s, splitSymbl);
		//生成插入的代码
		backcode.getInsert().creatInsert(tablename, parameters);
		//生成修改的代码
		backcode.getUpdate().createUpdate(tablename, parameters,globald);

		//生成delete的代码
		backcode.getDelete().createDelete(tablename);
		
		
		
	}

}
