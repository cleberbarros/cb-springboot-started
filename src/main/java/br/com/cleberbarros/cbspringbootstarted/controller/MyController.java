package br.com.cleberbarros.cbspringbootstarted.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.cleberbarros.cbspringbootstarted.service.MyService;

@Controller
public class MyController {

	@Autowired
	private MyService service;
	
@GetMapping("/hi")
@ResponseBody
public String hello() {
	
	service.exibir();

 return "Hello!";	
}
}
