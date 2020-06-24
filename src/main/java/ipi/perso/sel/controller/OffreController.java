package ipi.perso.sel.controller;

import static java.util.stream.Collectors.toList;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import ipi.perso.sel.dto.OffreDto;
import ipi.perso.sel.model.Category;
import ipi.perso.sel.model.Offre;
import ipi.perso.sel.model.Publication;
import ipi.perso.sel.model.Rubrique;
import ipi.perso.sel.service.OffreService;
import ipi.perso.sel.service.PublicationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
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
    public Offre getOffre(@PathVariable("id") Long id) {
    	return offreService.findOffreById(id);
    }
	
	@PostMapping("/new")
	@ResponseStatus(HttpStatus.CREATED)
	public void createOffre(@RequestBody Map<String, String> json) {
		String titre = json.get("titre");
		String text = json.get("text");
		Long userId = Long.parseLong(json.get("userId"));
		int rubriqueId = Integer.parseInt(json.get("rubriqueId"));
		offreService.createOffre(titre, text, userId, rubriqueId);
	}

}
