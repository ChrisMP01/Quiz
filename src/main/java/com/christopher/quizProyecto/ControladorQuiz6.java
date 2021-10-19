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
public class ControladorQuiz6 {

	@GetMapping("quiz6")
	public String process(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("SESSION_QUIZ");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "quiz6";

	}

	@PostMapping("quiz6")
	public String quiz6_post(@RequestParam("qz6") String msg, HttpServletRequest request, HttpSession httpSession) {

		if (msg != null) {
			httpSession.setAttribute("Quiz6", msg);
		}

		return "redirect:/quiz7";
	}
}
