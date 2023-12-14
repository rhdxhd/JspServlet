package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import member.MemberDAO;
import member.MemberService;
import member.MemberVO;

@WebServlet("*.me")
public class MemberController extends HttpServlet {

	MemberService service;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println(req.getParameter("user_id"));
//		System.out.println(req.getParameter("social"));
		
		
		if(req.getServletPath().equals("/login.me")) {
			System.out.println(req.getParameter("user_id"));
			System.out.println(req.getParameter("user_pw"));
			
			
			service = new MemberDAO();
			MemberVO vo = new MemberVO();
			vo.setUser_id(req.getParameter("user_id"));
			vo.setUser_pw(req.getParameter("user_pw"));
			vo.setSocial(req.getParameter("social"));
			
			//service를 이용하여 member_login메소드를 호출하고 그 결과를 다시 MemberVo에 담아보기. ( SELECT 해오기 )
			vo = service.member_login(vo);
		
			
			System.out.println(vo.getName());
			
			
			resp.getWriter().println(new Gson().toJson(vo));
		}
	}
	

}











//package controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.google.gson.Gson;
//
//import member.MemberDAO;
//import member.MemberService;
//import member.MemberVO;
//
//@WebServlet("*.me")
//public class MemberController extends HttpServlet {
//    MemberService service;
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getParameter("user_id"));
//        if(req.getServletPath().equals("/login.me")) {
//            service = new MemberDAO();
//            MemberVO vo = new MemberVO();
//            vo.setUser_id(req.getParameter("user_id"));
//            vo.setUser_pw(req.getParameter("user_pw"));
//            vo = service.member_login(vo);
//            resp.getWriter().println(new Gson().toJson(vo));
//        }
//    }
//}
