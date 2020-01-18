package com.zhishi.model.entity;

public class LightSwitch {
	
	private Integer id;
	
	private String lightSwitch;
	
	private String acOnOff;

	public LightSwitch(Integer id, String lightSwitch, String acOnOff) {
		this.id = id;
		this.lightSwitch = lightSwitch;
		this.acOnOff = acOnOff;
	}

	@Override
	public String toString() {
		return "LightSwitch [id=" + id + ", lightSwitch=" + lightSwitch + ", acOnOff=" + acOnOff + "]";
	}
	
}
