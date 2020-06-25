package ipi.perso.sel.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.Offre;
import ipi.perso.sel.model.Rubrique;
import ipi.perso.sel.model.User;
import ipi.perso.sel.repository.OffreRepository;
import ipi.perso.sel.repository.RubriqueRepository;

@Service
public class OffreService {
	
	@Autowired
	OffreRepository offreRepository;
	
	@Autowired
	RubriqueRepository rubriqueRepository;

	
	@Autowired
	UserService userService;
	
	public List<Offre> getAllOffres() {
		return offreRepository.findAll();
	}
	
	public Offre findOffreById(Long id) {
    	Optional<Offre> offre = offreRepository.findById(id);
    	if (!offre.isPresent()) {
    		throw new EntityNotFoundException("L'offre avec id '" + id + "' n'existe pas.");
    	}
    	return offre.get();
    }
	
	public List<Offre> findAllByUserId(Long userId) {
		User user = userService.findUserById(userId);
		return offreRepository.findByUser(user);
	}
	
	public void createOffre(String titre, String text, Long userId, int rubriqueId) {
		User user = userService.findUserById(userId);
		LocalDate dateCreation = LocalDate.now();
		Rubrique rubrique = rubriqueRepository.findById(rubriqueId).get();
		String photoLien = "";
		Offre newOffre = new Offre(null, titre, text, user, dateCreation, photoLien, rubrique);
		offreRepository.save(newOffre);
	}

}
