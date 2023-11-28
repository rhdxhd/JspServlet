package controller;

import java.io.IOException;
import java.nio.file.Path;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hr.HrDAO;


@WebServlet("*.hr")
public class HrController extends HttpServlet {
	RequestDispatcher rd;
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HrDAO dao = new HrDAO();
		
		
		//String path = req.getServletPath().replace("/", "");
		if(req.getServletPath().equals("/list.hr")) {
			rd = req.getRequestDispatcher("hr/list.jsp");
			req.setAttribute("list", dao.select());
			rd.forward(req, resp);
			
		}
	}
	
}
