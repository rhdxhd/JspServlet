package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	//1.url을 통해 파라메터를 입력받아 4가지 동작이 전부 잘 되는지 테스트
	//2.jsp페이지에 폼태그나 a태그 등을 이용하여 4가지 동작이 잘 되는지 테스트(입력한 값 기준으로)

import mybatis.MybatisTblDAO;
import mybatis.MybatisTblVO;



@WebServlet("*.mytbl")
public class MybatisTblController extends HttpServlet {
	RequestDispatcher rd;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet 화면");
		String path = req.getServletPath();
		MybatisTblDAO dao = new MybatisTblDAO();
		
	
		if(path.equals("/insert.mytbl")) {  //CREATE
			//1.DAO호출
			//2.페이지 요청(URL 요청)
			MybatisTblVO vo = new MybatisTblVO();
			vo.setCol1(req.getParameter("col1"));
			vo.setCol2(req.getParameter("col2"));
			vo.setCol3(req.getParameter("col3"));
			
			System.out.println(dao.insert(vo));
			
			
			rd = req.getRequestDispatcher("mybatis/insert.jsp");
			System.out.println(req.getParameter("col1")+req.getParameter("col2")+req.getParameter("col3"));
			

		}else if(path.equals("/update.mytbl")) { //U
			//1.DAO호출
			//2.페이지 요청(URL 요청)
			MybatisTblVO vo = new MybatisTblVO();
			vo.setCol1(req.getParameter("col1"));
			vo.setCol2(req.getParameter("col2"));
			vo.setCol3(req.getParameter("col3"));
			
			
			System.out.println(dao.update(vo));
			resp.sendRedirect("select.mytbl");
			
			
		}else if(path.equals("/delete.mytbl")) { //D
			//1.DAO호출
			//2.페이지 요청(URL 요청)
			
			MybatisTblVO vo = new MybatisTblVO();
			vo.setCol1(req.getParameter("col1"));
		
			System.out.println(dao.delete(vo));
			resp.sendRedirect("select.mytbl");
			
			
			
		}else if(path.equals("/select.mytbl")) { //READ
			
			req.setAttribute("list", dao.select());
			
			rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
		}
	}
	

}
