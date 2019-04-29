package com.service.cn;
import java.util.List;

import com.common.cn.Example;
import com.dao.sql.cn.UserDao;
import com.entity.cn.User;

public class UserSV {
	
	public Integer login(String account,String password) throws Exception {
		UserDao userDao = new UserDao();
		User user = new User();
		Example example = new Example();
		example.where("account",account);
		example.where("password",password);
		List<User> list = userDao.findAll(example);
		Example example1 = new Example();
		example1.where("account",account);
		List<User> list1 = userDao.findAll(example1);
		if(list1.size()<=0) {
			return 2;
		}
		else if(list.size()<=0) {
			return 1;
		}
		else {
			user = list.get(0);
			user.setStatus("0");
			return 0;
		}
	}
	
	public Integer UpImgPath(String account,String imgpath) {
		UserDao dao = new UserDao();
		User user =new User();
		Example example = new Example();
		example.where("account",account);
		List<User> list = dao.findAll(example);
		if(list.size()<=0) {
			return 1;
		}
		else {
			user = list.get(0);
			user.setImgpath(imgpath);
			dao.update(user);
			return 0;
		}
	}
	
	public User findAll(String account) {
		UserDao dao = new UserDao();
		User user =new User();
		Example example = new Example();
		example.where("account",account);
		List<User> list = dao.findAll(example);
		if(list.size()<=0) {
			return null;
		}
		else {
			user = list.get(0);
			return user;
		}
	}
}
