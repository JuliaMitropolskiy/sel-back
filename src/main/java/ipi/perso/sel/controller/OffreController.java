package ipi.perso.sel.controller;

import static java.util.stream.Collectors.toList;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import ipi.perso.sel.dto.OffreDto;
import ipi.perso.sel.model.Category;
import ipi.perso.sel.model.Offre;
import ipi.perso.sel.model.Publication;
import ipi.perso.sel.model.Rubrique;
import ipi.perso.sel.service.OffreService;
import ipi.perso.sel.service.PublicationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/offres")
public class OffreController {
	
	@Autowired
	PublicationService publicationService;
	
	@Autowired
	OffreService offreService;
	
	@GetMapping("")
	@ResponseBody
	public List<OffreDto> getOffres() {
		return offreService
		.getAllOffres()
		.stream()
		.map(o -> new OffreDto(o.getId(), o.getTitre(), o.getText(), o.getUser().getId(), o.getUser().getPrenom(), o.getUser().getCommune(),
				o.getDateCreation(), o.getPhotoLien(), o.getRubrique(), o.getRubrique().getCategory()))
		.collect(toList());
	}
	
	@GetMapping("/{id}")
    @ResponseBody
    public Offre getAnnonce(@PathVariable("id") Long id) {
    	return offreService.findOffreById(id);
    }

}
