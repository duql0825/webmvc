package kr.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberUpdateController {
	public String requestHandler(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		int num = Integer.parseInt(request.getParameter("num"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String addr = request.getParameter("addr");
        
        MemberVO vo = new MemberVO();
        vo.setNum(num);
        vo.setPhone(phone);
        vo.setEmail(email);
        vo.setAddr(addr);
        
        MemberDAO dao = new MemberDAO();
        int cnt = dao.memUpdate(vo);
        String nextPage=null;
        if(cnt > 0) {
            nextPage = "redirect:/webmvc/list.do";
        } else {
            throw new ServletException("error");
        }
        return nextPage;
	}
}
