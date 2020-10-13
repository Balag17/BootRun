package spring.ojt.springojtproject.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class WhiteLabelController implements ErrorController {
		@RequestMapping("/error")
		public String handleError() {
			return "<h1>Something went wrong!! Custom message for white label error</h1>";
		}
		@Override
		public String getErrorPath() {
			System.out.println("hiii");
			return "/error";
		}
	}


