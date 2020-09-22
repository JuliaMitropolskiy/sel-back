package ipi.perso.sel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ipi.perso.sel.model.Echange;
import ipi.perso.sel.service.EchangeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/echanges")
public class EchangeController {
	
	@Autowired
	EchangeService echangeService;
	
	@PostMapping("/new")
	public void transferMinutes(@RequestBody Echange echange) {
		echangeService.transferMinutes(echange);
		
	}

}
