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
public class ControladorQuiz9 {
	@GetMapping("quiz9")
	public String quiz9_get (Model model, HttpSession session) {
		List<String> messages = (List<String>) session.getAttribute("SESSION_QUIZ");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "quiz9";

	}

	@PostMapping("quiz9")
	public String quiz9_post(@RequestParam("qz9") String msg, HttpServletRequest request 
		 ,HttpSession httpSession) {
		
		
		if (msg != null) {
			httpSession.setAttribute("Quiz9", msg);
		}
		
		return "redirect:/quiz10";
	}
}
