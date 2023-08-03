package com.spring.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.biz.board.BoardDAO;
import com.spring.biz.board.BoardVO;

@Controller
public class InsertBoardController {
	
	@RequestMapping(value = "/insertBoard.do", method = RequestMethod.GET) // GET으로 부르면 페이지 보여줘
	public String handleRequest() {
		
		return "redirect:insertBoardPage.jsp";
	}

	@RequestMapping(value = "/insertBoard.do", method = RequestMethod.POST) // POST로 부르면 글 작성해줘
	public String insertBoard(BoardVO bVO, BoardDAO bDAO, ModelAndView mav) {
		
		boolean flag = bDAO.insert(bVO);

		if(flag) {
			return "redirect:main.do";
		}
		else {
			return "redirect:insertBoardPage.jsp";
		}
		
	}

}
