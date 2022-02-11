package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhoneController {

	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	@RequestMapping(value="/phone/list", method= {RequestMethod.GET,RequestMethod.POST})
	public String list() {
		System.out.println("[PhoneController > list()]");
		
		return "/WEB-INF/views/list.jsp";
	}
	
	@RequestMapping(value="/phone/writeForm", method= {RequestMethod.GET,RequestMethod.POST})
	public String writeForm() {
		System.out.println("[PhoneController > writeForm()]");
		
		return "/WEB-INF/views/writeForm.jsp";
	}
	
	
}
