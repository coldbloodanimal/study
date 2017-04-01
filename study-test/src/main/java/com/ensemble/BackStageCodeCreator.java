package com.ensemble;

import com.ensemble.method.*;
import com.ensemble.method.List;
import com.ensemble.method.MyList;

public class BackStageCodeCreator{

	/**
	 * @param args
	 */
	private CheckRepeatBehaviour checkRepeatBehaviour;
	private List list;
	private Insert insert;
	private Update update;
	private Delete delete;
	public BackStageCodeCreator() {
		super();
		checkRepeatBehaviour=new CheckRepeat();
		list=new MyList();
		insert=new MyInsert();
		update=new MyUpdate();
		delete=new MyDelete();
	}
	
	public CheckRepeatBehaviour getCheckRepeatBehaviour() {
		return checkRepeatBehaviour;
	}

	public Insert getInsert() {
		return insert;
	}

	public Update getUpdate() {
		return update;
	}

	public Delete getDelete() {
		return delete;
	}

	public List getList() {
		return list;
	}





}
