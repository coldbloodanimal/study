package com.ensemble.method;

public class ComboBox {
public static void main(String[] args){
	//Check_AssessType  1:选项 2：文本
	String storename1="checkAccesType";
	String comboname1="checkAccesTypeField";
	String fieldLabel="";
	String storetype1="SimpleStore";
	String data1="[['1','选项'],['2','文本']]";
	ComboBox combobox=new ComboBox();
	combobox.createStore(storename1, storetype1, data1);
	System.out.println();
	combobox.createCombo(storename1, comboname1, fieldLabel);
}
/*
 * 
 * var isActive = new Ext.data.SimpleStore({
	fields:['key','keyValue'],
	data:[['Y','是'],['N','否']]
});
var activeField = new Ext.form.ComboBox({
	id: 'activeField',
	fieldLabel: '是否有效',
	width:100,
	listWidth : 130,
	selectOnFocus: true,
	//allowBlank: false,
	store: isActive,
	//anchor: '90%',
	valueNotFoundText:'',
	displayField: 'keyValue',
	valueField: 'key',
	triggerAction: 'all',
	emptyText:'选择期间类型...',
	mode: 'local', //本地模式
	editable:true,
	pageSize: 10,
	minChars: 1,
	selectOnFocus:true,
	forceSelection:true
});
 * */
public void createStore(String storename,String storetype, String data) {
	// TODO Auto-generated method stub
	System.out.println("var "+storename+" = new Ext.data."+storetype+"({");
	System.out.println("fields:['key','Value'],");
	System.out.println("data:"+data);
	System.out.println("})");
}


public void createCombo(String sotrename,String Comboname,String fieldLabel){
	System.out.println("var "+Comboname+" = new Ext.form.ComboBox({");
	System.out.println("id: '"+Comboname+"',");
	System.out.println("fieldLabel: '"+fieldLabel+"',");
	System.out.println("width:100,");
	System.out.println("listWidth : 130,");
	System.out.println("selectOnFocus: true,");
	System.out.println("store: "+sotrename+",");
	System.out.println("valueNotFoundText:'',");
	System.out.println("displayField: 'Value',");
	System.out.println("valueField: 'key',");
	System.out.println("triggerAction: 'all',");
	System.out.println("mode: 'local', //本地模式");
	System.out.println("editable:true,");
	System.out.println("pageSize: 10,");
	System.out.println("minChars: 1,");
	System.out.println("selectOnFocus:true,");
	System.out.println("forceSelection:true");
	System.out.println("})");
}

}
