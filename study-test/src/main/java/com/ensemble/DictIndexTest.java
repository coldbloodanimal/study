package com.ensemble;

import com.ensemble.method.List;

public class DictIndexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String globali="^DHCCJXQMPatShowI";
		String globald="^DHCCJXQMPatShowD"; 
		String indexname="PatShowCode";
		String checkword="PatShowCode";
		String indexname2="CheckName";
		String checkword2="CheckName";

		String tablename="dhc_qm_data.PatShow";
		String parameters="  PatShow_code, PatShow_name, PatShow_desc, PatShow_active";
		
		String s="SELECT PatShow_rowid, PatShow_code, PatShow_name, PatShow_desc, PatShow_active FROM dhc_qm_data.PatShow";
		String splitSymbl=",";
		BackStageCodeCreator backcode=new BackStageCodeCreator();
		//获得检验重复的对象
		CheckRepeatBehaviour cr=backcode.getCheckRepeatBehaviour();
		//获得生成list的对象
		List list=backcode.getList();
		//生成检验重复代码
		cr.checkrepeat(globali, indexname, checkword);
		//cr.checkrepeat(globali, indexname2, checkword2);
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
