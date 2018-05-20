package it.giorgio.quarto.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.giorgio.quarto.entity.Utente;
import it.giorgio.quarto.repository.UtenteRepository;

@Controller
public class HomeController {
	// inject via application.properties
	@Value("${home.message:test}")
	private String message = "Hello World";

	@Autowired
	private UtenteRepository utenteRepository;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		model.put("time", new Date());
		return "home";
	}
	
	@RequestMapping("/users")
	public String users(Map<String, Object> model) {
		List<Utente> utenti = this.utenteRepository.findAll();
		model.put("utenti", utenti);
		return "users";
	}

}
