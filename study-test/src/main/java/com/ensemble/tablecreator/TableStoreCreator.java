package com.ensemble.tablecreator;

public class TableStoreCreator {
	private int start;
	private String parameters;
	
	
	//['all_income', '总收入']
	public static void main(String[] args){
		
		String parameters="all_income,all_cost,all_profit,all_income_b,medical_income,medical_cost,medical_profit,drugs_income,drugs_cost,drugs_profit,out_income_b,out_treat_income,out_med_income,in_income_b,in_treat_income,in_med_income,out_treat_fix_cost,out_treat_chg_cost,out_med_fix_cost,out_med_chg_cost,in_treat_fix_cost,in_treat_chg_cost,in_med_fix_cost,in_med_chg_cost,res_treat_fix_cost,res_treat_chg_cost,res_med_fic_cost,res_med_chg_cost,admin_share_cost,asst_share_cost,tech_share_cost,direct_treat_cost,govn_depre_cost,govn_amo_cost,edu_depre_cost,edu_amo_cost,human_cost,material_cost,net_med_cost,depre_cost,fund_cost,repair_cost,admin_cost,other_cost,out_num,eme_num,out_ss_num,In_num,at_hospital_num,org_bed_num,in_hospital_num,other_dept_num,out_hospital_num,total_in_hospital_days,total_in_dept_days,total_bed_used_days,in_ss_num,x_num,ct_num,mr_num,bc_num,wcj_num,bl_num,hy_num,cx_num,mz_num,operated_num";
		String descriptions="总收入,总支出,总收益,总收入预算值,医疗总收入,医疗总支出,医疗总收益,药品总收入,药品总支出,药品总收益,门诊收入预算值,门诊医疗收入,门诊药品收入,住院收入预算值,住院医疗收入,住院药品收入,门诊医疗固定成本,门诊医疗变动成本,门诊药品固定成本,门诊药品变动成本,住院医疗固定成本,住院医疗变动成本,住院药品固定成本,住院药品变动成本,科研医疗固定成本,科研医疗变动成本,科研药品固定成本,科研药品变动成本,管理分摊成本,医辅分摊成本,医技分摊成本,直接医疗成本,财政补助固定资产折旧,财政补助无形资产摊销,科教项目固定资产折旧,科教项目无形资产摊销,人员成本,卫生材料成本,药品成本,固定资产折旧成本,无形资产摊销成本,提取医疗风险基金成本,管理成本,其他成本,门诊人次,急诊人次,门诊手术人次,住院床日,在院人数,机构床位数量,门诊入院人数,他科转入人数,出院人数,实际开放床日数,出院者住院在本科室总日数,实际占用床日数,住院手术人次,X光人次,CT人次,MR人次,B超人次,胃肠镜人次,病理人次,化验人次,抽血人次,麻醉人次,手术人次";
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
			//将下划线命名法变成骆驼命名法 nametype
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
