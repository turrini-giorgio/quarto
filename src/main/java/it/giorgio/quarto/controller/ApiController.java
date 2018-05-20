package it.giorgio.quarto.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.giorgio.quarto.dto.HelloMessage;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
	@RequestMapping("/hello/{to}")
	public HelloMessage hello(@PathVariable String to) {
		return new HelloMessage(to);
	}
}

