package com.service.cn;

import java.util.List;

import com.dao.sql.cn.DiffRPDao;
import com.entity.cn.DiffRP;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;;

public class Table_DiffRPSV {
	
	public JSONArray queryList() {
		DiffRPDao dao = new DiffRPDao();
		List<DiffRP> list = dao.findAll();
		JSONArray array = new JSONArray();
		for (DiffRP diffRP : list) {
			JSONObject json = new JSONObject();
			json.put("UUID", diffRP.getUUID());
			json.put("U9ID", diffRP.getU9ID());
			json.put("DocType", diffRP.getDocType());
			json.put("Org", diffRP.getOrg());
			json.put("OrgName", diffRP.getOrgName());
			json.put("Currency", diffRP.getCurrency());
			json.put("BusinessDate", diffRP.getBusinessDate());
			json.put("Dept", diffRP.getDept());
			json.put("Item", diffRP.getItem());
			json.put("DocNo", diffRP.getDocNo());
			json.put("OrderBy", diffRP.getOrderBy());
			json.put("Contract", diffRP.getContract());
			json.put("DocQty", diffRP.getDocQty());
			json.put("BLQty", diffRP.getBLQty());
			json.put("PriceType", diffRP.getPriceType());
			json.put("TemPrice", diffRP.getTemPrice());
			json.put("SpotPrice", diffRP.getSpotPrice());
			json.put("MaPrice", diffRP.getMaPrice());
			json.put("WeekMny", diffRP.getWeekMny());
			json.put("PreEndDate", diffRP.getPreEndDate());
			json.put("DiffType", diffRP.getDiffType());
			json.put("BaPrice", diffRP.getBaPrice());
			json.put("DiffBaMny", diffRP.getDiffBaMny());
			json.put("PreDiffDate", diffRP.getPreDiffDate());
			json.put("PayMny", diffRP.getPayMny());
			json.put("PayBank", diffRP.getPayBank());
			json.put("PayDate", diffRP.getPayDate());
			json.put("PayDocNo", diffRP.getPayDocNo());
			json.put("ActBaType", diffRP.getActBaType());
			json.put("ActRecMny", diffRP.getActRecMny());
			json.put("ActDiffDate", diffRP.getActDiffDate());
			json.put("AgentOrg", diffRP.getAgentOrg());
			json.put("Memo", diffRP.getMemo());
			json.put("IfEnd", diffRP.getIfEnd());
			System.out.println(json.toString());
			array.add(json);
			json = null;
		}
		
		return array;
	}
	
}
