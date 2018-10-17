package com.aaa.Entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Dept {
	private Integer id;
	private Integer departnmu;
	private String deptname;
	@DateTimeFormat(pattern = "yy-MM-dd")
	private Date addtime;
	private Integer statu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepartnmu() {
		return departnmu;
	}

	public void setDepartnmu(Integer departnmu) {
		this.departnmu = departnmu;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Integer getStatu() {
		return statu;
	}

	public void setStatu(Integer statu) {
		this.statu = statu;
	}

}
