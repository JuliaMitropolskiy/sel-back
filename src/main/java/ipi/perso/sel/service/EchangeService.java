package ipi.perso.sel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.Echange;
import ipi.perso.sel.model.User;
import ipi.perso.sel.repository.CategoryRepository;
import ipi.perso.sel.repository.EchangeRepository;

@Service
public class EchangeService {
	
	@Autowired
	UserService userService;
	
	@Autowired
	EchangeRepository echangeRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public void transferMinutes(Echange echange) {
		echangeRepository.save(echange);
		
		User emetteur = echange.getEmetteur();
		emetteur.setSoldeMinutes(emetteur.getSoldeMinutes() - echange.getMinutes());
		userService.modifierProfil(emetteur);
		
		User beneficiaire = echange.getBeneficiaire();
		beneficiaire.setSoldeMinutes(beneficiaire.getSoldeMinutes() + echange.getMinutes());
		userService.modifierProfil(beneficiaire);

		
	}
	
//	public void transferMinutes(Long idEmetteur, Long idBeneficiaire, LocalDate dateEchange, Integer categoryId, Integer minutes, String message) {
//		User emetteur = userService.findUserById(idEmetteur);
//		emetteur.setSoldeMinutes(emetteur.getSoldeMinutes() - minutes);
//		userService.modifierProfil(emetteur);
//		User beneficiaire = userService.findUserById(idBeneficiaire);
//		beneficiaire.setSoldeMinutes(beneficiaire.getSoldeMinutes() + minutes);
//		userService.modifierProfil(beneficiaire);
//		Category category = categoryRepository.findById(categoryId).get();
//		
//		Echange echange = new Echange(emetteur, beneficiaire, dateEchange, category, minutes, message);
//		echangeRepository.save(echange);
//		
//	}


}
