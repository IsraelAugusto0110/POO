package com.fatec.testeSpring.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Porteiro {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
