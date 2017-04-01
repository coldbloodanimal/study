package com.command;

public class RemoteControllerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController rc=new RemoteController();
		//
		Command[] onCommand = new Command[7];
		
		Command[] offCommand = new Command[7];
 		Light light=new Light();
		Light light2=new Light();
		Stereo stereo=new Stereo();
		onCommand[0]=new LightOnCommand(light);
		offCommand[0]=new LightOffCommand(light);
		onCommand[1]=new LightOnCommand(light2);
		offCommand[1]=new LightOffCommand(light2);
		onCommand[2]=new StereoOnWithCDCommand(stereo);
		offCommand[2]=new StereoOffWithCDCommand(stereo);
		
		//
		rc.setCommand(0, onCommand[0], offCommand[0]);
		rc.setCommand(1, onCommand[1], offCommand[1]);
		rc.setCommand(2, onCommand[2], offCommand[2]);
		
		rc.onPressed(0);
		rc.offPressed(0);
		rc.onPressed(1);
		rc.offPressed(1);
		rc.onPressed(2);
		rc.offPressed(2);
		rc.toString();
		
		
		
	}

}
