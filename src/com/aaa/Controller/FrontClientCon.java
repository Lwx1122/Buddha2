package com.aaa.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.Service.IClientSer;
@RequestMapping("f/cli")
@Controller
public class FrontClientCon {
	@Autowired
	private IClientSer clientSer;
	@RequestMapping("/getAll")
	public String findAll(){
		List<Map> listmap = clientSer.getAll();
		return "FgetClient";
	}
}
