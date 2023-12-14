package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sg.SgDAO;
import sg.SgVO;

@WebServlet("*.sg")
public class SgController extends HttpServlet {
	
	RequestDispatcher rd;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		SgDAO dao = new SgDAO();

		if (req.getServletPath().equals("/list.sg")) {
			rd = req.getRequestDispatcher("sg/list.jsp");
			req.setAttribute("list", dao.select());
			
			rd.forward(req, resp);
		
			
		}else if(path.equals("/delete.sg")) {
			int employee_id = Integer.parseInt(req.getParameter("employee_id"));
			dao.delete(employee_id);
			resp.sendRedirect("list.sg");
			
			
			
		}else if(path.equals("/insert.sg")) {
			SgVO vo = new SgVO();
			vo.setLast_name(req.getParameter("last_name"));
			vo.setHire_date(req.getParameter("hire_date"));
			vo.setSalary(Integer.parseInt(req.getParameter("salary")));
			vo.setEmail(req.getParameter("email"));
			dao.insert(vo);
			resp.sendRedirect("list.sg");	
			
			
		}else if(path.equals("/update.sg"))	{
			SgVO vo = new SgVO();
			vo.setEmployee_id(Integer.parseInt(req.getParameter("employee_id")));
			vo.setLast_name(req.getParameter("last_name"));
			vo.setHire_date(req.getParameter("hire_date"));
			//System.out.println(req.getParameter("hire_date"));
			
			vo.setSalary(Integer.parseInt(req.getParameter("salary")));
			vo.setEmail(req.getParameter("email"));
			dao.update(vo);
			resp.sendRedirect("list.sg");
			
			
	 
			
			
		}
	}
}