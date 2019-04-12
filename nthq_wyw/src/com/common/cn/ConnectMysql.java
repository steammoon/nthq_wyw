package com.common.cn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMysql {
	// mysql 数据库连接
	static final String FN = "com.mysql.jdbc.Driver";
	static final String HOST = "localhost:3306";
	static final String DATABASE = "mysql";
	static final String USER = "root";
	static final String PASS = "Abcd1234";
	static final String URL = "jdbc:mysql://" + HOST + "/" + DATABASE + "?useSSL=false&useUnicode=true&characterEncoding=UTF-8";
	//static final String URL = "jdbc:mysql://127.0.0.1:3306/demo?useSSL=false";

	Connection ct = null;

	public Connection mysqlconnect () {

		try {
			Class.forName(ConnectMysql.FN);
			ct = DriverManager.getConnection(ConnectMysql.URL,USER,PASS);
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("（HW）数据库连接失败！");
		}
		return ct;
	}


	public void mysqlclose(Statement ps,Connection ct) {
		try {
			ps.close();
			ct.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}


	}

	public void mysqlclose(PreparedStatement ps,Connection ct) {
		try {
			ps.close();
			ct.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}


	}

	public void mysqlclose(ResultSet rs,Statement ps,Connection ct) {
		try {
			rs.close();
			ps.close();
			ct.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}


	}

}
