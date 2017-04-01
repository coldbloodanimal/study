package com.test.chapter4;

import java.sql.Date;
public class WorkItemCollectData {
	private int InterLocMethod_rowid; //方法接口ID
	private String BonusUnitCode ; //科室编码
	private String BonusUnitName ; //科室名称
	private String ItemName ; //收费项目名称
	private String BonusYear ; //年
	private String BonusPeriod ; //月
	private float ItemNum ; //项目数值
	private Date CollectDate ; //采集时间
	private int State ; //数据状态
	private String CheckMan  ; //审核人
	private Date CheckDate  ; //审核日期
	private int DataType  ; //数据类型
	public int getInterLocMethod_rowid() {
		return InterLocMethod_rowid;
	}
	public void setInterLocMethod_rowid(int interLocMethod_rowid) {
		InterLocMethod_rowid = interLocMethod_rowid;
	}
	public String getBonusUnitCode() {
		return BonusUnitCode;
	}
	public void setBonusUnitCode(String bonusUnitCode) {
		BonusUnitCode = bonusUnitCode;
	}
	public String getBonusUnitName() {
		return BonusUnitName;
	}
	public void setBonusUnitName(String bonusUnitName) {
		BonusUnitName = bonusUnitName;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getBonusYear() {
		return BonusYear;
	}
	public void setBonusYear(String bonusYear) {
		BonusYear = bonusYear;
	}
	public String getBonusPeriod() {
		return BonusPeriod;
	}
	public void setBonusPeriod(String bonusPeriod) {
		BonusPeriod = bonusPeriod;
	}
	public float getItemNum() {
		return ItemNum;
	}
	public void setItemNum(float itemNum) {
		ItemNum = itemNum;
	}
	public Date getCollectDate() {
		return CollectDate;
	}
	public void setCollectDate(Date collectDate) {
		CollectDate = collectDate;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public String getCheckMan() {
		return CheckMan;
	}
	public void setCheckMan(String checkMan) {
		CheckMan = checkMan;
	}
	public Date getCheckDate() {
		return CheckDate;
	}
	public void setCheckDate(Date checkDate) {
		CheckDate = checkDate;
	}
	public int getDataType() {
		return DataType;
	}
	public void setDataType(int dataType) {
		DataType = dataType;
	}
}
