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
		//��ü����ظ��Ķ���
		CheckRepeatBehaviour cr=backcode.getCheckRepeatBehaviour();
		//�������list�Ķ���
		List list=backcode.getList();
		//���ɼ����ظ�����
		cr.checkrepeat(globali, indexname, checkword);
		//cr.checkrepeat(globali, indexname2, checkword2);
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
