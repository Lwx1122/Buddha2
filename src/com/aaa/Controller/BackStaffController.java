package com.aaa.Controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.Entity.Staff;
import com.aaa.Service.IStaffSer;

@Controller
@RequestMapping("/back/staff")
public class BackStaffController {
	@Autowired
	private IStaffSer staffSer;

	@RequestMapping("/getAllStaff")
	public String findAllStaff(Staff s, Integer pageSize, Integer currPage,
			HttpServletRequest req) {
		List<Map> staffList = staffSer.getAllStaff(s, pageSize, currPage);
		System.out.println(staffList);
		// req.setAttribute("staffList", staffList);
		return "BackshowStaff";

	}

	/**
	 * 
	 * @����ϼ 2018��10��17��
	 * @param s
	 * @return
	 */
	@RequestMapping("upStaff")
	public String upStaff(Staff s) {
		int j = staffSer.updStaff(s);
		return "BackshowStaff";
	}

	/**
	 * ��¼ 2018��10��17��
	 * 
	 * @ˬ����
	 * @param loginstr
	 *            ���Ż�绰
	 * @param password
	 *            ����
	 * @param session
	 * @return
	 */
	@RequestMapping("/Login")
	public String Login(String loginstr, String password, HttpSession session) {
		List<Map> staffList = staffSer.getLogin(loginstr, password);
		if (staffList.size() > 0) {
			session.setAttribute("staffList", staffList);
			return "BackShowDept";
		}
		return "forward:/BackLogin.jsp";

	}

	@RequestMapping("/staAll")
	@ResponseBody
	public List<Map> getAll() {
		List<Map> list = staffSer.getAllSta();
		return list;

	}

}
