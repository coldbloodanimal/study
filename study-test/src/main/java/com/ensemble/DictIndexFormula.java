package com.ensemble;

import com.ensemble.method.List;

public class DictIndexFormula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String global="^herpg.sys4475.DictIndexFoB5BBI";
		String indexname="DictIndexFormulaCode";
		String checkword="code";
		String indexname2="DictIndexFormulaName";
		String checkword2="name";

		String tablename="herpg_sys_data.DictIndexFormula";
		String parameters=" orgDr, copyDr, formula_code, formula_name, formula_desc, use_range, fetch_type, Is_cal, Is_dir, formula_exp, formula_Exp_desc, is_stop, end_date";
		
		String s="SELECT Index_Formula_RowID, dif.orgDr,org.org_name, copyDr,copy.copy_name, formula_code, formula_name, formula_desc, use_range, fetch_type, Is_cal, Is_dir, formula_exp, formula_Exp_desc, dif.is_stop, dif.end_date FROM herpg_sys_data.DictIndexFormula dif,herpg_sys_data.sysorganization org,herpg_sys_data.SysCopy copy WHERE dif.orgDr=org.ORG_Rowid AND dif.copyDr=copy.copy_rowid";
		String splitSymbl=",";
		BackStageCodeCreator backcode=new BackStageCodeCreator();
		//获得检验重复的对象
		CheckRepeatBehaviour cr=backcode.getCheckRepeatBehaviour();
		//获得生成list的对象
		List list=backcode.getList();
		//生成检验重复代码
		cr.checkrepeat(global, indexname, checkword);
		cr.checkrepeat(global, indexname2, checkword2);
		//生成List代码,creatList方法的实现我现在做的很乱，也没有什么时间优化，先这样用着了
		
		list.creatList(s, splitSymbl);
		//生成插入的代码
		backcode.getInsert().creatInsert(tablename, parameters);
		//生成修改的代码
		backcode.getUpdate().createUpdate(tablename, parameters,global);

		//生成delete的代码
		backcode.getDelete().createDelete(tablename);
	}

}
