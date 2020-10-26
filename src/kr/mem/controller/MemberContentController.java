package kr.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberContentController {
	public String requestHandler(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		int num = Integer.parseInt(request.getParameter("num"));
        MemberDAO dao = new MemberDAO();
        MemberVO vo = dao.memContent(num);
        String nextPage = null;
        if(vo != null) {
            //View Forwarding (JSP)
            request.setAttribute("vo", vo);
            nextPage = "/member/content.jsp";
        } else {
            throw new ServletException("ERROR");
        }
        return nextPage;
	}
}
 