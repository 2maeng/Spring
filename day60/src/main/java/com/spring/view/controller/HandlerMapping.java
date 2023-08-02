package com.spring.view.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
	// FrontController에서 사용되는 factory 클래스의 이름
	// 팩토리 패턴을 사용하기 때문에 싱글톤이 유지됨
	
	private Map<String, Controller> mappings; // main.do에 MainAction 반환해줘
	
	public HandlerMapping() { // 생성자 주입
		mappings = new HashMap<String, Controller>();
		
		mappings.put("/main.do", new MainController());
		mappings.put("/login.do", new LoginController());
	}
	
	public Controller getController(String command) {
		return mappings.get(command); // mappings가 주체이기에 의존 주입 필요
	}
}
