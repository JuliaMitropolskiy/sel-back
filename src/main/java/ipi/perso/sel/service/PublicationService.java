package ipi.perso.sel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.Publication;
import ipi.perso.sel.repository.PublicationRepository;

@Service
public class PublicationService {
	
	@Autowired
	private PublicationRepository publicationRepository;
	
	public void createPublication (Publication publication) {
		publicationRepository.save(publication);
	}
	
	public void deletePublication (Long id) {
		publicationRepository.deleteById(id);
	}
	
	/*public void modifierPublication (Publication publication) {
		Publication publicationAModifier = publicationRepository.findById(publication.getId()).get();
		publicationAModifier.setDateCreation(publication.getDateCreation());
		publicationAModifier.setPhotoLien(publication.getPhotoLien());
		publicationAModifier.setText(publication.getText());
		publicationAModifier.setTitre(publication.getTitre());
		publicationRepository.save(publicationAModifier);
	}*/

}
