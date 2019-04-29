package com.dao.sql.cn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.common.cn.ConnectMysql;
import com.common.cn.Example;
import com.dao.cn.UserDaoImpl;
import com.entity.cn.User;

public class UserDao implements UserDaoImpl {

	@Override
	public boolean insert(User user) {
		PreparedStatement statement = null;
		ConnectMysql ctsql = new ConnectMysql();
		Connection ct = ctsql.mysqlconnect();
		String sql = "insert into nthq_wyw_user (id,name,account,password,phoneNum,email,createtime,effective,cardnum,status,userdetail) VALUES (?,?,?,?,?,?,?,?,?,?,?)"; 
		try {
			statement = ct.prepareStatement(sql);
			statement.setNString(1,user.getId());
			statement.setNString(2,user.getName());
			statement.setNString(3,user.getAccount());
			statement.setNString(4,user.getPassword());
			statement.setNString(5,user.getPhoneNum());
			statement.setNString(6,user.getEmail());
			statement.setNString(7,user.getCreatetime());
			statement.setNString(8,user.getEffective());
			statement.setNString(9,user.getCardnum());
			statement.setNString(10,user.getStatus());
			statement.setNString(11,user.getUserdetail());
		    boolean rst = statement.execute();
		    return rst;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ctsql.mysqlclose(statement, ct);
		}
	}

	@Override
	public boolean detele(User user) {
		PreparedStatement statement = null;
		ConnectMysql ctsql = new ConnectMysql();
		Connection ct = ctsql.mysqlconnect();
		String sql = "delete from nthq_wyw_user where id = ?"; 
		try {
			statement = ct.prepareStatement(sql);
			statement.setNString(1,user.getId());
		    boolean rst = statement.execute();
		    return rst;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ctsql.mysqlclose(statement, ct);
		}
	}

	@Override
	public boolean update(User user) {
		PreparedStatement statement = null;
		ConnectMysql ctsql = new ConnectMysql();
		Connection ct = ctsql.mysqlconnect();
		String sql = "update nthq_wyw_user set name=?,account=?,password=?,phoneNum=?,email=?,effective=?,cardnum=?,status=?,userdetail=?,imgpath=? where id=?"; 
		try {
			statement = ct.prepareStatement(sql);
			statement.setNString(1,user.getName());
			statement.setNString(2,user.getAccount());
			statement.setNString(3,user.getPassword());
			statement.setNString(4,user.getPhoneNum());
			statement.setNString(5,user.getEmail());
			statement.setNString(6,user.getEffective());
			statement.setNString(7,user.getCardnum());
			statement.setNString(8,user.getStatus());
			statement.setNString(9,user.getUserdetail());
			statement.setNString(10,user.getImgpath());
			statement.setNString(11,user.getId());
		    boolean rst = statement.execute();
		    return rst;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ctsql.mysqlclose(statement, ct);
		}
	}

	@Override
	public User findByID(String id) {
		User user = new User();
		ResultSet rs = null;
		PreparedStatement statement = null;
		ConnectMysql ctsql = new ConnectMysql();
		Connection ct = ctsql.mysqlconnect();
		String sql = "select * from nthq_wyw_user where id = ? "; 
		try {
			statement = ct.prepareStatement(sql);
			statement.setNString(1,id);
			rs = statement.executeQuery();
			while(rs.next()){
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setAccount(rs.getString("account"));
				user.setPassword(rs.getString("password"));
				user.setPhoneNum(rs.getString("phoneNum"));
				user.setEmail(rs.getString("email"));
				user.setCreatetime(rs.getString("createtime"));
				user.setEffective(rs.getString("effective"));
				user.setCardnum(rs.getString("cardnum"));
				user.setStatus(rs.getString("status"));
				user.setUserdetail(rs.getString("userdetail"));
				user.setImgpath(rs.getString("imgpath"));
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ctsql.mysqlclose(rs,statement, ct);
		}
		return user;
	}

	@Override
	public List<User> findAll(Example userExample) {
		List<User> list = new ArrayList<User>();
		ResultSet rs = null;
		PreparedStatement statement = null;
		ConnectMysql ctsql = new ConnectMysql();
		Connection ct = ctsql.mysqlconnect();
		String sql = "select * from nthq_wyw_user where ";
		sql += userExample.where;
		try {
			statement = ct.prepareStatement(sql);
			rs = statement.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setAccount(rs.getString("account"));
				user.setPassword(rs.getString("password"));
				user.setPhoneNum(rs.getString("phoneNum"));
				user.setEmail(rs.getString("email"));
				user.setCreatetime(rs.getString("createtime"));
				user.setEffective(rs.getString("effective"));
				user.setCardnum(rs.getString("cardnum"));
				user.setStatus(rs.getString("status"));
				user.setUserdetail(rs.getString("userdetail"));
				user.setImgpath(rs.getString("imgpath"));
			    list.add(user);
			    user = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			ctsql.mysqlclose(rs, statement, ct);
		}
		return list;
	}

	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<User>();
		ResultSet rs = null;
		PreparedStatement statement = null;
		ConnectMysql ctsql = new ConnectMysql();
		Connection ct = ctsql.mysqlconnect();
		String sql = "select * from nthq_wyw_user ";
		try {
			statement = ct.prepareStatement(sql);
			rs = statement.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setAccount(rs.getString("account"));
				user.setPassword(rs.getString("password"));
				user.setPhoneNum(rs.getString("phoneNum"));
				user.setEmail(rs.getString("email"));
				user.setCreatetime(rs.getString("createtime"));
				user.setEffective(rs.getString("effective"));
				user.setCardnum(rs.getString("cardnum"));
				user.setStatus(rs.getString("status"));
				user.setUserdetail(rs.getString("userdetail"));
				user.setImgpath(rs.getString("imgpath"));
				list.add(user);
				user = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			ctsql.mysqlclose(rs, statement, ct);
		}
		return list;
	}

}
