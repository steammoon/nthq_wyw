package com.common.cn;

import java.util.List;

public class JsonUtil {
	
public String jsonstr ;
	
	public JsonUtil() {
		jsonstr="{";
	}
	
	public void add(String obj,String str) {
		jsonstr += "\"" + obj + "\":\"" + str + "\",";
	}
	
	public void addInt(String obj, int str)
    {
		jsonstr += "\"" + obj + "\":" + String.valueOf(str) + ",";
    }

    public void addlist(String obj, List<String> str)
    {
    	jsonstr +="\""+obj+"\":[";
        for (int i = 0; i < str.size(); i++)
        {
        	jsonstr += str.get(i) + ",";
        }
        jsonstr = jsonstr.substring(0,jsonstr.length() - 1);
        jsonstr += "],";
    }

    public void close()
    {
    	jsonstr = jsonstr.substring(0,jsonstr.length() - 1);
    	jsonstr += "}";
    }

}
