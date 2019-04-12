package com.common.cn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectSqlServer {
	static final String FN = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String HOST = "192.168.1.23:1433";
	static final String DATABASE = "demo";
	static final String USER = "sa";
	static final String PASS = "Abcd1234";
	static final String URL = "jdbc:sqlserver://" + HOST + ";databasename=" + DATABASE;
	//static final String URL = "jdbc:mysql://127.0.0.1:3306/demo?useSSL=false";

	Connection ct = null;

	public Connection sqlserverconnect () {

		try {
			Class.forName(ConnectMysql.FN);
			ct = DriverManager.getConnection(ConnectSqlServer.URL,USER,PASS);
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("��HW�����ݿ�����ʧ�ܣ�");
		}
		if(ct==null){
			System.out.println("���ݿ�����ʧ��");
			System.out.println("-----------------------");
		}else {
			System.out.println("���ݿ����ӳɹ�");
			System.out.println("-----------------------");
		}
		return ct;
	}


	public void sqlserverclose(Statement ps,Connection ct) {
		try {
			ps.close();
			ct.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}


	}

	public void sqlserverclose(PreparedStatement ps,Connection ct) {
		try {
			ps.close();
			ct.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}


	}

	public void sqlserverclose(ResultSet rs,CallableStatement ps,Connection ct) {
		try {
			rs.close();
			ps.close();
			ct.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
