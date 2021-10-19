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
public class ControladorQuiz7 {

	@GetMapping("quiz7")
	public String process(Model model) {
		return "quiz7";
	}

	@PostMapping("quiz7")
	public String quiz7_post(@RequestParam("qz7") String msg, HttpServletRequest request, HttpSession httpSession) {

		if (msg != null) {
			httpSession.setAttribute("Quiz7", msg);
		}

		return "redirect:/quiz8";
	}
}
