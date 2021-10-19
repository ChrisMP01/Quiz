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
public class ControladorQuiz1 {

	@GetMapping("quiz1")
	public String quiz1_get (Model model) {
		return "quiz1";

	}

	@PostMapping("quiz1")
	public String quiz1_post(@RequestParam("qz1") String msg, HttpServletRequest request 
		 ,HttpSession httpSession) {
		
		
		if (msg != null) {
			httpSession.setAttribute("Quiz1", msg);
		}
		
		return "redirect:/quiz2";
	}
}