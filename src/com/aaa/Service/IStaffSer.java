package com.aaa.Service;

import java.util.List;
import java.util.Map;

import com.aaa.Entity.Staff;

/**
 * 
 * @����ϼ Administrator 2018��10��17��
 */
public interface IStaffSer {

	List<Map> getAllStaff(Staff s, Integer jobnum, Integer pageSize);

	int updStaff(Staff s);

	List<Map> getAllSta();

	List<Map> getLogin(String loginstr, String password);

}
