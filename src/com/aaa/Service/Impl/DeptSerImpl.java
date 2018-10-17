package com.aaa.Service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.Dao.IDeptDao;
import com.aaa.Service.IDeptSer;

@Service
public class DeptSerImpl implements IDeptSer {
	@Autowired
	private IDeptDao deptDao;

	@Override
	public List<Map> getAllDept() {
		// TODO Auto-generated method stub
		return deptDao.getAllDept();
	}

}
