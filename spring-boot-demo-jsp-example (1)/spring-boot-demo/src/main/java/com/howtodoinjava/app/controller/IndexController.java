package com.howtodoinjava.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home(Model model) {
         
		//To hit the rest service
		final String uri = "http://localhost:8081/products";

	    RestTemplate restTemplate = new RestTemplate();
	    ArrayList<String> list = restTemplate.getForObject(uri, ArrayList.class);
	    model.addAttribute("names", list );

	    System.out.println(list);
		
	    return "index";	
	}
	

}