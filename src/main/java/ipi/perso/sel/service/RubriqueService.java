package ipi.perso.sel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.Category;
import ipi.perso.sel.model.Rubrique;
import ipi.perso.sel.repository.CategoryRepository;
import ipi.perso.sel.repository.RubriqueRepository;

@Service
public class RubriqueService {
	
	@Autowired
	RubriqueRepository rubriqueRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Rubrique> getAllRubriques() {
		return rubriqueRepository.findAll();
	}
	
	public List<Rubrique> getAllRubriquesByCategory(int categoryCode) {
		Category category = categoryRepository.findById(categoryCode).get();
		return rubriqueRepository.findByCategory(category);
	}

}
