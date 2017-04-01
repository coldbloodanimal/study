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
		//��ü����ظ��Ķ���
		CheckRepeatBehaviour cr=backcode.getCheckRepeatBehaviour();
		//�������list�Ķ���
		List list=backcode.getList();
		//���ɼ����ظ�����
		cr.checkrepeat(global, indexname, checkword);
		cr.checkrepeat(global, indexname2, checkword2);
		//����List����,creatList������ʵ�����������ĺ��ң�Ҳû��ʲôʱ���Ż���������������
		
		list.creatList(s, splitSymbl);
		//���ɲ���Ĵ���
		backcode.getInsert().creatInsert(tablename, parameters);
		//�����޸ĵĴ���
		backcode.getUpdate().createUpdate(tablename, parameters,global);

		//����delete�Ĵ���
		backcode.getDelete().createDelete(tablename);
	}

}
