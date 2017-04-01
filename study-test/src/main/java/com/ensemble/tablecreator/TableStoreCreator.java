package com.ensemble.tablecreator;

public class TableStoreCreator {
	private int start;
	private String parameters;
	
	
	//['all_income', '������']
	public static void main(String[] args){
		
		String parameters="all_income,all_cost,all_profit,all_income_b,medical_income,medical_cost,medical_profit,drugs_income,drugs_cost,drugs_profit,out_income_b,out_treat_income,out_med_income,in_income_b,in_treat_income,in_med_income,out_treat_fix_cost,out_treat_chg_cost,out_med_fix_cost,out_med_chg_cost,in_treat_fix_cost,in_treat_chg_cost,in_med_fix_cost,in_med_chg_cost,res_treat_fix_cost,res_treat_chg_cost,res_med_fic_cost,res_med_chg_cost,admin_share_cost,asst_share_cost,tech_share_cost,direct_treat_cost,govn_depre_cost,govn_amo_cost,edu_depre_cost,edu_amo_cost,human_cost,material_cost,net_med_cost,depre_cost,fund_cost,repair_cost,admin_cost,other_cost,out_num,eme_num,out_ss_num,In_num,at_hospital_num,org_bed_num,in_hospital_num,other_dept_num,out_hospital_num,total_in_hospital_days,total_in_dept_days,total_bed_used_days,in_ss_num,x_num,ct_num,mr_num,bc_num,wcj_num,bl_num,hy_num,cx_num,mz_num,operated_num";
		String descriptions="������,��֧��,������,������Ԥ��ֵ,ҽ��������,ҽ����֧��,ҽ��������,ҩƷ������,ҩƷ��֧��,ҩƷ������,��������Ԥ��ֵ,����ҽ������,����ҩƷ����,סԺ����Ԥ��ֵ,סԺҽ������,סԺҩƷ����,����ҽ�ƹ̶��ɱ�,����ҽ�Ʊ䶯�ɱ�,����ҩƷ�̶��ɱ�,����ҩƷ�䶯�ɱ�,סԺҽ�ƹ̶��ɱ�,סԺҽ�Ʊ䶯�ɱ�,סԺҩƷ�̶��ɱ�,סԺҩƷ�䶯�ɱ�,����ҽ�ƹ̶��ɱ�,����ҽ�Ʊ䶯�ɱ�,����ҩƷ�̶��ɱ�,����ҩƷ�䶯�ɱ�,�����̯�ɱ�,ҽ����̯�ɱ�,ҽ����̯�ɱ�,ֱ��ҽ�Ƴɱ�,���������̶��ʲ��۾�,�������������ʲ�̯��,�ƽ���Ŀ�̶��ʲ��۾�,�ƽ���Ŀ�����ʲ�̯��,��Ա�ɱ�,�������ϳɱ�,ҩƷ�ɱ�,�̶��ʲ��۾ɳɱ�,�����ʲ�̯���ɱ�,��ȡҽ�Ʒ��ջ���ɱ�,����ɱ�,�����ɱ�,�����˴�,�����˴�,���������˴�,סԺ����,��Ժ����,������λ����,������Ժ����,����ת������,��Ժ����,ʵ�ʿ��Ŵ�����,��Ժ��סԺ�ڱ�����������,ʵ��ռ�ô�����,סԺ�����˴�,X���˴�,CT�˴�,MR�˴�,B���˴�,θ�����˴�,�����˴�,�����˴�,��Ѫ�˴�,�����˴�,�����˴�";
		int start=5;
		TableStoreCreator tablecreator=new TableStoreCreator();
		tablecreator.columnCreator(parameters,descriptions, start);

	}
	
	public void columnCreator(String parameters,String descriptions,int start){
		String p=parameters;
		String d[]=descriptions.split(",");
		String s[]=p.split(",");
		if(d.length==s.length){
			System.out.println("//nice ! sd ");
		}else{
			System.out.println("parameters.length "+s.length);
			System.out.println("descriptions.length "+d.length);
		}
		for(int i=0;i<s.length;i++){
			//���»���������������������� nametype
			//String ll;
			//System.out.println(i);
			//Property emeNum As %Integer [ SqlColumnNumber = 6, SqlFieldName = eme_num ];
			//System.out.println("//"+d[i]);
			//System.out.println("Property "+nametype(s[i])+" As %Integer [ InitialExpression = \"0\",SqlColumnNumber = "+(start+i+1)+", SqlFieldName = "+s[i]+" ];");
			//System.out.println("Property "+nametype(s[i])+" As %Numeric(MAXVAL = 20, SCALE = 4) [ InitialExpression = \"0.0000\",SqlColumnNumber = "+(start+i+1)+", SqlFieldName = "+s[i]+" ];");
			System.out.print("['"+s[i]+"','"+d[i]+"'],");
			//System.out.println();
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
