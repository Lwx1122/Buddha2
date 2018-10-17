package com.aaa.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.Service.IDeptSer;

@RequestMapping("/back/dept")
@Controller
public class BackDeptCon {
	@Autowired
	private IDeptSer deptSer;

	@RequestMapping("/getAllDept")
	public ModelAndView getAllDept() {
		List<Map> deptList = deptSer.getAllDept();
		ModelAndView md = new ModelAndView();
		md.addObject("deptList", deptList);
		md.setViewName("BackShowDept");
		return md;

	}
}
