package com.zhishi.utils;

public class LightUtil {
	private int id;
	private String lightSwitch;

	public LightUtil(int id, String lightSwitch) {
		this.id = id;
		this.lightSwitch = lightSwitch;
	}

	public LightUtil() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLightSwitch() {
		return lightSwitch;
	}

	public void setLightSwitch(String lightSwitch) {
		this.lightSwitch = lightSwitch;
	}
}
