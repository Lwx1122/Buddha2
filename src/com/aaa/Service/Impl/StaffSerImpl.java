package com.aaa.Service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.Dao.IStaffDao;
import com.aaa.Entity.Staff;
import com.aaa.Service.IStaffSer;
@Service
public class StaffSerImpl implements IStaffSer {
	@Autowired
	private IStaffDao staffDao;
	@Override
	public List<Map> getAllStaff(Staff s, Integer pageSize, Integer currPage) {
		// TODO Auto-generated method stub
		return staffDao.getAllStaff(s,pageSize,currPage);
	}
	@Override
	public int updStaff(Staff s) {
		// TODO Auto-generated method stub
		return staffDao.updStaff(s);
	}

}
