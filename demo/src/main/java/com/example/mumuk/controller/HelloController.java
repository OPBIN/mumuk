package com.example.mumuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/")
	public String goHome() {
		System.out.println("TLTltldlqwp[dl[wqpld[wqpld[qp");
		return "/home.html";
	}
}
