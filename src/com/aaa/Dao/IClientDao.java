package com.aaa.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public interface IClientDao {

	List<Map> getAll();

}
