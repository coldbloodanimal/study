package com.command;

public class StereoOffWithCDCommand implements Command{

	Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo){
		this.stereo=stereo;
	}
	public void excute() {
		// TODO Auto-generated method stub
		stereo.off();
	}


}
