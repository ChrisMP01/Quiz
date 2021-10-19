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
public class ControladorQuiz5 {

	@GetMapping("quiz5")
	public String process(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("SESSION_QUIZ");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "quiz5";

	}

	@PostMapping("quiz5")
	public String quiz5_post(@RequestParam("qz5") String msg, HttpServletRequest request, HttpSession httpSession) {

		if (msg != null) {
			httpSession.setAttribute("Quiz5", msg);
		}

		return "redirect:/quiz6";
	}
}
