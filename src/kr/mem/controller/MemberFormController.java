package kr.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberFormController {
	public String requestHandler(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String nextPage = "/member/member.html";
		return nextPage;
	}
}
