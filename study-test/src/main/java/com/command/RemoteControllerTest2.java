package com.command;

public class RemoteControllerTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController rc=new RemoteController();
		//

		Light light=new Light();
		Light light2=new Light();
		Stereo stereo=new Stereo();
		Command lighton=new LightOnCommand(light);
		Command lightoff=new LightOffCommand(light);
		Command light2on=new LightOnCommand(light2);
		Command light2off=new LightOffCommand(light2);
		Command stereoon=new StereoOnWithCDCommand(stereo);
		Command stereooff=new StereoOffWithCDCommand(stereo);
		
		//
		rc.setCommand(0, lighton, lightoff);
		rc.setCommand(1, light2on, light2off);
		rc.setCommand(2, stereoon, stereooff);
		
		rc.onPressed(0);
		rc.offPressed(0);
		rc.onPressed(1);
		rc.undo();
		rc.offPressed(1);
		rc.onPressed(2);
		rc.undo();
		rc.offPressed(2);
		rc.undo();
		System.out.println(rc.toString());
		System.out.println(rc);
		
		
	}
}
