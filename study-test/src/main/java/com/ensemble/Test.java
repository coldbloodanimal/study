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
		 * ����as��֧��
		 * SELECT a.BonusYear,a.BonusPeriod,c.WorkItemName,b.BonusUnitName,a.ItemNum nownum,a.ItemNum*a.ItemPrice AS nowreward, lastyear.ItemNum lastyearnum,lastyear.ItemNum*lastyear.ItemPrice AS lastyearreward, lastmonth.ItemNum lastmonthnum,lastmonth.ItemNum*lastmonth.ItemPrice AS lastmonthreward, myavrage.itemnum averagenum,myavrage.reward AS averagereward
		 * 
		 * */
		//���ڳ�������ظ��ı���
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
		//��ü����ظ��Ķ���
		CheckRepeatBehaviour cr=backcode.getCheckRepeatBehaviour();
		//�������list�Ķ���
		List list=backcode.getList();
		//���ɼ����ظ�����
		//cr.checkrepeat(global, indexname, checkword);
		//cr.checkrepeat(global, indexname2, checkword2);
		//����List����,creatList������ʵ�����������ĺ��ң�Ҳû��ʲôʱ���Ż���������������
		
		list.creatList(s, splitSymbl);
		//���ɲ���Ĵ���
		backcode.getInsert().creatInsert(tablename, parameters);
		//�����޸ĵĴ���
		backcode.getUpdate().createUpdate(tablename, parameters,globald);

		//����delete�Ĵ���
		backcode.getDelete().createDelete(tablename);
		
		
		
	}

}
