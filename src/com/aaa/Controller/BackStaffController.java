package com.aaa.Controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.Entity.Staff;
import com.aaa.Service.IStaffSer;

@Controller
@RequestMapping("/back/staff")
public class BackStaffController {
	@Autowired
	private IStaffSer staffSer;
	@RequestMapping("/getAllStaff")
	public String findAllStaff(Staff s ,Integer jobnum,String name,Integer pageSize,Integer currPage,HttpServletRequest req){
		List<Map> staffList=staffSer.getAllStaff(s,jobnum,name,pageSize,currPage);
		System.out.println(staffList);
		req.setAttribute("staffList", staffList);
		return "BackshowStaff";
		
	}
}
