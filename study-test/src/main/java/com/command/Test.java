package com.command;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Light light=new Light();
		//Command com=new Command();
		Command lighton=new LightOnCommand(light);
		Command lightoff=new LightOffCommand(light);
		SimpleRemoteController src=new SimpleRemoteController();
		src.setCommand(lighton,lightoff);
		src.onPressed();
		src.offPressed();
		
	}

}
