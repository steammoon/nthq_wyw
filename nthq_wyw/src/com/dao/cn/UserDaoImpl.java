package com.dao.cn;

import java.util.List;

import com.entity.cn.User;
import com.entity.cn.UserExample;

public interface UserDaoImpl {
	boolean insert(User user);
	boolean detele(User user);
	boolean update(User user);
	User findByID(String id);
	List<User> findAll(UserExample userExample);
	List<User> findAll();

}
