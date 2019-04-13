package com.servlet.cn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.cn.Table_DiffRPSV;
import com.service.cn.UserSV;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class Query_DiffRPSV
 */
@WebServlet("/Query_DiffRPSV")
public class Query_DiffRPSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query_DiffRPSV() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Table_DiffRPSV sv = new Table_DiffRPSV();
		JSONArray json = new JSONArray(); 
		try {
			json = sv.queryList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(json);
			out.flush();
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Table_DiffRPSV sv = new Table_DiffRPSV();
		JSONArray json = new JSONArray();
		try {
			json  = sv.queryList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(json);
			out.flush();
		} 
	}

}
