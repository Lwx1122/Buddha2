package com.aaa.Service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.aaa.Dao.IClientDao;
import com.aaa.Service.IClientSer;
@Service
public class ClientSerImpl implements IClientSer {
	@Autowired
	private IClientDao clientDao;
	@Override
	public List<Map> getAll() {
		// TODO Auto-generated method stub
		return clientDao.getAll();
	}

}
