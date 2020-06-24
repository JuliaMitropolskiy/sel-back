package ipi.perso.sel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ipi.perso.sel.model.Rubrique;
import ipi.perso.sel.service.RubriqueService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rubriques")
public class RubriqueController {
	
	@Autowired
	RubriqueService rubriqueService;
	
	@GetMapping("")
	@ResponseBody
	public List<Rubrique> getAllRubriques() {
		return rubriqueService.getAllRubriques();
	}
	
	@GetMapping("/{categoryCode}")
	@ResponseBody
	public List<Rubrique> getRubriquesByCategoryCode(@PathVariable int categoryCode) {
		return rubriqueService.getAllRubriquesByCategory(categoryCode);
	}

}
