package ipi.perso.sel.service;


import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.Annonce;
import ipi.perso.sel.model.User;
import ipi.perso.sel.repository.AnnonceRepository;

@Service
public class AnnonceService {
	
	@Autowired
	AnnonceRepository annonceRepository;
	
	public Iterable<Annonce> getAllAnnonces() {
		return annonceRepository.findAll();
	}
	
	public Annonce findAnnonceById(Long id) {
    	Optional<Annonce> annonce = annonceRepository.findById(id);
    	if (!annonce.isPresent()) {
    		throw new EntityNotFoundException("L'annonce avec id '" + id + "' n'existe pas.");
    	}
    	return annonce.get();
    }

}
