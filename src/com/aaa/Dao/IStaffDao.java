package com.aaa.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.aaa.Entity.Staff;
@Repository
public interface IStaffDao {

	public List<Map> getAllStaff(Staff s, Integer jobnum, String name,
			Integer pageSize, Integer currPage);
}
