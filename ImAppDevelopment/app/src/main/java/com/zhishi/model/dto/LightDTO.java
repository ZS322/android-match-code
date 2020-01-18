package com.zhishi.model.dto;


import com.zhishi.model.entity.LightSwitch;

import java.util.Set;

public class LightDTO {
	
	private String status;
	
	private String message;
	
	private Set<LightSwitch> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Set<LightSwitch> getData() {
        return data;
    }

    public void setData(Set<LightSwitch> data) {
        this.data = data;
    }

    public LightDTO(String status, String message, Set<LightSwitch> data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

    @Override
    public String toString() {
        return "LightDTO{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
