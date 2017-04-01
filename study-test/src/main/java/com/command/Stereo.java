package com.command;

public class Stereo {

	public void on() {
		System.out.println("stereo is on");
	}

	public void off() {
		System.out.println("stereo is off");
	}

	public void setCD() {
		System.out.println("CD model ");
	}

	public void setDvd() {
		System.out.println("DVD model ");
	}

	public void setRadio() {
	}

	public void setVolume(int i) {
		System.out.println("volume is "+i);
	}
}
