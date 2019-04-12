package com.dao.cn;

import java.util.List;

import com.common.cn.Example;
import com.entity.cn.DiffRP;

public interface DiffRPDaoImpl {
	boolean insert(DiffRP diffRP);
	boolean update(DiffRP diffRP);
	DiffRP findByID(String id);
	List<DiffRP> findAll(Example userExample);
	List<DiffRP> findAll();

}
