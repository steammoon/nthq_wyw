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
		String sql = "insert into nthq_wyw_user (id,name,account,password,phoneNum,email,createtime,effective,cardnum,status,userdetail,imgpath,sex,education,marstatus,nickname,birthday,byear,bmonth,bdate,constellation,nation,live_province,live_city,live_area,address,home_province,home_city,home_area) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
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
			statement.setNString(12,user.getImgpath());
			statement.setNString(13,user.getSex());
			statement.setNString(14,user.getEducation());
			statement.setNString(15,user.getMarstatus());
			statement.setNString(16,user.getNickname());
			statement.setNString(17,user.getBirthday());
			statement.setNString(18,user.getByear());
			statement.setNString(19,user.getBmonth());
			statement.setNString(20,user.getBdate());
			statement.setNString(21,user.getConstellation());
			statement.setNString(22,user.getNation());
			statement.setNString(23,user.getLive_province());
			statement.setNString(24,user.getLive_city());
			statement.setNString(25,user.getLive_area());
			statement.setNString(26,user.getAddress());
			statement.setNString(27,user.getHome_province());
			statement.setNString(28,user.getHome_city());
			statement.setNString(29,user.getHome_area());
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
		String sql = "update nthq_wyw_user set name=?,account=?,password=?,phoneNum=?,email=?,effective=?,cardnum=?,status=?,userdetail=?,imgpath=?,sex=?,education=?,marstatus=?,nickname=?,birthday=?,byear=?,bmonth=?,bdate=?,constellation=?,nation=?,live_province=?,live_city=?,live_area=?,address=?,home_province=?,home_city=?,home_area=? where id=?"; 
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
			statement.setNString(11,user.getSex());
			statement.setNString(12,user.getEducation());
			statement.setNString(13,user.getMarstatus());
			statement.setNString(14,user.getNickname());
			statement.setNString(15,user.getBirthday());
			statement.setNString(16,user.getByear());
			statement.setNString(17,user.getBmonth());
			statement.setNString(18,user.getBdate());
			statement.setNString(19,user.getConstellation());
			statement.setNString(20,user.getNation());
			statement.setNString(21,user.getLive_province());
			statement.setNString(22,user.getLive_city());
			statement.setNString(23,user.getLive_area());
			statement.setNString(24,user.getAddress());
			statement.setNString(25,user.getHome_province());
			statement.setNString(26,user.getHome_city());
			statement.setNString(27,user.getHome_area());
			statement.setNString(28,user.getId());
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
				user.setSex(rs.getString("sex"));
				user.setEducation(rs.getString("education"));
				user.setMarstatus(rs.getString("marstatus"));
				user.setNickname(rs.getString("nickname"));
				user.setBirthday(rs.getString("birthday"));
				user.setByear(rs.getString("byear"));
				user.setBmonth(rs.getString("bmonth"));
				user.setBdate(rs.getString("bdate"));
				user.setConstellation(rs.getString("constellation"));
				user.setNation(rs.getString("nation"));
				user.setLive_province(rs.getString("live_province"));
				user.setLive_city(rs.getString("live_city"));
				user.setLive_area(rs.getString("live_area"));
				user.setAddress(rs.getString("address"));
				user.setHome_province(rs.getString("home_province"));
				user.setHome_city(rs.getString("home_city"));
				user.setHome_area(rs.getString("home_area"));
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
				user.setSex(rs.getString("sex"));
				user.setEducation(rs.getString("education"));
				user.setMarstatus(rs.getString("marstatus"));
				user.setNickname(rs.getString("nickname"));
				user.setBirthday(rs.getString("birthday"));
				user.setByear(rs.getString("byear"));
				user.setBmonth(rs.getString("bmonth"));
				user.setBdate(rs.getString("bdate"));
				user.setConstellation(rs.getString("constellation"));
				user.setNation(rs.getString("nation"));
				user.setLive_province(rs.getString("live_province"));
				user.setLive_city(rs.getString("live_city"));
				user.setLive_area(rs.getString("live_area"));
				user.setAddress(rs.getString("address"));
				user.setHome_province(rs.getString("home_province"));
				user.setHome_city(rs.getString("home_city"));
				user.setHome_area(rs.getString("home_area"));
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
				user.setSex(rs.getString("sex"));
				user.setEducation(rs.getString("education"));
				user.setMarstatus(rs.getString("marstatus"));
				user.setNickname(rs.getString("nickname"));
				user.setBirthday(rs.getString("birthday"));
				user.setByear(rs.getString("byear"));
				user.setBmonth(rs.getString("bmonth"));
				user.setBdate(rs.getString("bdate"));
				user.setConstellation(rs.getString("constellation"));
				user.setNation(rs.getString("nation"));
				user.setLive_province(rs.getString("live_province"));
				user.setLive_city(rs.getString("live_city"));
				user.setLive_area(rs.getString("live_area"));
				user.setAddress(rs.getString("address"));
				user.setHome_province(rs.getString("home_province"));
				user.setHome_city(rs.getString("home_city"));
				user.setHome_area(rs.getString("home_area"));
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
