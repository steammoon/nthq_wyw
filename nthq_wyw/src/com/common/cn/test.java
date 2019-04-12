package com.common.cn;

import java.util.List;

import com.dao.sql.cn.DiffRPDao;
import com.entity.cn.DiffRP;
import com.service.cn.Table_DiffRPSV;
import com.service.cn.UserSV;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class test {

	public static void main(String[] args) throws Exception {
		Table_DiffRPSV sv = new Table_DiffRPSV();
		JSONArray json = sv.queryList();
		System.out.println(json.toString());
	}
}
