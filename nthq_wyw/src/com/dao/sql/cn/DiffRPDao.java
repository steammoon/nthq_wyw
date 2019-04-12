package com.dao.sql.cn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.common.cn.ConnectSqlServer;
import com.common.cn.Example;
import com.dao.cn.DiffRPDaoImpl;
import com.entity.cn.DiffRP;

public class DiffRPDao implements DiffRPDaoImpl {

	@Override
	public boolean insert(DiffRP diffRP) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean update(DiffRP diffRP) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public DiffRP findByID(String id) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public List<DiffRP> findAll(Example userExample) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public List<DiffRP> findAll() {
		List<DiffRP> list = new ArrayList<DiffRP>();
		ResultSet rs = null;
		CallableStatement statement = null;  
		ConnectSqlServer ctsql = new ConnectSqlServer();
		Connection ct = ctsql.sqlserverconnect();
		String sql = "{call HW_JCK_DiffRP_WX}";
		try {
			statement = ct.prepareCall(sql);
			rs = statement.executeQuery();
			//rs = statement.getResultSet();
			while(rs!=null && rs.next()){
				DiffRP proxy = new DiffRP();
				if (rs.getString("UUID") != null) {
					proxy.setUUID(rs.getString("UUID"));
				}
				if (rs.getString("U9ID") != null) {
				    proxy.setU9ID(rs.getString("U9ID"));
				}
				if (rs.getString("��������") != null) {
				    proxy.setDocType(rs.getString("��������"));
				}
				if (rs.getString("��֯ID") != null) {
				    proxy.setOrg(rs.getString("��֯ID"));
				}
				if (rs.getString("��֯") != null) {
				    proxy.setOrgName(rs.getString("��֯"));
				}
				if (rs.getString("����") != null) {
				    proxy.setCurrency(rs.getString("����"));
				}
				if (rs.getString("�ɽ���") != null) {
				    proxy.setBusinessDate(rs.getString("�ɽ���"));
				}
				if (rs.getString("����") != null) {
				    proxy.setDept(rs.getString("����"));
				}
				if (rs.getString("Ʒ��") != null) {
				    proxy.setItem(rs.getString("Ʒ��"));
				}
				if (rs.getString("������") != null) {
				    proxy.setDocNo(rs.getString("������"));
				}
				if (rs.getString("��Ӧ��_�ͻ�") != null) {
				    proxy.setOrderBy(rs.getString("��Ӧ��_�ͻ�"));
				}
				if (rs.getString("��ͬ��") != null) {
				    proxy.setContract(rs.getString("��ͬ��"));
				}
				if (rs.getString("��ͬ����") != null) {
				    proxy.setDocQty(rs.getString("��ͬ����"));
				}
				if (rs.getString("�ᵥ����") != null) {
				    proxy.setBLQty(rs.getString("�ᵥ����"));
				}
				if (rs.getString("��������") != null) {
				    proxy.setPriceType(rs.getString("��������"));
				}
				if (rs.getString("�ݶ���") != null) {
				    proxy.setTemPrice(rs.getString("�ݶ���"));
				}
				if (rs.getString("���") != null) {
				    proxy.setSpotPrice(rs.getString("���"));
				}
				if (rs.getString("ÿ�����г���") != null) {
				    proxy.setMaPrice(rs.getString("ÿ�����г���"));
				}
				if (rs.getString("����δʵ��ӯ��") != null) {
				    proxy.setWeekMny(rs.getString("����δʵ��ӯ��"));
				}
				if (rs.getString("Ԥ�ƶ�����") != null) {
				    proxy.setPreEndDate(rs.getString("Ԥ�ƶ�����"));
				}
				if (rs.getString("��۽��㷽ʽ") != null) {
				    proxy.setDiffType(rs.getString("��۽��㷽ʽ"));
				}
				if (rs.getString("�����") != null) {
				    proxy.setBaPrice(rs.getString("�����"));
				}
				if (rs.getString("������") != null) {
				    proxy.setDiffBaMny(rs.getString("������"));
				}
				if (rs.getString("Ԥ�Ʋ���ո�����") != null) {
				    proxy.setPreDiffDate(rs.getString("Ԥ�Ʋ���ո�����"));
				}
				if (rs.getString("������") != null) {
				    proxy.setPayMny(rs.getString("������"));
				}
				if (rs.getString("��������") != null) {
				    proxy.setPayBank(rs.getString("��������"));
				}
				if (rs.getString("��������") != null) {
				    proxy.setPayDate(rs.getString("��������"));
				}
				if (rs.getString("֧������") != null) {
				    proxy.setPayDocNo(rs.getString("֧������"));
				}
				if (rs.getString("ʵ�ʽ��㷽ʽ") != null) {
				    proxy.setActBaType(rs.getString("ʵ�ʽ��㷽ʽ"));
				}
				if (rs.getString("ʵ�ʽ��_��") != null) {
				    proxy.setActRecMny(rs.getString("ʵ�ʽ��_��"));
				}
				if (rs.getString("ʵ�ʽ��_��") != null) {
				    proxy.setActPayMny(rs.getString("ʵ�ʽ��_��"));
				}
				if (rs.getString("����ո�����") != null) {
				    proxy.setActDiffDate(rs.getString("����ո�����"));
				}
				if (rs.getString("������֯") != null) {
				    proxy.setAgentOrg(rs.getString("������֯"));
				}
				if (rs.getString("��ע��;") != null) {
				    proxy.setMemo(rs.getString("��ע��;"));
				}
				if (rs.getString("�Ƿ����") != null) {
				    proxy.setIfEnd(rs.getString("�Ƿ����"));
				}
			    list.add(proxy);
			    proxy = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			ctsql.sqlserverclose(rs, statement, ct);
		}
		return list;
	}

}
