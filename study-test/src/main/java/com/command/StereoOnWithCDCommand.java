package com.command;

public class StereoOnWithCDCommand implements Command{

	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo=stereo;
	}
	public void excute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCD();
		stereo.setVolume(2);
	}


}
