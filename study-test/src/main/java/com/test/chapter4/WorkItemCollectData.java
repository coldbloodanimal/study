package com.test.chapter4;

import java.sql.Date;
public class WorkItemCollectData {
	private int InterLocMethod_rowid; //�����ӿ�ID
	private String BonusUnitCode ; //���ұ���
	private String BonusUnitName ; //��������
	private String ItemName ; //�շ���Ŀ����
	private String BonusYear ; //��
	private String BonusPeriod ; //��
	private float ItemNum ; //��Ŀ��ֵ
	private Date CollectDate ; //�ɼ�ʱ��
	private int State ; //����״̬
	private String CheckMan  ; //�����
	private Date CheckDate  ; //�������
	private int DataType  ; //��������
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
