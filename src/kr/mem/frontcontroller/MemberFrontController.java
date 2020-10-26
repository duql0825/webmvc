package kr.mem.frontcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.controller.Controller;
import kr.mem.controller.MemberContentController;
import kr.mem.controller.MemberDeleteController;
import kr.mem.controller.MemberFormController;
import kr.mem.controller.MemberInsertController;
import kr.mem.controller.MemberListController;
import kr.mem.controller.MemberUpdateController;
import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		// *.do
		//클라이언트의 요청을 확인하는 작업
		// frontcontroller는 서블릿으로 만든다
		String urlPath = request.getRequestURI();
		System.out.println(urlPath);
		String ctx = request.getContextPath();
		System.out.println(ctx);
		String command = urlPath.substring(ctx.length());
		System.out.println(command);
		
		String view = null;
		HandlerMapping mapping = new HandlerMapping();
		Controller controller = mapping.getController(command);
		view = controller.requestHandler(request, response)
		//2. 요청에 따라 작업을 나누어서 처리
		
		if(view != null) {
			if(view.indexOf("redirect :")!=-1) {
				response.sendRedirect(view.split(":")[1]);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(view);
				rd.forward(request, response);
			}
		}
	}
}
