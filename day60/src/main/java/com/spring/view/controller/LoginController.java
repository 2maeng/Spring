package com.spring.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.biz.member.MemberDAO;
import com.spring.biz.member.MemberVO;

@Controller
public class LoginController { // 스프링이 제공하는 Controller
	
	// String -> ModelAndView로 변경
	@RequestMapping(value = "/login.do")
	public String login(MemberVO mVO, MemberDAO mDAO, HttpSession session) {
		
		System.out.println("로그: LoginController(): ");
		
		mVO = mDAO.selectOne(mVO);
		
		if(mVO != null) {
			session.setAttribute("member", mVO.getMid());
		}
		
		// VR은 디폴트로 forward 방식
		// VR의 설정을 무시하고 main.do를 실행
		
		return "redirect:main.do";
//		return "main.do"; // .do로 끝나므로 Controller로 가려고
	}
	
	@RequestMapping(value = "/logout.do")
	public String logout(HttpSession session) {
		
		System.out.println("로그: LogoutController(): ");
		
		session.removeAttribute("member");
		
		return "redirect:main.do";
		
//		return "main.do";
	}

}
