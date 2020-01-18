package com.zhishi.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.zhishi.model.dto.LightDTO;
import com.zhishi.model.entity.LightSwitch;


@RestController
public class LightController {
	
	@PostMapping("/getJsonData")
	public String getJsonData(@RequestBody LightSwitch lightSwitch) {
		
		System.out.println(lightSwitch);	//打印android客户端传过来的值
		
		Set<LightSwitch> data=new HashSet<LightSwitch>();	//使用集合存储对象
		
		//遍历添加对象
		for (int i = 1; i < 3; i++) {	
			data.add(new LightSwitch(i-1,""+i,""+i));
		}
		
		LightDTO lightDTO = new LightDTO("200","成功",data);		//把集合对象存入LightDTO对象
		
		Gson gson=new Gson();
		
		String returnData = gson.toJson(lightDTO);	//构造一个字符串对象
		
		return returnData;
		
	}
	
}
