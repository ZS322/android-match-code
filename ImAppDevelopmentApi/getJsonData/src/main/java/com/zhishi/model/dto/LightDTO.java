package com.zhishi.model.dto;

import java.util.HashSet;
import java.util.Set;

import com.zhishi.model.entity.LightSwitch;


public class LightDTO {
	
	private String status;
	
	private String message;
	
	private Set<LightSwitch> data;

	public LightDTO(String status, String message, Set<LightSwitch> data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
}
