package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//정확한 구분자를 통해 해당 구분자로 끝나는 모든 요청을 받게 만드는게 가능함.
//String으로 하나의 문자열을 url맵핑으로 쓰는경우. "/list"
//String 배열을 이용하여 .. @WebServlet(name = "usertbl", urlPatterns = {"/list", "/.." ...}
// "/"를 제외하고 -> *.te
//insert.te , list.te , update.te.....

@WebServlet("*.te")
public class Controller_Servlet extends HttpServlet {

	
	RequestDispatcher rd; //서블릿에서 다시 페이지로 요청을 넘길때 사용됨. (Forward)
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet 화면"+ " "+ req.getServletPath());
		
		if(req.getServletPath().equals("/list.te")) {
		rd = req.getRequestDispatcher("test/list.jsp");
				
		req.setAttribute("data", "serVletData");
		req.setAttribute("data2", "123");
		}else if (req.getServletPath().equals("/new.te")) {
			rd= req.getRequestDispatcher("test/new.jsp");
		}else if (req.getServletPath().equals("/insert.te")) {
			System.out.println("인서트 처리" + req.getParameter("id"));
			rd = req.getRequestDispatcher("test/update.jsp");
			//받은 id와 pw값을 test/update.jsp로 보내고 출려해보기.
			req.setAttribute("id", req.getParameter("id"));
			req.setAttribute("pw", req.getParameter("pw"));  //${id}
		}else if (req.getServletPath().equals("/delete.te")) {  //요청 받음
			System.out.println("여기까지 delete" + req.getParameter("deleteid"));
			resp.sendRedirect("list.te");
			return;
		 
		}else if (req.getServletPath().equals("/initialList.te")) {  //요청 받음
			System.out.println("initial");
			String str = req.getParameter("initial");
			
			
			if("initial".equals("list.abc")) {
				rd = req.getRequestDispatcher(".jsp");
			}else {
				rd = req.getRequestDispatcher(".jsp");
			}	
			
			
			
			
			
	    }else {
			resp.getWriter().println("오류");
			
		}
		
		
		rd.forward(req, resp);
	}
		
	

}
