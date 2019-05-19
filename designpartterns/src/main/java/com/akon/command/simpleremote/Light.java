package com.akon.command.simpleremote;

/**
 * 厂商提供的灯开关的API
 */
public class Light {

	public Light() {
	}

	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	}
}
