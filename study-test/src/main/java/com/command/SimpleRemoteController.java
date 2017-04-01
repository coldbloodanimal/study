package com.command;

public class SimpleRemoteController {
	private Command onCommand;
	private Command offCommand;
	
	public SimpleRemoteController() {
		super();
	}

	public void onPressed(){
		onCommand.excute();	
	}
	
	public void setCommand(Command onCommand,Command offCommand){
		this.onCommand=onCommand;
		this.offCommand=offCommand;
	}
	public void offPressed(){
		offCommand.excute();
	}

}
