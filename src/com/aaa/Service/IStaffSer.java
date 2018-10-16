package com.aaa.Service;

import java.util.List;
import java.util.Map;

import com.aaa.Entity.Staff;

public interface IStaffSer {

	List<Map> getAllStaff(Staff s, Integer jobnum, String name,
			Integer pageSize, Integer currPage);
	
}
