package ipi.perso.sel.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.Offre;
import ipi.perso.sel.repository.OffreRepository;

@Service
public class OffreService {
	
	@Autowired
	OffreRepository offreRepository;
	
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

}
