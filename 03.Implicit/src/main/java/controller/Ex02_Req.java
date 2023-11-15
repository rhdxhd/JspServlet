package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex02")
public class Ex02_Req extends HttpServlet {
	RequestDispatcher rd;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EX02까지옴");
		//DAO, JDBC이용 로그인 확인 => Model
		//req ( form 태그, a태그 등으로 들어오는 파라메터를 가지고 있다 ) getParameter <- String
		String email = req.getParameter("email");
		System.out.println(email);
		//email과pw가 각각 admin, admin1234이면 ex03req.jsp로 넘어가고, 그게 아니라면 ex02req.jsp가 실행되게 처리해보기.
		String pw = req.getParameter("pw");
		System.out.println(pw);
		
		if("admin".equals(email)&&"admin1234".equals(pw)) {
			rd = req.getRequestDispatcher("request/ex03req.jsp");
		}else {
			rd = req.getRequestDispatcher("request/ex02req.jsp");
		}
			
		//Attribute
		req.setAttribute("key", "data");
			
		//ArrayList로 String데이터 5건을 묶어서 setAttribute를 통해
		//jsp로 전송. ( jsp엥서는 받아서 출력)
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		req.setAttribute("list", list);
			
		rd.forward(req, resp);	
	}
}
//		rd = req.getRequestDispatcher("request/ex02req.jsp");
//		rd.forward(req, resp);
		
		
		
		
		
		

