package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import customer.CustomerDAO;
import customer.CustomerVO;


@WebServlet("*.cu")
public class CustomerController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		CustomerDAO dao = new CustomerDAO();
		if(req.getServletPath().equals("/select.cu")) {
			//common. config.xml
			//		  mapper.xml
			// 		  DAO <-(MybatisConnection)
			
			String query = req.getParameter("query");
			System.out.println(query);
			List<CustomerVO> list = dao.select(query);
			//MVC(WEB) : Request.setAttrivute ->jsp..
			//new Gson().toJson(list);
			resp.getWriter().print(new Gson().toJson(list));			
		}else if(req.getServletPath().equals("/delete.cu")) {
			System.out.println(req.getParameter("customer_id"));
			int customer_id = Integer.parseInt(req.getParameter("customer_id"));
			dao.delete(customer_id);
			//resp.getWriter().print(  );//<-결과 출력은 추후
		}else if(req.getServletPath().equals("/update.cu")) {
			CustomerVO vo = new Gson().fromJson(req.getParameter("vo"), CustomerVO.class);
			dao.update(vo);
		}else if(req.getServletPath().equals("/insert.cu")) {
			CustomerVO vo = new Gson().fromJson(req.getParameter("vo"), CustomerVO.class);
			dao.insert(vo);
		
			//TypeTo
			//vo를 이용해서 update가 되게 만들고, update후 새로고침도 되게 처리해보기.		
		}	
	}
}
