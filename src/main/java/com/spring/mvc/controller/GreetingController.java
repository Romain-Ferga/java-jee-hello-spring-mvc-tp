package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting(Model model) {

		model.addAttribute("message", "Hello from Spring MVC");

		return "WEB-INF/view/showMessage.jsp";

	}

}
