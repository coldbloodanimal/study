package com.command;

import java.util.Arrays;

public class RemoteController {
	Command onCommand[];
	Command offCommand[];
	Command undoCommand;
	public RemoteController() {
		super();
		onCommand=new Command[3];
		offCommand=new Command[3];
	}

	public void onPressed(int slot){
		onCommand[slot].excute();	
		this.undoCommand=offCommand[slot];
		
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		
		this.onCommand[slot]=onCommand;
		this.offCommand[slot]=offCommand;
	}
	public void offPressed(int slot){
		offCommand[slot].excute();
		this.undoCommand=onCommand[slot];
	}
	
	public void undo(){
		this.undoCommand.excute();
	}

	@Override
	public String toString() {
		return "RemoteController [onCommand=" + Arrays.toString(onCommand)
				+ ", offCommand=" + Arrays.toString(offCommand) + "]";
	}
}
