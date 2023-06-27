package com.stock;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindStockValue
 */
@WebServlet("/FindStockValue")
public class FindStockValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindStockValue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stockvalue=request.getParameter("stock");
		String info=FindJson.getJsonInfo(stockvalue);
		new FindJson().log();
	PrintWriter out=response.getWriter();
		out.println(info);
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	//	request.setAttribute("message", stockvalue);
	//	request.getRequestDispatcher("index.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
