package com.aaa.Dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.aaa.Entity.Staff;

@Repository
public interface IStaffDao {
	public List<Map> getAllStaff(@Param("s") Staff s,
			@Param("size") Integer pageSize, @Param("curr") Integer currPage);

	public int updStaff(Staff s);

	public List<Map> getAllSta();

	public List<Map> getLogin(@Param("str") String loginstr,
			@Param("pas") String password);
}
