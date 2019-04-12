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
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean update(DiffRP diffRP) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public DiffRP findByID(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<DiffRP> findAll(Example userExample) {
		// TODO 自动生成的方法存根
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
				if (rs.getString("单据类型") != null) {
				    proxy.setDocType(rs.getString("单据类型"));
				}
				if (rs.getString("组织ID") != null) {
				    proxy.setOrg(rs.getString("组织ID"));
				}
				if (rs.getString("组织") != null) {
				    proxy.setOrgName(rs.getString("组织"));
				}
				if (rs.getString("币种") != null) {
				    proxy.setCurrency(rs.getString("币种"));
				}
				if (rs.getString("成交日") != null) {
				    proxy.setBusinessDate(rs.getString("成交日"));
				}
				if (rs.getString("部门") != null) {
				    proxy.setDept(rs.getString("部门"));
				}
				if (rs.getString("品种") != null) {
				    proxy.setItem(rs.getString("品种"));
				}
				if (rs.getString("订单号") != null) {
				    proxy.setDocNo(rs.getString("订单号"));
				}
				if (rs.getString("供应商_客户") != null) {
				    proxy.setOrderBy(rs.getString("供应商_客户"));
				}
				if (rs.getString("合同号") != null) {
				    proxy.setContract(rs.getString("合同号"));
				}
				if (rs.getString("合同数量") != null) {
				    proxy.setDocQty(rs.getString("合同数量"));
				}
				if (rs.getString("提单数量") != null) {
				    proxy.setBLQty(rs.getString("提单数量"));
				}
				if (rs.getString("定价类型") != null) {
				    proxy.setPriceType(rs.getString("定价类型"));
				}
				if (rs.getString("暂定价") != null) {
				    proxy.setTemPrice(rs.getString("暂定价"));
				}
				if (rs.getString("点价") != null) {
				    proxy.setSpotPrice(rs.getString("点价"));
				}
				if (rs.getString("每周五市场价") != null) {
				    proxy.setMaPrice(rs.getString("每周五市场价"));
				}
				if (rs.getString("当周未实现盈亏") != null) {
				    proxy.setWeekMny(rs.getString("当周未实现盈亏"));
				}
				if (rs.getString("预计定价日") != null) {
				    proxy.setPreEndDate(rs.getString("预计定价日"));
				}
				if (rs.getString("差价结算方式") != null) {
				    proxy.setDiffType(rs.getString("差价结算方式"));
				}
				if (rs.getString("结算价") != null) {
				    proxy.setBaPrice(rs.getString("结算价"));
				}
				if (rs.getString("结算差价") != null) {
				    proxy.setDiffBaMny(rs.getString("结算差价"));
				}
				if (rs.getString("预计差价收付日期") != null) {
				    proxy.setPreDiffDate(rs.getString("预计差价收付日期"));
				}
				if (rs.getString("付汇金额") != null) {
				    proxy.setPayMny(rs.getString("付汇金额"));
				}
				if (rs.getString("付汇银行") != null) {
				    proxy.setPayBank(rs.getString("付汇银行"));
				}
				if (rs.getString("付汇日期") != null) {
				    proxy.setPayDate(rs.getString("付汇日期"));
				}
				if (rs.getString("支付请款单号") != null) {
				    proxy.setPayDocNo(rs.getString("支付请款单号"));
				}
				if (rs.getString("实际结算方式") != null) {
				    proxy.setActBaType(rs.getString("实际结算方式"));
				}
				if (rs.getString("实际金额_收") != null) {
				    proxy.setActRecMny(rs.getString("实际金额_收"));
				}
				if (rs.getString("实际金额_付") != null) {
				    proxy.setActPayMny(rs.getString("实际金额_付"));
				}
				if (rs.getString("差价收付日期") != null) {
				    proxy.setActDiffDate(rs.getString("差价收付日期"));
				}
				if (rs.getString("代付组织") != null) {
				    proxy.setAgentOrg(rs.getString("代付组织"));
				}
				if (rs.getString("备注用途") != null) {
				    proxy.setMemo(rs.getString("备注用途"));
				}
				if (rs.getString("是否完结") != null) {
				    proxy.setIfEnd(rs.getString("是否完结"));
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
