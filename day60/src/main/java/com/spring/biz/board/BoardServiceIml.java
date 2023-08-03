package com.spring.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceIml implements BoardService{
	// Service 레이어가 관념적으로 존재하는데, 그것을 구현한 클래스
	// Service 레이어에서는 DAO를 사용한다
	// == C 파트
	// : DAO를 사용할 것 이기 때문에
	// 	 DAO와 메서드 시그니처를 맞추면 유리함
	// 메서드 시그니처를 강제하고 싶다
	// => 인터페이스
	
	@Autowired
	private BoardDAO boardDAO;
	// 의존 관계 -> DI

	@Override
	public BoardVO selectOne(BoardVO bVO) {
		return boardDAO.selectOne(bVO);
	}

	@Override
	public List<BoardVO> selectAll(BoardVO bVO) {
		return boardDAO.selectAll(bVO);
	}

	@Override
	public boolean insert(BoardVO bVO) {
		return boardDAO.insert(bVO);
	}

	@Override
	public boolean update(BoardVO bVO) {
		return boardDAO.update(bVO);
	}

	@Override
	public boolean delete(BoardVO bVO) {
		return boardDAO.delete(bVO);
	}


}