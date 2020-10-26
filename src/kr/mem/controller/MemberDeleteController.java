package kr.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;

public class MemberDeleteController {
	public String requestHandler(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		int num = Integer.parseInt(request.getParameter("num"));
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memDelete(num);
		String nextPage = null;
		if(cnt > 0) {
			nextPage="redirect:/webmvc/list.do";
		}else {
			throw new ServletException("error");
		}
		return nextPage;
	}
}
