package com.christopher.quizProyecto;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorResult {
	
	@GetMapping("quizResult")
	public String result_get(Model modelo,HttpSession session) {
		
		
		String quiz1 = (String) session.getAttribute("Quiz1");
		String quiz2 = (String) session.getAttribute("Quiz2");
		String quiz3 = (String) session.getAttribute("Quiz3");
		String quiz4 = (String) session.getAttribute("Quiz4");
		String quiz5 = (String) session.getAttribute("Quiz5");
		String quiz6 = (String) session.getAttribute("Quiz6");
		String quiz7 = (String) session.getAttribute("Quiz7");
		String quiz8 = (String) session.getAttribute("Quiz8");
		String quiz9 = (String) session.getAttribute("Quiz9");
		String quiz10 = (String) session.getAttribute("Quiz10");
		
		modelo.addAttribute("quiz_res",session);
		return "quizResult";
	}
}
