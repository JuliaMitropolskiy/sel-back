package ipi.perso.sel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ipi.perso.sel.model.Annonce;
import ipi.perso.sel.model.User;
import ipi.perso.sel.service.AnnonceService;
import ipi.perso.sel.service.PublicationService;

@RestController
@RequestMapping("/annonces")
public class AnnonceController {
	
	@Autowired
	PublicationService publicationService;
	
	@Autowired
	AnnonceService annonceService;
	
	@GetMapping("")
	@ResponseBody
	public Iterable<Annonce> getAnnonces() {
		return annonceService.getAllAnnonces();
	}
	
	@GetMapping("/{id}")
    @ResponseBody
    public Annonce getAnnonce(@PathVariable("id") Long id) {
    	return annonceService.findAnnonceById(id);
    }

}
