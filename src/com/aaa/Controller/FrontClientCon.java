package com.aaa.Controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.Service.IClientSer;
@RequestMapping("fro/cli")
@Controller
public class FrontClientCon {
	@Autowired
	private IClientSer clientSer;
	/**
	 * 
	 * @����ϼ
	 * 2018��10��17��
	 * @return
	 */
	@RequestMapping("/getAll")
	public String findAll(HttpServletRequest req){
		List<Map> listmap = clientSer.getAll();
		req.setAttribute("listmap",listmap);
		return "FgetClient";
	}
}
