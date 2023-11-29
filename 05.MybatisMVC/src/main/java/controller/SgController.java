package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sg.SgDAO;


@WebServlet("*.sg")
public class SgController extends HttpServlet {
	
	RequestDispatcher rd;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		SgDAO dao = new SgDAO();
		
		if(req.getServletPath().equals("/list.sg")) {
		rd= req.getRequestDispatcher("sg/list.jsp");
		HashMap<String, String> map = new HashMap<>();
		map.put("", req.getParameter(""));
		map.put("", req.getParameter(""));

		
		req.setAttribute("", map.get(""));
		req.setAttribute("", map.get(""));

		
		req.setAttribute("list", dao.select(map));
		
		
		
		
		
		rd.forward(req, resp);
		
		
		
		
		
	}
}
}