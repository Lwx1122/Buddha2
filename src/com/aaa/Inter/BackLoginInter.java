package com.aaa.Inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.Entity.Staff;
/**
 * 
 * @李文霞 Administrator
 *2018年10月17日
 */
public class BackLoginInter implements HandlerInterceptor{

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
		Staff s = (Staff) session.getAttribute("staff");
		String contextPath= req.getContextPath();
		if(s == null){
			resp.sendRedirect(contextPath+"/BackLogin.jsp");
			return false;
		}
		return true;
	}
	
	/*@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object o) throws Exception {
		HttpSession session = req.getSession();
		User u = (User)session.getAttribute("user");
		String contextPath = req.getContextPath();//获取项目路径
		System.out.println(contextPath);
		if(u==null){
			resp.sendRedirect(contextPath+"/index.jsp");
			return false;
		}
		return true;
	}*/

}
