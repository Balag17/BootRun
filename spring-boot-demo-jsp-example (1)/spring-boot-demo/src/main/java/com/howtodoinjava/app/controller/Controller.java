package com.howtodoinjava.app.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller implements ErrorController {

	@RequestMapping("/error")
	public String handleError(HttpServletResponse response, Model model) {
		/* ModelAndView modelAndView = new ModelAndView(); */

		if(response.getStatus() == HttpStatus.NOT_FOUND.value()) {
			/* modelAndView.setViewName("error-404"); */
			model.addAttribute("errorCode", 404);
		}
		else if(response.getStatus() == HttpStatus.FORBIDDEN.value()) {
			model.addAttribute("errorCode", 403);
		}
		else if(response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
			model.addAttribute("errorCode", 500);
		}
		return "errorPage";
	}
	
	@Override
	public String getErrorPath() {
		System.out.println("hiii");
		return "/error";
	}
}
