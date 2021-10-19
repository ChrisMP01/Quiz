package com.christopher.quizProyecto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ControladorQuiz3 {
	
	@GetMapping("quiz3")
	public String quiz3_get (Model model) {
		return "quiz3";

	}

	@PostMapping("quiz3")
	public String quiz3_post(@RequestParam("qz3") String msg, HttpServletRequest request 
			 ,HttpSession httpSession) {
			
			
			if (msg != null) {
				httpSession.setAttribute("Quiz3", msg);
			}
			
			return "redirect:/quiz4";
		}
}
