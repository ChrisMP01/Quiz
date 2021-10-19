package com.christopher.quizProyecto;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorQuiz2 {
	@GetMapping("quiz2")
	public String quiz2_get(Model model) {
		return "quiz2";

	}
	
	@PostMapping("quiz2")
	public String quiz2_post(@RequestParam("qz2") String msg, HttpServletRequest request 
			 ,HttpSession httpSession) {
			
			
			if (msg != null) {
				httpSession.setAttribute("Quiz2", msg);
			}
			
			return "redirect:/quiz3";
		}
}
