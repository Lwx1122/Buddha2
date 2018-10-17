package com.aaa.Inter;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @李文霞 Administrator 2018年10月17日
 */
public class BackLoginInter implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object o) throws Exception {
		HttpSession session = req.getSession();
		List<Map> staffList = (List<Map>) session.getAttribute("staffList");
		String contextPath = req.getContextPath();
		System.out.println(staffList.size());
		if (staffList.size() > 0) {
			return true;
		}
		resp.sendRedirect(contextPath + "/BackLogin.jsp");
		return false;
	}

}
